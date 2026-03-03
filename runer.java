public class runer {
    public static void main(String[] args){
        Animal animalOne= new Animal();
        animalOne.setSpecies("Dog");
        System.out.println(animalOne.toString());

        Animal animalTwo= new Animal();
        animalTwo.setSpecies("Cat");
        System.out.println(animalTwo.toString());
    }
}
