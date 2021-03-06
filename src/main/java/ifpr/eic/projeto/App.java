package ifpr.eic.projeto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;

import ifpr.eic.projeto.telas.Controle;

/**
 * JavaFX App
 */
public class App extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        Parent root = loadTela("fxml/tela.fxml", (o)->new Controle());
        Scene scene = new Scene(root, 720, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static Parent loadTela(String fxml, Callback controller){
        Parent root = null;
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource(fxml));
            loader.setControllerFactory(controller);

            root = loader.load();
            
        }catch (Exception e){
            System.out.println("Problema no arquivo fxml. Está correto?? "+fxml);
            e.printStackTrace();
        }
        return root;   
    }

    public static void main(String[] args) {
        launch();
    }

}