package principal;

import trab1.Empresa;
import trab1.Motorista;
import trab1.Passageiro;
import trab1.Viagem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empresa e = new Empresa();

        Motorista m = new Motorista("123456789", "Rui Cardoso", 1500);
        Motorista m2 = new Motorista("987654321", "Carolina Silva", 1700);

        e.addMotorista(m.getNif(), m.getNome(), m.getSalario());
        e.addMotorista(m2.getNif(), m2.getNome(), m2.getSalario());

        e.addViagem("Bragança", "Porto", new Date(2023, 12, 5), 20.5, 40, m);
        e.addViagem("Bragança", "Lisboa", new Date(2023, 12, 9), 15, 30, m);
        e.addViagem("Porto", "Coimbra", new Date(2023, 12, 1), 13.5, 30, m2);

        e.vendeBilhete(new Passageiro("121212347", "Carlos Pinto", "123456789"), 1);
        e.vendeBilhete(new Passageiro("121212348", "Julia Rocha", "789456123"), 1);
        e.vendeBilhete(new Passageiro("121212349", "Ines Freitas", "456123789"), 1);
        e.vendeBilhete(new Passageiro("121212350", "Joao Pereira", "789567345"), 2);

        System.out.println(e);

        e.removerMotorista("45678");
        e.removerViagem(2);

        System.out.println(e);
    }
}
