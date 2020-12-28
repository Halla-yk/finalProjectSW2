
package views;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hala
 */
public class FinalProjectSWE extends Application {
    static Scene scene;
    
    @Override
    public void start(Stage primaryStage)  throws Exception {
      Parent root =  FXMLLoader.load(getClass().getResource("ProductScreen.fxml"));
       scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
