// Exercício 4
// Nome: Gabriel Pedrosa
// Período: 3º Período

import java.util.ArrayList;

class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();
        
        Produto p1 = new Produto("Mochila", 120.0);
        Produto p2 = new Produto("Estojo", 25.0);
        Produto p3 = new Produto("Livro", 50.0);
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        for (int i = 0; i < lista.size(); i++) {
            Produto p = lista.get(i);
            p.exibirDados();
            System.out.println("-----------------");
        }
    }
}
