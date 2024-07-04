public class Classes_Practice {
   
    private int max, min;
    //constructor inistialize max and min to 0
    public Classes_Practice()
    {
        max=0;
        min=0;
    }
    //constructor with one parameter a, set max and min to a
    public Classes_Practice(int a)
    {
        max=a;
        max=b;
    }
    //constructor wit two parameter a, b, set max to be large one and min to be small one
    public Classes_Practice(int a, int b)
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
    //return the value of max
    public int getMax()
    {
        return max;
    }
    //return the value of min
    public int getMin()
    {
        return min;
    }
    //set max value
    public void setMax(int a)
    {
        if(a > max)
            max=a;
        else if(a > min && a <= max)
            max=max;
        else
            min=a;
    }
    //set min value
    public void setMin(int a)
    {
        if( a < min)
            min=a;
        else if(a < max && a >= min)
            min=min;
        else
            max=a;
    }
    //print out max and min in form of (max, min)
    public String toString()
    {
        return "("+max+", "+min+")";
    }
    //compare two object, return boolean value
    public boolean equals(Classes_Practice obj)
    {
        if(this.max==obj.man&&this.min==obj.min)
            return ture;
        else
            return false;
    }
    //accept value a and add it to both max and min
    public Classes_Practice add(int a)
    {
        Classes_Practice sum = (this.max+a, this.min+a);
        return sum;
    }
    //take a object as argument and return a object with the sum of two objects
    public Classes_Practice add(Classes_Practice obj)
    {
        Classes_Practice sum;
        sum.max=this.max+obj.max;
        sum.min=this.min+obj.min;
        return sum;
    }
}
