package model;
public class AnimalDomestico extends Animal {
    
    public AnimalDomestico(String nome, Integer idade, Boolean alimentado){
        super(nome, idade, alimentado);
    }

    @Override
    public String somCaracteristico() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void alimentarAnimal(Animal animal) {
        // TODO Auto-generated method stub
        animal.setAlimentado(true);
        return;
    }

    public void verificarAlimentacao(Animal animal){
        if(animal.getAlimentado() == false){
            System.out.println("O Animal não foi alimentado!");
        }else{
            System.out.println("O Animal já foi alimentado!");
        }
    }



}

