package model;

public class Gato extends AnimalDomestico {
    public Gato(String nome, Integer idade, Boolean alimentado){
        super(nome, idade, alimentado);
    }
    
    public Gato(){
        super("", 0, false);
    }

    @Override
    public void alimentarAnimal(Animal animal) {
        // TODO Auto-generated method stub
        super.alimentarAnimal(animal);
    }

    @Override
    public String somCaracteristico() {
        // TODO Auto-generated method stub
        return "Miau";
    }

}
