package views;
import java.util.ArrayList;

import models.Cliente;
public class ListarClientes {
   
    public void retornarLista(){
    
    ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    System.out.println("\n -- LISTAGEM DE CLIENTES -- \n");
   
    
    // for(int i = 0; i < clientes.size(); i++){
    //    System.out.println(clientes.get(i));
    // }
    for(Cliente clienteCadastrado : clientes) {
        System.out.println(clienteCadastrado);
     }
       
    }

    public void renderizar() {
    }
    
} 

