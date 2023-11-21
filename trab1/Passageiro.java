package trab1;

public class Passageiro extends Pessoa{

    private String telefone;
    private Viagem bilhete;

    public Passageiro(String nif, String nome, String telefone) {
        super(nif, nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public Viagem getBilhete() {
        return bilhete;
    }

    public void setBilhete(Viagem bilhete) {
        this.bilhete = bilhete;
    }
    
    
}
