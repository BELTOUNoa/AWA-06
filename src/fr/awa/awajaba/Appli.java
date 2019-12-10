/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba;

import fr.awa.awajaba.entites.EvaluationConvive;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class Appli extends Application {
    
    Spinner note = new Spinner<Integer>();
        
    SpinnerValueFactory noteFac = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 5, 2);
        
    
    TextArea com = new TextArea();
    
    CheckBox blok = new CheckBox("Bloqué");
    
    
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Valider");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                EvaluationConvive eval = new EvaluationConvive();
                eval.setBloque(blok.isSelected());
                eval.setCommentaire(com.getText());
                eval.setNote((int) noteFac.getValue());
                System.out.println(eval.toString());
            }
        });
        
        
        note.setValueFactory(noteFac);
        
        VBox root = new VBox();
        
        root.getChildren().add(com);
        
        root.getChildren().add(note);
        
        root.getChildren().add(blok);
        
        
        Button btnEff = new Button();
        btnEff.setText("Effacer");
        btnEff.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                com.setText("");
                noteFac.setValue(0);
            }
        });
        
        
        
        
        root.getChildren().add(btn);
        
        root.getChildren().add(btnEff);
        
        Scene scene = new Scene(root, 400, 350);
        
        primaryStage.setTitle("Evaluer un Convive");
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
