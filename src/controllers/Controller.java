/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import models.Factory;

/**
 *
 * @author hala
 */
public class Controller {
    Factory ff = new Factory();
    public void displayScreen(ActionEvent event,String screenName) throws IOException{
      Pane addCourse = FXMLLoader.load(getClass().getResource(screenName));
        Scene scene = new Scene(addCourse);
          Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
          window.setScene(scene);
          window.show();
    }
}
