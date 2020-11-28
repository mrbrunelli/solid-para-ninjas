package br.com.srp;

public class CalculadoraDeSalario {
	public void calcular(Funcionario funcionario) {
		System.out.println(
					funcionario.getNome() + ", " + 
					funcionario.getCargo() + ", " +
					funcionario.getCargo().getRegra().calcula(funcionario)
				);
	}
	
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Matheus Ricardo Brunelli", 2000, Cargo.DESENVOLVEDOR);
		Funcionario funcionario2 = new Funcionario("José Pereira da Silva", 2000, Cargo.DBA);
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		calculadora.calcular(funcionario1);
		calculadora.calcular(funcionario2);
	}
}
