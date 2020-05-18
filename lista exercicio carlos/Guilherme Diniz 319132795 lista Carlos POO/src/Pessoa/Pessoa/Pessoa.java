package henraça3.Pessoa;

public class Pessoa {
	protected String nome;
	protected String endereco;
    protected int telefone;
    public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	


	public Pessoa(String nome,String endereco,int telefone)
	{
		this.nome=nome;
		this.endereco = endereco;
		this.telefone = telefone;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public void  exibir()
	{
		  
		System.out.print(" nome ="+"\n" + this.nome + "\n" +"telefone ="+ this.telefone  + "\n"  +"endereço ="+ this.endereco + "\n");
	}
	

}
