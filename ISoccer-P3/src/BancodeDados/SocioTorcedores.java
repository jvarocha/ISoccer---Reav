package BancodeDados;

import java.util.ArrayList;

import IModel.SocioElite;
import IModel.SocioJunior;
import IModel.SocioSenior;

public class SocioTorcedores {
	private ArrayList<SocioJunior> sociosjunior = new ArrayList<>();
	private ArrayList<SocioSenior> sociossenior = new ArrayList<>();
	private ArrayList<SocioElite> socioselite = new ArrayList<>();
	public SocioJunior BuscarJunior(String nome) {
		for(SocioJunior buscar : sociosjunior) {
			if(nome.equalsIgnoreCase(buscar.getNome())) {
				return buscar;
			}
		}
		return null;
	}
	public ArrayList<SocioJunior> getJunior() {
		return sociosjunior;
	}
	public void setJunior(SocioJunior socio) {
		this.sociosjunior.add(socio);
	}
	public SocioSenior BuscarMedico(String nome) {
		for(SocioSenior buscar : sociossenior) {
			if(nome.equalsIgnoreCase(buscar.getNome())) {
				return buscar;
			}
		}
		return null;
	}
	public ArrayList<SocioSenior> getSenior() {
		return sociossenior;
	}
	public void setSenior(SocioSenior socio) {
		this.sociossenior.add(socio);
	}
	public SocioElite BuscarPreparador(String nome) {
		for(SocioElite buscar : socioselite) {
			if(nome.equalsIgnoreCase(buscar.getNome())) {
				return buscar;
			}
		}
		return null;
	}
	public ArrayList<SocioElite> getElite() {
		return socioselite;
	}
	public void setElite(SocioElite socio) {
		this.socioselite.add(socio);
	}
}
