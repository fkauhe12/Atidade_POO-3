package br.com.estacio.empresa.model;

public abstract class Funcionario {
    // Atributos
    protected  String nome;
    protected String cpf;
    protected int idade;

    // Construtor
    public Funcionario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    // encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
    }
    


}