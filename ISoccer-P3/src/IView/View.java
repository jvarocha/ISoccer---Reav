package IView;

import java.util.Scanner;

import IControl.Control;

public class View implements MensagemTemplate {
	
	private static Control control;
	private static Scanner teclado = new Scanner(System.in);
	private static String funcionalidade = "Continuar";
	
	public View() {
		control = new Control();
		MostrarFuncionalidades();
		funcionalidade = teclado.nextLine();
		while(funcionalidade.equalsIgnoreCase("Encerrar") != true) {
			if (funcionalidade.equalsIgnoreCase("Adicionar Funcionario")) {
				AdicionarFuncionario();
			} else if (funcionalidade.equalsIgnoreCase("Remover Funcionario")) {
				RemoverFuncionario();
			} else if (funcionalidade.equalsIgnoreCase("Alterar Dados")) {
				AlterarDados();
			} else if (funcionalidade.equalsIgnoreCase("Relatorios")) {
				Relatorios();
			} else if (funcionalidade.equalsIgnoreCase("Socio Torcedor")) {
				SocioTorcedor();
			} else if (funcionalidade.equalsIgnoreCase("Recursos Fisicos")) {
				RecursosFisicos();
			}
			MostrarFuncionalidades();
			funcionalidade = teclado.nextLine();
		}
	}
	
	private void RecursosFisicos() {
		System.out.println("Estadio\n"+"Onibus\n"+"Centro de Treinamento");
		int disponivel;
		String recurso = teclado.nextLine();
		if(recurso.equalsIgnoreCase("Estadio")) {
			System.out.println("Estadio");
			System.out.println("Lanchonete");
			System.out.println("Banheiro");
			System.out.println("Torcida");
			control.AlterarDadosEstadio(teclado.nextLine(),0);			
		} else if(recurso.equalsIgnoreCase("Onibus")) {
			System.out.println("Alterar a quantidade de ônibus disponivel para:");
			disponivel = teclado.nextInt();
			control.AlterarDadosOnibus(disponivel);
			
		} else if(recurso.equalsIgnoreCase("Centro de Treinamento")) {
			System.out.println("CT disponivel");
			System.out.println("Dormitorio");			
			control.AlterarDadosCT(teclado.nextLine(),0);
		}
	}
	
	private void SocioTorcedor() {
		Torcedor();
		funcionalidade = teclado.nextLine();
		if(funcionalidade.equalsIgnoreCase("Cadastrar Socio")) {
			System.out.println("Categoria:");
			String categoria = teclado.nextLine();
			if(categoria.equalsIgnoreCase("Junior")) {
				control.CadastrarJunior();
			}else if(funcionalidade.equalsIgnoreCase("Senior")) {
				control.CadastrarSenior();
			}else if(funcionalidade.equalsIgnoreCase("Elite")) {
				control.CadastrarElite();
			}
		}else if(funcionalidade.equalsIgnoreCase("Alterar Adimplencia")) {
			
		}
		
	}

	private void Relatorios() {
		TipodeRelatorio();
		String tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("Relatorio dos Funcionarios")) {
			control.FuncionariosRelatorio();
		}
		else if(tipo.equalsIgnoreCase("Relatorio dos Recursos Fisicos")) {
			control.RecursosFisicosRelatorio();			
		}
		else if(tipo.equalsIgnoreCase("Relatorio dos Socios Torcedores")) {
			control.SocioTorcedorRelatorio();			
		}
		
	}

	private void AlterarDados() {
		String cargo;
		String nome;
		String alterar;
		PerguntarCargo();
		cargo = teclado.nextLine();
		PerguntarNome();
		nome = teclado.nextLine();
		PerguntarAlteraçao();
		alterar = teclado.nextLine();
		if(cargo.equalsIgnoreCase("Presidente")) {
			Control.AlterarDadosSimilares(cargo,alterar);
		}
		else if(cargo.equalsIgnoreCase("Tecnico")) {
			Control.AlterarDadosSimilares(cargo,alterar);
		}
		else if(cargo.equalsIgnoreCase("Jogador")) {
			Control.AlterarDadosJogador(nome,alterar);
		}
		else if(cargo.equalsIgnoreCase("Preparador Fisico")) {
			Control.AlterarDadosSimilares(cargo,alterar);
		}
		else if(cargo.equalsIgnoreCase("Medico")) {
			Control.AlterarDadosMedico(nome,alterar);
		}
		else if(cargo.equalsIgnoreCase("Advogado")) {
			PerguntarAlteraçao();
			Control.AlterarDadosSimilares(cargo,alterar);
		}
		else if(cargo.equalsIgnoreCase("Motorista")) {
			Control.AlterarDadosMotorista(nome,alterar);
		}
		else if(cargo.equalsIgnoreCase("Cozinheiro")) {
			Control.AlterarDadosSimilares(cargo,alterar);
		}
		else {
			ProfissaoInexistente();
		}
	}

	private void RemoverFuncionario() {
		PerguntarCargo();
		String profissao;
		profissao = teclado.nextLine();
		PerguntarNome();
		if(profissao.equalsIgnoreCase("Presidente")) {
			Control.RemoverPresidente();
		}
		else if(profissao.equalsIgnoreCase("Tecnico")) {
			Control.RemoverTecnico();
		}
		else if(profissao.equalsIgnoreCase("Jogador")) {
			Control.RemoverJogador(teclado.nextLine());
		}
		else if(profissao.equalsIgnoreCase("Preparador Fisico")) {
			Control.RemoverPreparadorFisico(teclado.nextLine());
		}
		else if(profissao.equalsIgnoreCase("Medico")) {
			Control.RemoverMedico(teclado.nextLine());
		}
		else if(profissao.equalsIgnoreCase("Advogado")) {
			Control.RemoverAdvogado(teclado.nextLine());
		}
		else if(profissao.equalsIgnoreCase("Motorista")) {
			Control.RemoverMotorista(teclado.nextLine());
		}
		else if(profissao.equalsIgnoreCase("Cozinheiro")) {
			Control.RemoverCozinheiro(teclado.nextLine());
		}
		else {
			ProfissaoInexistente();
		}
	}

	public void AdicionarFuncionario() {
		PerguntarCargo();
		String profissao;
		profissao = teclado.nextLine();
		if(profissao.equalsIgnoreCase("Presidente")) {
			Control.AdicionarPresidente();
		}
		else if(profissao.equalsIgnoreCase("Tecnico")) {
			Control.AdicionarTecnico();
		}
		else if(profissao.equalsIgnoreCase("Jogador")) {
			Control.AdicionarJogador();
		}
		else if(profissao.equalsIgnoreCase("Preparador Fisico")) {
			Control.AdicionarPreparadorFisico();
		}
		else if(profissao.equalsIgnoreCase("Medico")) {
			Control.AdicionarMedico();
		}
		else if(profissao.equalsIgnoreCase("Advogado")) {
			Control.AdicionarAdvogado();
		}
		else if(profissao.equalsIgnoreCase("Motorista")) {
			Control.AdicionarMotorista();
		}
		else if(profissao.equalsIgnoreCase("Cozinheiro")) {
			Control.AdicionarCozinheiro();
		}
		else {
			ProfissaoInexistente();
		}
	}

	@Override
	public void PerguntarNome() {
		System.out.println("Nome:");		
	}

	@Override
	public void PerguntarCargo() {
		System.out.println("Cargo: ");		
	}

	@Override
	public void ProfissaoInexistente() {
		System.out.println("Profissão não existente !");		
	}

	@Override
	public void MostrarFuncionalidades() {
		System.out.println("Adicionar Funcionário");
		System.out.println("Remover Funcionário");
		System.out.println("Alterar dados");
		System.out.println("Relatórios");
		System.out.println("Sócio-Torcedor");
		System.out.println("Recursos Físicos");
	}

	@Override
	public void PerguntarAlteraçao() {
		System.out.println("Alterar:");		
	}

	@Override
	public void TipodeRelatorio() {
		System.out.println("Tipo de Relatório:");		
	}

	@Override
	public void Torcedor() {
		System.out.println("Cadastrar Socio");
		System.out.println("Alterar Adimplencia");
		
	}
}
