
public class Funcionario {
    String nome;
    String cargo;
    float valor_h_trab;
    int qtdht;
    float calc;

    public float calc_sal(float valor_h, float qtd) {
        calc = valor_h * qtd;
        return calc;
    }

    public float desc_sal(float sal, float desc) {
        float novo_sal = sal - desc;
        return novo_sal;
    }
}
