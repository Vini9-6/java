import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo!");
        selecaoCandidato();
    }

    
    static void selecaoCandidato(){
        String[] candidatos = {"AUGUSTO","HENRIQUE","JOANA","ANTONIO","LUIS","LARISSA","VINICIUS","MATEUS","JULIANA","JOSE"};
        String[] selecionados = new String[5];
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados <=5 && candidatosAtual < candidatos.length) {
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
        }
    }   

    static double  valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1500, 2200);
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
