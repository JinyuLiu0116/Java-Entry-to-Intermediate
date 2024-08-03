package com.mac190.game_practice;

public interface iSoccer_game {
    void setReferee(String referee);
    void setTeamA_name(String name);
    void setTeamB_name(String name);
    void setSubA(int subA) throws Exception;
    void setSubB(int subB) throws Exception;
    void setScoreA(int scoreA) throws Exception;
    void setScoreB(int scoreB) throws Exception;
    String WhoIsWinner();
}
