package entities;

public class Mesa extends Produtos{
	
	private Double cadeiras;
	
	public Mesa(int tabuas, int horas, double valorProduto) {
		super(tabuas, horas, valorProduto);
	}
	
	public Double getCadeira() {
		return cadeiras;
	}
	public void setCadeira(double cadeira) {
		this.cadeiras = cadeira;
	}
	
	//Operação para descobrir o valor da varíavel
	@Override
	public Double getValorIdeal(int totalTabuas, int totalHoras, Produtos produto) {
		return (double)(totalTabuas - this.getTabuas() * cadeiras) / produto.getTabuas();
	}

}
