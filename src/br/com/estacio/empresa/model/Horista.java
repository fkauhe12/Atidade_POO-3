package br.com.estacio.empresa.model;

public class Horista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;
    
    // Construtor
    public Horista(String nome, String cpf, int idade, double valorHora, int horasTrabalhadas) {
        super(nome, cpf, idade);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Encapsulamento
    public double getValorHora() {
        return valorHora;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    // Métodos
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor por Hora: " + this.valorHora);
        System.out.println("Horas Trabalhadas: " + this.horasTrabalhadas);
    }
}
