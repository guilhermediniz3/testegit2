public class Parente extends PessoaFisica {
    
    public String grauParentesco;
    
    public Parente( String nome, String telefone, String endereco, 
            String cpf, String grauParentesco ){
        super(nome, telefone, endereco, cpf);
        this.grauParentesco = grauParentesco;
    }
    
        
    @Override
    public void exibe(){
        super.exibe();
        System.out.println("Grau de parentesco: " + this.grauParentesco);
        System.out.println("Método do parente");
    }
   

    public void setGrauParentesco(String grauParentesco){
        this.grauParentesco = grauParentesco;
    }
    
    public String getGrauParentesco(){
        return this.grauParentesco;
    }
    
}
