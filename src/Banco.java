import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    List<Conta> contas = new ArrayList<>();

    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void exibirContas(){
        for(Conta conta : contas){
            System.out.println("--- Conta Número: " + conta.numero + " ---");
            System.out.println("Titular: " + conta.cliente.nome);
            System.out.println("Saldo: " + conta.saldo);
        }
    }
}