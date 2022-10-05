import java.util.Scanner;

public class App{

    static final Scanner inputscaner = new Scanner(System.in);

    private static String getString(String prompt) {
        String result = "";
        System.out.println(prompt);
        result = inputscaner.nextLine();

        return result;
    }
    
    private static double getDouble(String prompt) {
        double result= 0.0;
        System.out.println(prompt);
        result = inputscaner.nextDouble();
        return result;
    }

    public static void main(String[] args) {
        /* phase 3
       
        String qst0 = "whats your name? ";
        getString(qst0);

        Double num1 = getDouble("enter your first number");
        Double num2 = getDouble("enter second number");

        String test = String.format("(You want to add %f and %f", num1, num2);
        System.out.println(test);
        */

        /* phase 5 
        String qst0 = "lets add numbers ";
        System.out.println(qst0);
        // getString(qst0);

        Double num1 = getDouble("enter your first number");
        Double num2 = getDouble("enter second number");
        
        Calculator cal = new Calculator();
        double result = cal.add(num1, num2);
        System.out.println(result);

        qst0 = "lets subtract numbers ";
        System.out.println(qst0);

        num1 = getDouble("enter your first number");
        num2 = getDouble("enter second number");

        result = cal.subtract(num1, num2);
        System.out.println(result);

        qst0 = "lets multiply numbers ";
        System.out.println(qst0);

        num1 = getDouble("enter your first number");
        num2 = getDouble("enter second number");

        result = cal.multiply(num1, num2);
        System.out.println(result);

        qst0 = "lets divide numbers ";
        System.out.println(qst0);

        num1 = getDouble("enter your first number");
        num2 = getDouble("enter second number");

        result = cal.divide(num1, num2);
        System.out.println(result);
        */

        System.out.println("Welcome to the app calcluator");
        

        // String qst = null;
        boolean qst = true; 

        while(qst){
            System.out.println("choose from this options: ");
            System.out.println("a: to add numbers");
            System.out.println("b: to substract");
            System.out.println("c: to multiply");
            System.out.println("d: to divide");
            System.out.println("x: to exit");

            String qst2 =getString("insert option: ");

            if(qst2.equals("x")){
                qst = false;
            }

        }

        System.out.println("thanks or using the calculator! good bye");
        

    }

}