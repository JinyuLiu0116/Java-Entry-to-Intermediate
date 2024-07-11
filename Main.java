package com.mac190.oopPractice.staticKeyWord;

public class Main {
    public static void main(String[] args){

        Friend friend1 = new Friend("Sponegbob");

        System.out.println(Friend.numberOfFriends);

        Friend friend2 = new Friend("Patrick");

        System.out.println(Friend.numberOfFriends);

        Friend friend3 = new Friend("Patrick");

        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();

        



    }
}
