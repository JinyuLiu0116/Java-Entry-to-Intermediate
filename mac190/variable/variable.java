package com.mac190.variable;
//A variable is a name of a memory location where data is saved in the RAM(memory)
//The way certain data are saved will depend on their type, integers are not saved the
//same way floating numbers are saved. Same for strings or character etc .... That's why when we define a
//variable, we need to specify the variables type(the type of data that will be stored in that variable)
// type variableName = value;
// type can be any primitive type(native type):
// int long
// double(double precision decimal value) float(single precision decimal value)
// char boolean
//variableName is unique identifier for the variable so that you can refer to it(should not use: main, public,class,for...).
//variable should not start with a digit, and should not contain a special character: ~!@#$%^&*()...
//the more annoying special character is: space. because once there is space, you have two names not one.
public class variable {
    public static void main(String[] args){
        int student = 17;
        student = student + 13;
        System.out.println("The number of student is:"+student);
        double packet = 23.79;
        double amount = packet *2 + 3.4;
        System.out.println("You have total amount of money:$"+amount);
        boolean y = true, n = false;
        System.out.println("We have a class today. "+y);
        System.out.println("We do not have homework. "+n);
    }
}