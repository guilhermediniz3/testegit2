public class Conta {
    private int numero;
    private int agencia;
    protected float saldo;
    
    public Conta( int numero, int agencia ){
        this.numero = numero;
        this.agencia = agencia;
    }
    
    public void setNumero( int numero ){
        this.numero = numero;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setAgencia( int agencia ){
        this.agencia = agencia;
    }
    
    public int getAgencia(){
        return this.agencia;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void exibeDados(){
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}
