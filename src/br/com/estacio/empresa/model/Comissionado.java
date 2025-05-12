package br.com.estacio.empresa.model;

public class Comissionado extends Funcionario {
    //Atributos
    private double totalVendas;
    private double taxaComissao;

    //Construtor
    public Comissionado(String nome, String cpf, int idade, double totalVendas, double taxaComissao) {
        super(nome, cpf, idade);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    //Encapsulamento
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    //Métodos
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Total de Vendas: " + this.totalVendas);
        System.out.println("Taxa de Comissão: " + this.taxaComissao);
    }





    
}
