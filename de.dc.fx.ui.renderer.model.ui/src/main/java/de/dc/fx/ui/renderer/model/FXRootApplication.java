package de.dc.fx.ui.renderer.model;

import de.dc.fx.ui.renderer.model.view.*;
import de.dc.javafx.xcore.workbench.emf.ui.di.EMFPlatform;
import de.dc.javafx.xcore.workbench.emf.ui.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXRootApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		EmfWorkbench workbench = new EmfWorkbench(); 
		workbench.registerEmfEditor(FXRootDetailedEmfTreeViewCompact.class);
		workbench.addViewToLeft(new EmfRecentlyOpenView());
		workbench.addViewToLeft(new EmfPaletteView());
		primaryStage.setScene(new Scene(workbench));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		EMFPlatform.init();
		launch(args);
	}

}
