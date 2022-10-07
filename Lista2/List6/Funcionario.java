package POO_List.List6;

import java.sql.Date;

public class Funcionario {

    private int matricula;
    private String nomeCompleto;
    private String cpf;
    private Date dataNascimento;
    private int sexo;
    private double salario;
    private int telefone;
    
    
    public Funcionario(int matricula, String nomeCompleto, String cpf, Date dataNascimento, int sexo, double salario,
            int telefone) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.salario = salario;
        this.telefone = telefone;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    
}
