package Classes;

import java.util.Scanner;

public class Piloto {
     private String nome;
     private int CPF;
     private int registroAnac;

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

     public void setRegistroAnac(int registroAnac){
          this.registroAnac = registroAnac;
     }
     public int getRegistroAnac(){
          return registroAnac;
     }

     public String pilotando(){
          return "Pilotando";
     }

     public void registroPiloto(){
        System.out.println("Digite o nome, o cpf e o registro da anac do piloto");
        Scanner tcd = new Scanner(System.in);
        this.nome = tcd.next();
        this.CPF = tcd.nextInt();
        this.registroAnac= tcd.nextInt();
    
    }
}