package com.mac190.oopPractice.methods;
/*


8- method MaxMin add(MaxMin m) that returns an object MaxMin with the max as
the sum of the two max values and min the sum of the two min values.
9- Write a main where you use all constructors and all methods with
appropriate variables of your choice.
 */

public class MaxMin {
    private int max,min;

    public MaxMin ()
    {
        max=0;
        min=0;
    }
    public MaxMin(int a)
    {
        max=a;
        min=a;
    }
    public MaxMin(int a, int b)
    {
        if(a>b){
            max=a;
            min=b;
        }
        else{
            max=b;
            min=a;
        }
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
        if(min>a)
        {
            max=min;
            min=a;
        }
        else
            max=a;
    }
    public void setMin(int a)
    {
        if(max<a)
        {
            min=max;
            max=a;
        }
        else
            min=a;
    }
    public String toString()
    {
        return "("+max+", "+min+")";
    }
    public boolean equals(MaxMin obj)
    {
        if(!obj.getClass().equals(this.getClass()))
            return false;
        else
            return true;
    }
    public MaxMin add(int a)
    {
        MaxMin obj = new MaxMin(this.max+a, this.min+a);
        return obj;
    }
    public MaxMin add(MaxMin obj)
    {
        MaxMin sum = new MaxMin();
        sum.max=obj.max+this.max;
        sum.min=obj.min+this.min;
        return sum;
    }

}
