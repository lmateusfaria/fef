import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int idade1,idade2,idade3,app=0;
        boolean camila1,camila2,camila3;

        while(app==0){
                
            System.out.println("Digite a primeira idade:");
            idade1 = ler.nextInt();
            if(idade1 <= 4 || idade1 >= 101){System.out.println("Idade Inválida!");break;}

            System.out.println("Digite a segunda idade:");
            idade2 = ler.nextInt();
            if(idade2 <= 4 || idade2 >= 101){System.out.println("Idade Inválida!");break;}

            System.out.println("Digite a terceira idade:");
            idade3 = ler.nextInt();
            if(idade3 <= 4 || idade3 >= 101){System.out.println("Idade Inválida!");break;}
            
            camila1 = (idade1 < idade2 && idade1 >= idade3) || (idade1 <= idade3 && idade1 > idade2);

            camila2 = (idade2 <= idade1 && idade2 > idade3) || (idade2 < idade3 && idade2 >= idade1);

            camila3 = (idade3 <= idade2 && idade3 > idade1) || (idade3 < idade1 && idade3 >= idade2);

            if (camila1){
                System.out.println(idade1);
            }
            if (camila2){
                System.out.println(idade2);
            }
            if (camila3){
                System.out.println(idade3);
            }
            ler.close();
            break;
        }
    }
}
