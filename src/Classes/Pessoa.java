package Classes;

public class Pessoa {
    String nome;
    String CPF;
    String RG;
    int telefone;
    int emergencia;
    String AssinaturaTermo;
    String endereco;

    Pessoa(String _nome){
    this.nome = _nome;
    }

    public String Embarcado(){
        return "Embarcado";
    }
}
