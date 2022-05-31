package ex3;

public class Main {

    public static void main(String[] args) {

        Caminhao automovel1 = new Caminhao();
        Esportivo automovel2 = new Esportivo();


        String [] automoveis = {automovel1.combustivel(), automovel2.combustivel()};

        System.out.println(automovel1 + "Usa diesel!");
        System.out.println(automovel2 + "Usa gasolina!");
    }
}


