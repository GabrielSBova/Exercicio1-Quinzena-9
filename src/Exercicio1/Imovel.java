package Exercicio1;

public abstract class Imovel {
    protected String nomeProp;
    protected String endereco;
    protected double pReal;
    protected double pAtualizado;
    protected String stats;


    public abstract void exibirInformacoes();
    public abstract void calcularValor();

    public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setpReal(double pReal) {
        this.pReal = pReal;
    }

    public void setpAtualizado(double pAtualizado) {
        this.pAtualizado = pAtualizado;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }
}

