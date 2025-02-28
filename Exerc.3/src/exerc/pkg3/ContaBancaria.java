
package exerc.pkg3;

public class ContaBancaria {
    public String titular;
    private double saldo;
  
    public ContaBancaria(String titular, double saldo){
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    
    public void exibir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Titular: " + titular);

    }
     
    public void sacar(double valorSaque){
        if (saldo >= valorSaque){
          saldo -= valorSaque;  
          
        }else{
            System.out.println("Erro!Não é possivel fazer o saque");
            
        }
        
    }
        public String getTitular(){
          return titular;
      }
      public double getSaldo(){
          return saldo;
      }
             

      public void setTitular(String titular){
         this.titular = titular;
     }
        public void setSaldo(double saldo){
            this.saldo = saldo;
        }
         
}


