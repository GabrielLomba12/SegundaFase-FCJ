import java.util.Scanner;
import java.util.Random;

public class Fase2 {
    static String timeAtual;
    static String clubeSorteado;
    public static void main(String[] args) throws InterruptedException {
        Fase2();
    }

    static void Fase2()throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("");//alteração
        System.out.println("");//alteração
        System.out.println("Você jogou muito bem na temporada passada e isso despertou o interesse de vários clubes grandes!");
        System.out.println("Estes clubes estão localizados nestas duas regiões: Sul e Sudeste.");
        System.out.println("\nAgora é com você! Escolha uma região e caso você acerte uma pergunta tem o direito de escolher o clube que deseja jogar!");

        System.out.println("1) Sul\n2) Sudeste");
        System.out.print("Sua escolha: ");
        String regiao = sc.nextLine();

        if (regiao.equals("1")) {
            System.out.println("Você escolheu a região: Sul.");
        } else if (regiao.equals("2")) {
            System.out.println("Você escolheu a região: Sudeste.");
        } else {
            while (true) {
                if (regiao.equals("1") || regiao.equals("2")) {
                    if (regiao.equals("1")) {
                        System.out.println("Você escolheu a região: Sul.");
                        break;
                    } else if (regiao.equals("2")) {
                        System.out.println("Você escolheu a região: Sudeste.");
                        break;
                    }
                } else {
                    System.out.print("Opção inválida. Digite novamente: ");
                    regiao = sc.nextLine();
                }
            }
        }
        System.out.print("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nQual o maior artilheiro da seleção brasileira?\na) Neymar\nb) Pelé\nc) Zico\nd) Romário");
        System.out.print("Sua resposta: ");
        String resposta = sc.nextLine().toUpperCase();
        while (true) {
            if (resposta.equals("a".toUpperCase()) || resposta.equals("b".toUpperCase()) || resposta.equals("c".toUpperCase()) || resposta.equals("d".toUpperCase())) {
                break;
            } else {
                System.out.print("Opção inválida. Digite novamente: ");
                resposta = sc.nextLine().toUpperCase();
            }
        }

        String clubesSul[] = new String[] {
                "Grêmio", "Internacional"
        };

        String clubesSudeste[] = new String[] {
                "Atlético Mineiro", "Palmeiras"
        };
        String escolha;
        switch (resposta) {
            case "B":
                System.out.println("Resposta correta. Pelé tem 77 gols em 92 jogos.\n\nOpções disponíveis:");
                if (regiao.equals("1")) {
                    int indiceClube = 1;
                    for (String clube : clubesSul) {
                        System.out.println(indiceClube + ") " + clube);
                        indiceClube += 1;
                    }
                    System.out.print("\nEscolha o time de sua preferência: ");
                    escolha = sc.nextLine();
                    while (true) {
                        if (escolha.equals("1") || escolha.equals("2")) {
                            if (escolha.equals("1")){
                                timeAtual = clubesSul[Integer.parseInt(escolha) - 1];
                            }
                            else if (escolha.equals("2")){
                                timeAtual = clubesSul[Integer.parseInt(escolha) - 1];
                            }
                            break;
                        } else {
                            System.out.print("Opção inválida. Digite novamente: ");
                            escolha = sc.nextLine();
                        }
                    } 

                    System.out.println("Parabéns! Você se tornou o novo jogador do " + timeAtual + ".");
                } 
                else if (regiao.equals("2")) {
                    int indiceClube = 1;
                    for (String clube : clubesSudeste) {
                        System.out.println(indiceClube + ") " + clube);
                        indiceClube += 1;
                    }
                    System.out.print("\nEscolha o time de sua preferência: ");
                    escolha = sc.nextLine();
                    while (true) {
                        if (escolha.equals("1") || escolha.equals("2")) {
                            if (escolha.equals("1")){
                                timeAtual = clubesSudeste[Integer.parseInt(escolha) - 1];
                            }
                            else if (escolha.equals("2")){
                                timeAtual = clubesSudeste[Integer.parseInt(escolha) - 1];
                            }
                            break;
                        } else {
                            System.out.print("Opção inválida. Digite novamente: ");
                            escolha = sc.nextLine();
                        }
                    }
                    System.out.printf("Parabéns! Você se tornou o novo jogador do %s.", timeAtual);
                }
                
                break;

            case "A":
            case "C":
            case "D":
                System.out.println("Resposta incorreta. Pelé tem 77 gols em 92 jogos.");
                
                if (regiao.equals("1")) {
                    clubeSorteado = clubesSul[random.nextInt(clubesSul.length)];
                    System.out.println("\nSeu time será sorteado. \nSeu clube sorteado foi: " + clubeSorteado);
                    timeAtual = clubeSorteado;
                } else if (regiao.equals("2")) {
                    clubeSorteado = clubesSudeste[random.nextInt(clubesSudeste.length)];
                    System.out.println("\nSeu time será sorteado. \nSeu clube sorteado foi: " + clubeSorteado);
                    timeAtual = clubeSorteado;
                }
                break;
        }
        int pontuaçao = 0;
        //char pergunta1  = '0';
        char pergunta1;
        System.out.println("\nAgora que definimos o seu novo time, vamos iniciar sua temporada!");
        System.out.println("\nVocê esta estreiando pelo " + timeAtual + " e irá enfrentar o Fortaleza pela primeira rodada do Brasileirão.");
        System.out.println("Mas antes de tudo, você deve acertar uma pergunta para ter a certeza que se sairá bem na sua estreia!");
        System.out.print("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nQuem é o maior artilheiro da história do Brasileirão, na era dos ponto corridos?");
        System.out.println("a) Diego Souza");
        System.out.println("b) Gabigol");
        System.out.println("c) Roberto Dinamite");
        System.out.println("d) Luis Fabiano");
        System.out.print("Sua reposta: ");
        do{
        pergunta1 = sc.nextLine().toUpperCase().charAt(0);

        switch (pergunta1){
            case 'A':
            case 'B':
            case 'D':
                System.out.println("Resposta incorreta! O artilheiro foi Roberto Dinamite com 190 gols.");
                System.out.println("E por ter errado esta pergunta você acabou indo mal na estreia. Errando alguns passes e perdendo um gol.\nMas não desanime, você terá outras chances de mostrar o seu valor!");
                System.out.println("Sua pontução: " + pontuaçao);
                break;
            case 'C':
                System.out.println("Resposta correta!, Roberto Dinamite tem 190 gols.");
                System.out.println("QUE ESTREIA!! Você fez uma ótima partida, marcando um gol e dando duas belas assistências! Assim, ganhando moral com o clube!");
                pontuaçao += 20;
                System.out.println("Sua pontuação: " + pontuaçao);
                break;
            default:
                System.out.print("Opção inválida, digite novamente: ");
                break;
        }
        }while (pergunta1 != 'A' && pergunta1 != 'B' && pergunta1 != 'C' && pergunta1 != 'D' );
        
        Thread.sleep(3000);
        char pergunta2;
        
            System.out.println("\n\nAlém do Brasileirão, o " + timeAtual + " está disputando também a Libertadores.");
            System.out.println("Seu time ja avançou algumas fases, porém você não estava escrito anteriormente. Então hoje será a sua estreia! Esteja preparado.");

            System.out.println("Para garantir a vitória e o seu bom desempenho na partida, acerte a pergunta:");
            System.out.print("----------------------------------------------------------------------------------------------------------");
            System.out.println("\nQual jogador tem mais hat-tricks (3 gols em um mesmo jogo) na carreira?\na) Luis Suarez\nb) Lionel Messi\nc) Cristiano Ronaldo\nd) Ronaldo Fenômeno");
            System.out.print("Sua resposta: ");
            do{
            pergunta2 = sc.nextLine().toUpperCase().charAt(0);

            switch(pergunta2){
                case 'A':
                case 'B':
                case 'D':
                    System.out.println("Resposta incorreta! O jogador com hat-tricks é o Cristinao Ronaldo, com 61 marcos na carreira!");
                    System.out.println("E assim, você acabou indo bem mal nesta partida e seu time foi eliminado. Parece até que você sentiu a pressão de jogar com o estádio lotado.");
                    System.out.println("Sua pontução: " + pontuaçao);
                    break;
                case 'C':
                    System.out.println("Resposta correta!! Cristiano Ronaldo tem 61 hat-tricks na carreira.");
                    System.out.println("Você foi simplesmente FANTÁSTICO!! Numa noite mágica de Libertadores, você marcou um hat-trick no jogo de ida das oitvas de final contra o Boca Juniors! QUE ESTREIA!");
                    pontuaçao += 20;
                    System.out.println("Sua pontução: " + pontuaçao);
                    break;
                default:
                    System.out.print("Opção inválida, digite novamente: ");
                    break;
            }
        }while (pergunta2 != 'A' && pergunta2 != 'B' && pergunta2 != 'C' && pergunta2 != 'D');
        

        Thread.sleep(3000);
        char pergunta3;
        
            System.out.println("\n\nVocê está no meio do campeonato brasileiro e o " + timeAtual + " precisa de uma vitória para pegar a ponta da tabela.");
            System.out.println("O jogo é contra o líder Flamengo no Maracanã, este jogo terá uma pressão absurda, se ganharem este jogo se tornam favoritos ao título!");
            System.out.print("----------------------------------------------------------------------------------------------------------");
            System.out.println("\nO São Paulo é um clube multicampeão, nacionalmente e internacionalmente, e neste século fizeram o feito de serem campeões brasileiro 3 vezes seguidas. Quais foram estes anos?");
            System.out.println("a) 2005, 2006, 2007\nb) 2008, 2009, 2010\nc) 2007, 2008, 2009\nd) 2006, 2007, 2008");
            System.out.print("Sua resposta: ");
            do{
            pergunta3 = sc.next().toUpperCase().charAt(0);
            switch(pergunta3){
                case 'A':
                case 'B':
                case 'C':
                    System.out.println("Resposta errada! A resposta correta seria a alternativa 'd'.");
                    System.out.println("Com esta derrota as chances de título dimunuiram e o seu time perdeu uma chance de ouro. Parece que já existem alguns clubes europeus de olho na sua situação, porém você só terá uma oportunidade caso seu desempenho coletivo for bom.");
                    System.out.println("Sua pontução: " + pontuaçao);
                    break;
                case 'D':
                    System.out.println("Resposta correta!!\nO " + timeAtual + " ganhou do Flamengo por 2 x 0, assumiu a ponta do campeonato e se tornou favoritíssimo ao título!");
                    System.out.println("Muitos jornalistas estão comentando sobre sua temporada, ótimas atuações com gols e assistências estão despertando o interesse de vários clubes europeus, continue acertando as questões e terá uma otima carreira!");
                    pontuaçao += 20;
                    System.out.println("Sua pontução: " + pontuaçao);
                    break;
                default:
                    System.out.print("Opção inválida, digite novamente: ");
                    break;
            }
        }while (pergunta3 != 'A' && pergunta3 != 'B' && pergunta3 != 'C' && pergunta3 != 'D');
        

        Thread.sleep(3000);
        char pergunta4 = '0';
        if(pergunta2 == 'C'){
            
                System.out.println("\n\nPerto do fim da temporada, o " + timeAtual + " tem um jogo importantíssimo, válido pela semifinal da Libertadores, num grande clássico contra o Corinthinas!!\nO jogo de ida foi 0 à 0 no casa do adversário. Mentenha o foco, vença a partida e avance para a final do campeonato.");
                System.out.print("----------------------------------------------------------------------------------------------------------");
                System.out.println("\nQual o primeiro time brasileiro a ganhar uma Libertadores?\na) Corinthians\nb) Santos\nc) Palmeiras\nd) Flamengo");
                System.out.print("Sua resposta: ");
                do{
                pergunta4 = sc.next().toUpperCase().charAt(0);
                switch (pergunta4){
                    case 'A':
                    case 'C':
                    case 'D':
                        System.out.println("Reposta incorreta! O Santos foi o primeiro campeão.");
                        System.out.println("AH NÃO! O " + timeAtual + " teve um péssimo desempenho e perdeu para o Corinthians por 3x0. Assim sendo eliminado da Libertadores.");
                        System.out.println("Você jogou muito mal, o que está acontecendo? Mantenha o foco nas perguntas! A temporada ainda não está perdida.");
                        System.out.println("Sua pontução: " + pontuaçao);
                        break;
                    case 'B': 
                        System.out.println("Resposta correta!!\nHISTÓRICO! Com tão pouca idade você conseguiu levar o " + timeAtual + " à final da Libertadores com dois gols e uma assistência!!");
                        System.out.println("Podemos definitivamente dizer que você é craque!");
                        pontuaçao += 20;
                        System.out.println("Sua pontução: " + pontuaçao);
                        break;
                    default: 
                        System.out.print("Opção inválida, digite novamente: ");
                        break;
                }
            }while (pergunta1 != 'A' && pergunta1 != 'B' && pergunta1 != 'C' && pergunta1 != 'D');
        }
        
        
        Thread.sleep(3000);
        char pergunta5;
        if (pergunta3 =='D'){
            
                System.out.println("\n\nHoje é a útilma rodada do Brasileirão e o " + timeAtual +  " só não pode perder para conquistar o Brasileirão, vença a partida e conquiste este título.\nAlém disso, você está disputandoa a artilharia do campeonato com o Gabigol, do Flamengo. Você vai precisar de dois gols para ultrapassá-lo.");
                System.out.print("----------------------------------------------------------------------------------------------------------");
                System.out.println("\nUm dos Brasileirões mais disputado da história foi o de 2009, onde a diferença do 1º colocado para o 3º foi de 2 pontos. Qual foi o time campeão?");
                System.out.println("a) Cruzeiro\nb) Flamengo\nc) São Paulo\nd) Internacional");
                System.out.print("Sua resposta: ");
                do{
                pergunta5 = sc.next().toUpperCase().charAt(0);
                switch (pergunta5){
                    case 'A':
                    case 'C':
                    case 'D':
                        System.out.println("Resposta incorreta! O Flamengo foi o campeão daquela edição.");
                        System.out.println("Que pipocada! Oque parecia um título certo, se tornou um vexame. O jogo acabou 2x0 para o Coritiba e o " + timeAtual + " não conseguiu o título.\nVocê não conseguiu nem a artilharia do campeonato.");
                        System.out.println("Sua pontução: " + pontuaçao);
                        break;
                    case 'B':
                        System.out.println("Reposta correta!");
                        System.out.println("PARABÉNS!! O " + timeAtual + " consguiu derrotar o Coritiba por 5x0, onde você marcou 3 gols e conseguiram conquistar o tão sonhado título do Brasileirão!");
                        System.out.println("Que temporada mágica!! Além do título você ainda se consagrou artilheiro do campeonato, com 25 gols!");
                        pontuaçao += 20;
                        System.out.println("Sua pontução: " + pontuaçao);
                        break;
                    default: 
                        System.out.print("Opção inválida, digite novamente: ");
                        break;
                }
            }while (pergunta5 != 'A' && pergunta5 != 'B' && pergunta5 != 'C' && pergunta5 != 'D');
        }
        else if(pergunta3 == 'A' || pergunta3 == 'B' || pergunta3 == 'C'){
                System.out.println("\n\nHoje é a útilma rodada do Brasileirão e o " + timeAtual +  " acabou ficando um pouco para trás na disputa, vença a partida e garanta pelo menos uma vaga para a próxima Libertadores.");
                System.out.println("Além disso, você está disputandoa a artilharia do campeonato com o Gabigol, do Flamengo. Você vai precisar de dois gols para ultrapassá-lo.");
                System.out.print("----------------------------------------------------------------------------------------------------------");
                System.out.println("\nUm dos Brasileirões mais disputado da história foi o de 2009, onde a diferença do 1º colocado para o 3º foi de 2 pontos. Qual foi o time campeão?");
                System.out.println("a) Cruzeiro\nb) Flamengo\nc) São Paulo\nd) Interncaional");
                System.out.print("Sua resposta: ");
                do{
                pergunta5 = sc.next().toUpperCase().charAt(0);
                switch (pergunta5){
                    case 'A':
                    case 'C':
                    case 'D':
                        System.out.println("Resposta incorreta! O Flamengo foi o campeão daquela edição.");
                        System.out.println("Que pipocada! Oque parecia uma classificação certa, se tornou um vexame. O jogo acabou 2x0 para o Coritiba e o " + timeAtual + " não conseguiu a vaga.\nVocê não conseguiu nem a artilharia do campeonato.");
                        System.out.println("Sua pontução: " + pontuaçao);
                        break;
                    case 'B':
                        System.out.println("Reposta correta!");
                        System.out.println("PARABÉNS!! O " + timeAtual + " conseguiu derrotar o Coritiba por 5x0, onde você marcou 3 gols e conseguiram a vaga para a próxima Libertadores!");
                        System.out.println("Que temporada mágica!! ");
                        pontuaçao += 20;
                        System.out.println("Sua pontução: " + pontuaçao);
                        break;
                    default: 
                        System.out.print("Opção inválida, digite novamente: ");
                        break;
                }
            }while (pergunta5 != 'A' && pergunta5 != 'B' && pergunta5 != 'C' && pergunta5 != 'D');
        }

        Thread.sleep(3000);
        char pergunta6;
        if(pergunta4 =='B'){
            System.out.println("Você chegou na tão sonhada final de Libertadores e jogará contra o River Plate!\nEste com certeza é o jogo da sua vida até então!");
            System.out.println("Os torcedores estão num grande expectativa sobre o seu desempenho! Não os decepcione!");
            System.out.print("----------------------------------------------------------------------------------------------------------");
            System.out.println("\nQual o maior artilheiro da história da Libertadores?\na) Gabigol (BRA)\nb) Alberto Spencer (EQU)\nc) Fernando Morena (URU)\nd) Daniel Onega (ARG)");
            System.out.print("Sua resposta: ");
            do{
                pergunta6 = sc.next().toUpperCase().charAt(0);
                switch (pergunta6){
                    case 'B':
                        System.out.println("Resposta correta! Alberto Spencer tem 54 gols.");
                        System.out.println("HISTÓRICO!! Você acaba de conquistar a Libertadores! Fazendo dois gols e vencendo a partida contra o River por 2x1!");
                        System.out.println("Além disso foi escolhido como o craque da competição! Parabéns!");
                        pontuaçao += 20;
                        System.out.println("\nSua pontução: " + pontuaçao);
                        break;
                    case 'A':
                    case 'C':
                    case 'D':
                        System.out.println("Resposta incorreta! Alberto Spencer tem 54 gols.");
                        System.out.println("Não foi dessa vez... O "  + timeAtual + " perdeu por 1x0 para o River. Porém apesar da derrota, você foi um dos destques do campeonato. Muito bem!");
                        System.out.println("\nSua pontução: " + pontuaçao);
                        break;
                    default:
                        System.out.print("Opção inválida, digite novamente: ");
                        break;
                }
            }while (pergunta6 != 'A' && pergunta6 != 'B' && pergunta6 != 'C' && pergunta6 != 'D');
        }
        
        System.out.println("\n\nPontuação final: " + pontuaçao);

        if (pontuaçao >= 60){
            System.out.println("Parabéns foi destaque do ano e despertou interesse de clubes Europeus!");
            System.out.println("Desta forma você avançou para a fase 3!");
            Thread.sleep(3000);
            //textFaseDois();   
            Thread.sleep(3000);         
            //Fase3();
        }else{
            System.out.println("Você não atingiu a pontuação necessária para avançar para a próxima temporada e com isso, encerramos aqui a sua jornada!");
            System.exit(0);
        }
    }
}