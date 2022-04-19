package views;
import java.util.ArrayList;

import models.Cliente;
import utils.Console;


public class CadastrarCliente{

    public void renderizar(){
    Cliente cliente = new Cliente();
    ArrayList <Cliente> clientes = new ArrayList<Cliente>();

    String nome = Console.readString("Digite o nome do cliente: ");
    
    cliente.setNome(nome);

    cliente.setCpf(Console.readString("Digite o CPF do cliente: "));
    clientes.add(cliente);

    System.out.println("\n Cliente Cadastrado !!!");
    }   
}