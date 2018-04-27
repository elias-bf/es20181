package objetoEsfera;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Esfera esfera1 = new Esfera();
        
        System.out.println("Digite o valor do raio da esfera");
        esfera1.setRaio(scan.nextDouble());
        System.out.println(" ");
        
        System.out.println("Area: "+esfera1.calcArea());
        System.out.println("Volume: "+esfera1.calcVolume());
    }
    
}
