package com.mac190.game;

import java.util.Objects;

public abstract class Game {
    private String TeamA,TeamB;
    private int MaxPlayers, MaxSubs;
    private int ScoreA,ScoreB,SubA,SubB;

    public Game(){
        this.TeamA="Unknown";
        this.TeamB="Unknown";
        this.MaxPlayers=1;
        this.MaxSubs=0;
        ScoreA=ScoreB=SubA=SubB=0;
    }
    public Game(String teamA,String teamB,int players,int subs)throws Exception{
        this.setTeamA(teamA);
        this.setTeamB(teamB);
        this.setMaxPlayers(players);
        this.setMaxSubs(subs);
        ScoreA=ScoreB=SubA=SubB=0;
    }

    public void setTeamA(String teamA) {TeamA = teamA;}
    public void setTeamB(String teamB) {TeamB = teamB;}
    public void setMaxPlayers(int max)throws Exception{
        if(max<=0){
            throw new Exception("Max players cannot less then 1!");
        }else{
            this.MaxPlayers=max;
        }
    }
    public void setMaxSubs(int max)throws Exception{
        if(max<0){
            throw new Exception("Max substitutes cannot less then 0!");
        }else{
            this.MaxSubs=max;
        }
    }
    public String getTeamA(){return this.TeamA;}
    public String getTeamB(){return this.TeamB;}
    public int getMaxPlayers(){return this.MaxPlayers;}
    public int getMaxSubs(){return this.MaxSubs;}
    public int getScoreA(){return this.ScoreA;}
    public int getScoreB(){return this.ScoreB;}
    public int getSubA(){return this.SubA;}
    public int getSubB(){return this.SubB;}

    @Override
    public String toString() {
        return "Game{" +
                "TeamA='" + TeamA + '\'' +
                ", TeamB='" + TeamB + '\'' +
                ", MaxPlayers=" + MaxPlayers +
                ", MaxSubs=" + MaxSubs +
                ", ScoreA=" + ScoreA +
                ", ScoreB=" + ScoreB +
                ", SubA=" + SubA +
                ", SubB=" + SubB +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object==null) return false;
        if (this == object) return true;
        if (!(object instanceof Game)) return false;
        Game game = (Game) object;
        return MaxPlayers == game.MaxPlayers && MaxSubs == game.MaxSubs && ScoreA == game.ScoreA && ScoreB == game.ScoreB && SubA == game.SubA && SubB == game.SubB
                && this.getTeamA().equals(game.getTeamA())&&this.getTeamB().equals(game.getTeamB());
    }
    abstract public void setScoreA();
    abstract public void setScoreB();
    abstract public void setSubA();
    abstract public void setSubB();
    public void WhoIsWinning(){
        if(this.getScoreA()>this.getScoreB()){
            System.out.println(this.getTeamA()+" wins the game!");
        }else if(this.getScoreA()<this.getScoreB()){
            System.out.println(this.getTeamB()+" wins the game!");
        }else{
            System.out.println("It is a draw!");
        }
    }
}
