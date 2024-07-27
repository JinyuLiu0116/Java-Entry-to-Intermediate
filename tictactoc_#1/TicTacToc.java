package com.example.tictactoc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class TicTacToc implements EventHandler<ActionEvent> {
    private int[][] Tic;
    private HBox root;
    private Button b00,b01,b02,b10,b11,b12,b20,b21,b22;
    private Button[][] bArray;
    private int turn;

    public TicTacToc(){
        Tic = new int[3][3];
        VBox v1 = new VBox();
        VBox v2 = new VBox();
        VBox v3 = new VBox();
        bArray = new Button[3][3];
        for(int rows=0;rows<3;rows++){
            for(int col=0;col<3;col++){
                bArray[rows][col]=new Button();
                bArray[rows][col].setPrefSize(50,50);
                Tic[rows][col]=-1;
                if(rows==0){
                    v1.getChildren().add(bArray[rows][col]);
                }else if(rows==1){
                    v2.getChildren().add(bArray[rows][col]);
                }else {
                    v3.getChildren().add(bArray[rows][col]);
                }

            }
        }

        root = new HBox();
        root.getChildren().addAll(v1,v2,v3);

    }
    public Pane getRoot(){
        return root;
    }
    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
//        b00=new Button("");
//        b00.setPrefSize(50,50);
//        b10=new Button("");
//        b10.setPrefSize(50,50);
//        b20=new Button("");
//        b20.setPrefSize(50,50);
//        VBox v1 = new VBox();
//        v1.getChildren().addAll(b00,b10,b20);
//
//        b01=new Button("");
//        b01.setPrefSize(50,50);
//        b11=new Button("");
//        b11.setPrefSize(50,50);
//        b21=new Button("");
//        b21.setPrefSize(50,50);
//        VBox v2 = new VBox();
//        v2.getChildren().addAll(b01,b11,b21);
//
//        b02=new Button("");
//        b02.setPrefSize(50,50);
//        b12=new Button("");
//        b12.setPrefSize(50,50);
//        b22=new Button("");
//        b22.setPrefSize(50,50);
//        VBox v3 = new VBox();
//        v3.getChildren().addAll(b02,b12,b22);