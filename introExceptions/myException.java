package com.mac190.introExceptions;

public class myException extends Exception {
    private int code;
    private String msg;
    public myException(int c, String m){
        super(m);
        code = c;
        msg = m;
    }
    public String getMessage(){
        return "Code: "+this.code+" message: "+this.msg;
    }
}
