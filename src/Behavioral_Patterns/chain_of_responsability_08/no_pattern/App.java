package Behavioral_Patterns.chain_of_responsability_08.no_pattern;

class Pedido {
    private double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

class Gerente {
    private String nome;
    private double limiteAprovacao;

    public Gerente(String nome, double limiteAprovacao) {
        this.nome = nome;
        this.limiteAprovacao = limiteAprovacao;
    }

    public String getNome() {
        return nome;
    }

    public boolean aprovar(Pedido pedido) {
        return pedido.getValor() <= limiteAprovacao;
    }
}

public class App {
    public static void main(String[] args) {
        Gerente gerenteJunior = new Gerente("James Beto Bonde", 5000);
        Gerente gerentePleno = new Gerente("Joshep De HaHaHa", 10000);
        Gerente gerenteSenior = new Gerente("Baty Raio Laser", Double.MAX_VALUE);

        Pedido pedido = new Pedido(2500);
        // Pedido pedido = new Pedido(8000);
        // Pedido pedido = new Pedido(12000);

        if (gerenteJunior.aprovar(pedido)) {
            System.out.println("Pedido aprovado por " + gerenteJunior.getNome());
        } else if (gerentePleno.aprovar(pedido)) {
            System.out.println("Pedido aprovado por " + gerentePleno.getNome());
        } else if (gerenteSenior.aprovar(pedido)) {
            System.out.println("Pedido aprovado por " + gerenteSenior.getNome());
        } else {
            System.out.println("Pedido não aprovado.");
        }
    }
}