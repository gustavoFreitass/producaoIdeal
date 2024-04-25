package entities;

public abstract class Produtos {
	
	private Integer tabuas;
	private Integer horas;
	private Double valorProduto;
	
	public Produtos(int tabuas, int horas, double valorProduto) {
		this.tabuas = tabuas;
		this.horas = horas;
		this.valorProduto = valorProduto;
	}
	
	//Definindo os construtores
	public Integer getTabuas() {
		return tabuas;
	}
	public void setTabuas(int tabuas) {
		this.tabuas = tabuas;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public Double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	//Definindo uma função abstrata para utilizar na operação das classes filhas
	public abstract Double getValorIdeal(int totalTabuas, int totalHoras, Produtos produto);
	
}
