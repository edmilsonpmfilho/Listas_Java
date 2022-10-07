package POO_List.List7;

import java.sql.Date;

public class Carro {
    private String chassi;
    private String cor;
    private int anoFabricação;
    private int anoModelo;
    private Date dataEntrada;
    
    
    public Carro(String chassi, String cor, int anoFabricação, int anoModelo, Date dataEntrada) {
        this.chassi = chassi;
        this.cor = cor;
        this.anoFabricação = anoFabricação;
        this.anoModelo = anoModelo;
        this.dataEntrada = dataEntrada;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAnoFabricação() {
        return anoFabricação;
    }
    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public Date getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    
    
}
