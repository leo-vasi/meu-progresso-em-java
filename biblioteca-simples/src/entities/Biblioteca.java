package entities;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livros> colecao;

    public Biblioteca() {
        this.colecao = new ArrayList<>();
    }

    public void adicionarLivro(Livros livro) {
        this.colecao.add(livro);
    }

    public void exibirLivros() {
        for (Livros livro : colecao) {
            livro.exibirInfo();
            System.out.println();
        }
    }

    public Livros buscarLivros(String titulo) {
        for (Livros livro: colecao) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }
}
