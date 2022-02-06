package dad.hospitalorganizer.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class EntradaController implements Initializable{
	

	
		@FXML
		private BorderPane view;
		
	    @FXML
	    private ImageView iconoEntradas;

	    @FXML
	    private Button nuevoButton;

	    @FXML
	    private ImageView iconoEntradasNuevo;

	    @FXML
	    private Button verButton;

	    @FXML
	    private ImageView iconoEntradasVer;

	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
	    
	    public EntradaController() throws IOException {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EntradasView.fxml"));
			loader.setController(this);
			loader.load();
		}

		public BorderPane getView() {
			
			return view;
		}
	    
	    
	    @FXML
	    void onclickPedido(ActionEvent event) {

	    }

	    @FXML
	    void onclickPedidoVer(ActionEvent event) {

	    }

		

	
}
