public class Pessoa {
    private String nome;
    private String CPF;
    private String rg;

    public Pessoa(String nome, String CPF, String rg) {
        this.nome = nome;
        this.CPF = CPF;
        this.rg = rg;
    }
    public Pessoa(){}

    public void andar(){
        System.out.println(nome+" está andando...");
    }
    public void correr(){
        System.out.println(nome+" está correndo...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
