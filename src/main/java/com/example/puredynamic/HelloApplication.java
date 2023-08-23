package com.example.puredynamic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        AnchorPane parent = new AnchorPane();

        Scene scene = new Scene(parent, 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        parent.getChildren().add(new Label("tra-la-la"));
        Button b = new Button("Press me");
        parent.getChildren().add(b);
        b.setOnAction(actionEvent -> b.setLayoutX(b.getLayoutX()+10));

        Pane pane = new Pane();
        parent.getChildren().add(pane);
        pane.setLayoutY(100);
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        pane.getChildren().add(loader.load());

        Pane pane2 = new Pane();
        parent.getChildren().add(pane2);
        pane2.setLayoutY(100); pane2.setLayoutX(200);
        loader = new FXMLLoader(HelloApplication.class.getResource("2.fxml"));
        pane2.getChildren().add(loader.load());
        ((SecondController)loader.getController()).setZ("********");
    }

    public static void main(String[] args) {
        launch();
    }
}