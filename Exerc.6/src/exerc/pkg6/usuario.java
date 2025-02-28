
package exerc.pkg6;

public class usuario {
        private String login;
        private String senha;
        
        public usuario(String login, String senha){
            this.login = login;
            this.senha = senha;
        }
        
        public boolean Autenticar(String login, String senha){
          if (senha == this.senha && login == this.login){
              System.out.println("Senha e login corretos");
              return true;
          }else{
              System.out.println("Senha ou login incorretos");
              return false; 
          }
          
        }
          
          public String getLogin(){
          return login;
          }
          
      public String getSenha(){
          return senha;
      }
      
        public void setLogin(String login){
            this.login = login;
        }
        
        public void setSenha(String senha){
            this.senha = senha;
        }
}

