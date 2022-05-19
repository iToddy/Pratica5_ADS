package Pratica5_41;

public class Empresa {
	
	String name;
	String cnpj;
	int qtdFuncionario = 0;
	static int cont = 0;
	
	Funcionario[] funcionarios;
	

	public int getQtdFuncionario() {
		return qtdFuncionario;
	}

	public void setQtdFuncionario(int qtdFuncionario) {
		this.qtdFuncionario = qtdFuncionario;
	}

	public Empresa(String name, String cnpj, int qtdFuncionario) {
		this.name = name;
		this.cnpj = cnpj;
		this.qtdFuncionario = qtdFuncionario;
		funcionarios = new Funcionario[qtdFuncionario];
	}
	
	public Empresa(String name, String cnpj) {
		this.qtdFuncionario = 100;
		funcionarios = new Funcionario[qtdFuncionario];
		this.name = name;
		this.cnpj = cnpj;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	public void contratar(Funcionario newFunc) {
		funcionarios[cont] = newFunc;
		cont++;
	}
	
	public void demitir(Funcionario oldFunc) {
		cont--;
		this.qtdFuncionario=cont;
		oldFunc.setActive(false);
	}
}
