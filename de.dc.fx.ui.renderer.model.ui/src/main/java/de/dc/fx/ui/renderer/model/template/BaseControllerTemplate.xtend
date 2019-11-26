package de.dc.fx.ui.renderer.model.template

import de.dc.fx.ui.renderer.model.FXNode
import de.dc.fx.ui.renderer.model.FXRoot
import de.dc.fx.ui.renderer.model.FXNamedElement
import de.dc.fx.ui.renderer.model.FXTableView
import de.dc.fx.ui.renderer.model.FXTableColumn

class BaseControllerTemplate implements IGenerator<FXRoot> {
	
	override gen(FXRoot input)'''
	package «input.basePackage».controller;
	
	import javafx.fxml.*;
	import javafx.scene.control.*;
	import javafx.scene.layout.*;
	import javafx.collections.*;
	import javafx.scene.control.cell.*;
	
	«val className = Class.forName(input.controller).simpleName»
	public class Base«className»{
		
		«FOR e: input.eResource.allContents.toIterable.filter(FXNamedElement)»
		«IF e.id !== null»
		@FXML
		protected «e.eClass.name.replaceFirst("FX", "")» «e.id»;
		
		«ENDIF»
		«ENDFOR»
		«FOR e: input.eResource.allContents.toIterable.filter(FXTableView)»
		«val table = e as FXTableView»
		protected ObservableList «table.id.toFirstLower»Data = FXCollection.observableArrayList();
		
		protected FilteredList filtered«table.id.toFirstUpper»Data = new FilteredList(«table.name.toFirstLower»Data);
		
		«FOR column : table.columns»
		@FXML
		protected TableColumn «column.id»;
		
		«ENDFOR»
		«ENDFOR»
		public void initialize(){
			«FOR e : input.eResource.allContents.toIterable.filter(FXTableView)»
			«e.id».setItems(filtered«e.id.toFirstUpper»Data);
			«ENDFOR»
			«FOR e : input.eResource.allContents.toIterable.filter(FXTableColumn)»
			«IF e.cellFactory !== null»
			«e.id».setCellFactory(new «e.cellFactory»());
			«ELSE»
			«e.id».setCellFactory(new PropertyValueFactory<>("«e.name»"));
			«ENDIF»
			«IF e.cellValueFactory !== null»
			«e.id».setCellValueFactory(new «e.cellFactory»());
			«ENDIF»
			«ENDFOR»
		}
	}
	'''
	
	override filename(FXRoot input) {
		val className = Class.forName(input.controller).simpleName
		'Base'+className
	}
	
}