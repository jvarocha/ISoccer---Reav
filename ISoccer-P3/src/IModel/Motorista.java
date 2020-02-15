package IModel;

import java.util.Scanner;

public class Motorista extends Funcionario {
	private int habilitaçao;
	
	private static Scanner teclado = new Scanner(System.in);
	public Motorista() {
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
		System.out.println("Habilitação:");
		setTelefone(teclado.nextInt());
	}

	public int getHabilitaçao() {
		return habilitaçao;
	}

	public void setHabilitaçao(int habilitaçao) {
		this.habilitaçao = habilitaçao;
		teclado.next();
	}
	
	@Override
	public void MostrarDados() {
		System.out.println( "Nome: " + getNome() +
			   "\nE-mail: " + getEmail() +
			   "\nCPF: " + getEmail() +
			   "\nTelefone: " + getEmail() +
			   "\nSalário: " + getEmail() +
			   "\nHabilitação: " + getHabilitaçao() );
	}

}
