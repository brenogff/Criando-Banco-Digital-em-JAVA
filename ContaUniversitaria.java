public class ContaUniversitaria extends Conta {

    public ContaUniversitaria(Cliente cliente){
        super(cliente);
    }
    
   public void imprimirExtrato(){
    System.out.println("=== Extrato Conta Universitaria ===");
    super.imprimirInformacoesComuns();
    System.out.println("=== Voce pode pagar suas mensalidades por aqui ===");
    System.out.println("=== Consulte no sistema para saber mais ===");
   } 
    
    
}
