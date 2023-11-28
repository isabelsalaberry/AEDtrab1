package trab1;

import java.util.Date;
import java.util.TreeSet;

public class Motorista extends Pessoa{

    private double salario;
    private TreeSet<Viagem> viagens;

    /**
     * Construtor de Motorista com NIF, Nome e Salario
     * @param nif 'NIF' do Motorista a ser criado
     * @param nome 'Nome' do Motorista a ser criado
     * @param salario 'Salario' do Motorista a ser criado
     */
    public Motorista(String nif, String nome, double salario) {
        super(nif, nome);
        this.salario = salario;
        this.viagens = new TreeSet<>();
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

    /**
     * Cria uma viagem e a adiciona à lista de viagens de Motorista
     * @param lp 'Local de Partida' da viagem
     * @param ld 'Local de Destino' da viagem
     * @param dp 'Data de Partida' da viagem
     * @param pb 'Preço do Bilhete' da viagem
     * @param nl 'Numero de Lugares' no autocarro da viagem
     * @return 'true' se a operação foi bem sucedida, caso contrario 'false'
     */
    public boolean addViagem(String lp, String ld, Date dp, double pb, int nl){
        return(viagens.add(new Viagem(lp,ld,dp, pb, nl, this )));
    }
}
