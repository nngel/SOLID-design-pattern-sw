public class Pet{
    private String petName;
    private String owner;

    public Pet(String petName, String owner){
        this.petName = petName;
        this.owner = owner;
    }

    public String makeSound(){
        return petName +" makes sound";
    }
    public String eat(){
        return petName +" is eating";
    }
}