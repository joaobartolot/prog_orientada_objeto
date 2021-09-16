// João Victor C. Bartolot e Luana da Costa Bueno

import java.time.LocalDate;

public class TesteEscalacao {
    public static void main(String[] args) {
        Time t = new Time("Flamengo", "mengao");

        Jogador[] jogadores = {
            new Jogador("Joao", "Bartolot", 23, t),
            new Jogador("Joao", "Bartolot", 23, t),
            new Jogador("Joao", "Bartolot", 23, t),
            new Jogador("Joao", "Bartolot", 23, t),
            new Jogador("Joao", "Bartolot", 23, t)
        };

        Escalacao e = new Escalacao(t, jogadores, LocalDate.now());
        e.imprimir();
    }

}
