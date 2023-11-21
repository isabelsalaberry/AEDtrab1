package trab1;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Pedro Henrique Filla Decolin - a52982
 * @author Isabel Irigon Salaberry - a52983
 * 
 */
public class Empresa {

    private LinkedHashSet<Motorista> motoristas;
    private LinkedHashSet<Viagem> viagens;

    public Empresa() {
        this.motoristas = new LinkedHashSet<>();
        this.viagens = new LinkedHashSet<>();
    }

    public boolean addMotorista(String nif, String nome, double salario){
     return motoristas.add(new Motorista(nif,nome,salario));        
    }
    
    public boolean addViagem(String lp, String ld, Date dp, double pb, int nl, Motorista m){
        //add uma viagem no LinkedHashSet de viagens da empresa e no TreeMap de viagens do motorista
        return(viagens.add(new Viagem(lp,ld,dp, pb, nl, m ))||(m.addViagem(lp,ld,dp, pb, nl)));
    }

    public boolean removerMotorista(String nif){
        Iterator<Motorista>  it=motoristas.iterator();
        while(it.hasNext()) {
            Motorista motorista = it.next();    //o iterator é posicionado sempre antes do primeiro item da coleção
            if (motorista.getNif().equals(nif)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean removerViagem(int cod){
        Iterator<Viagem>  it=viagens.iterator();
        while(it.hasNext()) {
            Viagem viagem = it.next();
            if (viagem.getCod()==cod) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean vendeBilhete(Passageiro p, int codViagem){
        /*
        iterator percorre a lista de viagens e quando encontrar a com código 
        correspondente seta o Bilhete (do tipo Viagem) ao passageiro p
        */
        Iterator<Viagem>  it=viagens.iterator();
        while(it.hasNext()) {
            Viagem viagem = it.next();
            if(viagem.getCod()==codViagem){
                p.setBilhete(viagem);  
                   return true;
            }
        }
        return false;
    }
    

    public double getReceitasTotais(){
        /*
        conta o numero de itens na lista de passageiros em cada viagem da lista 
        de viagens e multiplica pelo preço do bilhete
        */
    double receitasTotais = 0;
    int numPassageiros=0;
    
    Iterator<Viagem> itV = viagens.iterator();
    while (itV.hasNext()) {
        Viagem viagem = itV.next();
        Iterator<Passageiro> itP = viagem.getPassageiros().iterator();
        while (itP.hasNext()) {
            Passageiro passageiro = itP.next();
            numPassageiros++;
        }
        receitasTotais+=(numPassageiros*viagem.getPrecoBilhete());
    }

    return receitasTotais;
    }


}
