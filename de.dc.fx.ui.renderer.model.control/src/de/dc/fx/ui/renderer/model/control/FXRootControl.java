package de.dc.fx.ui.renderer.model.control;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

import de.dc.fx.ui.renderer.model.FXRoot;
import javafx.scene.layout.BorderPane;

public class FXRootControl extends BorderPane{

	private FXRoot model;
	private Class<?> controllerClass;
	private Object controller;

	public FXRootControl(FXRoot model) {
		this.model = model;
		
		if (model.getController()!=null) {
			try {
				controllerClass = Class.forName(model.getController());
				controller = controllerClass.newInstance();
				invokeMethodBy("initialize");
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void invokeMethodBy(String methodName) {
		if (controllerClass!=null && controller!=null) {
			Method initializeMethod;
			try {
				initializeMethod = controllerClass.getMethod(methodName);
				initializeMethod.invoke(controller,null);
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Optional<Object> getController(){
		return Optional.of(controller);
	}
	
	public Optional<Class<?>> getControllerClass(){
		return Optional.of(controllerClass);
	}
	
	public FXRoot getModel() {
		return model;
	}
}