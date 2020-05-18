public class ContaCorrente extends Conta {
    
    public float limite;
    
    public void depositar( float valor ){
        this.saldo = this.saldo + valor;
    }
    
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Limite: " + this.limite);
    }
    
    public ContaCorrente( int numero, 
            int agencia, float limite ){
        super( numero, agencia );
        this.limite = limite;
    }
    
    public void setLimite(float limite){
        this.limite = limite;
    }
    
    public float getLimite(){
        return this.limite;
    }
    
}
