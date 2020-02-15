package BancodeDados;

import java.util.ArrayList;

import IModel.Advogado;
import IModel.Cozinheiro;
import IModel.Jogador;
import IModel.Medico;
import IModel.Motorista;
import IModel.Preparador;
import IModel.Presidente;
import IModel.Tecnico;

public class BancodeDados {
	private Presidente presidente;
	private Tecnico tecnico;
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	private ArrayList<Medico> medicos = new ArrayList<>();
	private ArrayList<Preparador> preparadores = new ArrayList<>();
	private ArrayList<Cozinheiro> cozinheiros = new ArrayList<>();
	private ArrayList<Advogado> advogados = new ArrayList<>();
	private ArrayList<Motorista> motoristas = new ArrayList<>();
	public Jogador BuscarJogador(String nome) {
		for(Jogador buscar : jogadores) {
			if(nome.equalsIgnoreCase(buscar.getNome())) {
				return buscar;
			}
		}
		return null;
	}
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogador(Jogador jogador) {
		this.jogadores.add(jogador);
	}
	public Medico BuscarMedico(String nome) {
		for(Medico buscar : medicos) {
			if(nome.equalsIgnoreCase(buscar.getNome())) {
				return buscar;
			}
		}
		return null;
	}
	public ArrayList<Medico> getMedicos() {
		return medicos;
	}
	public void setMedico(Medico medico) {
		this.medicos.add(medico);
	}
	public Preparador BuscarPreparador(String nome) {
		for(Preparador buscar : preparadores) {
			if(nome.equalsIgnoreCase(buscar.getNome())) {
				return buscar;
			}
		}
		return null;
	}
	public ArrayList<Preparador> getPreparadores() {
		return preparadores;
	}
	public void setPreparador(Preparador preparador) {
		this.preparadores.add(preparador);
	}
	
	public Cozinheiro BuscarCozinheiro(String nome) {
		for(Cozinheiro buscar : cozinheiros) {
			if(nome.equalsIgnoreCase(buscar.getNome())) {
				return buscar;
			}
		}
		return null;
	}
	public ArrayList<Cozinheiro> getCozinheiros() {
		return cozinheiros;
	}
	public void setCozinheiro(Cozinheiro cozinheiro) {
		this.cozinheiros.add(cozinheiro);
	}
	public Advogado BuscarAdvogado(String nome) {
		for(Advogado buscar : advogados) {
			if(nome.equalsIgnoreCase(buscar.getNome())) {
				return buscar;
			}
		}
		return null;
	}
	public ArrayList<Advogado> getAdvogados() {
		return advogados;
	}
	public void setAdvogado(Advogado advogado) {
		this.advogados.add(advogado);
	}
	public Motorista BuscarMotorista(String nome) {
		for(Motorista buscar : motoristas) {
			if(nome.equalsIgnoreCase(buscar.getNome())) {
				return buscar;
			}
		}
		return null;
	}
	public ArrayList<Motorista> getMotoristas() {
		return motoristas;
	}
	public void setMotorista(Motorista motorista) {
		this.motoristas.add(motorista);
	}
	public Presidente getPresidente() {
		return this.presidente;
	}
	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}
	public Tecnico getTecnico() {
		return this.tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	
}
