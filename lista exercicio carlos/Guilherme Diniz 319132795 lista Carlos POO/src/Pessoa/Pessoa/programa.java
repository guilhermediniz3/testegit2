package henraça3.Pessoa;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome, endereco;
		long cpf=0;
		int telefone=0, cnpj=0;
		
		System.out.println("digite o nome");
		nome = sc.next();
		sc.nextLine();
		System.out.println("digite o endereço");
		endereco = sc.next();
		sc.nextLine();
		System.out.println("digite o cpf" );
        cpf = sc.nextLong();
		System.out.println("digite o telefone" );
		telefone= sc.nextInt();
		Pessoafisica p = new Pessoafisica(nome,endereco,telefone,cpf);
		p.exibir();
		System.out.println();
		System.out.println("digite o nome");
		nome = sc.next();
		sc.nextLine();
		System.out.println("digite o endereco");
		endereco = sc.next();
		sc.nextLine();
		System.out.println("digite o telefone");
		telefone = sc.nextInt();
		sc.nextLine();
		Pessoa p2 = new Pessoa (nome,endereco,telefone);
		p2.exibir();
		System.out.println("digite o nome");
		nome = sc.next();
		System.out.println("digite o endereço");
		endereco = sc.next();
		sc.nextLine();
		System.out.println("digite o cnpj" );
        cnpj = sc.nextInt();
		System.out.println("digite o telefone" );
		telefone= sc.nextInt();
		
		PessoaJuridica p3 = new PessoaJuridica(nome,endereco,telefone,cnpj);
		p3.exibir();
		
		sc.close();
	}

}
