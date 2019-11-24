package de.dc.fx.ui.renderer.model.template;

public interface IGenerator<T> {

	String gen(T input);
	
	String filename(T input);
}
