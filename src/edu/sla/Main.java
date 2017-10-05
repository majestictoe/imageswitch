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

public class Main extends Application {


    public void start(Stage primaryStage) throws Exception {
        //makes buttons
        Button pictureButton = new Button();
        //gets images
        Image knifecat = new Image("images.jpeg", 400, 400, false, true);
        Image sadcat = new Image("p0a19.jpg", 400, 400, false, true);
        Image screamcat = new Image("just-a-cat-falling-off-a-table-227148.jpg", 400, 400, false, true);
        //sets images as pictures on buttons
        pictureButton.setGraphic(new ImageView(sadcat));
        //creates menu items for menu button
        MenuItem knife = new MenuItem("knife");
        MenuItem scream = new MenuItem("scream");
        MenuItem sad = new MenuItem("cry");
        //creates menu button containing the menu items
        MenuButton menuButton = new MenuButton("Options", null, knife, scream, sad);
        //creates groups for each scene and adds components to groups
        Group s1 = new Group();
        s1.getChildren().add(pictureButton);
        s1.getChildren().add(menuButton);
        //makes scenes using the groups
        Scene scene1 = new Scene(s1, 400, 400);
        //declares actions for when menu items are clicked
        knife.setOnAction((ActionEvent e) -> pictureButton.setGraphic(new ImageView(knifecat)));
        scream.setOnAction((ActionEvent e) -> pictureButton.setGraphic(new ImageView(screamcat)));
        sad.setOnAction((ActionEvent e) -> pictureButton.setGraphic(new ImageView(sadcat)));
        //declares actions for when button is clicked
        pictureButton.setOnAction((ActionEvent e) ->System.out.println("pressed"));
        //sets up first stage
        primaryStage.setScene(scene1);
        primaryStage.setTitle("hgehvj");
        //shows stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}