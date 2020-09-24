package Exercicio1;

public class Velho extends Imovel {

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome do proprietário: " + this.nomeProp);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Preço real: R$"+this.pReal);
        System.out.println("Status: " + this.stats);
    }

    @Override
    public void calcularValor() {
        this.pAtualizado = pReal - (0.1 * pReal);
        System.out.println("Preço atualizado: R$"+this.pAtualizado);
    }
}
