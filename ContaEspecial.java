public class ContaEspecial extends Conta {

    public ContaEspecial(Cliente cliente){
        super(cliente);
    }
    
   @Override
   public void imprimirExtrato(){
    System.out.println("=== Extrato Conta Especial ===");
    super.imprimirInformacoesComuns();
    System.out.println("=== Voce tem 5000.00 de saldo especial ===");
    System.out.println("=== Consulte no sistema para saber mais ===");
   } 
    
}
