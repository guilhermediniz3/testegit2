package henraça3.Pessoa;

public class PessoaJuridica extends Pessoa  {

      protected   int cnpj ;
		public int getCnpj() {
			return cnpj;
		}
		public void setCnpj(int cnpj) {
			this.cnpj = cnpj;
		}
		public PessoaJuridica(String nome,String endereco,int telefone,int cnpj)
		{
			super(nome,endereco,telefone);
			this.cnpj=cnpj;
			
			
			
		}
		@Override 
		public void exibir()
		{  super.exibir();
			
		  System.out.print("CNPJ"+"\n"  + this.cnpj);
			
		}
		
         
}
