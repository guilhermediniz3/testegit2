package henraça3.Pessoa;

public class Pessoafisica extends Pessoa {
        protected long cpf;
	public Pessoafisica(String nome,String endereco,int telefone, long cpf) {
		super(nome,endereco,telefone);
		this.cpf =cpf;
		// TODO Auto-generated constructor stub
	}

	

	public long Cpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	@Override 
  public void exibir()
  { super.exibir();
  System.out.printf("cpf"+"\n"  + this.cpf);
	  
	  
	  
  }
}
