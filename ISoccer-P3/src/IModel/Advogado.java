package IModel;

import java.util.Scanner;

public class Advogado extends Funcionario {
	private static Scanner teclado = new Scanner(System.in);
	public Advogado(){
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
		teclado.next();
	}

}
