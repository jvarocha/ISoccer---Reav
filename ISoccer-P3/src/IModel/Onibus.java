package IModel;

public class Onibus {
	private int disponivel;

	public int getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(int disponivel) {
		this.disponivel = disponivel;
	}
	
	public void MostrarDados() {
		System.out.println("Há "+ this.disponivel + " ônibus disponível");
	}
}
