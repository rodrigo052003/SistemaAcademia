package Formato;

public class Instrutor {
    private String nome;
    private int cod;
    private String formacao;
    private float altura;

    public Instrutor(String nome, int cod, String formacao, float altura){
        this.nome = nome;
        this.cod = cod;
        this.formacao = formacao;
        this.altura = altura;
    }

    public String getnome() {
        return nome;
    }
    public String getformacao() {
        return formacao;
    }
    public float getAltura() {
        return altura;
    }

    public int getCod() {
        return cod;
    }
}
