package entities;

public class Livros {
    private String titulo;
    private String autor;
    private String editora;
    private int numPaginas;

    public Livros() {
        this.titulo = "Título desconhecido";
        this.autor = "Autor desconhecido";
        this.editora = "Editora desconhecida";
        this.numPaginas = 0;
    }

    public Livros (String titulo, String autor, String editora, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void exibirInfo() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}
