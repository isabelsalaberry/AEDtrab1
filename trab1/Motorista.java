package trab1;

import java.util.TreeSet;

public class Motorista extends Pessoa{

    private double salario;
    private TreeSet<Viagem> viagens;

    public Motorista(String nome, double salario) {
        super(nome);
        this.salario = salario;
        this.viagens = new TreeSet<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
