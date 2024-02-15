import model.Cat;

public class App {
    public static void main(String[] args) throws Exception {
        Cat tom = new Cat();
        
        tom.setAge("5");
        tom.setColor("White");
        tom.setGender("Male");
        tom.setName("Cisco");
        tom.setWeight("5");
        tom.setTipoDose("");
        
        //System.out.println("O Gato "+tom.getName()+" tem "+ tom.getAge() + " anos");

        //System.out.println(tom.toString());
        

        Cat nina = new Cat("Nina", "Female", "2", "1", "Blue", "");
        Cat nina2 = new Cat("Nina", "Female", "2", "1", "Blue","");


        System.out.println(nina.printCat());
        System.out.println(tom.printCat());

        if (nina == nina2){
            System.out.println("Nina é igual a nina2 -> VERDADE");
        } else {
            System.out.println("Nina é igual a nina2 -> FALSO");
        }

        if (nina.equals(nina2)){
            System.out.println("Nina é igual a nina2 -> VERDADE");
        
        }else{
            System.out.println("Nina é igual a nina2 -> FALSO");
        
        }
        
        System.out.println("Imprimindo o hashcode\n");
        System.out.println(tom.hashCode());
        System.out.println(nina.hashCode());
        System.out.println(nina2.hashCode());
        
        System.out.println("Dose Tom: " +tom.doseVermifugo("anual"));
        System.out.println("Dose Nina: " +nina.doseVermifugo("anual"));
        
        System.out.println(tom.doseVermifugo(tom.getTipoDose()));

        System.out.println(nina.toString());
        nina.envelhece();
        System.out.println(nina.toString());
        
    }
    
}
//overhide 
//na model ficara as aplicações da regras de negócio
//
