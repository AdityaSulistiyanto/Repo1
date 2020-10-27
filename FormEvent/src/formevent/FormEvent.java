/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formevent;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author Aldi
 */
public class FormEvent extends Application {
    
    @Override
    public void start(Stage stage) {
       Text text1 = new Text("Nama");
       Text text2 = new Text("Telepon");
       Text text3 = new Text("Alamat");
   
       
       TextField textField1 = new TextField();
       TextField textField2 = new TextField();
       TextArea textArea1 = new TextArea();
   
       
       Button button1 = new Button("Kirim");
       Button button2 = new Button("Hapus");
       
       GridPane gridPane = new GridPane();
       
       gridPane.setMinSize(400, 250);
       gridPane.setPadding(new Insets(10, 10, 10, 10));
       gridPane.setVgap(5);
       gridPane.setHgap(5);
       gridPane.setAlignment(Pos.CENTER);
       
       gridPane.add(text1, 0, 0);
       gridPane.add(textField1, 1, 0);
       gridPane.add(text2, 0, 1);
       gridPane.add(textField2, 1, 1);
       gridPane.add(text3, 0, 2);
       gridPane.add(textArea1, 1, 2);
       gridPane.add(button1, 0, 4);
       gridPane.add(button2, 1, 4);
       
       Scene scene = new Scene(gridPane);
       
       stage.setTitle("Form Pendaftaran Event");
       stage.setScene(scene);
       stage.show();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
