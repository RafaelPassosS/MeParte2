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
            System.out.print("1- Cadastrar Clientes \n");
            System.out.print("2 - Cadastrar Vendedor \n");
            System.out.print("3 - Cadastrar Produto \n");
            System.out.print("4 - Vender Produto \n");
            System.out.print("5 - Relatorio de Vendas \n");
            System.out.print("Selecione sua opção:");
            
            opc = entrada.next();
            
            if(opc.equals("1")){
                Cliente cliente = new Cliente();
                System.out.println("insira o Codigo do cliente:");
                String codigo = entrada.next();
                System.out.println("Insira o Nome do Cliente:");
                String nome = entrada.next();
                System.out.println("Insira o endereco do Cliente;");
                String endereco =  entrada.next();
                System.out.println("Insira o Telefone do cliente:");
                String telefone = entrada.next();
                System.out.println("Insira o CPF do Cliente:");
                String cpf = entrada.next();
                
                cliente.cadastrarCliente(codigo, nome, endereco, telefone, cpf);
                Clientes.add(cliente);
            }else{
                if(opc.equals("2")){
                    
                }else{
                    if(opc.equals("3")){
                        Produto produto = new Produto();
                        System.out.print("Insira o codigo do produto: ");
                        String codigo = entrada.next();
                        System.out.print("Insira a descrição do produto: ");
                        String descricao = entrada.next();
                        System.out.print("Insira a marca do produto: ");
                        String marca = entrada.next();
                        System.out.print("insira o modelo do produto: ");
                        String modelo = entrada.next();
                        System.out.print("insira o valor do produto: ");
                        double valor = entrada.nextDouble();
                        
                        produto.cadastrarProduto(codigo, descricao, marca, modelo, valor);
                        Produtos.add(produto);
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
