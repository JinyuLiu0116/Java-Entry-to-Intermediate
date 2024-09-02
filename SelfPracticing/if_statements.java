import java.util.Random;
public class if_statements {
    public static void main(String[] args){
        Random random=new Random();
        int hourly= random.nextInt(34)+17;
        System.out.println("Hourly salary:$"+hourly);
        
        if(hourly==16)
        {
            System.out.println("You have a basic hourly salary.");
        }
        else if(hourly<=20)
        {
            System.out.println("You have an average hourly salary.");
        }
        else if (hourly<=30)
        {
            System.out.println("You have a nice hourly salary.");
        }
        else if (hourly<=40)
        {
            System.out.println("You have a high hourly salary.");
        }
        else
        {
            System.out.println("You have a great hourly salary.");
        }
    }
}
