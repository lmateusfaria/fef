package model;
import java.util.ArrayList;

public class Canil {
    
    ArrayList<Animal> animais = new ArrayList<Animal>();

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
        
    }

    public void barulhoDoCanil(){
        for (Animal animal: animais){
            System.out.println(animal.somCaracteristico());
            System.out.println("BARULHO DO "+ animal.getNome());
        }
        return;
    }

    public void alimentarAnimais(){
        for (Animal animal : animais){
            animal.alimentarAnimal(animal);
            System.out.println( animal.getNome() + " <= ALIMENTADO ");
        }
        return;
    }
    
}
