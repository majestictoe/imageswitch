package edu.sla;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class Main extends Application {


    public void start(Stage primaryStage) throws Exception {
        //makes buttons
        Button pictureButton = new Button();
        Button pictureButton2 = new Button();
        Button pictureButton3 = new Button();
        //gets images
        Image knifecat = new Image("images.jpeg", 400, 400, false, true);
        Image sadcat = new Image("p0a19.jpg", 400, 400, false, true);
        Image screamcat = new Image("just-a-cat-falling-off-a-table-227148.jpg", 400, 400, false, true);
        //sets images as pictures on buttons
        pictureButton.setGraphic(new ImageView(sadcat));
        pictureButton2.setGraphic(new ImageView(knifecat));
        pictureButton3.setGraphic(new ImageView(screamcat));
        //creates menu items for menu button
        MenuItem knife = new MenuItem("knife");
        MenuItem scream = new MenuItem("scream");
        MenuItem sad = new MenuItem("cry");
        MenuItem knife1 = new MenuItem("knife");
        MenuItem scream1 = new MenuItem("scream");
        MenuItem sad1 = new MenuItem("cry");
        MenuItem knife2 = new MenuItem("knife");
        MenuItem scream2 = new MenuItem("scream");
        MenuItem sad2 = new MenuItem("cry");
        //creates menu button containing the menu items
        MenuButton menuButton = new MenuButton("Options", null, knife, scream, sad);
        MenuButton menuButton2 = new MenuButton("Options", null, sad1, scream1, knife1);
        MenuButton menuButton3 = new MenuButton("Options", null, scream2, knife2, sad2);
        //creates groups for each scene and adds components to groups
        Group s1 = new Group();
        s1.getChildren().add(pictureButton);
        s1.getChildren().add(menuButton);
        Group s2 = new Group();
        s2.getChildren().add(pictureButton2);
        s2.getChildren().add(menuButton2);
        Group s3 = new Group();
        s3.getChildren().add(pictureButton3);
        s3.getChildren().add(menuButton3);
        //makes scenes using the groups
        Scene scene1 = new Scene(s1, 400, 400);
        Scene scene2 = new Scene(s2, 400, 400);
        Scene scene3 = new Scene(s3, 400, 400);
        //declares actions for when menu items are clicked
        knife.setOnAction((ActionEvent e) -> primaryStage.setScene(scene2));
        scream.setOnAction((ActionEvent e) -> primaryStage.setScene(scene3));
        sad.setOnAction((ActionEvent e) -> primaryStage.setScene(scene1));
        knife1.setOnAction((ActionEvent e) -> primaryStage.setScene(scene2));
        scream1.setOnAction((ActionEvent e) -> primaryStage.setScene(scene3));
        sad1.setOnAction((ActionEvent e) -> primaryStage.setScene(scene1));
        knife2.setOnAction((ActionEvent e) -> primaryStage.setScene(scene2));
        scream2.setOnAction((ActionEvent e) -> primaryStage.setScene(scene3));
        sad2.setOnAction((ActionEvent e) -> primaryStage.setScene(scene1));
        //declares actions for when button is clicked
        pictureButton.setOnAction((ActionEvent e) -> primaryStage.setScene(scene2));
        pictureButton2.setOnAction((ActionEvent e) -> primaryStage.setScene(scene3));
        pictureButton3.setOnAction((ActionEvent e) -> primaryStage.setScene(scene1));
        //sets up first stage
        primaryStage.setScene(scene1);
        primaryStage.setTitle("hgehvj");
        //shows stage
        primaryStage.show();
        Media edgy = new Media(new File("Evanescense-Bring Me To Life lyrics.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(edgy);
        mediaPlayer.play();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}