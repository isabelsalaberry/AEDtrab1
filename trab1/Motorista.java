package trab1;

import java.util.Date;
import java.util.TreeSet;

public class Motorista extends Pessoa{

    private double salario;
    private TreeSet<Viagem> viagens;

    public Motorista(String nif, String nome, double salario) {
        super(nif, nome);
        this.salario = salario;
        this.viagens = new TreeSet<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public boolean addViagem(String lp, String ld, Date dp, double pb, int nl){
        return(viagens.add(new Viagem(lp,ld,dp, pb, nl, this )));
    }
    
    
}
