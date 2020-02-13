public class Caneta  implements MetodoDeEscrita{
    private String ehFeitoDe;
    private String  escreveCom;

    public Caneta() {
        this.ehFeitoDe = "plastico";
        this.escreveCom = "tinta";
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
