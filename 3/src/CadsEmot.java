
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class CadsEmot {

	public String sentenca;
    String chateado = ":-(";
	String divertido = ":-)";
	int qntDivertido = contaOcorrencias(sentenca, divertido);
	int qntChateado = contaOcorrencias(sentenca, chateado);

    public void setSentenca(String sentenca) {
        this.sentenca = sentenca;
    }
    private int contaOcorrencias(String sentenca2, String divertido2) {
		
		return 0;
	}
	public void contador() {
        for (int i = 0; i < this.sentenca.length() && (i + 2) < sentenca.length() ; i++) {
            if (this.sentenca.charAt(i) == ':' ) 
            {
                String keyWord = this.sentenca.substring(i, i+3);
                if (keyWord.equals( ":-(" )) 
                {
                    @SuppressWarnings("unused")
					int qtdChateado = 0;
					qtdChateado++;
                }
                else if (keyWord.equals( ":-)" )) {
                	ConsoleClear();
                    int qtdDivertido = 0;
					qtdDivertido++;
                }while 
                	(sentenca.charAt(i) == '0') {
                        System.out.println(" Aplicação FINALIZADA ");
                        System.exit(0);
                    }
            }
            }
        }
        
    public void resultado() {
    	
    	
        if (qntChateado > qntDivertido ) {
        	ConsoleClear();
            System.out.println("chateado");
        }
        else if (divertido == (chateado)) {
        	ConsoleClear();
            System.out.println("neutro");
        } else {
        	ConsoleClear();
            System.out.println("divertido");
        }
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

		
	
	