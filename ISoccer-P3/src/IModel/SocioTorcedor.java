package IModel;

public class SocioTorcedor {
	private String nome;
	private String email;
	private int cpf;
	private double contribuiçao;
	private int telefone;
	private Boolean adimplente;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCPF() {
		return cpf;
	}
	public void setCPF(int cpf) {
		this.cpf = cpf;
	}
	public double getContribuiçao() {
		return contribuiçao;
	}
	public void setContribuiçao(double contribuiçao) {
		this.contribuiçao = contribuiçao;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Boolean getAdimplente() {
		return adimplente;
	}
	public void setAdimplente(Boolean adimplente) {
		this.adimplente = adimplente;
	}

}
