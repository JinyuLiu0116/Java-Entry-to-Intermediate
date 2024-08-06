package com.mac190.game;

public interface iSoccer {
    String setTeamA(String a);
    String setTeamB(String b);
    String setReferee(String R);
    void setScoreA(int a)throws Exception;
    void setScoreB(int b)throws Exception;
    void setSubA(int a)throws Exception;
    void setSubB(int b)throws Exception;
    void WhoIsWinning();
}
