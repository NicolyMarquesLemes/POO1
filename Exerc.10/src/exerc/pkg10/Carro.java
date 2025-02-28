
package exerc.pkg10;

public class Carro {
    private String marca, modelo;
    public int ano;
    
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
     public void exibir(){
         System.out.println("Marca: " + marca);
         System.out.println("Modelo: " + modelo);
         if (ano < 1886){
             System.out.println("Erro!O ano está incorreto");
         }else{
             System.out.println("Ano: " + ano);
         }
     }
      
      public String getMarca(){
          return marca; 
      }
      
      public void setMarca(String marca){
          this.marca = marca;
      }

      public String getModelo(){
           return modelo;
        }
          
       public void setModelo(String modelo){
           this.modelo = modelo;
         }
          

       


}
