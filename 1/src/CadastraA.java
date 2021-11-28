import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;
public class CadastraA {
	
	public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String z;
        int opcoes = 0;
        ProdutoA [] vetorDeProdutos = new ProdutoA [3];
        
        do {

            System.out.println(" Digite a opção desejada: ");
            System.out.println(" 1 - Cadastrar Produtos ");
            System.out.println(" 2 - Atualizar o primeiro produto cadastrado na opção 1 ");
            System.out.println(" 3 - Excluir o segundo produto cadastrado ");
            System.out.println(" 4 - Listagem de Produtos ");
            System.out.println(" 0 Para finalizar a aplicação ");
            
            System.out.print("Digite uma opção: ");
            opcoes = s.nextInt();

            if(opcoes == 0) {
                System.out.println(" Aplicação FINALIZADA ");
                System.exit(0);
            }
            
            if(opcoes == 1){
                ConsoleClear();
                
                System.out.println(" Cadastrando Produtos . . .");
                
                ProdutoA  NovoProduto = new ProdutoA();
                ProdutoA  NovoProduto2 = new ProdutoA();
                ProdutoA  NovoProduto3 = new ProdutoA();
                
                NovoProduto.id = 1;
                NovoProduto.nome = "colher";
                NovoProduto.descricao = "utensilio";
                NovoProduto.preco = 2;
                NovoProduto.quantidade = 3;
                vetorDeProdutos[0] = NovoProduto;
                
                NovoProduto2.id = 2;
                NovoProduto2.nome = "faca";
                NovoProduto2.descricao = "utensilio";
                NovoProduto2.preco = 5;
                NovoProduto2.quantidade = 15;
                vetorDeProdutos[1] = NovoProduto2;
                
                NovoProduto3.id = 3;
                NovoProduto3.nome = "garfo";
                NovoProduto3.descricao = "utensilio";
                NovoProduto3.preco = 2.7;
                NovoProduto3.quantidade = 24;                
                vetorDeProdutos[2] = NovoProduto3;
                
                System.out.println(" Cadastro Realizado");
           }
            
           if(opcoes == 2)
           {
                ConsoleClear();
                System.out.println("Atualizar o primeiro produto cadastrado na opção 1 ");

                vetorDeProdutos [0].id = 4;
                vetorDeProdutos [0].nome = "concha";
                vetorDeProdutos [0].descricao = "utensilio";
                vetorDeProdutos [0].preco = 2.6;
                vetorDeProdutos [0].quantidade = 21;
                
                System.out.println(" Atualização Realizada");
           }
           
           if(opcoes == 3)
           {
                System.out.println("Excluir o segundo produto cadastrado");
                vetorDeProdutos [1].id = 0;
                vetorDeProdutos [1].nome = "";
                vetorDeProdutos [1].descricao = "";
                vetorDeProdutos [1].preco = 0;
                vetorDeProdutos [1].quantidade = 0;
                
                System.out.println(" Produto Excluido ");
           }
           
           if(opcoes == 4)
           {
               ConsoleClear();
               for (int i = 0; i <3; i++) {
                   
                    System.out.println("Produto " + (i+1) + ": ");
                    System.out.println("Id do Produto: " + vetorDeProdutos [i].id);
                    System.out.println("Nome do Produto: " + vetorDeProdutos [i].nome);
                    System.out.println("Descrição do Produto: " +vetorDeProdutos [i].descricao);
                    System.out.println("Preço do Produto: " +vetorDeProdutos [i].preco);
                    System.out.println("Quantidade do Produto: " +vetorDeProdutos [i].quantidade);
                    System.out.println("==============================================");
               }            
           }        
    }while(opcoes != 0);
    }
     static void ConsoleClear() {
        try {
            Robot robot = new Robot();

            robot.setAutoDelay(5);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);

        } catch (AWTException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
}
