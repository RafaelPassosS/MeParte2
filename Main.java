
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static ArrayList<Gato> Gatos = new ArrayList<>();
    static ArrayList<Adotante> Adotantes = new ArrayList<>();
    static ArrayList<Gatoadotado> Adotados = new ArrayList<>();
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
                for(int i = 0; i < Gatos.size(); ++i){
                        System.out.println("----------------------------------------");
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
                for(int i = 0; i < Adotados.size(); ++i){
                    System.out.println("----------------------------------------");                        System.out.println("----------------------------------------");
                    System.out.println("Codigo: "+Adotados.get(i).getCodigo());
                    System.out.println("Nome: "+Adotados.get(i).getNome());
                    System.out.println("Raca: "+Adotados.get(i).getRaça());
                    System.out.println("Apelido: "+Adotados.get(i).getApelido());
                    System.out.println("Sexo: "+Adotados.get(i).getSexo());
                    System.out.println("Data de entrada: "+Adotados.get(i).getDatadeentrada());
                    System.out.println("Nome da Racao: "+Adotados.get(i).getNomeracao());
                    System.out.println("Quantidade de Racao: "+Adotados.get(i).getQuantidaderacao());
                    System.out.println("Peso: "+Adotados.get(i).getPeso());
                    System.out.println("Cpf do adotante: "+Adotados.get(i).getCpf());
                    System.out.println("Data de saída: "+Adotados.get(i).getDatadesaida());
                }
            }else{
                if(opcao.equals("3")){
                    Adotante adotante = new Adotante();
            System.out.println("Digite o nome do adotante");
            String nome = entrada.nextLine();
        
            System.out.println("Digite o CPF do Adotante:");
            String cpf = entrada.nextLine();
        
            System.out.println("Digite o endereco do adotante:");
            String endereco = entrada.nextLine();
        
            System.out.println("Digite o numero do adotante:");
            String numero = entrada.nextLine();
        
            adotante.cadastrarAdotante(cpf, nome, endereco, numero);
            Adotantes.add(adotante);
                }else{
                    if(opcao.equals("4")){
                        for(int i = 0; i < Adotantes.size(); ++i){
                            System.out.println("----------------------------------------");
                            System.out.println("CPF: "+Adotantes.get(i).getCpf());
                            System.out.println("Nome "+Adotantes.get(i).getNome());
                            System.out.println("Endereco: "+Adotantes.get(i).getEndereco());
                            System.out.println("Numero de telefone: "+Adotantes.get(i).getNumero());
                        }
                    }else{
                        if(opcao.equals("5")){
                            System.out.print("Insira o codigo do gato: ");
                            String procuragato = entrada.next();
                            System.out.print("Insira o CPF do adotante: ");
                            String procuraadotante = entrada.next();
                            System.out.print("Insira a data: ");
                            String data = entrada.next();
                            
                            for(int i = 0; i < Gatos.size(); ++i){
                                if(Gatos.get(i).getCodigo().equals(procuragato)){
                                    for(int j = 0; j < Adotantes.size(); ++j){
                                        if(Adotantes.get(j).getCpf().equals(procuraadotante)){
                                            Gato gato = Gatos.get(i);
                                            Gatoadotado gatoadotado = gato.adotarGato();
                                            gatoadotado.setCpf(Adotantes.get(j).getCpf());
                                            gatoadotado.setDatadesaida(data);
                                            Adotados.add(gatoadotado);
                                            Gatos.remove(Gatos.get(i));
                                            System.out.print("Gato adotado com sucesso!");
                                        }
                                    }
                                }
                    }
                        }
                    }
                }
            }
        }
        }
    }
}