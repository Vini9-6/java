
import java.util.concurrent.ThreadLocalRandom;



public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo!");
       /*  analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(2500); */
    }

    static void selecaoCandidato(){
        String [] candidatos = {"AUGUSTO","HENRIQUE","JOANA","ANTONIO","LUIS","LARISSA","VINICIUS","MATEUS","JULIANA","JOSE" };
        int candidatosSelecionados=0;
        int candidatosAtual=0;
        double salarioBase=2000;

        while(candidatosSelecionados<5){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();


        }

    
    }   

    static double  valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2300);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;

        if (salarioBase>salarioPretendido)
        System.out.println("Ligue para o candidato!");
        else if(salarioBase==salarioPretendido)
        System.out.println("Envie contraproposta!");
        else
        System.out.println("Aguarde os demais candidatos.");

    }
}
