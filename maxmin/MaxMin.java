package com.mac190.maxmin;
//design and code a class MaxMin that has the following:
//*1 two integer private variables max and min where max should always be greater or equal than min
//*2 a default constructor that sets bot max and min to 0
//*3 a constructor that accepts two integers and sets max to the largest and min to the smallest
//*4 a constructor that accepts one integer and sets both max and min to that integer
//*5 getters for max and min
//*6 setters for max and min: If you try to set max to a smaller value than min
// then min should be set to that value and max should be set to the old min value
// example: min=2, max=6. setMax(-3) then min becomes -3 and max = 2
//Similarly if you try to set min to a larger value than max then max is set to that and min is set to the old max value

//*5 toString to return man min as (min, man)
//*6 method boolean equals to compare two max min objects.
//*7 method MaxMin add(int a) that returns a MaxMin object that is the sum of this
//and a (a is add to both max and min of this to create the new object)
//*8 method MaxMin add(MaxMin m) that returns an object MaxMin with the max as
//the sum of the two max values and min the sum of the two min values.
//9 writ a main where you use all constructors and all methods with appropriate variables of your choice.
public class MaxMin {
    private int max;
    private int min;

    public MaxMin(){
        max=0;
        min=0;
    }
    public MaxMin(int a, int b)
    {
        if(a>b)
        {
            max=a;
            min=b;
        }
        else
        {
            max=b;
            min=a;
        }
    }
    public MaxMin (int a)
    {
        max=a;
        min=a;
    }
    public int getMax()
    {
        return max;
    }
    public int getMin()
    {
        return min;
    }
    public void setMax(int a)
    {
        if(a<min)
        {
            max=min;
            min=a;
        }
        else
            max =a;
    }
    public void setMin(int b)
    {
        if(b>max)
        {
            min=max;
            max=b;
        }
        else
            min=b;
    }
    public String toString()
    {
        return "("+min+", "+max+")";
    }
    public boolean equals(Object x)
    {
        if(!x.getClass().equals(this.getClass()))
        {
            return false;
        }
        return true;
    }
    public MaxMin add(int a)
    {
        MaxMin result = new MaxMin(this.max+a,this.min+a);
        return result;
    }
    public MaxMin add(MaxMin m)
    {
        MaxMin sum = new MaxMin();
        sum.max =this.max+m.max;
        sum.min = this.min+m.min;
        return sum;
    }
}
