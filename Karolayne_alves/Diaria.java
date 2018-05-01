
package projetodiarias;

public class Diaria {
    private int codigo;
    private String nome;
    private String data;
    private double valor;

    public Diaria() {
    }

    public Diaria(int codigo, String nome, String data, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.data = data;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " • Diária => " + "Código: " + codigo + ", Nome: " + nome + ", data: " + data + ", valor: R$" + valor;
    }
    
}
