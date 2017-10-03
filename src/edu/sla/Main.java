package edu.sla;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Main extends Application {


    public void start(Stage primaryStage) throws Exception {

        Button pictureButton = new Button();
        Button pictureButton2 = new Button();
        Button pictureButton3 = new Button();
        Image knifecat = new Image("images.jpeg",400,400,false,true);
        Image sadcat = new Image ("p0a19.jpg",400,400,false,true);
        Image screamcat = new Image ("just-a-cat-falling-off-a-table-227148.jpg",400,400,false,true);
        pictureButton.setGraphic(new ImageView(sadcat));
        pictureButton2.setGraphic(new ImageView (knifecat));
        pictureButton3.setGraphic(new ImageView (screamcat));
        Scene scene1 = new Scene (pictureButton,400, 400);
        Scene scene2 = new Scene (pictureButton2,400, 400);
        Scene scene3 = new Scene (pictureButton3,400,400);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("hgehvj");
        pictureButton.setOnAction((ActionEvent e) -> primaryStage.setScene(scene2));
        pictureButton2.setOnAction((ActionEvent e) -> primaryStage.setScene(scene3));
        pictureButton3.setOnAction((ActionEvent e) -> primaryStage.setScene(scene1));
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
