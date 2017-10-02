package edu.sla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        Label hi = new Label("bees");
        Scene scene1 = new Scene (hi,400, 400);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("hgehvj");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
