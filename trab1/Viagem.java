package trab1;

import java.util.Date;
import java.util.LinkedHashSet;

public class Viagem implements Comparable<Viagem>{

    private static int id = 0;
    private int cod;
    private String localPartida;
    private String localDestino;
    private Date dataPartida;
    private double precoBilhete;
    private int numLugares;
    private Motorista motorista;
    private LinkedHashSet<Passageiro> passageiros;


    //Constructor, getters and setters
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
    
    public int getCod() {
        return cod;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public double getPrecoBilhete() {
        return precoBilhete;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public void setMotorista(Motorista m){

    }


    //Override and implements methods
    @Override
    public int compareTo(Viagem o) {
        return this.dataPartida.compareTo(o.dataPartida);
    }


    //Normal methods
    public Motorista getMotorista(){
        return null;
    }

    public boolean addPassageiro(Passageiro p){
        return false;
    }

    public int getLugaresDisponiveis(){
        return 0;
    }

    public double getReceitas(){
        return 0.0;
    }
}
