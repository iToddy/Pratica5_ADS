package Pratica5_41;

public class MainEmpresa {

	public static void main(String[] args) {
		
		Funcionario Vini = new Funcionario("Vini", "13461346", "rh" , 1500, true);
		Funcionario Duda = new Funcionario("Vini", "13461346", "dev", 1790, true);
		
		Empresa emp1 = new Empresa ("Toddy", "131313131", 20);
		
		emp1.contratar(Duda);
		emp1.contratar(Vini);
		
		System.out.println("Total de funcionários: " + emp1.getQtdFuncionario());
		
		emp1.demitir(Duda);
		
		System.out.println("Total de funcionários: " + emp1.getQtdFuncionario());
		
		
	}

}
