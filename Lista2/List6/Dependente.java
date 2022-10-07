package POO_List.List6;

import java.sql.Date;

public class Dependente extends Funcionario {

    private int sequencial;
    private String nomeCompleto;
    private Date dataNascimento;
    private int sexo;
    private boolean participaPlano;
    
    
    public Dependente(int matricula, String nomeCompleto, String cpf, Date dataNascimento, int sexo, double salario,
            int telefone, int sequencial, String nomeCompleto2, Date dataNascimento2, int sexo2,
            boolean participaPlano) {
        super(matricula, nomeCompleto, cpf, dataNascimento, sexo, salario, telefone);
        this.sequencial = sequencial;
        nomeCompleto = nomeCompleto2;
        dataNascimento = dataNascimento2;
        sexo = sexo2;
        this.participaPlano = participaPlano;
    }
    public int getSequencial() {
        return sequencial;
    }
    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getSexo() {
        return sexo;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public boolean isParticipaPlano() {
        return participaPlano;
    }
    public void setParticipaPlano(boolean participaPlano) {
        this.participaPlano = participaPlano;
    }

    
    
}
