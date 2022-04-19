package views;
import java.util.ArrayList;

import models.Produto;
import models.Vendedor;
import utils.Console;


public class Cadastro {
    public static void main(String[] args) {
        int opcao = 0;
        
        Vendedor vendedor = new Vendedor();
        Produto produto = new Produto();
        
        ArrayList <Vendedor> vendedores = new ArrayList<Vendedor>();
        ArrayList <Produto> produtos = new ArrayList<Produto>();

        do {
            System.out.println("\n -- PROJETO DE VENDAS -- \n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Vendedor");
            System.out.println("4 - Listar Vendedor");
            System.out.println("5 - Cadastrar Produto");
            System.out.println("6 - Listar Quantidade Produto");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                
                case 1:
                    CadastrarCliente cadastrarCliente = new CadastrarCliente();
                    cadastrarCliente.renderizar();

                    break;
                case 2:
                    ListarClientes listarClientes = new ListarClientes();
                    listarClientes.renderizar();
                    break;
                
                case 3:
                    vendedor = new Vendedor();
                    System.out.println("\n -- CADASTRO DE VENDEDOR -- \n");
                    String vnome = Console.readString("Digite o nome do vendedor: ");
                    vendedor.setNome(vnome);

                    vendedor.setCpf(Console.readString("Digite o CPF do vendedor: "));
                    vendedores.add(vendedor);

                    System.out.println("\n Cliente Vendedor !!!");

                    break;

                case 4:
                    System.out.println("\n -- LISTAGEM DE VENDEDORES -- \n");
                    // for(int i = 0; i < clientes.size(); i++){
                    //    System.out.println(clientes.get(i));
                    // }
                    for(Vendedor vendedorCadastrado : vendedores) {
                        System.out.println(vendedorCadastrado);
                    }

                    break;

                case 5:
                    produto = new Produto();
                    System.out.println("\n -- CADASTRO DE PRODUTOS -- \n");
                    String pnome = Console.readString("Digite o nome do produto: ");
                    produto.setNome(pnome);

                    produto.setCpf(Console.readString("Digite Quantidade Produto: "));
                    produtos.add(produto);

                    System.out.println("\n Item Cadastrado !!!");

                    break;

                case 6:
                    System.out.println("\n -- LISTAGEM DE PRODUTOS -- \n");
                    // for(int i = 0; i < clientes.size(); i++){
                    //    System.out.println(clientes.get(i));
                    // }
                    for(Produto produtoCadastrado : produtos) {
                        System.out.println(produtoCadastrado);
                    }

                    break;

                case 0:
                    System.out.println("\n -- SAINDO -- \n");
                    break;
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    }
}
