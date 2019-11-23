package de.dc.fx.ui.renderer.model.control

import javafx.beans.property.DoubleProperty
import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.value.ObservableValue
import javafx.geometry.Pos
import javafx.scene.Node
import javafx.scene.layout.Pane
import javafx.scene.transform.Scale

class FXZoomablePane extends Pane {
	
	Node content
	DoubleProperty zoomFactor = new SimpleDoubleProperty(1)

	new(Node content) {
		this.content = content
		children += content
		val scale = new Scale(1, 1)
		content.transforms += scale
		zoomFactor.addListener[ ObservableValue<? extends Number> observable, Number oldValue, Number newValue |
			scale.x = newValue.doubleValue
			scale.y = newValue.doubleValue
			requestLayout
		]
	}

	override layoutChildren() {
		var pos = Pos::TOP_LEFT
		var right = insets.right
		var left = insets.left
		var bottom = insets.bottom
		var contentWidth = (width - left - right) / zoomFactor.get
		var contentHeight = (height - insets.top - bottom) / zoomFactor.get
		layoutInArea(content, left, insets.top, contentWidth, contentHeight, 0, null, pos.hpos, pos.vpos)
	}

	def getZoomFactor() {
		zoomFactor.get
	}

	def setZoomFactor(Double zoomFactor) {
		this.zoomFactor.set(zoomFactor)
	}

	def zoomFactorProperty() {
		zoomFactor
	}
}
