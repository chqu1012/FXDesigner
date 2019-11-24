package de.dc.fx.ui.renderer.model.template

import de.dc.fx.ui.renderer.model.FXNode
import de.dc.fx.ui.renderer.model.FXRoot

class BaseControllerTemplate implements IGenerator<FXRoot> {
	
	override gen(FXRoot input)'''
	package «input.basePackage».controller;
	
	import javafx.fxml.*;
	import javafx.scene.control.*;
	import javafx.scene.layout.*;
	«val className = Class.forName(input.controller).simpleName»
	public class Base«className»{
		
		«FOR e: input.eResource.allContents.toIterable»
		«IF e instanceof FXNode»
		«val node = e as FXNode»
		«IF node.id !== null»
		@FXML
		protected «node.eClass.name.replaceFirst("FX", "")» «e.id»;
		
		«ENDIF»
		«ENDIF»
		«ENDFOR»
		public void initialize(){}
	}
	'''
	
	override filename(FXRoot input) {
		val className = Class.forName(input.controller).simpleName
		'Base'+className
	}
	
}