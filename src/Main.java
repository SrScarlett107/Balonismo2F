import java.util.Scanner;

import Classes.Balao;
public class Main {
    public static void main(String[] args) {
 Scanner tcd = new Scanner(System.in);
        int x = 0;

        for(x = 0; x == 1;){

            System.out.println("Bem vindo a agencia de balão, digite 1 se quiser adicionar um balão, digite 2 se quiser ver o balão já registrado, digite 3 se quiser registrar um piloto, digite 4 se quiser ver o piloto já regisrado, digite 5 se quiser registrar um passageiro, digite 6 se quiser ver o passsageiro já registrado");

            int y = tcd.nextInt();

            if (y == 1){
                 Balao b1 = new Balao();
                 b1.registroBalao();
            }
            else if(y ==2){
                
            }
        }
        

   
}

}