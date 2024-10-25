package br.edu.fatecpg.Relacionamento.Model;

public class Empresa {
	String nome;
	Funcionario[] funcionarios;
	public Empresa(String nome) {
		super();
		this.nome = nome;
		this.funcionarios = new Funcionario[10];
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void addFunc(int indice, Funcionario func) {
		this.funcionarios[indice] = func;
	}
	public boolean vazio() {
		int total = 0;
		for(int c = 0; c < 10; c++) {
			if(this.funcionarios[c] == null) {
				total++;
			}
		}
		return total == 10;
	}
	@Override
	public String toString() {
		if(vazio()) {
			throw new IllegalStateException("lista vazia");
		}
		StringBuilder funcs = new StringBuilder("[");
		for(int c = 0; c < 10; c++) {
			if(this.funcionarios[c] == null) {
				continue;
			}
			funcs.append(this.funcionarios[c].toString());
		}
		
		return "Empresa [nome=" + nome + ", funcionario=" + funcs.toString() + "]";
	}
	
}
