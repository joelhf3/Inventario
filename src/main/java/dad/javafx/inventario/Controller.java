package dad.javafx.inventario;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	private Model modelo = new Model();
	
	@FXML
	private GridPane view;
	
	@FXML
	private Button botonTodosIzquierda;
	
	@FXML
	private Button botonTodosDerecha;
	
	@FXML
	private Button botonSeleccionIzquierda;
	
	@FXML
	private Button botonSeleccionDerecha;
	
	public Controller() throws IOException {
		FXMLLoader cargador = new FXMLLoader(getClass().getResource("View.fxml"));
		cargador.setController(this);
		cargador.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public Model getModelo() {
		return modelo;
	}

	public GridPane getView() {
		return view;
	}
}
