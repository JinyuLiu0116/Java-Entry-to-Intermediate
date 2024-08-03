package com.mac190.game_practice;

public abstract class Sport_Game {
    private String TeamA_name,TeamB_name;
    private int Max_players,Max_subs;
    protected int subA,subB,scoreA,scoreB;

    public Sport_Game(){
        this.TeamA_name=this.TeamB_name="N/A";
        this.Max_players=1;
        this.Max_subs=0;
        this.subA=this.subB=this.scoreA=this.scoreB=0;
    }
    public Sport_Game(String teamA, String teamB,int MaxP, int MaxS) throws Exception{
        this.setTeamA_name(teamA);
        this.setTeamB_name(teamB);
        this.setMax_players(MaxP);
        this.setMax_subs(MaxS);
        this.subA=this.subB=this.scoreA=this.scoreB=0;
    }
    public Sport_Game(Sport_Game sp){
        this.setTeamA_name(sp.getTeamA_name());
        this.setTeamB_name(sp.getTeamB_name());
        try{
            this.setMax_players(sp.getMax_players());
            this.setMax_subs(sp.getMax_subs());
            this.setSubA(sp.getSubA());
            this.setSubB(sp.getSubB());
            this.setScoreA(sp.getScoreA());
            this.setScoreB(sp.getScoreB());
        }catch(Exception e){

        }
    }
    public String getTeamA_name(){return this.TeamA_name;}
    public String getTeamB_name(){return this.TeamB_name;}
    public int getMax_players(){return this.Max_players;}
    public int getMax_subs(){return this.Max_subs;}
    public int getSubA(){return this.subA;}
    public int getSubB(){return this.subB;}
    public int getScoreA(){return this.scoreA;}
    public int getScoreB(){return this.scoreB;}
    public void setTeamA_name(String name){this.TeamA_name=name;}
    public void setTeamB_name(String name){this.TeamB_name=name;}

    @Override
    public String toString() {
        return "Sport_Game{" +
                "TeamA_name='" + TeamA_name + '\'' +
                ", TeamB_name='" + TeamB_name + '\'' +
                ", Max_players=" + Max_players +
                ", Max_subs=" + Max_subs +
                ", subA=" + subA +
                ", subB=" + subB +
                ", scoreA=" + scoreA +
                ", scoreB=" + scoreB +
                '}';
    }
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(obj instanceof Sport_Game)) return false;
        Sport_Game sg=(Sport_Game) obj;
        return this.getTeamA_name().equals(sg.getTeamA_name())&&this.getTeamB_name().equals(sg.getTeamB_name())&&
                this.getMax_players()==sg.getMax_players()&&this.getMax_subs()==sg.getMax_subs()&&
                this.getSubA()==sg.getSubA()&&this.getSubB()==sg.getSubB()&&this.getScoreA()==sg.getScoreA();
    }
    public void setMax_players(int players) throws Exception{
        if(players<=0){
            throw new Exception("number of players connot be negative or zero!");
        }else{
            this.Max_players=players;
        }
    }
    public void setMax_subs(int subs)throws Exception{
        if(subs<0){
            throw new Exception("number of subs cannot be negative!");
        }else{
            this.Max_players=subs;
        }
    }
    abstract public void setSubA(int subA) throws Exception;
    abstract public void setSubB(int subB) throws Exception;
    abstract public void setScoreA(int scoreA) throws Exception;
    abstract public void setScoreB(int scoreB) throws Exception;
    public String WhoIsWinner(){
        if(this.getScoreA()>this.getScoreB()){
            return "Team:"+this.getTeamA_name()+" is winner!";
        }else if(this.getScoreA()<this.getScoreB()) {
            return "Team:" + this.getTeamB_name() + " is winner!";
        }else{
            return "It is a tie!";
        }
    }

}
