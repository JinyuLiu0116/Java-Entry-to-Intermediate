package com.example.demojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
       // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //create the labels and the VBox container
        Label num1Lab = new Label("Number1:");
        Label num2Lab = new Label("Number2:");
        VBox Box1=new VBox();
        Box1.setSpacing(35);
        Box1.getChildren().addAll(num1Lab,num2Lab);
        Label resultLab = new Label("Result:");
        VBox BoxForLab = new VBox();
        BoxForLab.setSpacing(60);
        //add labels to box
        BoxForLab.getChildren().addAll(Box1,resultLab);
        //create a textfield to type in number or something else
        TextField num1=new TextField("num1");
        TextField num2=new TextField("num2");
        //create a Vbos as a root Pane
        VBox BoxForText = new VBox();
        BoxForText.setSpacing(20);
        //after create TextField need to add to the stage of my root
        BoxForText.getChildren().addAll(num1,num2);
        //creat buttons
        Button plus = new  Button("+");
        Button minus = new  Button(" -");
        Button multiply = new  Button(" *");
        Button divide = new  Button(" /");
        Button percent = new  Button("%");
        VBox BoxForButton = new VBox();
        BoxForButton.getChildren().addAll(plus,minus,multiply,divide,percent);
        //create a HBox as a root to contain VBoxes
        //Label space = new Label("                        ");
        //VBox BoxFOrSpace =new VBox();
        //BoxFOrSpace.getChildren().add(space);
        //HBox root = new HBox();
        //root.getChildren().addAll(BoxForLab,BoxForText,BoxFOrSpace,BoxForButton);
        //Scene scene = new Scene(root,320, 440);

        HBox root1 = new HBox();
        root1.getChildren().addAll(BoxForLab,BoxForText);
        root1.setSpacing(5);
        HBox root2 = new HBox();
        root2.getChildren().add(BoxForButton);
        HBox superRoot= new HBox();
        superRoot.getChildren().addAll(root1,root2);
        superRoot.setSpacing(70);

        Scene scene = new Scene(superRoot,320, 440);
        stage.setTitle("JavaFX demo!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
