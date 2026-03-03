public class Animal {

    private String Species;

    public Animal(){
        Species= "";
    }
    public Animal(String newSpecies){
        Species= newSpecies;
    }
    public void setSpecies(String newSpecies){
         Species= newSpecies;
    }

    public String getspecies(){
        return Species;
    }
    public String toString(){
        return "Species: " + Species;
    }
}

