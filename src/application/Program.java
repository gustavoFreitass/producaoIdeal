package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantiTabuaCadeira, quantiTabuaMesa, quantiTempoCadeira, quantiTempoMesa, totalDeTabuas, totalDeHoras;
		
		//solicitar ao usuário informações necessárias para identificar as condições necessárias tanto para a tomada de decisão, quanto para saber as restrições.
		System.out.print("Informe a quantidade de tábuas que uma cadeira consome: ");
		quantiTabuaCadeira = sc.nextInt();
		System.out.print("Informe a quantidade de tábuas que uma mesa consome: ");
		quantiTabuaMesa = sc.nextInt();
		System.out.print("Informe a quantidade de horas que uma cadeira consome: ");
		quantiTempoCadeira = sc.nextInt();
		System.out.print("Informe a quantidade de horas que uma mesa consome: ");
		quantiTempoMesa = sc.nextInt();
		System.out.print("Informe a quantidade total de tábuas disponíveis: ");
		totalDeTabuas = sc.nextInt(); 
		System.out.print("Informe a quantidade total de horas disponíveis: ");
		totalDeHoras = sc.nextInt();
		
		//processo de colocar as váriaveis em um sistema linear para descobrir a quantidade ideal de cada produto.
		double[][]coefficients = {
                {quantiTabuaCadeira, quantiTabuaMesa},
                {quantiTempoCadeira, quantiTempoMesa}
        };
		double[]constants = {
			 totalDeTabuas,
			 totalDeHoras
		};
		double y =  (constants[1] - (coefficients[1][0] / coefficients[0][0]) * constants[0]) /
				(coefficients[1][1] - (coefficients[1][0] / coefficients[0][0]) * coefficients[0][1]);
		
		double x = (constants[0] - coefficients[0][1] * y) / coefficients[0][0];
		
		
		System.out.println("Quantidade ideal de cada produto:");
        System.out.println("mesa = " + x);
        System.out.println("cadeira = " + y);
		
        //processo para saber quais serão os lucros caso a produção ideal se concretize.
        System.out.print("\nDigite o valor de venda de cada cadeira: ");
        double valorDeVendaCadeira = sc.nextDouble();
        System.out.print("Digite o valor de venda de cada mesa: ");
		double valorDeVendaMesa = sc.nextDouble();
		double lucro = valorDeVendaCadeira*x + valorDeVendaMesa*y;
		System.out.printf("O lucro que se terá ao produzir a quantidade ideal de cadeiras e mesas é R$: %.2f", lucro);
		
		sc.close();

	}

}
