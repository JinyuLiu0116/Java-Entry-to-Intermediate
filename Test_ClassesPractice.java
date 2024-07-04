public class Test_ClassesPractice {
    public static void main(String[] args){
        Classes_Practice test1 = new Classes_Practice();
        System.out.println("Test1: "+test1.toString());
        Classes_Practice test2 =new Classes_Practice(5);
        System.out.println("Test2: "+test2.toString());
        Classes_Practice test3 = new Classes_Practice(11, 20);
        System.out.println("Test3: "+test3.toString());

        tset1.setMin(10);
        System.out.println("Test1, Min: "+test1.getMin());
        test1.setMax(5);
        System.out.println("Test1, Max: "+test1.getMax());

        if(test1.equals(test2))
        {
            System.out.println("They are equal.");
        }
        else
            System.out.println("They are not equal.");

        System.out.println();
        System.out.println("Test3:"+test3.toString());
        test3.add(5);
        System.out.println("After add 5 to both max and min, test3: "+test3.toString());

        System.out.println();
        System.out.println("Test2:"+test2.toString());
        System.out.println("Test1:"+test1.toString());
        Classes_Practice sum = test2.add(test3);
        System.out.println("After add test2 to test1, the sum is:"+sum.toString());











    }
}
