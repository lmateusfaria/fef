package model;

public class Cachorro extends AnimalDomestico{
    
    public Cachorro(String nome, Integer idade, Boolean alimentado ){
        super(nome, idade, alimentado);
    }

    public Cachorro(){
        super( "", 0, false);
    }

    @Override
    public String somCaracteristico() {
        // TODO Auto-generated method stub
        return "Auau";
    }
    
    @Override
    public void alimentarAnimal(Animal animal) {
        // TODO Auto-generated method stub
        super.alimentarAnimal(animal);
    }
}
