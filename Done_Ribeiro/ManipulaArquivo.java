import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ManipulaArquivo {
    public static ArrayList<Diaria> lerArquivo(File dados) {
        //File dados = new File("diarias.txt");
        Diaria novadiaria;
        ArrayList<Diaria> lista = new ArrayList<>();
        String linha;
        String[] dadosDiaria;
        
        try {
            Scanner leia = new Scanner(System.in);
            
            while(leia.hasNext()){
                linha = leia.nextLine();
                dadosDiaria = linha.split("\t");
                novadiaria = new Diaria();
                novadiaria.setCodigo(Integer.parseInt(dadosDiaria[0]));
                novadiaria.setNome(dadosDiaria[1]);
                novadiaria.setData(dadosDiaria[2]);
                dadosDiaria[3] = dadosDiaria[3].replace(',','.');
                novadiaria.setValor(Double.parseDouble(dadosDiaria[3]));
                lista.add(novadiaria);
            }
            return lista;
            
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Não foi possivel encontrar o arquivo.");
            
            return null;
        }
        
    }   
}
