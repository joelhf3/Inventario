package dad.javafx.inventario;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller controlador;

	@Override
	public void start(Stage primaryStage) throws Exception {

		controlador = new Controller();

		Scene scene = new Scene(controlador.getView(), controlador.getView().getPrefWidth(), controlador.getView().getPrefHeight());

		Stage stage = new Stage();
		stage.setTitle("Inventario");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
