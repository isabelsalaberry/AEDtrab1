package trab1;

import java.util.Date;
import java.util.LinkedHashSet;

public class Viagem implements Comparable<Viagem>{

    private static int id = 0; //constante atrelada à classe
    private int cod;
    private String localPartida;
    private String localDestino;
    private Date dataPartida;
    private double precoBilhete;
    private int numLugares;
    private Motorista motorista;
    private LinkedHashSet<Passageiro> passageiros;


    /**
     * Construtor de Viagem com Local de Partida, Local de Chegada, Data de Partida, Preço do Bilhete, Número de Lugares e Motorista
     * @param lp 'Local de Partida' da viagem
     * @param ld 'Local de Destino' da viagem
     * @param dp 'Data de Partida' da viagem
     * @param pb 'Preço do bilhete' da viagem
     * @param nl 'Número de Lugares' da viagem
     * @param m 'Motorista' da viagem
     */
    public Viagem(String lp, String ld, Date dp, double pb, int nl, Motorista m) {
        this.cod = ++id;
        this.localPartida = lp;
        this.localDestino = ld;
        this.dataPartida = dp;
        this.precoBilhete = pb;
        this.numLugares = nl;
        this.motorista = m;
        this.passageiros = new LinkedHashSet<>();
    }

    /**
     * Retorna o atributo 'Codigo'
     * @return atributo 'Codigo'
     */
    public int getCod() {
        return cod;
    }

    /**
     * Retorna o atributo 'Local de Partida'
     * @return atributo 'Local de Partida'
     */
    public String getLocalPartida() {
        return localPartida;
    }

    /**
     * Retorna o atributo 'Local de Destino'
     * @return atributo 'Local de Destino'
     */
    public String getLocalDestino() {
        return localDestino;
    }

    /**
     * Retorna o atributo 'Data de Partida'
     * @return atributo 'Data de Partida'
     */
    public Date getDataPartida() {
        return dataPartida;
    }

    /**
     * Retorna o atributo 'Preço do Bilhete'
     * @return atributo 'Preço do Bilhete'
     */
    public double getPrecoBilhete() {
        return precoBilhete;
    }

    /**
     * Retorna o atributo 'Numero de Lugares'
     * @return atributo 'Numero de Lugares'
     */
    public int getNumLugares() {
        return numLugares;
    }

    /**
     * Retorna o atributo 'Motorista'
     * @return atributo 'Motorista'
     */
    public Motorista getMotorista(){
        return this.motorista;
    }

    /**
     * Retorna o atributo 'Passageiros'
     * @return atributo 'Passageiros'
     */
    public LinkedHashSet<Passageiro> getPassageiros() {
        return passageiros;
    }

    /**
     * Configura o atributo 'Motorista'
     * @param m atributo 'Motorista'
     */
    public void setMotorista(Motorista m){
        this.motorista = m;
    }


    /**
     * Compara dois objetos tomando como referencia a data de partida
     * @param o the object to be compared.
     * @return < 0: se a data de partida de 'o' for maior do que 'this'
     *         = 0: se a data de partida de 'o' for igual a de 'this'
     *         < 0: se a data de partida de 'o' for menor do que 'this'
     */
    @Override
    public int compareTo(Viagem o) {
        return this.dataPartida.compareTo(o.dataPartida);
    }

    /**
     * Adiciona um 'Passageiro' à lista de passageiros da viagem, caso haja lugares disponiveis
     * @param p o Passageiro a ser adicionado
     * @return 'true' se a operação foi bem sucedida, caso contrario 'false'
     */
    public boolean addPassageiro(Passageiro p){
        if (this.getLugaresDisponiveis() > 0)
            return (this.passageiros.add(p));
        return false;
    }

    /**
     * Calcula o número de lugares ainda disponíveis da viagem com base no número de passageiros e número de lugares
     * @return número de lugares ainda disponíveis da viagem
     */
    public int getLugaresDisponiveis(){
        return (this.numLugares - this.passageiros.size());
    }

    /**
     * Calcula o total arrecadado com base no número de passageiros e preço do bilhete
     * @return
     */
    public double getReceitas(){
        return (this.precoBilhete * this.passageiros.size());
    }
}