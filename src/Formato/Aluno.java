package Formato;

public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private float altura;

    public Aluno(String nome, int idade, double peso, float altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
}
