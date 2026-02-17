import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        //instantiate Pet
        Pet Mypet1= new Pet();
        Mypet1.setName("Lee");
        Mypet1.setAge(6);
        Mypet1.setType("dog");
        Pet Mypet2= new Pet();
        Mypet2.setName("donny");
        Mypet2.setAge(4);
        Mypet2.setType("cat");

        System.out.println(Mypet1.toString());
        System.out.println();
        System.out.println(Mypet2.toString());


        System.out.print("Enter animal type: ");
        String pettype= scnr.nextLine();

        System.out.print("Enter animal name: ");
        String petname= scnr.nextLine();

        System.out.print("Enter an age: ");
        int petage= scnr.nextInt();

        Pet Mypet3= new Pet(pettype, petname, petage);
        System.out.println();
        System.out.println(Mypet3.toString());
    }
}
