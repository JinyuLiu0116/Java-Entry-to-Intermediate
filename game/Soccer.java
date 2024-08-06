package com.mac190.game;

public class Soccer extends Game{
    private String Referee;

    public Soccer()throws Exception{
        super("Unknown","Unknown",1,0);
        this.Referee="Unknown";
    }
    public Soccer(String teamA,String teamB,int players,int subs,String ref)throws Exception{
        super(teamA,teamB,players,subs);
        this.Referee=ref;
    }
    public void setReferee(String ref){this.Referee=ref;}
    public String getReferee(){return this.Referee;}
    public String toString(){
        return super.toString()+", referee: "+this.getReferee();
    }
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (this==obj) return true;
        if (!super.equals(obj)) return false;
        Soccer s=(Soccer) obj;
        return super.equals(s)&&this.getReferee().equals(s.getReferee());
    }
    public void setScoreA(int a)throws Exception{
        if(a!=1){
            throw new Exception("Score only can be 1!");
        }else{
            this.ScoreA+=1;
        }
    }
    public void setScoreB(int b)throws Exception{
        if(b!=1){
            throw new Exception("Score only can be 1!");
        }else{
            this.ScoreB+=1;
        }
    }
    public void setSubA(int a)throws Exception{
        if(a>3){
            throw new Exception("Cannot have more than 3 players substituted at once!");
        }else if(this.getSubA()+a>5){
            throw new Exception("Max players substituted cannot more than 5, no more substitutions allowed!");
        }else{
            this.SubA+=a;
        }
    }
    public void setSubB(int b)throws Exception{
        if(b>3){
            throw new Exception("Cannot have more than 3 players substituted at once!");
        }else if(this.getSubB()+b>5){
            throw new Exception("Max players substituted cannot more than 5, no more substitutions allowed!");
        }else{
            this.SubB+=b;
        }
    }
}
