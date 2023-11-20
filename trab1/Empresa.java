package trab1;

import java.util.Date;
import java.util.LinkedHashSet;

/**
 * @author Pedro Henrique Filla Decolin - a52982
 */
public class Empresa {

    private LinkedHashSet<Motorista> motoristas;
    private LinkedHashSet<Viagem> viagens;

    public Empresa() {
        this.motoristas = new LinkedHashSet<>();
        this.viagens = new LinkedHashSet<>();
    }

    public boolean addMotorista(String nif, String nome, double salario){
        return false;
    }

    public boolean addViagem(String lp, String ld, Date dp, double pb, int nl){
        return false;
    }

    public boolean removerMotorista(String nif){
        return false;
    }

    public boolean removerViagem(int cod){
        return false;
    }

    public double getReceitasTotais(){
        return 0.0;
    }

    public boolean vendeBilhete(Passageiro p, int codViagem){
        return false;
    }
}
