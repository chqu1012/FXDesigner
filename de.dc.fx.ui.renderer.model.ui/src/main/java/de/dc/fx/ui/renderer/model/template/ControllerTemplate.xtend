package de.dc.fx.ui.renderer.model.template

import de.dc.fx.ui.renderer.model.FXNode
import de.dc.fx.ui.renderer.model.FXRoot

class ControllerTemplate implements IGenerator<FXRoot> {
	
	override gen(FXRoot input)'''
	package �input.basePackage�.controller;
	
	public class �input.controller�{
		
		�FOR e: input.eResource.allContents.toIterable SEPARATOR '\n'�
		�IF e instanceof FXNode�
		�val node = e as FXNode�
		�IF node.id !== null�
		@FXML
		protected �node.eClass.name.replaceFirst("FX", "")� �e.id�;
		�ENDIF�
		�ENDIF�
		�ENDFOR�
		
		public void initialize(){}
	}
	'''
	
}