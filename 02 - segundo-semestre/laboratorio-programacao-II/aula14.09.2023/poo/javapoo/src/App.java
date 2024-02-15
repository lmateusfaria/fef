package ;

public class App {
    public static void main(String[] args) throws Exception {
        Cat tom = new Cat();
        
        tom.setAge("5");
        tom.setColor("White");
        tom.setGender("Male");
        tom.setName("Cisco");
        tom.setWeight("5");
        
        System.out.println("O Gato "+tom.getName()+" tem "+ tom.getAge() + "anos");

    }

}
