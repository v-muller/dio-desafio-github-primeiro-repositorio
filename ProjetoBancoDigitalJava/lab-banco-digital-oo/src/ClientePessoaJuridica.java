public class ClientePessoaJuridica extends Cliente {
    private Long cnpj;
    private String nomeFantasia;

    public ClientePessoaJuridica(){
        super();
    }

    public ClientePessoaJuridica(String nome, String endereco, String email, Integer telefone, Long cnpj, String nomeFantasia) {
        super(nome, endereco, email, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("CNPJ: %d\n", getCnpj()));
        sb.append(String.format("Nome da empresa: %s\n", getNomeFantasia()));
        return super.toString() + sb;
    }
}
