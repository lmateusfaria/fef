package model;

abstract class Veiculo {
    private String marca ;
    private String modelo ;
    private Integer anoFabricacao ;
    private Double aluguelDiario ;
    private Boolean alugado ;

    public Veiculo() {
        this.marca = "";
        this.modelo = "";
        this.anoFabricacao = 0;
        this.aluguelDiario = 0.0;
        this.alugado = false;
    }
    
    public Veiculo(String marca, String modelo, Integer anoFabricacao, Double aluguelDiario, Boolean alugado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.aluguelDiario = aluguelDiario;
        this.alugado = alugado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Double getAluguelDiario() {
        return aluguelDiario;
    }

    public void setAluguelDiario(Double aluguelDiario) {
        this.aluguelDiario = aluguelDiario;
    }

    public Boolean getAlugado() {
        return alugado;
    }

    public void setAlugado(Boolean alugado) {
        this.alugado = alugado;
    }

    

    public abstract String getTipo();


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((anoFabricacao == null) ? 0 : anoFabricacao.hashCode());
        result = prime * result + ((aluguelDiario == null) ? 0 : aluguelDiario.hashCode());
        result = prime * result + ((alugado == null) ? 0 : alugado.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Veiculo other = (Veiculo) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (anoFabricacao == null) {
            if (other.anoFabricacao != null)
                return false;
        } else if (!anoFabricacao.equals(other.anoFabricacao))
            return false;
        if (aluguelDiario == null) {
            if (other.aluguelDiario != null)
                return false;
        } else if (!aluguelDiario.equals(other.aluguelDiario))
            return false;
        if (alugado == null) {
            if (other.alugado != null)
                return false;
        } else if (!alugado.equals(other.alugado))
            return false;
        return true;
    }

    public void exibirVeiculo() {
            System.out.println("Veiculo\nMarca: " + this.marca +
                               "\nModelo: " + this.modelo +
                               "\nAno de Fabricacao: " + this.anoFabricacao +
                               "\nAluguel Diario: " + this.aluguelDiario +
                               "\nSituação: " + (this.alugado ? "INDISPONÍVEL":"DISPONÍVEL") +
                               "\nTipo: "+this.getTipo());
            return ;    
    }

}









package model;

public class carroComum extends Veiculo {
    
    
    public carroComum(String marca, String modelo, Integer anoFabricacao, Double aluguelDiario,Boolean alugado){
        super( marca, modelo, anoFabricacao, aluguelDiario,alugado);
    }


    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return "Carro Comum";
    }
    
}





package model;

public class carroLuxo extends Veiculo {
    
    public carroLuxo (String marca, String modelo, Integer anoFabricacao, Double aluguelDiario,Boolean alugado){
        super( marca, modelo, anoFabricacao, aluguelDiario,alugado);
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return "Carro de Luxo";
    }
}












package model;
import java.util.ArrayList;


public class Locadora {
    
    private ArrayList<Veiculo> frota = new  ArrayList<Veiculo>();

    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public void aluga(String veiculoDigitado) {
        for (Veiculo veiculo : frota){
            if(veiculo.getModelo().equals(veiculoDigitado) && veiculo.getAlugado().equals(false)){
                veiculo.setAlugado(true);
                System.out.println("Carro Alugado com Sucesso!");
                return;
            }else{
                //System.out.println("Erro ao Alugar!\nO Veiculo não está Disponível!");
            }
        }
        
        
    }

    public void devolve(String veiculoDigitado) {
        for (Veiculo veiculo : frota){
            if(veiculo.getModelo().equals(veiculoDigitado) && veiculo.getAlugado().equals(true)){
                veiculo.setAlugado(false);
                System.out.println("Carro Devolvido com Sucesso!");
                return;
            }else{
                //System.out.println("Erro ao Devolver!\nO Veiculo não está Disponível!");
            }
        }
        
    }

    public void exibirVeiculosDisponiveis(){
        for (Veiculo veiculo : frota){
            if(veiculo.getAlugado().equals(false)){
                System.out.println("--------------------------------------");
                veiculo.exibirVeiculo();
            }
        }
        
    }
}









package model;

public class Van extends Veiculo {
    public Van (String marca, String modelo, Integer anoFabricacao, Double aluguelDiario,Boolean alugado){
        super( marca, modelo, anoFabricacao, aluguelDiario,alugado);
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return "Van";
    }
}













import model.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Locadora locadora = new Locadora();

        Integer menuVeiculos = 0, tipoVeiculo = 0;

        System.out.println("Bem vindo a Locadora de Veiculos");
        do {
            System.out.println("1 - Adiciona um Novo Veiculo");
            System.out.println("2 - Aluga um Veiculo");
            System.out.println("3 - Devolve um Veiculo");
            System.out.println("4 - Exibi Veiculos Disponiveis");
            System.out.println("Insira uma opção: ");

            menuVeiculos = ler.nextInt();

            if (menuVeiculos.equals(1)) {
                System.out.println("Para adicionar um carro, primeiro você deve selecionar o seu tipo:");
                System.out.println("1-Carro Comum\n2-Carro de Luxo\n3-Van\nInsira uma opção: ");
                tipoVeiculo = ler.nextInt();
                if (tipoVeiculo.equals(1)) {

                    carroComum carroComum = new carroComum(null, null, 0, null, false);

                    System.out.println("Digite a Marca: ");
                    carroComum.setMarca(ler.next());

                    System.out.println("Digite o Modelo: ");
                    carroComum.setModelo(ler.next());

                    System.out.println("Digite o Ano de Fabricação: ");
                    carroComum.setAnoFabricacao(ler.nextInt());

                    System.out.println("Digite o Aluguel Diario: ");
                    carroComum.setAluguelDiario(ler.nextDouble());

                    locadora.adicionarVeiculo(carroComum);

                    System.out.println("Veiculo Adicionado => CARRO COMUM ");

                } else if (tipoVeiculo.equals(2)) {
                    carroLuxo carroLuxo = new carroLuxo(null, null, 0, null, false);

                    System.out.println("Digite a Marca: ");
                    carroLuxo.setMarca(ler.next());

                    System.out.println("Digite o Modelo: ");
                    carroLuxo.setModelo(ler.next());

                    System.out.println("Digite o Ano de Fabricação: ");
                    carroLuxo.setAnoFabricacao(ler.nextInt());

                    System.out.println("Digite o Aluguel Diario: ");
                    carroLuxo.setAluguelDiario(ler.nextDouble());

                    locadora.adicionarVeiculo(carroLuxo);

                    System.out.println("Veiculo Adicionado => CARRO DE LUXO");

                } else if (tipoVeiculo.equals(3)) {
                    Van van = new Van(null, null, 0, null, false);

                    System.out.println("Digite a Marca: ");
                    van.setMarca(ler.next());

                    System.out.println("Digite o Modelo: ");
                    van.setModelo(ler.next());

                    System.out.println("Digite o Ano de Fabricação: ");
                    van.setAnoFabricacao(ler.nextInt());

                    System.out.println("Digite o Aluguel Diario: ");
                    van.setAluguelDiario(ler.nextDouble());

                    locadora.adicionarVeiculo(van);

                    System.out.println("Veiculo Adicionado => VAN ! ");

                    
                } else {
                    System.out.println("OPÇÃO INVALIDA");
                    
                }

            } else if (menuVeiculos.equals(2)) {
                System.out.println("Insira o modelo do carro: ");
                locadora.aluga(ler.next());
            } else if (menuVeiculos.equals(3)) {
                System.out.println("Insira o modelo do carro: ");
                locadora.devolve(ler.next());
            } else if (menuVeiculos.equals(4)) {
                 
                System.out.println("Frota Disponivel da Locadora: ");
                locadora.exibirVeiculosDisponiveis();

                
            } else {
                System.out.println("OPÇÃO INVALIDA");
                
            }

        } while ((menuVeiculos == (1) || menuVeiculos.equals(2) || menuVeiculos.equals(3) || menuVeiculos.equals(4)));

        ler.close();
    }
}

