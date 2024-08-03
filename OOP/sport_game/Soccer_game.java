package com.mac190.game_practice;

public class Soccer_game extends Sport_Game implements iSoccer_game {
    private String referee;

    public String getReferee(){return this.referee;}
    public void setReferee(String referee){this.referee=referee;}

    @Override
    public String toString() {
        return "Soccer_game{" +
                "referee='" + referee + '\'' +
                '}'+super.toString();
    }
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(super.equals(obj))) return false;
        Soccer_game G=(Soccer_game) obj;
        return super.equals(G)&&this.getReferee().equals(G.getReferee());
    }

    public void setSubA(int subA) throws Exception{
        if(subA>3){
            throw new Exception("Cannot have more then three substitution at once!");
        }else if(subA+this.getSubA()>5){
            throw new Exception("Cannot have more then five substitution in one game!");
        }else{
            this.subA+=subA;
        }
    }
    public void setSubB(int subB) throws Exception{
        if(subB>3){
            throw new Exception("Cannot have more then three substitution at once!");
        }else if(subB+this.getSubB()>5){
            throw new Exception("Cannot have more then five substitution in one game!");
        }else{
            this.subB+=subB;
        }
    }
    public void setScoreA(int scoreA) throws Exception {
        if(scoreA!=1)
            throw new Exception("Soccer can only be one!");
        else
            this.scoreA+=scoreA;
    }
    public void setScoreB(int scoreB) throws Exception{
        if(scoreB!=1)
            throw new Exception("Soccer can only be one!");
        else
            this.scoreB+=scoreB;
    }

}
