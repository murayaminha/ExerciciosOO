public class Funcionário extends Pessoa{
    private int numeroDeMatricula;

    public Funcionário(String nome, int idade, String cidadeDeNascimento, int numeroDeMatricula) {
        super(nome, idade, cidadeDeNascimento);
        this.numeroDeMatricula = numeroDeMatricula;
    }
    public Funcionário(){}

    @Override
    public void exibirDados() {
        System.out.println("nome "+getNome()+"idade "+ getIdade()+"Cidade de nascimento"+ getCidadeDeNascimento()+"CPF "+this.numeroDeMatricula);
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }
}
