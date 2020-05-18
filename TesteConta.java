
public class TesteConta {
    public static void main(String[] args) {
      /*
        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(133);
        cc.setNumero(3435);
        cc.setLimite(1000);
        cc.getSaldo();
*/
      ContaCorrente cc2 = new ContaCorrente( 133, 3435, 1000 );
      cc2.exibeDados();
      cc2.depositar(500);
      cc2.exibeDados();
      
      cc2.depositar(300);
      cc2.exibeDados();
    }
    
}
