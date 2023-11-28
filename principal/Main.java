package principal;

import trab1.Empresa;
import trab1.Motorista;
import trab1.Passageiro;
import trab1.Viagem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empresa e = new Empresa();

        e.addViagem("Bragança", "Porto", new Date(2023, 12, 5), 20.5, 40);
        e.addViagem("Bragança", "Lisboa", new Date(2023, 12, 9), 15, 30);
        e.addViagem("Porto", "Coimbra", new Date(2023, 12, 1), 13.5, 30);

        e.addMotorista("121212345", "Eduardo Pinto", 1500);
        e.addMotorista("121212346", "Tiago Lopes", 1500);

        Motorista m = new Motorista("121212345", "Eduardo Pinto", 1500);
        Viagem v = new Viagem("Porto", "Coimbra", new Date(2023, 12, 1), 13.5, 30, null);
        e.addMotoristaAViagem(m, v);

        e.vendeBilhete(new Passageiro("121212347", "Carlos", "123456789"), 1);
        e.vendeBilhete(new Passageiro("121212348", "Julia", "789456123"), 1);
        e.vendeBilhete(new Passageiro("121212349", "Ines", "456123789"), 1);
        System.out.println("Receitas totais: " + e.getReceitasTotais());
    }
}
