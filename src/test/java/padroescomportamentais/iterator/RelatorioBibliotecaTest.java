package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioBibliotecaTest {

    @Test
    void deveContarLivrosDisponiveis() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Dom Casmurro", true),
                new Livro("O Pequeno Príncipe", true),
                new Livro("A Revolução dos Bichos", false),
                new Livro("O Hobbit", true)
        );
        assertEquals(3, RelatorioBiblioteca.contarLivrosDisponiveis(biblioteca));
    }

    @Test
    void deveContarTotalLivros() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Dom Casmurro", true),
                new Livro("O Pequeno Príncipe", true),
                new Livro("A Revolução dos Bichos", false),
                new Livro("O Hobbit", true)
        );
        assertEquals(4, RelatorioBiblioteca.contarTotalLivros(biblioteca));
    }

}