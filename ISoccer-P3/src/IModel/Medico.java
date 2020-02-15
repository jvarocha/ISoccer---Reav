package IModel;

import java.util.Scanner;

public class Medico extends Funcionario {
	private static Scanner teclado = new Scanner(System.in);
	public Medico() {
		System.out.println("Nome:");
		setNome(teclado.nextLine());
		System.out.println("e-mail:");
		setEmail(teclado.nextLine());
		System.out.println("CPF:");
		setCPF(teclado.nextInt());
		System.out.println("Sálario:");
		setSalario(teclado.nextDouble());
		System.out.println("Telefone:");
		setTelefone(teclado.nextInt());
		System.out.println("CRM:");
		setCrm(teclado.nextInt());
		System.out.println("UF:");
		setUf(teclado.next().charAt(0),teclado.next().charAt(0));
	}
	private int crm;
	private char[] uf = new char[2];
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
		teclado.next();
	}
	public char[] getUf() {
		return uf;
	}
	public void setUf(char letra1, char letra2) {
		this.uf[0] = letra1;
		this.uf[1] = letra2;
	}
	@Override
	public void MostrarDados() {
		System.out.println( "Nome: " + getNome() +
			   "\nE-mail: " + getEmail() +
			   "\nCPF: " + getEmail() +
			   "\nTelefone: " + getEmail() +
			   "\nSalário: " + getEmail() +
			   "\nCRM: " + getEmail() +
			   "\nUF: " + uf[0]+uf[1] );
	}
}
