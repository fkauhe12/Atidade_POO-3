package br.com.estacio.empresa.model;
import br.com.estacio.empresa.interfaces.Autenticavel;


public class Assalariado extends Funcionario implements Autenticavel {
    // Atributos
    private double salario;

    // Construtor
    public Assalariado(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, idade);
        this.salario = salario;
    }

    // encapsulamento
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: " + this.salario);
    }

    @Override
    public boolean autenticar(String senha) {
        return true;
    }
    
}
