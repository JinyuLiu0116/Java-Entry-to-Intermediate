package com.example.tictactoc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.Random;

public class TicTacToc implements EventHandler<ActionEvent> {
    private int[][] Tic;
    private HBox root,h1,h2,h3,H1;
    private VBox V1;
    private Button clean;
    private Button[][] bArray;
    private int turn;
    private Label result;

    public TicTacToc(){
        Tic = new int[3][3];
        h1 = new HBox();
        h2 = new HBox();
        h3 = new HBox();
        bArray = new Button[3][3];
        for(int rows=0;rows<3;rows++){
            for(int col=0;col<3;col++){
                bArray[rows][col]=new Button();
                bArray[rows][col].setPrefSize(50,50);
                bArray[rows][col].setOnAction(this);
                Tic[rows][col]=-1;
                if(rows==0){
                    h1.getChildren().add(bArray[rows][col]);
                }else if(rows==1){
                    h2.getChildren().add(bArray[rows][col]);
                }else {
                    h3.getChildren().add(bArray[rows][col]);
                }

            }
        }

        Random rand= new Random();
        turn=rand.nextInt(2);

        clean=new Button(" Clean ");
        clean.setOnAction(this);
        result=new Label("Winner: ");

        V1=new VBox();
        V1.getChildren().addAll(h1,h2,h3);
        H1=new HBox();
        H1.getChildren().addAll(clean,result);
        H1.setSpacing(20);
        VBox v4 = new VBox();
        v4.getChildren().addAll(V1,H1);
        v4.setSpacing(30);
        root = new HBox();
        root.getChildren().addAll(v4);
    }
    public Pane getRoot(){
        return root;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource().equals(bArray[0][0])){
            setButton(0,0);
            setText();
        }else if(actionEvent.getSource().equals(bArray[0][1])){
            setButton(0,1);
            setText();
        }else if(actionEvent.getSource().equals(bArray[0][2])){
            setButton(0,2);
            setText();
        }else if(actionEvent.getSource().equals(bArray[1][0])){
            setButton(1,0);
            setText();
        }else if(actionEvent.getSource().equals(bArray[1][1])){
            setButton(1,1);
            setText();
        }else if(actionEvent.getSource().equals(bArray[1][2])){
            setButton(1,2);
            setText();
        }else if(actionEvent.getSource().equals(bArray[2][0])){
            setButton(2,0);
            setText();
        }else if(actionEvent.getSource().equals(bArray[2][1])){
            setButton(2,1);
            setText();
        }else if(actionEvent.getSource().equals(bArray[2][2])){
            setButton(2,2);
            setText();
        }else if(actionEvent.getSource().equals(clean)){
            for(int r=0;r<3;r++){
                for(int c=0;c<3;c++){
                    Tic[r][c]=-1;
                    bArray[r][c].setText("");
                    bArray[r][c].setDisable(false);
                    result.setText("Winner: ");
                }
            }
        }
    }
    public void setButton(int r, int c){
        if(Tic[r][c]==-1&&turn==0){
            bArray[r][c].setText("O");
            Tic[r][c]=0;
            turn=1;
        }else if(Tic[r][c]==-1&&turn==1){
            bArray[r][c].setText("X");
            Tic[r][c]=1;
            turn=0;
        }
    }
    public void setText(){
        if(checkWinner(1)){//1 win
            result.setText("Winner: X player");
        }else if(checkWinner(0)){
            result.setText("Winner: O player");
        }else if(noWinner()){
            result.setText("Winner: No winner");
        }
    }
    public boolean checkWinner(int a){
        if(Tic[0][0]==a && Tic[0][1]==a && Tic[0][2]==a) {
            stopGame();
            return true;
        }else if(Tic[1][0]==a && Tic[1][1]==a && Tic[1][2]==a) {
            stopGame();
            return true;
        }else if(Tic[2][0]==a && Tic[2][1]==a && Tic[2][2]==a) {
            stopGame();
            return true;
        }else if(Tic[0][0]==a && Tic[1][0]==a && Tic[2][0]==a) {
            stopGame();
            return true;
        }else if(Tic[0][1]==a && Tic[1][1]==a && Tic[2][1]==a) {
            stopGame();
            return true;
        }else if(Tic[0][2]==a && Tic[1][2]==a && Tic[2][2]==a) {
            stopGame();
            return true;
        }else if(Tic[0][0]==a && Tic[1][1]==a && Tic[2][2]==a) {
            stopGame();
            return true;
        }else if(Tic[0][2]==a && Tic[1][1]==a && Tic[2][0]==a) {
            stopGame();
            return true;
        } else
            return false;
    }
    public boolean noWinner(){
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                if(Tic[r][c]==-1)
                    return false;
            }
        }
        return true;
    }
    public void stopGame(){
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                bArray[r][c].setDisable(true);
            }
        }
    }
}
//if action is coming from button b00
//check if Tic[0][0] is already pressed, you don't want to press twice. if there
//is a value different than -1, then return
//if there is -1 then if the first user's turn then display a big O on the button
//and update Tic[0][0] to 0. Check if there is a winner, if yes stop the game.
//if however the trun is for the second user (x), then display big X on the button
//and update Tic[0][0] to 1. Check if there is a winner. if there is a winner, stop the game.

//if action is coming from b01 do the same for Tic[0][1] and so on

//if action is coming from the buttom clear

