import java.util.ArrayList;
import java.util.List;

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

        imprimir(cc, poupanca, especial, universitaria);

    }

    private static void imprimir(Conta cc, Conta poupanca, Conta especial, Conta universitaria) {
        List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc);
        contas.add(poupanca);
        contas.add(especial);
        contas.add(universitaria);

        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }
    
}
