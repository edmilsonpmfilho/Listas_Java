package POO_List.List17;

import java.net.URI;
import java.util.ArrayList;

public class Pessoa  {
    private String nome;
    private String cpf;
    private URI foto;
    private String email;

    ArrayList<Evento> evento;
    ArrayList<Amigo> amigo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public URI getFoto() {
        return foto;
    }
    public void setFoto(URI foto) {
        this.foto = foto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
