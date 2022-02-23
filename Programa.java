public class Programa {

    public static void main(String[] args) {

        Cliente Breno = new Cliente();
        Breno.setNome("Breno");

        Conta cc = new ContaCorrente(Breno);
        Conta poupanca = new ContaPoupanca(Breno);
        Conta especial = new ContaEspecial(Breno);
        Conta universitaria = new ContaUniversitaria(Breno);

        cc.depositar(200);

        cc.transferir(50, poupanca);

        cc.transferir(50, especial);

        cc.transferir(50, universitaria);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        especial.imprimirExtrato();
        universitaria.imprimirExtrato();

    }
    
}
