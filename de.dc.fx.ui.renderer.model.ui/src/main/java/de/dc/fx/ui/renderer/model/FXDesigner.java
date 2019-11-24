package de.dc.fx.ui.renderer.model;

import de.dc.fx.ui.renderer.model.view.*;
import de.dc.javafx.xcore.workbench.emf.ui.di.EMFPlatform;
import de.dc.javafx.xcore.workbench.emf.ui.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDesigner extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("FXDesigner");
		
		EmfWorkbench workbench = new EmfWorkbench(); 
		workbench.registerEmfEditor(FXRootDetailedEmfTreeViewCompact.class);
		workbench.addViewToLeft(new EmfRecentlyOpenView());
		workbench.addViewToLeft(new EmfPaletteView());
		workbench.addViewToRight(new FXRootPreview());
		primaryStage.setScene(new Scene(workbench));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		EMFPlatform.init();
		launch(args);
	}

}
