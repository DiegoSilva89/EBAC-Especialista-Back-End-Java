package br.com.diego;

public class Cliente {

    //criando propriedades da classe Cliente
    private int codigo;

    private String nome;

    private String endereco;

    //criando os getters and setters para pegar ou adicionar valores nas propriedades
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //método utilizado para cadastrar um endereço para o cliente
    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);
    }

    public void imprimirEndereco() {
        System.out.println(this.endereco);
    }

    public String retornarNomeCliente() {
        return "Endereço do Diego";
    }

    public int getValorTotal() {
        return 20;
    }
}
