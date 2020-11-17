package dad.javafx.inventario;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

	private ListProperty<String> listaIzquierda = new SimpleListProperty<>(FXCollections.observableArrayList());
	private ListProperty<String> listaDerecha = new SimpleListProperty<>(FXCollections.observableArrayList());
	private StringProperty seleccionIzquierda = new SimpleStringProperty();
	private StringProperty seleccionDerecha = new SimpleStringProperty();
	
	public final ListProperty<String> listaIzquierdaProperty() {
		return this.listaIzquierda;
	}
	
	public final ObservableList<String> getListaIzquierda() {
		return this.listaIzquierdaProperty().get();
	}
	
	public final void setListaIzquierda(final ObservableList<String> listaIzquierda) {
		this.listaIzquierdaProperty().set(listaIzquierda);
	}
	
	public final ListProperty<String> listaDerechaProperty() {
		return this.listaDerecha;
	}
	
	public final ObservableList<String> getListaDerecha() {
		return this.listaDerechaProperty().get();
	}
	
	public final void setListaDerecha(final ObservableList<String> listaDerecha) {
		this.listaDerechaProperty().set(listaDerecha);
	}
	
	public final StringProperty seleccionIzquierdaProperty() {
		return this.seleccionIzquierda;
	}
	
	public final String getSeleccionIzquierda() {
		return this.seleccionIzquierdaProperty().get();
	}
	
	public final void setSeleccionIzquierda(final String seleccionIzquierda) {
		this.seleccionIzquierdaProperty().set(seleccionIzquierda);
	}
	
	public final StringProperty seleccionDerechaProperty() {
		return this.seleccionDerecha;
	}
	
	public final String getSeleccionDerecha() {
		return this.seleccionDerechaProperty().get();
	}
	
	public final void setSeleccionDerecha(final String seleccionDerecha) {
		this.seleccionDerechaProperty().set(seleccionDerecha);
	}
}
