
public class FilhoMedico extends Funcionario {
    String crm;
    float bonus;

    public float calcularBonus(float salario, float bonus) {
        float sal = salario + bonus;
        return sal;
    }

    public float calc_sal(float valor_h, float qtd) {
        double bonus_sal, salario_calc;
        calc = valor_h * qtd;
        bonus_sal = calc * 0.05;
        salario_calc = calc + Float.parseFloat("" + bonus_sal);

        return (float) salario_calc;
    }
}
