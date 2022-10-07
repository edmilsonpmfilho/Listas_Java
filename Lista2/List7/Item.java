package POO_List.List7;

import java.sql.Date;

public class Item extends Modelo {

    private int codigo;
    private String nome;
    private String descricao;
    
    
    public Item(String chassi, String cor, int anoFabricação, int anoModelo, Date dataEntrada, int codigo, String marca,
            String nome, double motor, int serie, int codigo2, String nome2, String descricao) {
        super(chassi, cor, anoFabricação, anoModelo, dataEntrada, codigo, marca, nome, motor, serie);
        codigo = codigo2;
        nome = nome2;
        this.descricao = descricao;
    }
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
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}
