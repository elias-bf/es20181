package objetoEsfera;

public class Esfera {
    //Parametros
    private double raio;
    
    //Construtores
    public Esfera(){
        raio = 0;
    }
    public Esfera(double raio){
        this.raio = raio;
    }
    
    //Acessores.
    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }
    
    //Especiais.
    public double calcArea(){
        return (4*3.14*raio*raio);
    }
    public double calcVolume(){
        return (4.0/3*3.14*raio*raio*raio);
    }
}
