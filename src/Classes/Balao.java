package Classes;

import java.util.Scanner;
public class Balao {

    private int id;
    private String registro;
    private String cor;
    private String tipo;
    private int capacidade;
    private double altura;
    private String porte;
    private double peso;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String voar(){
        return "voando";
    }

    public void registroBalao(){
        System.out.println("Digite o id, o registro, a cor, o tipo, a capacidade, a altura, o porte e o peso suportado pelo balão:");
        Scanner tcd = new Scanner(System.in);
        this.id = tcd.nextInt();
        
    }
}
