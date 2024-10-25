package br.edu.fatecpg.Relacionamento.Model;

public class Endereco {
	String rua;
	String num;
	String cidade;
	public Endereco(String rua, String num, String cidade) {
		super();
		this.rua = rua;
		this.num = num;
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", num=" + num + ", cidade=" + cidade + "]";
	}
	
	
}
