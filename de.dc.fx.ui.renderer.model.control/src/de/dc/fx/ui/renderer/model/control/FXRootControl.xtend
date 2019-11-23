package de.dc.fx.ui.renderer.model.control

import de.dc.fx.ui.renderer.model.FXRoot
import java.util.Optional
import javafx.scene.layout.BorderPane

class FXRootControl extends BorderPane {
	
	FXRoot model
	Class<?> controllerClass
	Object controller

	new(FXRoot model) {
		this.model = model
		if (model.controller !== null) {
			controllerClass = Class.forName(model.controller)
			controller = controllerClass.newInstance
			invokeMethodBy("initialize", null)
		}
	}

	def invokeMethodBy(String methodName, Object params) {
		if (controllerClass !== null && controller !== null) {
			if (params !== null) {
				var initializeMethod = controllerClass.getMethod(methodName, params.getClass())
				if (initializeMethod !== null) {
					initializeMethod.invoke(controller, params)
				}
			} else {
				var initializeMethod = controllerClass.getMethod(methodName)
				initializeMethod.invoke(controller, null)
			}
		}
	}

	def getController() {
		Optional.ofNullable(controller)
	}

	def getControllerClass() {
		Optional.of(controllerClass)
	}

	def getModel() {
		model
	}
}
