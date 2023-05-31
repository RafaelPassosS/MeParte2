import java.util.ArrayList;

public class Gato {
    private String codigo;
    private String nome;
    private String raça;
    private String apelido;
    private String sexo;
    private String datadeentrada;
    private int idade;
    private String nomeracao;
    private double quantidaderacao;
    private double peso;
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDatadeentrada() {
        return datadeentrada;
    }

    public void setDatadeentrada(String datadeentrada) {
        this.datadeentrada = datadeentrada;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeracao() {
        return nomeracao;
    }

    public void setNomeracao(String nomeracao) {
        this.nomeracao = nomeracao;
    }

    public double getQuantidaderacao() {
        return quantidaderacao;
    }

    public void setQuantidaderacao(double quantidaderacao) {
        this.quantidaderacao = quantidaderacao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    public void cadastrarGato(String codigo, String nome, String raça, String apelido, String sexo, String datadeentrada,
                              int idade, String nomeracao, double quantidaderacao, double peso) {
        this.codigo = codigo;
        this.nome = nome;
        this.raça = raça;
        this.apelido = apelido;
        this.sexo = sexo;
        this.datadeentrada = datadeentrada;
        this.idade = idade;
        this.nomeracao = nomeracao;
        this.quantidaderacao = quantidaderacao;
        this.peso = peso;
        
        System.out.println("Gato cadastrado com sucesso!");
    }
    
    public Gatoadotado adotarGato() {
        Gatoadotado gatoadotado = new Gatoadotado();
        gatoadotado.setCodigo(this.getCodigo());
        gatoadotado.setNome(this.getNome());
        gatoadotado.setRaça(this.getRaça());
        gatoadotado.setApelido(this.getApelido());
        gatoadotado.setSexo(this.getSexo());
        gatoadotado.setDatadeentrada(this.getDatadeentrada());
        gatoadotado.setIdade(this.getIdade());
        gatoadotado.setNomeracao(this.getNomeracao());
        gatoadotado.setQuantidaderacao(this.getQuantidaderacao());
        gatoadotado.setPeso(this.getPeso());

        return gatoadotado;
    }
}