import java.util.Scanner;
public class Emoticon {
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        CadsEmot emoticon = new CadsEmot();
        
        System.out.println( " Olá digite algo: " );
        System.out.println( " Digite zero para sair do programa: " );
        String sentenca = entrada.nextLine();
        
        emoticon.setSentenca(sentenca);

        emoticon.contador();
        
        emoticon.resultado();
        
        entrada.close();
        }
    }
