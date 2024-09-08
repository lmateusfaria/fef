/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diarioclasse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author jeffe
 */
public class DiarioClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cria a lista de alunos
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe numero de alunos:");
        int numeroAlunos = leia.nextInt();
        
        for(int x=0;x<numeroAlunos;x++){
            //entra com dados de n alunos
            Aluno aluno = new Aluno();
            System.out.println("Nome:");
            aluno.setNome(leia.nextLine());
            System.out.println("Nota 01");
            aluno.setNota1(leia.nextDouble());
            System.out.println("Nota 02");
            aluno.setNota2(leia.nextDouble());
            System.out.println("Nota 03");
            aluno.setNota3(leia.nextDouble());
            System.out.println("Nota 04");
            aluno.setNota4(leia.nextDouble());
            
            aluno.calcularMedia();
            //insere o aluno na lista
            alunos.add(aluno);
        }
        
        int alunosSalaAula = 0; //armazena nro de alunos
        double mediaAcumuladaSala = 0; //acumula a media dos alunos
        
        for(Aluno aluno : alunos){
            mediaAcumuladaSala += aluno.getMedia();
            alunosSalaAula++;
        }
        
        System.out.println("A  media da sala "+(mediaAcumuladaSala/alunosSalaAula));
        
    }
    
}
