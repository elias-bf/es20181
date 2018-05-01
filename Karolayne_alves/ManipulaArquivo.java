
package projetodiarias;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ManipulaArquivo {
    public static ArrayList<Diaria> lerArquivo(){
        File dados = new File("diarias.txt");
        Diaria x;
        ArrayList<Diaria> lista = new ArrayList<>();
        String linha;
        String[] dadosDiaria;
        try{
            Scanner leia = new Scanner(dados);
            while(leia.hasNext()){
                linha = leia.nextLine();
                dadosDiaria = linha.split("\t");
                x = new Diaria();
                x.setCodigo(Integer.parseInt(dadosDiaria[0]));
                x.setNome(dadosDiaria[1]);
                x.setData(dadosDiaria[2]);
                dadosDiaria[3] = dadosDiaria[3].replace(',', '.');
                x.setValor(Double.parseDouble(dadosDiaria[3]));
                //System.out.println(x.toString());
                lista.add(x);
            }
            return lista;
        }
        catch(FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível"
                    + "encontrar o arquivo.");
            return null;
        }
        
   
    }
    
}
