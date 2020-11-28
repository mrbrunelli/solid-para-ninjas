package br.com.srp;

public class Funcionario {
	private String nome;
	private Cargo cargo;
	private double salarioBase;

	public Funcionario (String nome, double salarioBase, Cargo cargo) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

}
