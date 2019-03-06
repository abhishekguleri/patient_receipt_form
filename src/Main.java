import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Hello patient\nplease fill the reciept form: ");

        Scanner name = new Scanner(System.in);//start the scanner class to take input

        System.out.println("\033[1;32m enter your name:");
        String enter = name.nextLine(); //take string input in the scanner class
        System.out.println("\033[1;34myour entered number is " + enter);

        System.out.println("\033[1;32menter your year of birth:");
        String num1 = name.nextLine();//take integer input in the scanner class
        System.out.println("\033[1;34myour year of birth is =" + num1);

        System.out.println("\033[1;32menter your weight:");
        double weight = name.nextDouble();//take double input in  the the scanner class
        System.out.println("\033[1;34myour weight is =" + weight);

        System.out.println("\033[1;32menter your age:");
        int age = name.nextInt();//take integer input in  the scanner class
        System.out.println("\033[1;34myour age is" + age);

        System.out.println("thanks for your time\n \033[1;34m wait for your name to be called" + enter);
        name.close();
    }
}
