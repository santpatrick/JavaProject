package models;
public class Produto {
    
    private String pnome;
    private String pquant;
    
    public String getNome() {
        return pnome;
    }
    public void setNome(String nome) {
        this.pnome = nome;
    }
    public String getCpf() {
        return pquant;
    }
    public void setCpf(String cpf) {
        this.pquant = cpf;
    }
    

    @Override
    public String toString() {
        return "\nNome: " + pnome + "| Quantidade " + pquant;
    }

}
