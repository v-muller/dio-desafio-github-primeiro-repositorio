public class Cliente {

	private String nome;
	private String endereco;
	private String email;
	private Integer telefone;

	public Cliente(){}

	public Cliente(String nome, String endereco, String email, Integer telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Nome: %s\n", getNome()));
		sb.append(String.format("Endereço: %s\n", getEndereco()));
		sb.append(String.format("Email: %s\n", getEmail()));
		sb.append(String.format("Telefone: %s\n", getTelefone()));
		return sb.toString();
	}
}
