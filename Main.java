public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        System.out.println("Objeto criado: " + c1);

        Caneta2 canetaA = new Caneta2();
        canetaA.setCor("Azul");
        canetaA.setEspessura(0.5);

        Caneta2 canetaB = new Caneta2();
        canetaB.setCor("Preta");
        canetaB.setEspessura(1.0);

        System.out.println("Caneta A: " + canetaA.getCor() + " - " + canetaA.getEspessura());
        System.out.println("Caneta B: " + canetaB.getCor() + " - " + canetaB.getEspessura());

        Caneta3 cAzul = new Caneta3("Azul", 0.7);
        Caneta3 cPreta = new Caneta3("Preta", 1.0);

        cAzul.escrever("Escrito com a azul");
        cPreta.escrever("Escrito com a preta");

        Lampada lamp = new Lampada();
        System.out.println("Ligada? " + lamp.isLigada());
        lamp.ligar();
        System.out.println("Ligada? " + lamp.isLigada());
        lamp.desligar();
        System.out.println("Ligada? " + lamp.isLigada());

        Mesa minhaMesa = new Mesa(cAzul);
        minhaMesa.usarCaneta("Escrevendo na mesa...");

        Caneta3 fab1 = FabricaDeCanetas.criarAzul();
        Caneta3 fab2 = FabricaDeCanetas.criarPreta();

        fab1.escrever("Caneta azul da fábrica!");
        fab2.escrever("Caneta preta da fábrica!");
    }
}
