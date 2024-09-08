import java.util.Scanner;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Integer menu = 0, tipoAnimal = 0;
        
        Canil pulguentos = new Canil();

        do{

            System.out.println("BEM VINDO AO CANIL PULGUENTOS");
            System.out.println("1 - ADICIONA NOVO ANIMAL");
            System.out.println("2 - ALIMENTA TODOS OS ANIMAIS");
            System.out.println("3 - OUÇA OS ANIMAIS");
            menu = ler.nextInt();

            System.out.println(menu);
            if(menu==1){

                System.out.println("\nINSIRIA O TIPO DE ANIMAL!\n1 - CACHORRO\n2- GATO");
                tipoAnimal = ler.nextInt();

                if(tipoAnimal == 1){
                    Cachorro dog = new Cachorro();
                    //Cachorro bob = new Cachorro("Bob", 4, false);
                    //Cachorro zeca = new Cachorro("Zeca", 1, false);
                    //Cachorro marley = new Cachorro("Marley", 20, false);
                    System.out.println("DIGITE O NOME DO CACHORRO: ");
                    dog.setNome(ler.next());
                    System.out.println("DIGITE A IDADE DO CACHORRO: ");
                    dog.setIdade(ler.nextInt());
                    
                    pulguentos.adicionarAnimal(dog);
                    
                }else if (tipoAnimal == 2){
                    
                    Gato cat = new Gato(); 

                    System.out.println("DIGITE O NOME DO GATO: ");
                    cat.setNome(ler.next());
                    System.out.println("DIGITE A IDADE DO CACHORRO: ");
                    cat.setIdade(ler.nextInt());
                    pulguentos.adicionarAnimal(cat);
                    
                }else{
                    System.out.println("\n!!!VALOR INVALIDO!!!\n");
                }

            }else if (menu==2){

                System.out.println("ALIMENTANDO TODOS OS ANIMAIS :D");

                pulguentos.alimentarAnimais();
                System.out.println();
                System.out.println("TODOS ANIMAIS FORAM ALIMENTADOS :P");

            }else if (menu == 3){
                System.out.println("ESCUTE O BARULHO DO CANIL PULGUENTOS!");
                pulguentos.barulhoDoCanil();


            }else{  
                System.out.println("\n!!!VALOR INVALIDO!!!\n");
            }

        }while(menu != 1 || menu != 2 || menu == 3 );
        ler.close();
    }
}
