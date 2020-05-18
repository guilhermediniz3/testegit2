 
public class Veiculo {
    String placa;
    
    
    public Veiculo(){
         System.out.println("O contrutor SEM PARÂMETROS da classe veículo foi executado." );
    }
    public Veiculo(String placa){
        this.placa = placa;
        System.out.println("O contrutor da classe veículo foi executado com a placa " + placa);
    }
    
    
}
