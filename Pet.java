//Ibrahim Bamba
//02/08/26
public class Pet {
   //private data fields
private String name;
  //public conductor
public Pet()
{
    this.setName("");
}
//public set or mutator method for every private data field(except when data fields are on read only)
public void setName(String newName)
{
    this.name= newName;
}
//public get or accessor method for every private field(except if it is a secret)
public String getName()
{
    return this.name;
}
//public toostring method that prints out all the objects states (meaning the data in the object that you will later instantiate in the main() method)
public String toString()
{
    String output = "Pet name: ";
    output += this.getName();
    return output;
}
    //main
    public static void main(String[] args)
    {
        //instantiate Pet
        Pet Mypet1= new Pet();
        Mypet1.setName("Lee");
        Pet Mypet2= new Pet();
        Mypet2.setName("donny");

        System.out.println("Pet information:");
        System.out.println("Name: " + Mypet1.getName());
        System.out.println();
        System.out.println("Pet information:");
        System.out.println("Name: " + Mypet2.getName());
    }
}