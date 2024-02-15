import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int app=0,win=0;

        String pt1,pt2,pt3,pt4,pt5,pt6;
        
        while(app==0){
            
            System.out.println("Digite o resultado da primeira disputa:");
            pt1 = ler.nextLine();
            if(pt1.toUpperCase().equals("V")){
                win++;
            }else if (pt1.toUpperCase().equals("P")){

            }else{
                System.out.println("Resposta Inválida!");
                break;
            }

            System.out.println("Digite o resultado da segunda disputa:");
            pt2 = ler.nextLine();
            if(pt2.toUpperCase().equals("V")){
                win++;
            }else if (pt2.toUpperCase().equals("P")){

            }else{
                System.out.println("Resposta Inválida!");
                break;
            }

            System.out.println("Digite o resultado da terceira disputa:");
            pt3 = ler.nextLine();
            if(pt3.toUpperCase().equals("V")){
                win++;
            }else if (pt3.toUpperCase().equals("P")){

            }else{
                System.out.println("Resposta Inválida!");
                break;
            }

            System.out.println("Digite o resultado da quarta disputa:");
            pt4 = ler.nextLine();
            if(pt4.toUpperCase().equals("V")){
                win++;
            }else if (pt4.toUpperCase().equals("P")){

            }else{
                System.out.println("Resposta Inválida!");
                break;
            }

            System.out.println("Digite o resultado da quinta disputa:");
            pt5 = ler.nextLine();
            if(pt5.toUpperCase().equals("V")){
                win++;
            }else if (pt5.toUpperCase().equals("P")){

            }else{
                System.out.println("Resposta Inválida!");
                break;
            }

            System.out.println("Digite o resultado da sexta disputa:");
            pt6 = ler.nextLine();
            if(pt6.toUpperCase().equals("V")){
                win++;
            }else if (pt6.toUpperCase().equals("P")){

            }else{
                System.out.println("Resposta Inválida!");
                break;
            }
            

            if(win == 5 || win == 6){
                System.out.println("Grupo 1 - Número de vitórias: "+win);
                break;
            }else if(win == 4 || win == 3){
                System.out.println("Grupo 2 - Número de vitórias: "+win);
                break;
            }else if(win == 2 || win == 1){
                System.out.println("Grupo 3 - Número de vitórias: "+win);
                break;
            }else{
                win=-1;
                System.out.println(win);
            }

            ler.close();
            break;
        }
    }
}
