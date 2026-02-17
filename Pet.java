//Ibrahim Bamba
//02/08/26
public class Pet {

    //private data fields
    private int age;
    private String name;
    private String type;

    //public conductor
    public Pet() {
        this.name= "";
        this.type= "";
        this.age= 0;
    }

    public Pet(String newType, String newName, int newAge) {
        setName(newName);
        setType(newType);
        setAge(newAge);
    }

    //public set or mutator method for every private data field(except when data fields are on read only)
    public void setName(String newName) {
        this.name = newName;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    //public get or accessor method for every private field(except if it is a secret)
    public String getName() {
        return this.name;
    }

    //this public get or accessor Returns the type of pet
    public String getType() {
        return this.type;
    }

    //this public get or accessor Returns the age of the pet
    public int getAge() {
        return this.age;
    }

    public String Speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "woof";
        }
        else if (type.equalsIgnoreCase("cat")) {
            return "meow";
        }
        else {
            return "noise";
        }
    }

    //public toostring method that prints out all the objects states (meaning the data in the object that you will later instantiate in the main() method)
    public String toString() {
        String output = "Pet information: " + "\n";
        output += "Name: " + this.getName() + "\n";
        output += "Type: " + this.getType() + "\n";
        output += "Age: " + this.getAge() + "\n";
        output += "noise: " + Speak();
        return output;
    }

}