package de.dc.fx.ui.renderer.model.template

import de.dc.fx.ui.renderer.model.FXNode
import de.dc.fx.ui.renderer.model.FXRoot
import de.dc.fx.ui.renderer.model.FXNamedElement

class BaseControllerTemplate implements IGenerator<FXRoot> {
	
	override gen(FXRoot input)'''
	package «input.basePackage».controller;
	
	import javafx.fxml.*;
	import javafx.scene.control.*;
	import javafx.scene.layout.*;
	
	«val className = Class.forName(input.controller).simpleName»
	public class Base«className»{
		
		«FOR e: input.eResource.allContents.toIterable.filter(FXNamedElement)»
		«IF e.id !== null»
		@FXML
		protected «e.eClass.name.replaceFirst("FX", "")» «e.id»;
		
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