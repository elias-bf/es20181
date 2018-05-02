package exercicio02;

public class Piramide {
    private float base;
    private float altura;

    public Piramide() {
        base = 0;
        altura = 0;
    }

    public Piramide(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float calcVolume(){
        return 1.0f/3*base*altura;
    }
}
