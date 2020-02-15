package IModel;

public class Estadio {
	private int disponivel;
	private int torcedores;
	private int lanchonetes;
	private int banheiros;
	public int getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(int disponivel) {
		disponivel = disponivel;
	}

	public int getTorcedores() {
		return torcedores;
	}

	public void setTorcedores(int torcedores) {
		this.torcedores = torcedores;
	}

	public int getLanchonetes() {
		return lanchonetes;
	}

	public void setLanchonetes(int lanchonetes) {
		this.lanchonetes = lanchonetes;
	}

	public int getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(int banheiros) {
		this.banheiros = banheiros;
	}
	
	public void MostrarDados() {
		System.out.println("Estadio: "+ this.disponivel + "  disponível\n" +
							"Lanchonetes: " + this.lanchonetes +
							"\nBanheiros: " + this.banheiros +
							"\nTorcida: " + this.torcedores);
	}
}
