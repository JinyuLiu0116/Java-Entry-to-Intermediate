package com.example.calculator;

import javafx.beans.property.IntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class DemoController implements EventHandler<ActionEvent> {
    private HBox superRoot;
    private Label num1Lab,num2Lab,resultLab,space;
    private TextField num1,num2;
    private Button plus,minus,multiply,divide,percent;
    public DemoController(){
        num1Lab = new Label("Number1:");
        num2Lab = new Label("Number2:");
        VBox Box1=new VBox();
        Box1.setSpacing(35);
        Box1.getChildren().addAll(num1Lab,num2Lab);
        resultLab = new Label("Result:");
        VBox BoxForLab = new VBox();
        BoxForLab.setSpacing(60);
        //add labels to box
        BoxForLab.getChildren().addAll(Box1,resultLab);
        //create a textfield to type in number or something else
        num1=new TextField("num1");
        num2=new TextField("num2");
        //create a Vbos as a root Pane
        VBox BoxForText = new VBox();
        BoxForText.setSpacing(20);
        //after create TextField need to add to the stage of my root
        BoxForText.getChildren().addAll(num1,num2);
        //creat buttons
        plus = new  Button("+");
        plus.setOnAction(this);
        minus = new  Button(" -");
        minus.setOnAction(this);
        multiply = new  Button(" *");
        multiply.setOnAction(this);
        divide = new  Button(" /");
        divide.setOnAction(this);
        percent = new  Button("%");
        percent.setOnAction(this);
        VBox BoxForButton = new VBox();
        BoxForButton.getChildren().addAll(plus,minus,multiply,divide,percent);
        //create a HBox as a root to contain VBoxes
        //space = new Label("                        ");
        //VBox BoxFOrSpace =new VBox();
        //BoxFOrSpace.getChildren().add(space);
        //superRoot = new HBox();
        //superRoot.getChildren().addAll(BoxForLab,BoxForText,BoxFOrSpace,BoxForButton);


        HBox root1 = new HBox();
        root1.getChildren().addAll(BoxForLab,BoxForText);
        root1.setSpacing(5);
        HBox root2 = new HBox();
        root2.getChildren().add(BoxForButton);
        superRoot= new HBox();
        superRoot.getChildren().addAll(root1,root2);
        superRoot.setSpacing(70);
    }
    public Pane getRoot(){
        return superRoot;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource().equals(plus)) {
            try {
                double n1 = Double.parseDouble(num1.getText());
                double n2 = Double.parseDouble(num2.getText());
                resultLab.setText("Result: " + (n1 + n2));
            } catch (NumberFormatException e) {
                resultLab.setText("Result: Number Format Exception");
            } catch (Exception e) {
                resultLab.setText("Result: Unknown Exception");
            }
        }else if(actionEvent.getSource().equals(minus)){
            try {
                double n1 = Double.parseDouble(num1.getText());
                double n2 = Double.parseDouble(num2.getText());
                resultLab.setText("Result: " + (n1 - n2));
            }catch (NumberFormatException e){
                resultLab.setText("Result: Number Format Exception");
            } catch (Exception e){
                resultLab.setText("Result: Unknown Exception");
            }
        }else if(actionEvent.getSource().equals(multiply)){
            try {
                double n1 = Double.parseDouble(num1.getText());
                double n2 = Double.parseDouble(num2.getText());
                resultLab.setText("Result: " + (n1 * n2));
            }catch (NumberFormatException e){
                resultLab.setText("Result: Number Format Exception");
            }catch(Exception e){
                resultLab.setText("Result: Unknown Exception");
            }
        }else if(actionEvent.getSource().equals(divide)){
            try {
                double n1 = Double.parseDouble(num1.getText());
                double n2 = Double.parseDouble(num2.getText());
                if(n2==0){
                    throw new Exception("Divide by 0 ");
                }
                resultLab.setText("Result: " + (n1 / n2));
            }catch (NumberFormatException e){
                resultLab.setText("Result: Number Format Exception");
            }catch(Exception e){
                resultLab.setText("Result: "+e.getMessage());
            }
        }else if(actionEvent.getSource().equals(percent)){
            try {
                double n1 = Double.parseDouble(num1.getText());
                double n2 = Double.parseDouble(num2.getText());
                if(n2==0){
                    throw new Exception("No modulo by 0 ");
                }
                resultLab.setText("Result: " + (n1 % n2));
            }catch (NumberFormatException e){
                resultLab.setText("Result: Number Format Exception");
            }catch(Exception e){
                resultLab.setText("Result: Unknown Exception");
            }
        }
    }
}
