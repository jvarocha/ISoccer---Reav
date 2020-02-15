package IControl;


import java.util.Scanner;

import BancodeDados.BancodeDados;
import IModel.Advogado;
import IModel.CentrodeTreinamento;
import IModel.Cozinheiro;
import IModel.Estadio;
import IModel.Funcionario;
import IModel.Jogador;
import IModel.Medico;
import IModel.Motorista;
import IModel.Onibus;
import IModel.Preparador;
import IModel.Presidente;
import IModel.SocioElite;
import IModel.SocioJunior;
import IModel.SocioSenior;
import BancodeDados.SocioTorcedores;
import IModel.Tecnico;

public class Control{
	private static BancodeDados funcionarios = new BancodeDados();
	private static SocioTorcedores sociotorcedores = new SocioTorcedores();
	private static Onibus onibus = new Onibus();
	private static Estadio estadio = new Estadio();
	private static CentrodeTreinamento ct = new CentrodeTreinamento();
	private static Scanner teclado = new Scanner(System.in);
	
	public static void AdicionarPresidente() {
		if(funcionarios.getPresidente() == null) {
			Presidente novopresidente = new Presidente();
			funcionarios.setPresidente(novopresidente);			
		}
		else {
			System.out.println("Já há um Presidente");
		}
		
	}
	public static void AdicionarTecnico() {
		if(funcionarios.getPresidente() != null) {
			Tecnico novotecnico = new Tecnico();
			funcionarios.setTecnico(novotecnico);			
		}
		else {
			System.out.println("Já há um Técnico");
		}
		
	}
	public static void AdicionarJogador() {
		Jogador novojogador = new Jogador();		
		funcionarios.setJogador(novojogador);		
	}
	public static void AdicionarPreparadorFisico() {
		Preparador novopreparador = new Preparador();
		funcionarios.setPreparador(novopreparador);				
	}
	public static void AdicionarMedico() {
		Medico novomedico = new Medico();
		funcionarios.setMedico(novomedico);			
	}
	public static void AdicionarMotorista() {
		Motorista novomotorista = new Motorista();
		funcionarios.setMotorista(novomotorista);			
	}
	public static void AdicionarAdvogado() {
		Advogado novoadvogado = new Advogado();
		funcionarios.setAdvogado(novoadvogado);			
	}
	public static void AdicionarCozinheiro() {
		Cozinheiro novocozinheiro = new Cozinheiro();
		funcionarios.setCozinheiro(novocozinheiro);			
	}

	public void CadastrarJunior() {
		sociotorcedores.setJunior(new SocioJunior());		
	}
	
	public void CadastrarSenior() {
		sociotorcedores.setSenior(new SocioSenior());
		
	}
	
	public void CadastrarElite() {
		sociotorcedores.setElite(new SocioElite());		
	}

	public void FuncionariosRelatorio() {
		try {
		funcionarios.getPresidente().MostrarDados();
		funcionarios.getTecnico().MostrarDados();
		for(Jogador jogador: funcionarios.getJogadores()) {
			jogador.MostrarDados();			
		}
		for(Medico medico: funcionarios.getMedicos()) {
			medico.MostrarDados();			
		}
		for(Advogado advogado: funcionarios.getAdvogados()) {
			advogado.MostrarDados();			
		}
		for(Preparador preparador: funcionarios.getPreparadores()) {
			preparador.MostrarDados();			
		}
		for(Cozinheiro cozinheiro: funcionarios.getCozinheiros()) {
			cozinheiro.MostrarDados();			
		}
		for(Motorista motorista: funcionarios.getMotoristas()) {
			motorista.MostrarDados();			
		}
		}catch(NullPointerException e){
			System.out.println("Falta as informações do restante");
		}
	}
	
	public void RecursosFisicosRelatorio() {
		try {
		onibus.MostrarDados();
		estadio.MostrarDados();
		ct.MostrarDados();
		}catch(NullPointerException e){
			System.out.println("Falta as informações do restante");
		}
		
	}
	
	public void SocioTorcedorRelatorio() {
		// TODO Auto-generated method stub
		
	}
	
	public void AlterarDadosOnibus(int disponivel) {
		if(disponivel >= 0) {
			onibus.setDisponivel(disponivel);
		}else {
			System.out.println("Entrada Inválida");
		}
	}
	
	public void AlterarDadosEstadio(String alterar, int dado) {
		if(dado >= 0) {
			if(alterar.equalsIgnoreCase("Estadio Disponivel")) {
				System.out.println("Para:");
				dado = teclado.nextInt();
				estadio.setDisponivel(dado);
			}else if(alterar.equalsIgnoreCase("Lanchonetes")) {
				System.out.println("Para:");
				dado = teclado.nextInt();
				estadio.setLanchonetes(dado);
			}else if(alterar.equalsIgnoreCase("Banheiros")) {
				System.out.println("Para:");
				dado = teclado.nextInt();
				estadio.setBanheiros(dado);;
			}else if(alterar.equalsIgnoreCase("Torcida")) {
				System.out.println("Para:");
				dado = teclado.nextInt();
				estadio.setTorcedores(dado);
			}
		}else {
			System.out.println("Entrada Inválida");
		}
	}

	public void AlterarDadosCT(String alterar, int dado) {
		if(dado >= 0) {
			if(alterar.equalsIgnoreCase("Ct Disponivel")) {
				System.out.println("Para:");
				dado = teclado.nextInt();
				ct.setDisponivel(dado);
			}else if(alterar.equalsIgnoreCase("Dormitorio")) {
				System.out.println("Para:");
				dado = teclado.nextInt();
				ct.setDormitorio(dado);
			}
		}else {
			System.out.println("Entrada Inválida");
		}
	}

	public static void RemoverPresidente() {
		funcionarios.setPresidente(null);
	}
	public static void RemoverTecnico() {
		funcionarios.setTecnico(null);
	}
	public static void RemoverJogador(String nome) {
		Jogador demitir = funcionarios.BuscarJogador(nome);
		funcionarios.getJogadores().remove(demitir);
	}
	public static void RemoverPreparadorFisico(String nome) {	
		Preparador demitir = funcionarios.BuscarPreparador(nome);
		funcionarios.getPreparadores().remove(demitir);
	}
	public static void RemoverMedico(String nome) {	
		Medico demitir = funcionarios.BuscarMedico(nome);
		funcionarios.getMedicos().remove(demitir);
	}
	public static void RemoverAdvogado(String nome) {
		Advogado demitir = funcionarios.BuscarAdvogado(nome);
		funcionarios.getAdvogados().remove(demitir);
	}
	public static void RemoverMotorista(String nome) {
		Motorista demitir = funcionarios.BuscarMotorista(nome);
		funcionarios.getMotoristas().remove(demitir);
	}
	public static void RemoverCozinheiro(String nome) {	
		Cozinheiro demitir = funcionarios.BuscarCozinheiro(nome);
		funcionarios.getCozinheiros().remove(demitir);
	}
	
	public static void AlterarDadosSimilares(String cargo, String alterar) {
		if(cargo.equalsIgnoreCase("Presidente")) {
			AlterarDadosFundamentais(funcionarios.getPresidente(),alterar);
		}
		else if(cargo.equalsIgnoreCase("Tecnico")) {
			AlterarDadosFundamentais(funcionarios.getTecnico(),alterar);			
		}
		else if(cargo.equalsIgnoreCase("Cozinheiro")) {
			System.out.println("Nome:");
			AlterarDadosFundamentais(funcionarios.BuscarCozinheiro(teclado.nextLine()),alterar);			
		}
		else if(cargo.equalsIgnoreCase("Advogado")) {
			System.out.println("Nome:");
			AlterarDadosFundamentais(funcionarios.BuscarAdvogado(teclado.nextLine()),alterar);	
		}
		else if(cargo.equalsIgnoreCase("Preparador Fisico")) {
			System.out.println("Nome:");
			AlterarDadosFundamentais(funcionarios.BuscarPreparador(teclado.nextLine()),alterar);
		}
	}
	
	public static void AlterarDadosFundamentais(Funcionario empregado, String alterar) {
		if(alterar.equalsIgnoreCase("Nome")) {
			System.out.println("Para:");
			empregado.setNome(teclado.nextLine());		
		}
		
		else if(alterar.equalsIgnoreCase("Email")) {
			System.out.println("Para:");
			empregado.setEmail(teclado.nextLine());		
		}
		
		else if(alterar.equalsIgnoreCase("Telefone")) {
			System.out.println("Para:");
			empregado.setTelefone(teclado.nextInt());
			teclado.next();
		}
		
		else if(alterar.equalsIgnoreCase("CPF")) {
			System.out.println("Para:");
			empregado.setCPF(teclado.nextInt());	
			teclado.next();
		}
		
		else if(alterar.equalsIgnoreCase("Salario")) {
			System.out.println("Para:");
			empregado.setSalario(teclado.nextDouble());	
			teclado.next();
		}
	}
	
	public static void AlterarDadosJogador(String nome, String alterar) {
		Jogador jogador = funcionarios.BuscarJogador(nome);
		if(alterar.equalsIgnoreCase("Nome") || alterar.equalsIgnoreCase("Email") || alterar.equalsIgnoreCase("Telefone")
			|| alterar.equalsIgnoreCase("CPF") || alterar.equalsIgnoreCase("Salario")) {
			AlterarDadosFundamentais(jogador,alterar);		
		}
		
		else if(alterar.equalsIgnoreCase("Posiçao")) {
			System.out.println("Para:");
			jogador.setPosiçao(teclado.nextLine());		
		}
		
		else if(alterar.equalsIgnoreCase("Apto")) {
			if(jogador.getApto() == true) {
				jogador.setApto(false);
			}
			jogador.setApto(true);
		}
	}
	public static void AlterarDadosMedico(String nome, String alterar) {	
		Medico medico = funcionarios.BuscarMedico(nome);
		if(alterar.equalsIgnoreCase("Nome") || alterar.equalsIgnoreCase("Email") || alterar.equalsIgnoreCase("Telefone")
			|| alterar.equalsIgnoreCase("CPF") || alterar.equalsIgnoreCase("Salario")) {
			AlterarDadosFundamentais(medico,alterar);		
		}
		
		else if(alterar.equalsIgnoreCase("CRM")) {
			System.out.println("Para:");
			medico.setCrm(teclado.nextInt());
		}
		else if(alterar.equalsIgnoreCase("Uf")) {
			System.out.println("Para:");
			medico.setUf(teclado.next().charAt(0),teclado.next().charAt(0));
		}
	}
	public static void AlterarDadosMotorista(String nome, String alterar) {
		Motorista motorista = funcionarios.BuscarMotorista(nome);
		if(alterar.equalsIgnoreCase("Nome") || alterar.equalsIgnoreCase("Email") || alterar.equalsIgnoreCase("Telefone")
			|| alterar.equalsIgnoreCase("CPF") || alterar.equalsIgnoreCase("Salario")) {
			AlterarDadosFundamentais(motorista,alterar);		
		}
		
		else if(alterar.equalsIgnoreCase("Habilitaçao")) {
			System.out.println("Para:");
			motorista.setHabilitaçao(teclado.nextInt());		
		}		
	}
	
}
