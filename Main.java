import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    static ArrayList<Gato> Gatos = new ArrayList<>();
    static ArrayList<Adotante> Adotantes = new ArrayList<>();
    static ArrayList<Gatoadotado> Adotados = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Adoção de Gatos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 1));

        JButton btnCadastrarGatos = new JButton("Cadastrar Gatos");
        btnCadastrarGatos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarGato();
            }
        });
        frame.add(btnCadastrarGatos);

        JButton btnConsultarGatos = new JButton("Consultar Gatos");
        btnConsultarGatos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consultarGatos();
            }
        });
        frame.add(btnConsultarGatos);

        JButton btnCadastrarAdotantes = new JButton("Cadastrar Adotantes");
        btnCadastrarAdotantes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarAdotante();
            }
        });
        frame.add(btnCadastrarAdotantes);

        JButton btnConsultarAdotantes = new JButton("Consultar Adotantes");
        btnConsultarAdotantes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consultarAdotantes();
            }
        });
        frame.add(btnConsultarAdotantes);

        JButton btnAdotarGato = new JButton("Adotar Gato");
        btnAdotarGato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adotarGato();
            }
        });
        frame.add(btnAdotarGato);

        JButton btnRelatorio = new JButton("Relatório de Provisões");
        btnRelatorio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerarRelatorio();
            }
        });
        frame.add(btnRelatorio);

        frame.pack();
        frame.setVisible(true);
    }

    public static void cadastrarGato() {
        Gato gato = new Gato();

        String codigo = JOptionPane.showInputDialog("Digite o código do gato:");
        String nome = JOptionPane.showInputDialog("Digite o nome do gato:");
        String raca = JOptionPane.showInputDialog("Digite a raça do gato:");
        String apelido = JOptionPane.showInputDialog("Digite o apelido do gato:");
        String sexo = JOptionPane.showInputDialog("Digite o sexo do gato:");
        String dataDeEntrada = JOptionPane.showInputDialog("Digite a data de entrada do gato:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do gato:"));
        String nomeRacao = JOptionPane.showInputDialog("Digite o nome da ração do gato:");
        double quantidadeRacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de ração do gato:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do gato:"));

        gato.cadastrarGato(codigo, nome, raca, apelido, sexo, dataDeEntrada, idade, nomeRacao, quantidadeRacao, peso);
        Gatos.add(gato);

        JOptionPane.showMessageDialog(null, "Gato cadastrado com sucesso!");
    }

    public static void consultarGatos() {
        StringBuilder output = new StringBuilder();

        for (Gato gato : Gatos) {
            output.append("----------------------------------------\n");
            output.append("Código: ").append(gato.getCodigo()).append("\n");
            output.append("Nome: ").append(gato.getNome()).append("\n");
            output.append("Raça: ").append(gato.getRaça()).append("\n");
            output.append("Apelido: ").append(gato.getApelido()).append("\n");
            output.append("Sexo: ").append(gato.getSexo()).append("\n");
            output.append("Data de entrada: ").append(gato.getDatadeentrada()).append("\n");
            output.append("Nome da Ração: ").append(gato.getNomeracao()).append("\n");
            output.append("Quantidade de Ração: ").append(gato.getQuantidaderacao()).append("\n");
            output.append("Peso: ").append(gato.getPeso()).append("\n");
        }

        for (Gatoadotado gatoAdotado : Adotados) {
            output.append("----------------------------------------\n");
            output.append("Código: ").append(gatoAdotado.getCodigo()).append("\n");
            output.append("Nome: ").append(gatoAdotado.getNome()).append("\n");
            output.append("Raça: ").append(gatoAdotado.getRaça()).append("\n");
            output.append("Apelido: ").append(gatoAdotado.getApelido()).append("\n");
            output.append("Sexo: ").append(gatoAdotado.getSexo()).append("\n");
            output.append("Data de entrada: ").append(gatoAdotado.getDatadeentrada()).append("\n");
            output.append("Nome da Ração: ").append(gatoAdotado.getNomeracao()).append("\n");
            output.append("Quantidade de Ração: ").append(gatoAdotado.getQuantidaderacao()).append("\n");
            output.append("Peso: ").append(gatoAdotado.getPeso()).append("\n");
            output.append("CPF do adotante: ").append(gatoAdotado.getCpf()).append("\n");
            output.append("Data de saída: ").append(gatoAdotado.getDatadesaida()).append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Consulta de Gatos", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void cadastrarAdotante() {
        Adotante adotante = new Adotante();

        String nome = JOptionPane.showInputDialog("Digite o nome do adotante:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do adotante:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do adotante:");
        String numero = JOptionPane.showInputDialog("Digite o número do adotante:");

        adotante.cadastrarAdotante(cpf, nome, endereco, numero);
        Adotantes.add(adotante);

        JOptionPane.showMessageDialog(null, "Adotante cadastrado com sucesso!");
    }

    public static void consultarAdotantes() {
        StringBuilder output = new StringBuilder();

        for (Adotante adotante : Adotantes) {
            output.append("----------------------------------------\n");
            output.append("CPF: ").append(adotante.getCpf()).append("\n");
            output.append("Nome: ").append(adotante.getNome()).append("\n");
            output.append("Endereço: ").append(adotante.getEndereco()).append("\n");
            output.append("Número de telefone: ").append(adotante.getNumero()).append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Consulta de Adotantes", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void adotarGato() {
        String procurarGato = JOptionPane.showInputDialog("Insira o código do gato:");
        String procurarAdotante = JOptionPane.showInputDialog("Insira o CPF do adotante:");
        String data = JOptionPane.showInputDialog("Insira a data:");

        for (int i = 0; i < Gatos.size(); ++i) {
            if (Gatos.get(i).getCodigo().equals(procurarGato)) {
                for (int j = 0; j < Adotantes.size(); ++j) {
                    if (Adotantes.get(j).getCpf().equals(procurarAdotante)) {
                        Gato gato = Gatos.get(i);
                        Gatoadotado gatoAdotado = gato.adotarGato();
                        gatoAdotado.setCpf(Adotantes.get(j).getCpf());
                        gatoAdotado.setDatadesaida(data);
                        Adotados.add(gatoAdotado);
                        Gatos.remove(Gatos.get(i));
                        JOptionPane.showMessageDialog(null, "Gato adotado com sucesso!");
                    }
                }
            }
        }
    }

    public static void gerarRelatorio() {
    HashMap<String, Double> provisoes = new HashMap<>();

    for (Gato gato : Gatos) {
        double quantidadeRacao = gato.getQuantidaderacao();
        String nomeRacao = gato.getNomeracao();

        if (provisoes.containsKey(nomeRacao)) {
            double total = provisoes.get(nomeRacao) + quantidadeRacao;
            provisoes.put(nomeRacao, total);
        } else {
            provisoes.put(nomeRacao, quantidadeRacao);
        }
    }

    StringBuilder relatorio = new StringBuilder();
    relatorio.append("Relatório de Provisões:\n");
    relatorio.append("========================\n");
    for (Map.Entry<String, Double> entry : provisoes.entrySet()) {
        String nomeRacao = entry.getKey();
        double quantidadeRacao = entry.getValue();
        relatorio.append("Ração: ").append(nomeRacao).append("\n");
        relatorio.append("Quantidade: ").append(quantidadeRacao).append(" g\n");
        relatorio.append("========================\n");
    }

    JOptionPane.showMessageDialog(null, relatorio.toString(), "Relatório de Provisões", JOptionPane.INFORMATION_MESSAGE);
    }
}
