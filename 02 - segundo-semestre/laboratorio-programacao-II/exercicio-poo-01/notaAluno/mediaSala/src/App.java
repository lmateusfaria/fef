import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        List<Aluno> alunos = new ArrayList<Aluno>();

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o numero de Alunos!");
        int numeroAlunos = ler.nextInt();

        for (int x=0; x <= numeroAlunos ; x++){
            Aluno aluno = new Aluno();

            System.out.println("Nome:");
            aluno.setNome(ler.nextLine());

            System.out.println("Nota 1:");
            aluno.setNota1(ler.nextDouble());

            System.out.println("Nota 2:");
            aluno.setNota2(ler.nextDouble());

            System.out.println("Nota 3:");
            aluno.setNota3(ler.nextDouble());

            System.out.println("Nota 4:");
            aluno.setNota4(ler.nextDouble());
            
            aluno.calcularMedia();

            alunos.add(aluno);

        }

        int alunosSalaAula = 0;// Armazena numero de alunos
        double mediaAcumuladaSala = 0.0;//Acumula a media dos alunos
        
        for(Aluno aluno: alunos){
            mediaAcumuladaSala += aluno.getMedia();
            alunosSalaAula++;
        }
        System.out.println("A media da sala "+ mediaAcumuladaSala/alunosSalaAula);

        ler.close();
    }
}
