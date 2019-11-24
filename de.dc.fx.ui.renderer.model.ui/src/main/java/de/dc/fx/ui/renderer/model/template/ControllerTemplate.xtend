package de.dc.fx.ui.renderer.model.template

import de.dc.fx.ui.renderer.model.FXRoot

class ControllerTemplate implements IGenerator<FXRoot> {
	
	override gen(FXRoot input)'''
	package «input.basePackage».controller;
	
	«val className = Class.forName(input.controller).simpleName»
	public class «className» extends Base«className»{
	}
	'''
	
	override filename(FXRoot input) {
		val className = Class.forName(input.controller).simpleName
		className
	}
	
}