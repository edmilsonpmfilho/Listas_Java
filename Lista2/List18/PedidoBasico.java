package POO_List.List18;

public class PedidoBasico extends Pedido{
    private String nome;
    private Gerente gerente;
    private Funcionario funcionario;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Gerente getGerente() {
        return gerente;
    }
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    
    
}
