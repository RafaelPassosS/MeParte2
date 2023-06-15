package prova.kamilla.pkg2;
import java.util.Scanner;
import java.util.ArrayList;

public class ProvaKamilla2 {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Vendedor> vendedores = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opc = "10";
        while(opc != "0"){
            System.out.print("1- Cadastrar Clientes");
            System.out.print("2 - Cadastrar Vendedor");
            System.out.print("3 - Cadastrar Produto");
            System.out.print("4 - Vender Produto");
            System.out.print("5 - Relatorio de Vendas");
            
            if(opc.equals('1')){
                Cliente cliente = new Cliente();
                System.out.println("Insira o nome do cliente; ")
            }
        }
        
    }
    
}
