package principal;

import trab1.Empresa;
import trab1.Motorista;
import trab1.Passageiro;
import trab1.Viagem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //criação da empresa
        Empresa e = new Empresa();

        //criação de dois motoristas
        Motorista m = new Motorista("12345", "Gregor", 1500);
        Motorista m2 = new Motorista("45678", "Isabel", 1700);

        //adicona os motoristas à lista da empresa
        e.addMotorista(m.getNif(), m.getNome(), m.getSalario());
        e.addMotorista(m2.getNif(), m2.getNome(), m2.getSalario());

        //criação de três viagens
        e.addViagem("Bragança", "Porto", new Date(2023, 12, 5), 20.5, 40, m);
        e.addViagem("Bragança", "Lisboa", new Date(2023, 12, 9), 15, 30, m);
        e.addViagem("Porto", "Coimbra", new Date(2023, 12, 1), 13.5, 30, m2);

        //venda de três bilhetes à três passageiros, na viagem de codigo 1
        e.vendeBilhete(new Passageiro("121212347", "Carlos", "123456789"), 1);
        e.vendeBilhete(new Passageiro("121212348", "Julia", "789456123"), 1);
        e.vendeBilhete(new Passageiro("121212349", "Ines", "456123789"), 1);
        System.out.println("Receitas totais: " + e.getReceitasTotais());
    }
}
