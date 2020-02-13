public class Lapis  implements MetodoDeEscrita{

    private String ehFeitoDe;
    private String  escreveCom;

    public Lapis() {
        this.ehFeitoDe = "Madeira";
        this.escreveCom = "grafite";
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
