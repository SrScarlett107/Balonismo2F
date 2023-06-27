import Classes.Balao;

public class Main {
    public static void main(String[] args) {

        Balao b1 = new Balao();
        String resultado = b1.voar();
        System.out.println(resultado);
        b1.id = 54545;
        b1.registro = "fddddd";
        b1.cor = "azul";
        b1.tipo = "comum";
        b1.capacidade = 5;
        b1.altura = 100.00;
        b1.porte = "medio";
        b1.peso =  150.00;

    }
}
