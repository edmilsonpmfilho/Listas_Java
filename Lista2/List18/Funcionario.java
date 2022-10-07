package POO_List.List18;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private Gerente gerente;
    ArrayList<PedidoBasico> pedidoBasicos;
    
    public Funcionario(String nome, String cpf, int matricula, String nomeUsuario, String cargo, BigDecimal salario,
            boolean status, String senha, Gerente gerente, ArrayList<PedidoBasico> pedidoBasicos) {
        super(nome, cpf, matricula, nomeUsuario, cargo, salario, status, senha);
        this.gerente = gerente;
        this.pedidoBasicos = pedidoBasicos;
    }
    public Gerente getGerente() {
        return gerente;
    }
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    public ArrayList<PedidoBasico> getPedidoBasicos() {
        return pedidoBasicos;
    }
    public void setPedidoBasicos(ArrayList<PedidoBasico> pedidoBasicos) {
        this.pedidoBasicos = pedidoBasicos;
    }
    
}
