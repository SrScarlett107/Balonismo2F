package Classes;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int CPF;
    private String RG;
    private int telefone;
    private int emergencia;
    private String assinaturaTermo;
    private String endereco;


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setCPF(int CPF){
        this.CPF = CPF;
    }
    public int getCPF(){
        return CPF;
    }

    public void setRG(String RG){
        this.RG = RG;
    }
    public String getRG(){
        return RG;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public int getTelefone(){
        return telefone;
    }

    public void setEmergencia(int emergencia){
        this.emergencia = emergencia;
    }
    public int getEmergencia(){
        return emergencia;
    }

    public void setAssinaturaTermo(String assinaturaTermo){
        this.assinaturaTermo = assinaturaTermo;
    }
    public String getAssinaturaTermo(){
        return assinaturaTermo;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
public void registroPessoa(){
        System.out.println("Digite o id, o registro, a cor, o tipo, a capacidade, a altura, o porte e o peso suportado pelo balão:");
        Scanner tcd = new Scanner(System.in);
        this.nome = tcd.next();
        this.CPF = tcd.nextInt();
        this.RG = tcd.next();
        this.telefone = tcd.nextInt();
        this.emergencia = tcd.nextInt();
        this.assinaturaTermo = tcd.next();
        this.endereco = tcd.next();
    }

    public String Embarcado(){
        return "Embarcado";
    }
}

