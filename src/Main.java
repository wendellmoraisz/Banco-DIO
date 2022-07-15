public class Main {
    
    public static void main(String[] args) {

        
        Conta contaCorrente = new ContaCorrente(new Cliente("Wendell"));
        Conta contaPoupanca = new ContaPoupanca(new Cliente("Flavinho"));
        
        contaCorrente.depositar(100);
        contaCorrente.transferir(50, contaPoupanca);
        
        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
        
        Banco santander = new Banco();
        santander.setNome("Santander");
        santander.addConta(contaCorrente);
        santander.addConta(contaPoupanca);

        santander.exibirContas();
    }
}
