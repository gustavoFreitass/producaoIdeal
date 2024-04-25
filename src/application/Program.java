package application;

import java.util.Scanner;

import entities.Cadeira;
import entities.Mesa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] linha = new String[3];
		int tabuas, horas, totalHoras, totalTabuas;
		double valorProduto;
		
		//Usuário definir os valores de cada condição
		System.out.print("Informe a quantidade de tábuas, horas e o valor de venda de um(a) mesa: ");
		linha = sc.nextLine().split(" ");
		tabuas = Integer.parseInt(linha[0]);
		horas = Integer.parseInt(linha[1]);
		valorProduto = Double.parseDouble(linha[2]);
		Mesa mesa = new Mesa(tabuas, horas, valorProduto);
		
		System.out.print("Informe a quantidade de tábuas, horas e o valor de venda de um(a) cadeira: ");
		linha = sc.nextLine().split(" ");
		tabuas = Integer.parseInt(linha[0]);
		horas = Integer.parseInt(linha[1]);
		valorProduto = Double.parseDouble(linha[2]);
		Cadeira cadeira = new Cadeira(tabuas, horas, valorProduto);
		
		System.out.print("Informe a quantidade de tabuas disponíveis: ");
		totalTabuas = sc.nextInt();
		System.out.print("Informe a quantidade de Horas disponíveis: ");
		totalHoras = sc.nextInt();
		
		//Definir quais são os valores das variáveis
		double qtdCadeira = cadeira.getValorIdeal(totalTabuas, totalHoras, mesa);
		mesa.setCadeira(qtdCadeira);
		double qtdMesa = mesa.getValorIdeal(totalTabuas, totalHoras, cadeira);
		
		double lucro = cadeira.getValorProduto() * qtdMesa + mesa.getValorProduto() * qtdCadeira;
		
		//Retornar valores para o usuário
		System.out.println("\nO valor ideal de produtos é: ");
		System.out.println("Cadeira = " + qtdCadeira);
		System.out.println("Mesa = " + qtdMesa);
		System.out.printf("O lucro da produção ideal é R$%.2f\n", lucro);
		
		sc.close();

	}

}
