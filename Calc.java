
public class Calc{
    //the two private variables
    private double number1;

    private double number2;

    //this is  the constructor containing initial values for the private variables
    public Calc(){
        number1= 0;
        number2= 0;
    }
    //these are the set methods
    public void setNum1(double n1){
        number1= n1;
    }

    public void setNum2(double n2){
        number2= n2;
    }
    //these are the get methods
    public double getNum1(){
        return number1;
    }

    public double getNum2(){
        return number2;
    }
    //this method adds the variables
    public double add(){
        return number1 + number2;
    }

   //this method subtracts the variables
    public double subtract(){
        return number1 - number2;
    }

    //this method multiplies the variables
    public double multiply(){
        return number1 * number2;
    }

    //this method divides the variables
    public double divide(){
        return number1 / number2;
    }
}
