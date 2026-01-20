


import java.util.Scanner; 

public classic Desafio {
  public static void main(String[] args ){ 
    //lê os valores de entrada
    Scanner leitorDeEntradas = new Scanner(System.in);
    float valorSalario = leitorDeEntradas.nextFloat();
    float valorBeneficios = leitorDeEntradas.nextFloat();

    float valorImposto = 0;
    if (valorSalario >= 0 && valorSalario <= 1100) {
        //atribuiu a alíquota de 5% mediante o valor do salário 
        valorImposto = 0.05F * valorSalario;
        //TODO Criar as demais condições para as alíquotas de 10.00% e 15.00%.
        
    } else if (valorSalario >= 1100.01 && valorSalario <=2500.00 ) {
        //atribuiu a alíquota de 5% mediante o valor do salário 
        valorImposto = 0.10F * valorSalario;
 
    } else {
        //atribuiu a alíquota de 5% mediante o valor do salário 
        valorImposto = 0.15F * valorSalario;
    }
        //Imprima e calcule a saída (com 2 casas decimais).
        
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida))

    



    }

  }
}