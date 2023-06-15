package prova.kamilla.pkg2;
import java.util.Scanner;
import java.util.ArrayList;

public class ProvaKamilla2 {
    static ArrayList<Cliente> Clientes = new ArrayList<>();
    static ArrayList<Vendedor> Vendedores = new ArrayList<>();

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
                Scanner entrada = new Scanner(System.in);
                Cliente cliente = new Cliente();
                System.out.println("insira o Codigo do cliente: ");
                String codigo = entrada.nextLine();
                System.out.println("Insira o Nome do Cliente: ");
                String nome = entrada.nextLine();
                System.out.println("Insira o endereco do Cliente; ");
                String endereco =  entrada.nextLine();
                System.out.println("Insira o Telefone do cliente: ");
                String telefone = entrada.nextLine();
                System.out.println("Insira o CPF do Cliente: ");
                String cpf = entrada.nextLine();
                
                cliente.cadastrarCliente(codigo, nome, endereco, telefone, cpf);
                Clientes.add(cliente);
            }else{
                if(opc.equals("2")){
                    
                }else{
                    if(opc.equals("3")){
                        
                    }else{
                        if(opc.equals("4")){
                            
                        }else{
                            if (opc.equals("5")){
                                
                            }
                        }
                    }
                }
            }
        }
        
    }
    
}
