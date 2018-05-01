package projetoprodutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner karol = new Scanner (System.in);
        List<Produto> colecaoProduto = new ArrayList<> ();
        Produto x = new Produto ();
        System.out.println("Código: ");
        x.setCodigo(karol.nextInt());
        System.out.println("Descrição do produto: ");
        x.setDescricao(karol.nextLine());
        System.out.println("Valor: ");
        x.setValor(karol.nextFloat());
        karol.nextLine();
        //ADICIONANDO O OBJETO "PRODUTO" AO ARRAY LIST;
        colecaoProduto.add(x);
        Produto y = new Produto ();
        System.out.println("Código: ");
        y.setCodigo(karol.nextInt());
        System.out.println("Descrição do produto: ");
        y.setDescricao(karol.nextLine());
        System.out.println("Valor: ");
        y.setValor(karol.nextFloat());
        colecaoProduto.add(y);
        
        for (Produto item : colecaoProduto) {
            
        }
    }
}
