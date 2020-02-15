package IModel;

import java.util.Scanner;

public class Jogador extends Funcionario {
	private String posiçao;
	private Boolean apto;
	private static Scanner teclado = new Scanner(System.in);
	public Jogador() {
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
		teclado.nextLine();
		System.out.println("Posição:");
		setPosiçao(teclado.nextLine());
		System.out.println("Apto, Sim ou Não:");
		if(teclado.nextLine().equalsIgnoreCase("Sim")) {
			setApto(true);
		}else {
			setApto(false);
		}
	}
	
	public Boolean getApto() {
		return apto;
	}
	public void setApto(Boolean aptidao) {
		this.apto = aptidao;
	}
	public String getPosiçao() {
		return posiçao;
	}
	public void setPosiçao(String posiçao) {
		this.posiçao = posiçao;
	}
	
	@Override
	public void MostrarDados() {
		System.out.println( "Nome:" + getNome() +
			   "\nE-mail:" + getEmail() +
			   "\nCPF:" + getCPF() +
			   "\nTelefone:" + getTelefone() +
			   "\nSalário:" + getSalario() +
			   "\nPosição:" + getPosiçao());
		if(apto == true) {
			System.out.println("Apto: Sim");
		}
		System.out.println("Apto: Não");
	}

}
