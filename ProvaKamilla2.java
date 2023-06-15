package prova.kamilla.pkg2;
import java.util.Scanner;
import java.util.ArrayList;

public class ProvaKamilla2 {
    static ArrayList<Cliente> Clientes = new ArrayList<>();
    static ArrayList<Vendedor> Vendedores = new ArrayList<>();
    static ArrayList<Produto> Produtos = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opc = "10";
        while(opc != "0"){
            Scanner entrada = new Scanner(System.in);
            System.out.print("1- Cadastrar Clientes");
            System.out.print("2 - Cadastrar Vendedor");
            System.out.print("3 - Cadastrar Produto");
            System.out.print("4 - Vender Produto");
            System.out.print("5 - Relatorio de Vendas");
            System.out.print("Selecione sua opção: ");
            
            opc = entrada.next();
            
            if(opc.equals("1")){
                Cliente cliente = new Cliente();
                System.out.println("insira o Codigo do cliente: \n");
                String codigo = entrada.nextLine();
                System.out.println("Insira o Nome do Cliente: \n");
                String nome = entrada.nextLine();
                System.out.println("Insira o endereco do Cliente; \n");
                String endereco =  entrada.nextLine();
                System.out.println("Insira o Telefone do cliente: \n");
                String telefone = entrada.nextLine();
                System.out.println("Insira o CPF do Cliente: \n");
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
