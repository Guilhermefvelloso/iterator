package padroescomportamentais.iterator;

import java.util.Iterator;

public class RelatorioBiblioteca {

    public static Integer contarLivrosDisponiveis(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivros(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Iterator<Livro> a = biblioteca.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}