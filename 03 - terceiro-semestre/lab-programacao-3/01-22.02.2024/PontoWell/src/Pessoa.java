import java.time.LocalDateTime;

public class Pessoa {
    String nome = "";
    Integer idade = 0;
    String sexo = "";
    String cpf = "";

    public String Ponto(){
        return "Entrada: "+LocalDateTime.now();
    }
    
    public String Sair(){
        return "Saída: "+LocalDateTime.now();
    }
    


}
