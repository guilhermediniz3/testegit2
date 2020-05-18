
public class PessoaFisica extends Pessoa{
    protected String cpf;
    
    public PessoaFisica( String nome, String telefone, String endereco, 
            String cpf ){
        super( nome, telefone, endereco );
        this.cpf = cpf;
    }
    
    @Override
    public void exibe(){
        super.exibe();
        System.out.println("CPF: " + this.cpf);
          System.out.println("Método da pf");
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
}
