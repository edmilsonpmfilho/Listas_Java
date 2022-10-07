package POO_List;

public class List_1 {
    private int id;
    private int ano;
    private String modelo;
    private Double carga_maxima;
    private double potencia;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Double getCarga_maxima() {
        return carga_maxima;
    }
    public void setCarga_maxima(Double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }
    public double getPortencia() {
        return potencia;
    }
    public void setPortencia(double portencia) {
        this.potencia = portencia;
    }
    public void consumo(){
        double consumo=potencia*carga_maxima*100;
        System.out.println(consumo);
        
    }
    public void leiaModelo(){
        System.out.println(modelo);
    }
   
    public void gravaModelo(){
        
    }
    
    
}
