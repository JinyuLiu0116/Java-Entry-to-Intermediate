package com.mac190.even;

public class Even {
    int num = 2;

    public String toString(){
        String str = "num:"+num;
        return str;
    }
    void add(int a)
    {
        num+=a;
        if(num%2 != 0){
            num++;
        }
    }
}
