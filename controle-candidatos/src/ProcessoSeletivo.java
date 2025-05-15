import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo!");
        selecaoCandidato();

    }

    static void entrandoEmContato(String candidato){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendido = false;
        do { 
            atendido = atender();
            continuarTentando = !atendido;
            if (continuarTentando) {
                System.out.println("Tentativa " + tentativas + " de contato com o candidato " + candidato);
                tentativas++;
            } else {
                System.out.println("Contato com o candidato " + candidato + " realizado!");
            }
        } while (continuarTentando && tentativas<=3);     

        if(atendido){
            System.out.println("O candidato " + candidato + " atendeu a ligacao!");
            double valorPretendido = valorPretendido();
            analisarCandidato(valorPretendido);
        } else {
            System.out.println("O candidato " + candidato + " nao atendeu a ligacao.");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    
    static void selecaoCandidato(){
        String[] candidatos = {"AUGUSTO","HENRIQUE","JOANA","ANTONIO","LUIS","LARISSA","VINICIUS","MATEUS","JULIANA","JOSE"};
        String[] selecionados = new String[5];
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salario: %.2f%n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("\nO candidato " + candidato + " foi selecionado para a vaga!\n");
                selecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

        System.out.println("\nCandidatos selecionados:");
        for (int i = 0; i < candidatosSelecionados; i++) {
            System.out.println(selecionados[i]);
            entrandoEmContato(selecionados[i]);
        }
    }   

    static double  valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1500, 2200);
    }

    static void analisarCandidato(double valorPretendido){
        double salarioBase = 2000;
        

        if (salarioBase>valorPretendido)
        System.out.println("Candidato contratado!");
        else if(salarioBase==valorPretendido)
        System.out.println("Envie contraproposta!");
        else
        System.out.println("Aguarde os demais candidatos.");

    }
}
