package com.mac190.maxminprime;

/*
Design and code a class prime that has one integer private member variable that's prime
at all times
check/Default constructor set num to 2
constructor that accepts an integer and sets num to the closed prime to that
integer if it's not prime
(use the static method isPrime(int a) to check if a number is prime or not
setters getters (setter should make sure you set num to a prime)
toString
equals
 Prime add(int a) //as a member of the class
 same method as a static method
 Prime add (Prime p)
 Test your class in a tester. Test all constructors nd methods including the static add
 */
public class Prime {
    private int prime;

    public Prime() {
        this.prime = 2;
    }

    public Prime(int a) {
        setPrime(a);
    }

    private boolean checkPrime(int a) {
        if (a < 1)
            return false;
        if (a == 2)
            return true;
        if(a%2==0)
            return false;
        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public void setPrime(int a) {
        while (!checkPrime(a))
            a++;
        this.prime = a;
    }

    public int getPrime() {
        return prime;
    }

    public String toString() {
        return "Prime: " + prime;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prime)) return false;
        Prime p = (Prime) o;
        return prime == p.prime;
    }

    public Prime add(int a) {
        Prime result = new Prime(this.prime + a);
        return result;
    }

    public static Prime add(Prime p,int a){
        Prime result = new Prime(p.prime + a);
        return result;
    }

    public Prime add(Prime p) {
        Prime result = new Prime(this.prime + p.prime);
        return result;
    }

}
