package br.edu.fatecpg.Relacionamento.View;
import br.edu.fatecpg.Relacionamento.Model.*;
public class Main {

	public static void main(String[] args) {
		Endereco end = new Endereco("ABC","123","PG");
		Pessoa Pedro = new Pessoa("Pedro",end);
		Funcionario pedro = new Funcionario("Pedro",1200, "Desenvolvedor Back end");
		Funcionario miranda = new Funcionario("Pedro",1200, "Desenvolvedor Back end");
		Funcionario jorge = new Funcionario("Pedro",1200, "Desenvolvedor Back end");
		Funcionario Ana = new Funcionario("Pedro",1200, "Desenvolvedor Back end");
		Funcionario lopez = new Funcionario("Pedro",1200, "Desenvolvedor Back end");
		Empresa Banco = new Empresa("Itau");
		System.out.println(Pedro);
		System.out.println(pedro);
		Banco.addFunc(0,pedro);
		Banco.addFunc(1, miranda);
		Banco.addFunc(2, jorge);
		Banco.addFunc(3, lopez);
		Banco.addFunc(4, Ana);
	}

}
