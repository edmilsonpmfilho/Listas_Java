package POO_List.List18;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Gerente extends Pessoa {
    ArrayList<Funcionario> funcionario;
    ArrayList<PedidoBasico> pedidoBasico;
    
    public Gerente(String nome, String cpf, int matricula, String nomeUsuario, String cargo, BigDecimal salario,
            boolean status, String senha, ArrayList<Funcionario> funcionario, ArrayList<PedidoBasico> pedidoBasico) {
        super(nome, cpf, matricula, nomeUsuario, cargo, salario, status, senha);
        this.funcionario = funcionario;
        this.pedidoBasico = pedidoBasico;
    }
    public ArrayList<Funcionario> getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(ArrayList<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    public ArrayList<PedidoBasico> getPedidoBasico() {
        return pedidoBasico;
    }
    public void setPedidoBasico(ArrayList<PedidoBasico> pedidoBasico) {
        this.pedidoBasico = pedidoBasico;
    }
    
}
