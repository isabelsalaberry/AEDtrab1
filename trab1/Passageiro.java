package trab1;

public class Passageiro extends Pessoa{

    private String telefone;
    private Viagem bilhete;

    /**
     * Construtor de Passageiro com NIF, Nome e Telefone
     * @param nif 'NIF' do Passageiro a ser criado
     * @param nome 'Nome' do Passageiro a ser criado
     * @param telefone 'Telefone' do passageiro a ser criado
     */
    public Passageiro(String nif, String nome, String telefone) {
        super(nif, nome);
        this.telefone = telefone;
    }

    /**
     * Retorna o atributo 'Telefone'
     * @return atributo 'Telefone'
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Retorna o atributo 'Viagem'
     * @return atributo 'Viagem'
     */
    public Viagem getBilhete() {
        return bilhete;
    }

    /**
     * Configura o atributo 'Viagem'
     * @param bilhete atributo 'Viagem'
     */
    public void setBilhete(Viagem bilhete) {
        this.bilhete = bilhete;
    }

    @Override
    public String toString() {
        return "\t\t" + "====================\n" +
                "\t\t" + "nif: " + nif + "\n" +
                "\t\t" + "nome: " + nome + "\n" +
                "\t\t" + "telefone: " + telefone + "\n" +
                "\t\t" + "====================\n";
    }
}
