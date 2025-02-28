
package exerc.pkg3;

public class Exerc3 {

    public static void main(String[] args) {
        ContaBancaria objConta1 = new ContaBancaria("Maycon", 1200);
        objConta1.exibir();
        objConta1.sacar(20);
        objConta1.sacar(1500);
        objConta1.depositar(200);
        System.out.println("Saldo: " + objConta1.getSaldo());
    }
    
}

