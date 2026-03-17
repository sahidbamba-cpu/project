import java.util.Scanner;

public class run {
    public static void main(String[] args){
        //instantiate a Calc object
        Calc myCalculator = new Calc();
        //get user input for two numbers
        Scanner scan = new Scanner(System.in);
        // FIRST NUMBER (safe input)
        System.out.print("Please enter the first number: ");
        double n1;
        double n2;
        while(true){
            if(scan.hasNextDouble()){
                n1 = scan.nextDouble();

                if(myCalculator.validateNumber(n1)){
                    break;
                } else {
                    System.out.print("Invalid number. Try again:");
                }

            } else {
                System.out.print("Invalid input. Please enter a number:");
                scan.next(); // clear bad input
            }
        }

        // SECOND NUMBER (safe input)
        System.out.print("Please enter the second number: ");
        while(true){
            if(scan.hasNextDouble()){
                n2 = scan.nextDouble();

                if(myCalculator.validateNumber(n2)){
                    break;
                } else {
                    System.out.print("Invalid number. Try again:");
                }

            } else {
                System.out.print("Invalid input. Please enter a number:");
                scan.next();
            }
        }

        //pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        //output from Calc instance
        System.out.println(myCalculator);

        //examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        //calling Calc methods directly
        //can use a local variable for sum if you need that value for another calculation
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        //or if you don't, then just display the difference, product and quotient
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
}
