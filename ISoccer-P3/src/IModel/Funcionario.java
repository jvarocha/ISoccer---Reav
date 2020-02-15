package IModel;

public class Funcionario {
	
		private String nome;
		private String email;
		private int cpf;
		private double salario;
		private int telefone;
		
		public void MostrarDados() {
			System.out.println( "Nome: " + getNome() +
				   "\nE-mail: " + getEmail() +
				   "\nCPF: " + getCPF() +
				   "\nTelefone: " + getTelefone() +
				   "\nSalário: " + getSalario());		
		}
		
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
		
		public double getSalario() {
			return salario;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		public int getTelefone() {
			return telefone;
		}
		
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
}
