import java.util.Scanner; // importa a classe scanner

public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(10);
        // imprime o status inicial da smartTv
        System.out.println("tv ligada: " + smartTv.ligada);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status -> tv ligada? " + smartTv.ligada);

        // cria um scanner para capturar a entrada do usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite 1 para aumentar o volume ou 0 para diminuir: ");
        int novoVolume = scanner.nextInt();

        // enquanto o usuario nao digitar uma opcao valida, o loop continua
        while (novoVolume != 1 && novoVolume != 0) {
        System.out.println("opcao invalida. digite 1 para ir ao proximo Volume ou 0 para o anterior: ");
        novoVolume = scanner.nextInt();
        }

        if (novoVolume == 1) {
            smartTv.aumentarVolume();
        } else  {
            smartTv.diminuirVolume();       
        }
        System.out.println("volume atual: " + smartTv.volume);

        System.out.println("digite o canal desejado: ");
        int novoCanal = scanner.nextInt(); // le o numero digitado pelo usuario


        smartTv.mudarCanal(novoCanal); // atualiza o canal na smartTv
        System.out.println("canal atual: " + smartTv.canal);

        System.out.println("digite 1 para ir ao proximo canal ou 0 para o anterior: ");
        novoCanal = scanner.nextInt();

        // enquanto o usuario nao digitar uma opcao valida, o loop continua
        while (novoCanal != 1 && novoCanal != 0) {
            System.out.println("opcao invalida. digite 1 para ir ao proximo canal ou 0 para o anterior: ");
            novoCanal = scanner.nextInt();
        }

        if (novoCanal == 1) {
            smartTv.avancarCanal(); // avanca para o proximo canal
        } else  {
            smartTv.voltarCanal(); // volta para o canal anterior
        }

        System.out.println("canal atual: " + smartTv.canal);
                // fecha o scanner
                scanner.close();
    }
}