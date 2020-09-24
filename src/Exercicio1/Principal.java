package Exercicio1;

public class Principal {

    public static void main(String[] args) {
        Novo novo1 = new Novo();
        //Os imóveis novos abaixo existem de fato, assim como os endereços, preços e status citados, porém, com o tempo algumas informações que até o momento são verídicas, podem mudar

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-= Imóveis novos disponíveis -=-=-=-=-=-=-=-=-=-=-=-=  ");
        novo1.setNomeProp("TAO Incorporadora");
        novo1.setEndereco("Boulevard Vinte e Oito de Setembro, 62 - Vila Isabel, Rio de Janeiro - RJ");
        novo1.setpReal(160000);
        novo1.setStats("Novo");
        novo1.exibirInformacoes();
        novo1.calcularValor();
        System.out.println("---------------------------------------------------------------------------");

        Novo novo2 = new Novo();
        novo2.setNomeProp("CURY SP");
        novo2.setEndereco("Avenida dos Ourives, 774 - Jardim São Savério, São Paulo - SP");
        novo2.setpReal(212000);
        novo2.setStats("Novo");
        novo2.exibirInformacoes();
        novo2.calcularValor();
        System.out.println("---------------------------------------------------------------------------");

        Novo novo3 = new Novo();
        novo3.setNomeProp("Vitacon");
        novo3.setEndereco("Avenida Rebouças, 1092 - Pinheiros, São Paulo - SP");
        novo3.setpReal(905819);
        novo3.setStats("Novo");
        novo3.exibirInformacoes();
        novo3.calcularValor();

        //A partir daqui, todas as informações mostradas abaixo são fictícias
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-= Imóveis velhos disponíveis -=-=-=-=-=-=-=-=-=-=-=-=  ");
        Velho old1 = new Velho();
        old1.setNomeProp("Joãozinho");
        old1.setEndereco("Rua das abobrinhas, 153 - Jardim Bonito, São Paulo - SP");
        old1.setpReal(400000);
        old1.setStats("Velho");
        old1.exibirInformacoes();
        old1.calcularValor();
        System.out.println("---------------------------------------------------------------------------");

        Velho old2 = new Velho();
        old2.setNomeProp("Aninha");
        old2.setEndereco("Rua das Frutas, 97 - Lago dos pássaros, São Paulo - SP");
        old2.setpReal(300000);
        old2.setStats("Velho");
        old2.exibirInformacoes();
        old2.calcularValor();
        System.out.println("---------------------------------------------------------------------------");

        Velho old3 = new Velho();
        old3.setNomeProp("Mário");
        old3.setEndereco("Rua das Mandiocas, 49 - Vila Anciã, Rio de Janeiro - RJ");
        old3.setpReal(90000);
        old3.setStats("Velho");
        old3.exibirInformacoes();
        old3.calcularValor();
        System.out.println("---------------------------------------------------------------------------");

    }
}
