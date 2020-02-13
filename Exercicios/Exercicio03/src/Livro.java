import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public Livro(){}

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        System.out.println("ERRO! Não é possivel alterar este dado");
    }

    public void setAutor(String autor) {
        System.out.println("ERRO! Não é possivel alterar este dado");
    }

    public void setPaginas(int paginas) {
        System.out.println("ERRO! Não é possivel alterar este dado");
    }
}

