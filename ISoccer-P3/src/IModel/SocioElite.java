package IModel;

import java.util.Scanner;

public class SocioElite extends SocioTorcedor {
	private static Scanner teclado = new Scanner(System.in);
	public SocioElite() {
		System.out.println("Nome:");
		setNome(teclado.nextLine());
		System.out.println("e-mail:");
		setEmail(teclado.nextLine());
		System.out.println("CPF:");
		setCPF(teclado.nextInt());
		System.out.println("Contribuiçao:");
		setContribuiçao(teclado.nextDouble());
		System.out.println("Telefone:");
		setTelefone(teclado.nextInt());
		teclado.next();
		System.out.println("Adimplencia, Sim ou Não");
		if(teclado.nextLine().equalsIgnoreCase("sim")) {
			setAdimplente(true);
		}else {
			setAdimplente(false);
		}
	}

}
