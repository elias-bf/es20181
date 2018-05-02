package exercicio03;

public class Retangulo {
    
    private float comprimento;
    private float largura;

    public Retangulo() {
        comprimento = 0;
        largura = 0;
    }

    public Retangulo(float comprimento, float largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    public float calcArea(){
        return (largura*comprimento);
    }
    public float calcPerimetro(){
        return (largura+largura+comprimento+comprimento);
    }
}
