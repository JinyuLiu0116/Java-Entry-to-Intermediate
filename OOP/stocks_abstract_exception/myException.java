package com.mac190.stocks_abstract_exception;

public class myException extends Exception{
    private int code;
    private String msg;
    public myException(int c,String m){
        super(m);
        this.code=c;
        this.msg=m;
    }
    public String getMessage(){
        return "Code: "+this.code+", Message: "+this.msg;
    }
    public String sayHi(){
        return "Hi, this is myException.";
    }
}
