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
        System.out.println(" Qual página deseja acessar: ");
        pagina=s.nextInt();

         int opcoes = s.nextInt();
         if(opcoes==0) {
			listagem [0]=nome = "Malcolm & Marie";
			listagem [0]=id="1";
			listagem [0]=descricao = "Malcom & Marie conta a história do complexo relacionamento entre um cineasta em ascensão em Hollywood, Malcom, e a sua namorada e atriz Marie. O filme original da Netflix foi dirigido por Sam Levinson, criador da aclamada série de TV Euphoria, que também é estrelada por Zendaya.";
			listagem [0]=ano = "2021";
         }
         if(opcoes==1) {
			listagem [1]=nome = "Judas e o Messias Negro";
			listagem [1]=id = "2";
			listagem [1]=descricao = "Messias Negro conta a história do ativista norte-americano Fred Hampton, uma das maiores figuras do grupo Pantera Negra nos Estados Unidos. ";
			listagem [1]=ano = "2021";
         }
         if(opcoes==2) {
			listagem [2]=nome = "Cruella";
			listagem [2]=id = "3";
			listagem [2]=descricao = "Cruella conta a história das origens de uma das vilãs mais aclamadas da Disney, Cruella de Vil, antagonista que aparece em 101 Dálmatas.  ";
			listagem [2]=ano = "2021";
         }
         if(opcoes==3) {
			listagem [3]=nome = "Luca";
			listagem [3]=id = "4";
			listagem [3]=descricao = "Luca é um monstro marinho que vive com a sua família nas profundezas do litoral italiano. Por toda a sua vida, a família de Luca sempre o aconselhou a nunca revelar a sua imagem para os humanos.  ";
			listagem [3]=ano = "2021";
         }
         if(opcoes==4) {
			listagem [4]=nome = "Em um Bairro de Nova York";
			listagem [4]=id = "5";
			listagem [4]=descricao = "Em um Bairro de Nova York é baseado no aclamado musical da Broadway, In The Heights, criado por Linn Manuel Miranda, criador do também aclamado Hamilton.   ";
			listagem [4]=ano = "2021";
         }
         if(opcoes==5) {
			listagem [5]=nome = "Viúva Negra";
			listagem [5]=id = "6";
			listagem [5]=descricao = "Viúva Negra é uma continuação de Capitão América. A espiã Natasha Romanoff deverá prestar contas com seu passado, enfrentando inimigos terríveis como o Treinador e a Dama de Ferro. " ;
			listagem [5]=ano = "2021";
         }
         if(opcoes==6) {
			listagem [6]=nome = "Godzilla Vs. Kong";
			listagem [6]=id = "7";
			listagem [6]=descricao = "O filme Godzilla Vs. Kong é uma continuação de Godzilla II: Rei dos Monstros e Kong: Skull Island e promete colocar frente a frente dois dos monstros mais aclamados da história do cinema hollywoodiano." ;
			listagem [6]=ano = "2021";
         }
         if(opcoes==7) {
			listagem [7]=nome = "1917";
			listagem [7]=id = "8";
			listagem [7]=descricao = "O enredo é relativamente simples: dois soldados ingleses precisam levar um recado para evitar que uma tropa aliada caia numa armadilha mortal. " ;
			listagem [7]=ano = "2020";
         }
		 if(opcoes==8) {
			listagem [8]=nome = "Jojo Rabbit";
			listagem [8]=id = "9";
			listagem [8]=descricao = "Esta sátira ambientada num dos períodos mais tristes da história aposta no humor para criticar a intolerância, tal como fez Charlie Chaplin no início do século XX.  " ;
			listagem [8]=ano = "2020";
		 }
		 if(opcoes==9) {
			listagem [9]=nome = "O Poço";
			listagem [9]=id = "10";
			listagem [9]=descricao = "Um filme de terror e suspense que se tornou viral logo nos primeiros dias em que foi lançado. Há quem diga que esse filme lembra um pouco a proposta do Parasita, vencedor do Oscar de Melhor Filme 2020.  " ;
			listagem [9]=ano = "2020";
		 }
		 if(opcoes==10) {
			listagem [10]=nome = "Viver Duas Vezes";
			listagem [10]=id = "11";
			listagem [10]=descricao = "Uma linda e emocionante história de amor, em que Emilio , diagnosticado com Alzheimer, resolve partir para uma grande aventura e reencontrar um amor de infância, antes que seja tarde para lembrar do rosto dela. " ;
			listagem [10]=ano = "2020";
		 }
		 if(opcoes==11) {
			listagem [11]=nome = "Adoráveis Mulheres";
			listagem [11]=id = "12";
			listagem [11]=descricao = "Com 6 indicações ao Oscar, este filme é uma adaptação do famoso romance de Louisa May Alcott. Ambientado nos EUA da metade do século XIX, o filme conta a história das irmãs March, focando na jovem Jo, que sonha em sonhar uma escritora de sucesso. " ;
			listagem [11]=ano = "2020";
		 }
		 if(opcoes==12) {
			listagem [12]=nome = "A última coisa que ele queria";
			listagem [12]=id = "13";
			listagem [12]=descricao = "McMahon (Anne Hathaway), uma jornalista, vai para América Central ajudar o pai numa missão: cobrir a corrupção e o tráfico de armas que lá ocorre. Entretanto, a história ganha outros contornos ao longo dela. " ;
			listagem [12]=ano = "2020";
		 }
		 if(opcoes==13) {
			listagem [13]=nome = "Troco em Dobro";
			listagem [13]=id = "14";
			listagem [13]=descricao = "Troco em Dobro é uma comédia policial com uma pitada de suspense. Na história, o detetive Spenser (Mark Wahlberg), recém saído da prisão, e Hawk (Winston Duke) unem-se para derrubar alguns bandidos nas ruas de Boston. " ;
			listagem [13]=ano = "2020";
		 }
		 if(opcoes==14) {
			listagem [14]=nome = "Roma";
			listagem [14]=id = "15";
			listagem [14]=descricao = "Roma se passa na virada de 1970 para 1971 na Cidade do México. O filme acompanha Cleo, uma empregada doméstica devotada à família em crise para a qual trabalha, e que descobre estar grávida. " ;
			listagem [14]=ano = "2018";
		 }
		 if(opcoes==15) {
			listagem [15]=nome = "O Irlandês";
			listagem [15]=id = "16";
			listagem [15]=descricao = "O Irlandês acompanha os passos de Frank Sheeran, um assassino profissional da máfia. A trama do longa se concentra especialmente na sua relação com o líder sindical Jimmy Hoffa e seu misterioso desaparecimento. " ;
			listagem [15]=ano = "2019";
		 }
		 if(opcoes==16) {
			listagem [16]=nome = "My Happy Family";
			listagem [16]=id = "17";
			listagem [16]=descricao = "My Happy Family conta a história de Manana, uma mulher de 52 anos que se sente sufocada pela família e não consegue ter controle sobre a própria vida. Tudo muda, no entanto, quando ela decide ir morar sozinha, deixando seu marido e filhos para trás." ;
			listagem [16]=ano = "2017";
		 }
		 if(opcoes==17) {
			listagem [17]=nome = "Strong Island";
			listagem [17]=id = "18";
			listagem [17]=descricao = "Long Island conta a história do irmão do próprio diretor Yance Ford. Em 1992, assassinado durante uma discussão, ele entrou para as estatísticas de jovens negros mortos nos EUA sem que o culpado pelo crime fosse responsabilizado." ;
			listagem [17]=ano = "2017";
		 }
		 if(opcoes==18) {
			listagem [18]=nome = "Rolling Thunder Revue";
			listagem [18]=id = "19";
			listagem [18]=descricao = "Misturando documentário com ficção, Rolling Thunder Revue: A Bob Dylan Story by Martin Scorsese é o segundo longa do diretor a respeito de Dylan. Nesta obra, ele se debruça sobre gravações, depoimentos e história imaginadas a respeito de sua turnê de 1975." ;
			listagem [18]=ano = "2019";
		 }
		 if(opcoes==19) {
			listagem [19]=nome = "Happy as Lazzaro";
			listagem [19]=id = "20";
			listagem [19]=descricao = "Happy as Lazzaro é um filme de drama italiano que mistura alegorias bíblicas e críticas a exploração de trabalho. Nele, Lazzaro, que dá título ao longa, é um trabalhador inocente que vê sua vida mudar ao compactuar com um falso sequestro." ;
			listagem [19]=ano = "2018";
		 }
	}while(cadastro!=0);
			}
	public static void main(String[] args) {
	 cadastraFilmes();	
	 

	 int inicio = (pagina - 1) * tamanhoPagina;  
	 // Pula a quantidade de filmes q for necessária
	 for (int i = 0; i < tamanhoPagina && inicio + i < 20; i++);
	 System.out.println(pagina + nome);
	 
	 
	 
	
	}
	}