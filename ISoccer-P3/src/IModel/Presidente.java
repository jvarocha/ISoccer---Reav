package IModel;

import java.util.Scanner;

public class Presidente extends Funcionario {
	private static Scanner teclado = new Scanner(System.in);
	public Presidente(){
		System.out.println("Nome:");
		setNome(teclado.nextLine());
		System.out.println("E-mail:");
		setEmail(teclado.nextLine());
		System.out.println("CPF:");
		setCPF(teclado.nextInt());
		System.out.println("Sálario:");
		setSalario(teclado.nextDouble());
		System.out.println("Telefone:");
		setTelefone(teclado.nextInt());
	}

}
