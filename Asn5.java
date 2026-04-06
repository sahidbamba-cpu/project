import java.util.ArrayList;
public class Asn5 {
    public static void main(String[] args){
        //Creates a new list called  Car Brands
        ArrayList<String> carBrands= new ArrayList<>();
        carBrands.add("Toyota");
        carBrands.add("Lexus");
        carBrands.add("AlphaRomeo");
        carBrands.add("Honda");

        //Creates a list of numbers
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        //prints out the car brands list
        System.out.println("List of Car Brands:");
        for(String car: carBrands){
            System.out.print(car+ ", ");
        }
        System.out.println();
        System.out.println();
        //prints out the numbers list
        System.out.println("List of numbers:");
        for(int num: numbers){
            System.out.print(num + ", ");
        }
        System.out.println();
        System.out.println();
        // Removes the first item of the numbers list
        numbers.remove(0);

        //Replaces the item Toyota with BMW from the Car Brand list
        carBrands.set(0, "BMW");

        //Prints the newly edited Car Brands list
        System.out.println("New List of Car Brands:");
        for(String car: carBrands){
            System.out.print(car + ", ");
        }

        System.out.println();
        System.out.println();
        //Prints the newly edited numbers list
        System.out.println("New List of numbers:");
        for(int num: numbers){
            System.out.print(num + ", ");
        }
    }
}