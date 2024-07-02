package selfPractice.classes;

public class MainClass {
    public static void main(String[] args) {
        Classes firtClass = new Classes();
        System.out.print("Enter your name: ");
        firtClass.setName();
        System.out.println("Enter your grade for each subject:");
        firtClass.getInput();
        System.out.println("Your information is:");
        firtClass.display();
    }
}
