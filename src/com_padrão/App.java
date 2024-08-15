package com_padrão;

// Contrato para definir o que um gerente que pode ou não aprovar pedidos deve ter
// No caso, um gerente pode aprovar ou negar o pedido (realizado no método "aprovar")
// Ou, caso o gerente não tenha autorização para aprovar ou negar o pedido ele deve passar para o próximo gerente (realizado no método "setProximoGerenteAprovador")

interface GerenteAprovadorDePedidos {
    void setProximoGerenteAprovador(GerenteAprovadorDePedidos aprovador);
    boolean aprovar(Pedido pedido);
}

class Pedido {
    private double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

class Gerente implements GerenteAprovadorDePedidos {
    private String nome;
    private double limiteAprovacao;
    private GerenteAprovadorDePedidos proximoGerenteAprovador;

    // ... construtores e getters
    public Gerente(String nome, double limiteAprovacao){
        this.nome = nome;
        this.limiteAprovacao = limiteAprovacao;
    }

    @Override
    public void setProximoGerenteAprovador(GerenteAprovadorDePedidos aprovador) {
        this.proximoGerenteAprovador = aprovador;
    }

    @Override
    public boolean aprovar(Pedido pedido) {
        if (pedido.getValor() <= limiteAprovacao) {
            System.out.println("Pedido aprovado por " + this.nome;

            return true;
        } else if (proximoGerenteAprovador != null) {
            System.out.println("Pedido não pode ser aprovado por " + this.nome);

            return proximoGerenteAprovador.aprovar(pedido);
        }
        
        System.out.println("Pedido não pode ser analisado.");
        return false;
    }
}

public class App {
    public static void main(String[] args) {
        Gerente gerenteJunior = new Gerente("James Beto Bonde", 5000);
        Gerente gerentePleno = new Gerente("Joshep De HaHaHa", 10000);
        Gerente gerenteSenior = new Gerente("Baty Raio Laser", Double.MAX_VALUE);

        gerenteJunior.setProximoGerenteAprovador(gerentePleno);
        gerentePleno.setProximoGerenteAprovador(gerenteSenior);
        // gerentePleno.setProximoGerenteAprovador(null);

        Pedido pedido1 = new Pedido(2000.00);
        Pedido pedido2 = new Pedido(8000.00);
        Pedido pedido3 = new Pedido(12000.00);
        gerenteJunior.aprovar(pedido1);
        gerenteJunior.aprovar(pedido2);
        gerenteJunior.aprovar(pedido3);
    }
}