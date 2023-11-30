package trab1;

import java.util.Date;
import java.util.TreeSet;

/**
 * Representa um motorista, herdando de pessoa e adicionando atributos e métodos
 */
public class Motorista extends Pessoa{

    private double salario;

    /**
     * Construtor de Motorista com NIF, Nome e Salario
     * @param nif 'NIF' do Motorista a ser criado
     * @param nome 'Nome' do Motorista a ser criado
     * @param salario 'Salario' do Motorista a ser criado
     */
    public Motorista(String nif, String nome, double salario) {
        super(nif, nome);
        this.salario = salario;
    }

    /**
     * Retorna o atributo 'Salario'
     * @return atributo 'Salario'
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Configura o atributo 'Salario'
     * @param salario atributo 'Salario'
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\t" + "====================\n" +
                "\t" + "nif: " + nif + "\n" +
                "\t" + "nome: " + nome + "\n" +
                "\t" + "salario: " + salario + "\n" +
                "\t" + "====================\n";
    }
}
