package com.mac190.maxminprime;

import com.mac190.prime.Prime;

public class MaxMinPrime {
    private Prime max, min;

    //default constructor sets both min and max to default primes
    public MaxMinPrime() {
        this.max = new Prime();
        this.min = new Prime();
    }

    //constructor accepting an integer and sets both to primes made out of that integer

    public MaxMinPrime(int a) {
        this.max = new Prime(a);
        this.min = new Prime(a);
    }

    //constructor accepting a prime number and sets both to the sam
    public MaxMinPrime(Prime p) {
        this.max = p;
        this.min = p;
    }

    //constructor that accepts two primes, set min to the smallest and max to the largest
    public MaxMinPrime(int a, int b) {
        if (a > b) {
            this.max = new Prime(a);
            this.min = new Prime(b);
        } else {
            this.max = new Prime(b);
            this.min = new Prime(a);
        }
    }

    public MaxMinPrime(Prime a, Prime b) {
        if (a.getPrime() > b.getPrime()) {
            this.max = a;
            this.min = b;
        } else {
            this.max = b;
            this.min = a;
        }
    }


    //getters for min and max returning Primes and getters returning integers(We have to use different names)
    public Prime getMax() {
        return this.max;
    }

    public Prime getMin() {
        return this.min;
    }

    public int getIntMax() {
        return max.getPrime();
    }

    public int getIntMin() {
        return min.getPrime();
    }

    //setters for min and max one that accepts a Prime and another that accepts and
    // an integer, should behave similar to the setters in MaxMin class
    public void setMax(Prime a) {
        if (a.getPrime() < min.getPrime()) {
            this.max = this.min;
            this.min = a;
        } else {
            this.max = a;
        }
    }

    public void setIntMax(int a) {
        if (a < min.getPrime()) {
            this.max = this.min;
            this.min = new Prime(a);
        } else {
            this.max = new Prime(a);
        }
    }

    public void setMin(Prime b) {
        if (b.getPrime() > max.getPrime()) {
            this.min = this.max;
            this.max = b;

        } else {
            this.min = b;
        }
    }

    public void setIntMin(int b) {
        if (b > max.getPrime()) {
            this.min = this.max;
            this.max = new Prime(b);
        } else {
            this.min = new Prime(b);
        }
    }

    //toString and equals
    public String toString() {
        return "(" + this.min.getPrime() + ", " + this.max.getPrime() + ")";
    }

   public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MaxMinPrime)) return false;
        MaxMinPrime p = (MaxMinPrime)o;
        return this.max.getPrime()==p.max.getPrime()&&this.min.getPrime()==p.min.getPrime();
    }

    //MaxMinPrime add(int a)
    public MaxMinPrime add(int a) {
        MaxMinPrime obj = new MaxMinPrime(this.max.getPrime() + a,
                this.min.getPrime() + a);
        return obj;
    }

    //MaxMinPrime add(Prime a)
    public MaxMinPrime add(Prime b) {
        MaxMinPrime obj = new MaxMinPrime(this.max.getPrime() + b.getPrime(),
                this.min.getPrime() + b.getPrime());
        return obj;
    }

    //MaxMinPrime add(MaxMinPrime p)
    public MaxMinPrime add(MaxMinPrime c) {
        MaxMinPrime obj = new MaxMinPrime(this.max.getPrime() + c.max.getPrime(),
                this.min.getPrime() + c.min.getPrime());
        return obj;
    }

    //Make the above methods as static
    public static MaxMinPrime add(MaxMinPrime p, int a) {
        MaxMinPrime obj = new MaxMinPrime(p.max.getPrime() + a,
                p.min.getPrime() + a);
        return obj;
    }

    public static MaxMinPrime add(MaxMinPrime p, Prime b) {
        MaxMinPrime obj = new MaxMinPrime(p.max.getPrime() + b.getPrime(),
                p.min.getPrime() + b.getPrime());
        return obj;
    }

    public static MaxMinPrime add(MaxMinPrime p, MaxMinPrime c) {
        MaxMinPrime obj = new MaxMinPrime(p.max.getPrime() + c.max.getPrime(),
                p.min.getPrime() + c.min.getPrime());
        return obj;
    }
    //Test
}
