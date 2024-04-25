package entities;

public class Cadeira extends Produtos{

	public Cadeira(int tabuas, int horas, double valorProduto) {
		super(tabuas, horas, valorProduto);
	}
	
	//Operação para descobrir o valor da Varíavel
	@Override
	public Double getValorIdeal(int totalTabuas, int totalHoras, Produtos produto) {
		 return (double)(totalHoras - (this.getHoras() / this.getTabuas()) * totalTabuas) / (produto.getHoras() - (this.getHoras() / this.getTabuas()) * produto.getTabuas());
	}

}
