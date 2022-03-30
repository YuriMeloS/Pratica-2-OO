package Questao1;
import java.util.Scanner;

public class Estoque {
	String nome;
	int qtdAtual;
	private int qtdMinima;
	
	Scanner ler = new Scanner(System.in);
		
	public Estoque() {
		
	}
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	private void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	private void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public void darBaixa(int qtde) {
		if ((qtdAtual- qtde)>=0 )
				qtdAtual = qtdAtual - qtde;
		
	}
	public String mostra() {
		return ("Nome do produto " + nome + " sua quantidade " + qtdAtual + " sua quantidade minima " + qtdMinima);
	}
	
	public boolean precisaRepor() {
		if(qtdAtual<=qtdMinima) {
			return true;
		}else {
			return false;
		}
	}
	
}








