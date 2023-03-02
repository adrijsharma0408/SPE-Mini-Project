import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your function:\n""
                + "\t5. Natural log\n"
                + "\t6. Square\n"
                + "\t7. Square root\n"
                + "\t8. Exponent\n" +
                "\t9. Factorial");
        Integer funcID = input.nextInt();
        Integer number1=0;
        Integer number2=0;
        System.out.println("Enter Input: ");
        number1 = input.nextInt();
        if(funcID == 1 || funcID == 2 || funcID == 3 ||
                funcID == 4 || funcID == 8)
        {
            number2 = input.nextInt();
        }

        switch(funcID) {
            case 7: System.out.println(Calculator.squareRoot(number1));break;
            default: System.out.println("Invalid input");break;*/
        }

        input.close();
    }

}
