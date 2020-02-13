public class Cliente extends Pessoa {
    private String CPF;

    public Cliente(String nome, int idade, String cidadeDeNascimento, String CPF) {
        super(nome, idade, cidadeDeNascimento);
        this.CPF = CPF;
    }

    public Cliente() {}

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public void exibirDados() {
        System.out.println("nome "+getNome()+"idade "+ getIdade()+"Cidade de nascimento"+ getCidadeDeNascimento()+"CPF "+this.CPF);
    }
}
