package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Biblioteca;
import entities.Livros;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Livros livro1 = new Livros("O Senhor dos Anéis", "J.R.R. Tolkien", "Harper Collins", 1200);
        Livros livro2 = new Livros("1984", "George Orwell", "Campanha das Letras", 328);
        Livros livro3 = new Livros();

        livro3.setTitulo("A revolução dos bichos");
        livro3.setAutor("George Orwell");
        livro3.setEditora("Campanha das letras");
        livro3.setNumPaginas(112);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("Buscando livro '1984': ");
        Livros livroBuscado = biblioteca.buscarLivros("1984");
        if (livroBuscado != null) {
            livroBuscado.exibirInfo();
        }
        else {
            System.out.println("Livro não encontrado");
        }
        sc.close();
    }
}
