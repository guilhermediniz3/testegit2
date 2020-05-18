public class Pessoa {
    protected String nome;
    protected String telefone;
    protected String endereco;
    
    public Pessoa(String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public void exibe(){
        System.out.println("Nome completo: " + this.nome );
        System.out.println("Telefone: " + this.telefone );
        System.out.println("Endereço: " + this.endereco );
    }
    
    public void setNome( String nome ){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setTelefone( String telefone ){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setEndereco( String endereco ){
        this.nome = endereco;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    
}
