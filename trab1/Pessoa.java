package trab1;

public class Pessoa {

    private String nif;
    private String nome;

    
    public Pessoa(String nome) {
        this("0", nome);
    }

    public Pessoa(String nif, String nome) {
        this.nif = nif;
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
