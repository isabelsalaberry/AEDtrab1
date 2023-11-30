package trab1;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author Pedro Henrique Filla Decolin - a52982
 * @author Isabel Irigon Salaberry - a52983
 * 
 */
public class Empresa {

    private LinkedHashSet<Motorista> motoristas;
    private TreeSet<Viagem> viagens;

    /**
     * Construtor de Empresa sem nenhum parâmetro. Apenas inicaliza as listas
     */
    public Empresa() {
        this.motoristas = new LinkedHashSet<>();
        this.viagens = new TreeSet<>();
    }

    /**
     * Cria um Motorista e o adciona à lista de motoristas
     * @param nif 'NIF' do motorista a ser criado
     * @param nome 'Nome' do motorista a ser criado
     * @param salario 'Salario' do motorista a ser criado
     * @return 'true' se a operação foi bem sucedida, caso contrario 'false'
     */
    public boolean addMotorista(String nif, String nome, double salario){
        return motoristas.add(new Motorista(nif,nome,salario));
    }

    /**
     * Cria uma viagem e a adiciona à lista de viagens
     * @param lp 'Local de Partida' da viagem a ser criada
     * @param ld 'Local de Destino' da viagem a ser criada
     * @param dp 'Data de Partida' da viagem a ser criada
     * @param pb 'Preço do Bilhete' da viagem a ser criada
     * @param nl 'Numero de Lugares' da viagem a ser criada
     * @param m  'Motorista' da viagem a ser criada
     * @return 'true' se a operação foi bem sucedida, caso contrário 'false'
     */
    public boolean addViagem(String lp, String ld, Date dp, double pb, int nl, Motorista m){
        return viagens.add(new Viagem(lp,ld,dp, pb, nl, m));
    }

    /**
     * Remove um motorista específico da lista de motoristas
     * @param nif 'NIF' do motorista a ser removido
     */
    public void removerMotorista(String nif){
        Iterator<Motorista> it = motoristas.iterator();
        while (it.hasNext()){
            Motorista m = it.next();
            if (m.getNif().equals(nif))
                it.remove();
        }
    }

    /**
     * Remove uma viagem em específco da lista de viagens
     * @param cod 'Codigo' da viagem a ser removida
     */
    public void removerViagem(int cod){
        Iterator<Viagem>  it = viagens.iterator();
        while(it.hasNext()) {
            Viagem v = it.next();
            if (v.getCod() == cod) {
                it.remove();
            }
        }
    }

    /**
     * Adiciona um passageiro à lista de passageiros da viagem e atrela à esse passageiro essa viagem
     * @param p 'Passageiro' a ser vendido o bilhete
     * @param codViagem 'Codigo' da viagem a ser vendido o bilhete
     * @return 'true' se a operação foi bem sucedida, caso contrário 'false'
     */
    public boolean vendeBilhete(Passageiro p, int codViagem){
        Iterator<Viagem>  it=viagens.iterator();
        while(it.hasNext()) {
            Viagem viagem = it.next();
            if(viagem.getCod()==codViagem){
                p.setBilhete(viagem);
                viagem.addPassageiro(p);
                return true;
            }
        }
        return false;
    }

    /**
     * Calcula a receita total de todas as viagens da lista
     * @return o total das receitas das viagens
     */
    public double getReceitasTotais() {
        double receitasTotais = 0;

        for (Viagem v : this.viagens) receitasTotais += v.getReceitas();

        return receitasTotais;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("..................................\n");
        str.append("Motoristas cadastrados na empresa:\n");
        str.append("..................................\n");
        for (Motorista m: motoristas) str.append(m.toString());
        str.append("...............................\n");
        str.append("Viagens cadastradas na empresa:\n");
        str.append("...............................\n");
        for (Viagem v: viagens) str.append(v.toString());
        str.append("...........................\n");
        str.append("Receitas totais da empresa:\n");
        str.append("...........................\n");
        str.append("Total: € " + getReceitasTotais() + "\n");

        return str.toString();
    }
}