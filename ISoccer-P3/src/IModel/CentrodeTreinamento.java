package IModel;

public class CentrodeTreinamento {
	private int disponivel;
	private int dormitorio;
	public int getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(int disponivel) {
		this.disponivel = disponivel;
	}

	public int getDormitorio() {
		return dormitorio;
	}

	public void setDormitorio(int dormitorio) {
		this.dormitorio = dormitorio;
	}
	
	public void MostrarDados() {
		System.out.println("Ônibus: "+ this.disponivel + "disponível\n" +
							"Dormitorio: "+ this.dormitorio);
	}
}
