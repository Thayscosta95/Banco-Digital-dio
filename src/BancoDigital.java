public class BancoDigital {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        cc.depositar(1000);
        cc.transferir(300, poupanca);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}
