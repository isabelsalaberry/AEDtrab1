package trab1;

public class Pessoa {

    protected String nif;
    protected String nome;

    /**
     * Construtor de Pessoa apenas com nome
     * @param nome 'Nome' da pessoa a ser criada
     */
    public Pessoa(String nome) {
        this("0", nome);
    }

    /**
     * Construtor de Pessoa com NIF e nome
     * @param nif 'NIF' da pessoa a ser criada
     * @param nome 'Nome' da pessoa a ser criada
     */
    public Pessoa(String nif, String nome) {
        this.nif = nif;
        this.nome = nome;
    }

    /**
     * Retorna o atributo 'NIF'
     * @return atributo 'NIF'
     */
    public String getNif() {
        return nif;
    }

    /**
     * Retorna o atributo nome
     * @return atributo 'Nome'
     */
    public String getNome() {
        return nome;
    }

    /**
     * Configura atributo 'NIF'
     * @param nif atributo 'NIF'
     */
    public void setNif(String nif) {
        this.nif = nif;
    }
}
