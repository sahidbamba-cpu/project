//Ibrahim Bamba
//01-30-2026


public class average
{
    public static void main(String[] args)
    {
        //assigns value to the variable
        double test1= 88.6;
        double test2=95.7;
        double test3=92.8;
        double average= (test1 + test2 + test3 )/3;

        //prints out the variable names and the assigned value
        System.out.println("Test score 1: " + test1);
        System.out.println("Test score 2: " + test2);
        System.out.println("Test score 3: " + test3);
        //prints out the average value with 2 decimal places
        System.out.printf("The average of 3 test score:  %.2f%n",  average);


    }
}
