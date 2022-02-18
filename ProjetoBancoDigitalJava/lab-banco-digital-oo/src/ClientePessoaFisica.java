public class ClientePessoaFisica extends Cliente {
    private Long cpf;

    public ClientePessoaFisica(){
        super();
    }

    public ClientePessoaFisica(String nome, String endereco, String email, Integer telefone, Long cpf) {
        super(nome, endereco, email, telefone);
        this.cpf = cpf;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Cpf: %d\n", getCpf()));
        return super.toString() + sb;
    }
}
