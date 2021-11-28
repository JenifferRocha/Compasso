import java.util.Arrays;
import java.util.Scanner;

public class ListaFilmes {
	static Scanner s = new Scanner(System.in);
	static int qntFilmes, tamanhoPagina, pagina;
	static String nome;
	static String descricao;
	static String ano, id;
	static int cadastro;
	static String ListaFilmes []  = new  String  [20];
	static String	listagem[] = new String[20];
	
	public static  void cadastraFilmes() {
		
	
	do {
        System.out.println(" Quantos filmes deseja filtrar: ");
        qntFilmes=s.nextInt();
        System.out.println(" Qual p�gina deseja acessar: ");
        pagina=s.nextInt();

         int opcoes = s.nextInt();
         if(opcoes==0) {
			listagem [0]=nome = "Malcolm & Marie";
			listagem [0]=id="1";
			listagem [0]=descricao = "Malcom & Marie�conta a hist�ria do complexo relacionamento entre um cineasta em ascens�o em Hollywood, Malcom, e a sua namorada e atriz Marie. O filme original da Netflix foi dirigido por Sam Levinson, criador da aclamada s�rie de TV Euphoria, que tamb�m � estrelada por Zendaya.";
			listagem [0]=ano = "2021";
         }
         if(opcoes==1) {
			listagem [1]=nome = "Judas e o Messias Negro";
			listagem [1]=id = "2";
			listagem [1]=descricao = "Messias Negro conta a hist�ria do ativista norte-americano Fred Hampton, uma das maiores figuras do grupo Pantera Negra nos Estados Unidos. ";
			listagem [1]=ano = "2021";
         }
         if(opcoes==2) {
			listagem [2]=nome = "Cruella";
			listagem [2]=id = "3";
			listagem [2]=descricao = "Cruella conta a hist�ria das origens de uma das vil�s mais aclamadas da Disney, Cruella de Vil, antagonista que aparece em 101 D�lmatas.  ";
			listagem [2]=ano = "2021";
         }
         if(opcoes==3) {
			listagem [3]=nome = "Luca";
			listagem [3]=id = "4";
			listagem [3]=descricao = "Luca � um monstro marinho que vive com a sua fam�lia nas profundezas do litoral italiano. Por toda a sua vida, a fam�lia de Luca sempre o aconselhou a nunca revelar a sua imagem para os humanos.  ";
			listagem [3]=ano = "2021";
         }
         if(opcoes==4) {
			listagem [4]=nome = "Em um Bairro de Nova York";
			listagem [4]=id = "5";
			listagem [4]=descricao = "Em um Bairro de Nova York � baseado no aclamado musical da Broadway,�In The Heights, criado por Linn Manuel Miranda, criador do tamb�m aclamado Hamilton.   ";
			listagem [4]=ano = "2021";
         }
         if(opcoes==5) {
			listagem [5]=nome = "Vi�va Negra";
			listagem [5]=id = "6";
			listagem [5]=descricao = "Vi�va Negra�� uma continua��o de�Capit�o Am�rica. A espi� Natasha Romanoff dever� prestar contas com seu passado, enfrentando inimigos terr�veis como o Treinador e a Dama de Ferro. " ;
			listagem [5]=ano = "2021";
         }
         if(opcoes==6) {
			listagem [6]=nome = "Godzilla Vs. Kong";
			listagem [6]=id = "7";
			listagem [6]=descricao = "O filme Godzilla Vs. Kong � uma continua��o de�Godzilla II: Rei dos Monstros�e�Kong: Skull Island�e promete colocar frente a frente dois dos monstros mais aclamados da hist�ria do cinema hollywoodiano." ;
			listagem [6]=ano = "2021";
         }
         if(opcoes==7) {
			listagem [7]=nome = "1917";
			listagem [7]=id = "8";
			listagem [7]=descricao = "O enredo � relativamente simples: dois soldados ingleses precisam levar um recado para evitar que uma tropa aliada caia numa armadilha mortal. " ;
			listagem [7]=ano = "2020";
         }
		 if(opcoes==8) {
			listagem [8]=nome = "Jojo Rabbit";
			listagem [8]=id = "9";
			listagem [8]=descricao = "Esta s�tira ambientada num dos per�odos mais tristes da hist�ria aposta no humor para criticar a intoler�ncia, tal como fez Charlie Chaplin no in�cio do s�culo XX.  " ;
			listagem [8]=ano = "2020";
		 }
		 if(opcoes==9) {
			listagem [9]=nome = "O Po�o";
			listagem [9]=id = "10";
			listagem [9]=descricao = "Um filme de terror e suspense que se tornou viral logo nos primeiros dias em que foi lan�ado. H� quem diga que esse filme lembra um pouco a proposta do�Parasita, vencedor do Oscar de Melhor Filme 2020.  " ;
			listagem [9]=ano = "2020";
		 }
		 if(opcoes==10) {
			listagem [10]=nome = "Viver Duas Vezes";
			listagem [10]=id = "11";
			listagem [10]=descricao = "Uma linda e emocionante hist�ria de amor, em que Emilio , diagnosticado com Alzheimer, resolve partir para uma grande aventura e reencontrar um amor de inf�ncia, antes que seja tarde para lembrar do rosto dela. " ;
			listagem [10]=ano = "2020";
		 }
		 if(opcoes==11) {
			listagem [11]=nome = "Ador�veis Mulheres";
			listagem [11]=id = "12";
			listagem [11]=descricao = "Com 6 indica��es ao Oscar, este filme � uma adapta��o do famoso romance de Louisa May Alcott. Ambientado nos EUA da metade do s�culo XIX, o filme conta a hist�ria das irm�s March, focando na jovem Jo, que sonha em sonhar uma escritora de sucesso. " ;
			listagem [11]=ano = "2020";
		 }
		 if(opcoes==12) {
			listagem [12]=nome = "A �ltima coisa que ele queria";
			listagem [12]=id = "13";
			listagem [12]=descricao = "McMahon (Anne Hathaway), uma jornalista, vai para Am�rica Central ajudar o pai numa miss�o: cobrir a corrup��o e o tr�fico de armas que l� ocorre. Entretanto, a hist�ria ganha outros contornos ao longo dela. " ;
			listagem [12]=ano = "2020";
		 }
		 if(opcoes==13) {
			listagem [13]=nome = "Troco em Dobro";
			listagem [13]=id = "14";
			listagem [13]=descricao = "Troco em Dobro�� uma com�dia policial com uma pitada de suspense. Na hist�ria, o detetive Spenser (Mark Wahlberg), rec�m sa�do da pris�o, e Hawk (Winston Duke) unem-se para derrubar alguns bandidos nas ruas de Boston. " ;
			listagem [13]=ano = "2020";
		 }
		 if(opcoes==14) {
			listagem [14]=nome = "Roma";
			listagem [14]=id = "15";
			listagem [14]=descricao = "Roma�se passa na virada de 1970 para 1971 na Cidade do M�xico. O filme acompanha Cleo, uma empregada dom�stica devotada � fam�lia em crise para a qual trabalha, e que descobre estar gr�vida. " ;
			listagem [14]=ano = "2018";
		 }
		 if(opcoes==15) {
			listagem [15]=nome = "O Irland�s";
			listagem [15]=id = "16";
			listagem [15]=descricao = "O Irland�s�acompanha os passos de Frank Sheeran, um assassino profissional da m�fia. A trama do longa se concentra especialmente na sua rela��o com o l�der sindical Jimmy Hoffa e seu misterioso desaparecimento. " ;
			listagem [15]=ano = "2019";
		 }
		 if(opcoes==16) {
			listagem [16]=nome = "My Happy Family";
			listagem [16]=id = "17";
			listagem [16]=descricao = "My Happy Family�conta a hist�ria de Manana, uma mulher de 52 anos que se sente sufocada pela fam�lia e n�o consegue ter controle sobre a pr�pria vida. Tudo muda, no entanto, quando ela decide ir morar sozinha, deixando seu marido e filhos para tr�s." ;
			listagem [16]=ano = "2017";
		 }
		 if(opcoes==17) {
			listagem [17]=nome = "Strong Island";
			listagem [17]=id = "18";
			listagem [17]=descricao = "Long Island�conta a hist�ria do irm�o do pr�prio diretor Yance Ford. Em 1992, assassinado durante uma discuss�o, ele entrou para as estat�sticas de jovens negros mortos nos EUA sem que o culpado pelo crime fosse responsabilizado." ;
			listagem [17]=ano = "2017";
		 }
		 if(opcoes==18) {
			listagem [18]=nome = "Rolling Thunder Revue";
			listagem [18]=id = "19";
			listagem [18]=descricao = "Misturando document�rio com fic��o,�Rolling Thunder Revue: A Bob Dylan Story by Martin Scorsese�� o segundo longa do diretor a respeito de Dylan. Nesta obra, ele se debru�a sobre grava��es, depoimentos e hist�ria imaginadas a respeito de sua turn� de 1975." ;
			listagem [18]=ano = "2019";
		 }
		 if(opcoes==19) {
			listagem [19]=nome = "Happy as Lazzaro";
			listagem [19]=id = "20";
			listagem [19]=descricao = "Happy as Lazzaro�� um filme de drama italiano que mistura alegorias b�blicas e cr�ticas a explora��o de trabalho. Nele, Lazzaro, que d� t�tulo ao longa, � um trabalhador inocente que v� sua vida mudar ao compactuar com um falso sequestro." ;
			listagem [19]=ano = "2018";
		 }
	}while(cadastro!=0);
			}
	public static void main(String[] args) {
	 cadastraFilmes();	
	 

	 int inicio = (pagina - 1) * tamanhoPagina;  
	 // Pula a quantidade de filmes q for necess�ria
	 for (int i = 0; i < tamanhoPagina && inicio + i < 20; i++);
	 System.out.println(pagina + nome);
	 
	 
	 
	
	}
	}