package exercicio01;

public class Esfera {
    //parametros
    private float raio;
    
    //construtores
    public Esfera() {
        raio = 0;
    }
    public Esfera(float raio) {
        this.raio = raio;
    }
    
    //Acessores
    public float getRaio() {
        return raio;
    }
    
    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    //especiais
    public double calcArea(){
        return (4*3.14*raio*raio);
    }
    public double calcVolume(){
        return (4.0/3*3.14*raio*raio*raio);
    }

}