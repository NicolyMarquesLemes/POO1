
package exerc.pkg5;

public class funcionario {
    private String nome;
    private double salario;
    
    public funcionario(String nome, double salario){
        this.nome = nome;
          this.salario = salario;
    }
    
    public void exibir(){
         System.out.println("Nome: " + nome);
          System.out.println("Salário: " + salario);
    }
         
      public String getNome(){
          return nome;
      }
      public double getSalario(){
          return salario;
      }
      
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public void setSalario(double salario){
            this.salario = salario;
        }
        
}

