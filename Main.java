
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Gato> Gatos = new ArrayList<>();
    public static void main(String[] args) {
        String opcao = "";
        while(opcao !="0"){
            Scanner entrada = new Scanner(System.in);
                    System.out.println(""
                + "1 - Cadastrar Gatos \n"      
                + "2 - Consultar Gatos \n"
                + "3 - Cadastrar Adotantes \n"
                + "4 - Consultar Adotantes \n"
                + "5 - Adotar Gato \n"
                + "6 - Relatorio de provisões");
        System.out.println("Selecione sua opcaoo");
        opcao = entrada.nextLine();
        if(opcao.equals("1")){
            Gato gato = new Gato();
            System.out.println("Digite o codigo do gato:");
            String codigo = entrada.nextLine();
        
            System.out.println("Digite o nome do gato:");
            String nome = entrada.nextLine();
        
            System.out.println("Digite a raca do gato:");
            String raca = entrada.nextLine();
        
            System.out.println("Digite o apelido do gato:");
            String apelido = entrada.nextLine();
        
            System.out.println("Digite o sexo do gato:");
            String sexo = entrada.nextLine();
        
            System.out.println("Digite a data de entrada do gato:");
            String datadeentrada = entrada.nextLine();
        
            System.out.println("Digite a idade do gato:");
            int idade = entrada.nextInt();
        
            System.out.println("Digite o nome da ração do gato:");
            String nomeracao = entrada.nextLine();
            
            entrada.nextLine();
        
            System.out.println("Digite a quantidade de ração do gato:");
            double quantidaderacao = entrada.nextDouble();
        
            System.out.println("Digite o peso do gato:");
            double peso = entrada.nextDouble();
            
            gato.cadastrarGato(codigo, nome, raca, apelido, sexo, datadeentrada, idade, nomeracao, quantidaderacao, peso);
            Gatos.add(gato);
        }else{
            if(opcao.equals("2")){
                System.out.print("Digite o codigo do gato: ");
                String procura = entrada.next();
                for(int i = 0; i < Gatos.size(); ++i){
                    if (Gatos.get(i).getCodigo().equals(procura)){
                        System.out.println("Codigo: "+Gatos.get(i).getCodigo());
                        System.out.println("Nome: "+Gatos.get(i).getNome());
                        System.out.println("Raca: "+Gatos.get(i).getRaça());
                        System.out.println("Apelido: "+Gatos.get(i).getApelido());
                        System.out.println("Sexo: "+Gatos.get(i).getSexo());
                        System.out.println("Data de entrada: "+Gatos.get(i).getDatadeentrada());
                        System.out.println("Nome da Racao: "+Gatos.get(i).getNomeracao());
                        System.out.println("Quantidade de Racao: "+Gatos.get(i).getQuantidaderacao());
                        System.out.println("Peso: "+Gatos.get(i).getPeso());
                    }
                            }
            }
        }
        }
    }
}