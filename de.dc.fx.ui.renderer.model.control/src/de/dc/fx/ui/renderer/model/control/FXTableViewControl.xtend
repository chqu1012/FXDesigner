package de.dc.fx.ui.renderer.model.control

import de.dc.fx.ui.renderer.model.FXTableColumn
import de.dc.fx.ui.renderer.model.FXTableView
import java.util.HashMap
import java.util.Map
import java.util.Optional
import javafx.collections.transformation.SortedList
import javafx.scene.control.Control
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import javafx.util.Callback

class FXTableViewControl<T> extends FXBaseView<T> {

	protected Map<String, TableColumn> columnsRegistry = new HashMap<String, TableColumn>()
	protected TableView<T> table

	new(FXTableView model) {
		super(model)
		model.columns.forEach([e|createColumn(e)])
		val sortedList = new SortedList(filteredMasterData)
		table = view as TableView<T>
		sortedList.comparatorProperty.bind(table.comparatorProperty)
		table.items = sortedList
	}

	def void createColumn(FXTableColumn e) {
		var column = new TableColumn(e.name)
		if (null !== e.cellFactory) {
			var c = Class.forName(e.cellFactory)
			var Object instance = c.newInstance
			if (instance instanceof Callback) {
				var feature = instance as Callback
				column.cellFactory = feature
			}
		}
		if (null !== e.cellValueFactory) {
			var c = Class.forName(e.cellValueFactory)
			var Object instance = c.newInstance
			if (instance instanceof Callback) {
				var feature = instance as Callback
				column.cellValueFactory = feature
			}
		}
		var id = if(e.getId() === null) e.name else e.id
		columnsRegistry.put(id, column)
		((view as TableView<T>)).columns += column
	}

	def getTableView(){
		table
	}

	override getSelectionModel() {
		((view as TableView<T>)).selectionModel
	}

	def findColumnBy(String id) {
		Optional.of(columnsRegistry.get(id))
	}

	override getFXNode() {
		model
	}

	override protected Control initControl() {
		return new TableView<T>()
	}
}
