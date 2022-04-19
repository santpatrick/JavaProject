package models;
public class Vendedor {

    private String vnome;
    private String vcpf;
    
    public String getNome() {
        return vnome;
    }
    public void setNome(String nome) {
        this.vnome = nome;
    }
    public String getCpf() {
        return vcpf;
    }
    public void setCpf(String cpf) {
        this.vcpf = cpf;
    }
    

    @Override
    public String toString() {
        return "\nNome: " + vnome + "| CPF: " + vcpf;
    }
}