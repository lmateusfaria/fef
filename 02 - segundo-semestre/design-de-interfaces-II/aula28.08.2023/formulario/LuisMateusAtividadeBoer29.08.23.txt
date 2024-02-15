<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <script>
        
        function calcularImpostoRenda(){
            var cpf = document.getElementById("idCpfContribuinte").value;
            var numeroDependentes = parseInt (document.getElementById("idNumeroDependentes").value);
            var renda = parseFloat(document.getElementById("idRendaMensal").value);
            var ir;
            renda = renda.toFixed(2);

            const SALARIO_MIN = 1320;
            const DESCONTO_POR_DEPENDENTE = 0.05;
            
            var valorDesconto = SALARIO_MIN*(DESCONTO_POR_DEPENDENTE*numeroDependentes);

            if (renda > 0 && renda <= 2112){
                document.getElementById("viewer").innerHTML = "CPF: "+cpf+" | Nº DEPENDENTES = "+numeroDependentes+" | RENDA MENSAL = R$ "+renda+
                "<br>VOCÊ ESTÁ ISENTO DE PAGAR IMPOSTO DE RENDA";
                alert("VOCÊ ESTÁ ISENTO DE PAGAR IMPOSTO DE RENDA");
            }else if(renda > 2112 && renda <= 2826.65){
                
                ir = (renda*0.075)+158.4;
                
                document.getElementById("viewer").innerHTML = "CPF: "+cpf+" | Nº DEPENDENTES = "+numeroDependentes+" | RENDA MENSAL = R$ "+renda+
                "<br>VOCÊ TERÁ DESCONTO DE 7,5% + R$ 158,40 NO SALÁRIO<br> IMPOSTO DE RENDA = R$ "+ ir;
                
            }else if (renda > 2826.65 && renda <= 3751.05){
                ir = (renda*0.15)+370.4;
                document.getElementById("viewer").innerHTML = "CPF: "+cpf+" | Nº DEPENDENTES = "+numeroDependentes+" | RENDA MENSAL = R$ "+renda+
                "<br>VOCÊ TERÁ DESCONTO DE 15% + R$ 370,40 NO SALÁRIO<br> IMPOSTO DE RENDA = R$ "+ ir;
                
                

            }else if (renda > 3751.05 && renda <= 4664.68){
                ir = (renda*0.225)+651.73;
                document.getElementById("viewer").innerHTML = "CPF: "+cpf+" | Nº DEPENDENTES = "+numeroDependentes+" | RENDA MENSAL = R$ "+renda+
                "<br>VOCÊ TERÁ DESCONTO DE 22,5% + R$ 651,73 NO SALÁRIO<br> IMPOSTO DE RENDA = R$ "+ ir;
                
                

            } else if (renda > 4664.68){
                ir = (renda*0.275)+884.96;
                document.getElementById("viewer").innerHTML = "CPF: "+cpf+" | Nº DEPENDENTES = "+numeroDependentes+" | RENDA MENSAL = R$ "+renda+
                "<br>VOCÊ TERÁ DESCONTO DE 27,5% + R$ 884,96 NO SALÁRIO<br> IMPOSTO DE RENDA = R$ "+ ir;
                
                


            } else {
                document.getElementById("viewer").innerHTML = "CPF: "+cpf+" | Nº DEPENDENTES = "+numeroDependentes+" | RENDA MENSAL = R$ "+renda+
                "<br>!!!! NÃO POSSUI RENDA !!!!";
                ir = 0;
            }
            ir = ir.toFixed(2);
            alert("Seu Imposto de Renda = R$ "+ir);

        }

    </script>
</head>
<body>
    
    <form id="formTesteJs" method="POST">
        <label>Digite o CPF do Contribuinte:</label>
        <input id="idCpfContribuinte" type="text" placeholder="Cpf"/><br><br>
        
        <label>Digite o Numero de Dependentes:</label>
        <input id="idNumeroDependentes" type="text" placeholder="Dependentes"/><br><br>
        
        <label>Digite a Renda Bruta Mensal do Contribuinte:</label>
        <input id="idRendaMensal" type="text" placeholder="Salario"/><br>
        
        <input id="botao" type="button" value="Calcular IR"
        onclick="calcularImpostoRenda()"/>

        <p><span id="viewer"></span></p>
    </form>
    

    
</body>
</html>