public class PenaMosquito implements MetodoDeEscrita {
    private String ehFeitoDe;
    private String  escreveCom;

    public PenaMosquito() {
        this.ehFeitoDe = "metal";
        this.escreveCom = "nanquim";
    }

    @Override
    public void escrever() {
        System.out.println("escrevendo com "+ this.escreveCom);
    }
    public String getEhFeitoDe() {
        return ehFeitoDe;
    }

    public String getEscreveCom() {
        return escreveCom;
    }
}
