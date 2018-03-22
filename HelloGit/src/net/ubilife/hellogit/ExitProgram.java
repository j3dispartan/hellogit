package net.ubilife.hellogit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExitProgram extends Application {

	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("I'm awesome");
		
		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		});
		
		button = new Button("Close Program");
		button.setOnAction(e -> closeProgram());

		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
	
	private void closeProgram() {
		Boolean answer = ConfirmBox.display("Title", "You sure you want to exit?");
		
		if (answer) {
			window.close();
		}
	}
}
