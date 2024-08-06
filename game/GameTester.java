package com.mac190.game;

public class GameTester {
    public static void main(String[] args) {
        try{

            Game G = new Soccer(); //call this objectA
            G.setTeamB("A");
            G.setTeamB("B");
            G.setMaxSubs(6);
            G.setMaxPlayers(16);
            System.out.println("G: " + G);

            Soccer S = new Soccer("Paris", "Barca", 11,5,"refer");
            System.out.println("S: " + S);
            S.setScoreA(1);
            S.setScoreA(1);
            S.setScoreB(1);
            S.setSubA(2);
            System.out.println("S: " + S);
            //S.substitutionA(4); Exception no more than 3 at a time
            System.out.println("S: " + S);
            iSoccer iS = (iSoccer) S;
            iS.setSubB(3);
            iS.setScoreA(1);
            System.out.println("iS: " + iS);
            G = (Game)iS; //ObjectA is gone no refrence to it anymore.
            System.out.println("G: " + G);
            S.setTeamA("Real");
            System.out.println("S: " + S);
            System.out.println("G: " + G);
            System.out.println("iS: " + iS);
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
