
package exerc.pkg1;

public class Produto {
     private String nome;
     private double preco;
     
     public Produto(String nome, double preco){
         this.nome = nome;
          this.preco = preco;
        
     }
     
      public void exibir(){
          System.out.println("Nome: " + nome);
          System.out.println("Preço: " + preco);
      }
      
      public String getNome(){
          return nome;
      }
      public double getPreco(){
          return preco;
      }
             

      public void setNome(String nome){
         this.nome = nome;
     }
        public void setPreco(double preco){
             this.preco = preco;
        }

}