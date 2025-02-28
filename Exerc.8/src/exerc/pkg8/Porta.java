
package exerc.pkg8;

public class Porta {
    private boolean aberta;
   
    public Porta(boolean aberta){
        this.aberta = aberta;
        
    }
    
    public boolean abrir(){
        if(aberta == true){
            this.aberta = true;
            System.out.println("Aporta está aberta");
        }else if(aberta == false){
            this.aberta = true;
            System.out.println("A porta se abriu");
        }
           return this.aberta; 
    }
    
    public boolean fechar(){
        if(aberta == false){
            this.aberta = false;
            System.out.println("A porta está fechada");
        }else if(aberta == true){
            this.aberta = false;
            System.out.println("A porta se fechou");
        }
        
        return this.aberta;
    }
}


