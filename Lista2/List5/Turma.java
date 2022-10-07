package POO_List.List5;

public class Turma {

    private String cod;
    private int turno;
    private int sala;
    
    
    public Turma(String cod, int turno, int sala) {
        this.cod = cod;
        this.turno = turno;
        this.sala = sala;
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    }
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }

    
    
}
