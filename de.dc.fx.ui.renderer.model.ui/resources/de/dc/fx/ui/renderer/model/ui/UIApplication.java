package de.dc.fx.ui.renderer.model.ui;

import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.file.FXRootFile;
import de.dc.fx.ui.renderer.model.renderer.UIRenderer;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class UIApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		UIRenderer renderer = new UIRenderer();
		FXRootFile file = new FXRootFile();
		FXRoot fxRoot = file.load("./resources/"+ui());
		Parent root = (Parent) renderer.doSwitch(fxRoot);
		init(renderer);
		primaryStage.setScene(new Scene(root, 800, 600));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	protected void init(UIRenderer renderer) {
	}
	
	protected abstract String ui();
}