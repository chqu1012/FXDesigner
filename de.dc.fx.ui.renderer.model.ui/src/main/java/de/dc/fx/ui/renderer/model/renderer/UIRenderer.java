package de.dc.fx.ui.renderer.model.renderer;

import de.dc.fx.ui.renderer.model.FXBorderPane;
import de.dc.fx.ui.renderer.model.FXButton;
import de.dc.fx.ui.renderer.model.FXHBox;
import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.FXTableView;
import de.dc.fx.ui.renderer.model.util.UISwitch;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class UIRenderer extends UISwitch<Node> {

	@Override
	public Node caseFXRoot(FXRoot object) {
		BorderPane root = new BorderPane();
		object.getChildren().forEach(e->root.setCenter(doSwitch(e)));
		return root;
	}

	@Override
	public Node caseFXTableView(FXTableView object) {
		TableView<Object> tableView = new TableView<>();
		object.getColumns().forEach(c->{
			TableColumn<Object, ?> column = new TableColumn<>(c.getName());
			tableView.getColumns().add(column );
		});
		return tableView;
	}
	
	@Override
	public Node caseFXButton(FXButton object) {
		return new Button(object.getName());
	}
	
	@Override
	public Node caseFXHBox(FXHBox object) {
		HBox hbox = new HBox(object.getSpacing());
		object.getChildren().forEach(e->hbox.getChildren().add(doSwitch(e)));
		return hbox;
	}
	
	@Override
	public Node caseFXBorderPane(FXBorderPane object) {
		BorderPane borderPane = new BorderPane();
		FXNode center = object.getCenter();
		FXNode left = object.getLeft();
		FXNode right = object.getRight();
		FXNode bottom = object.getBottom();
		FXNode top = object.getRight();
		if (center!=null) {
			borderPane.setCenter(doSwitch(center));
		}
		if (left != null) {
			borderPane.setLeft(doSwitch(left));
		}
		if (right != null) {
			borderPane.setRight(doSwitch(right));
		}
		if (bottom != null) {
			borderPane.setBottom(doSwitch(bottom));
		}
		if (top != null) {
			borderPane.setTop(doSwitch(top));
		}
		return borderPane;
	}
}