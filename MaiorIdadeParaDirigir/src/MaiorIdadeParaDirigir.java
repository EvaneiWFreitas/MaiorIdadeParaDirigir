/**
 * Programa que verifica se uma pessoa pode dirigir
 * de acordo com sua idade e condição de emancipação.
 *
 * <p>O programa solicita ao usuário sua idade e pergunta
 * se ele é emancipado. A partir dessas informações, verifica
 * se a pessoa atende aos critérios definidos para poder dirigir.</p>
 *
 * <p>A regra utilizada pelo programa é:</p>
 * <ul>
 *     <li>Pessoas com 18 anos ou mais podem dirigir.</li>
 *     <li>Pessoas emancipadas com 16 anos ou mais podem dirigir.</li>
 *     <li>As demais pessoas não podem dirigir.</li>
 * </ul>
 *
 * <p>Após realizar a verificação, o programa pergunta ao usuário
 * se deseja realizar uma nova consulta. O programa continuará
 * executando enquanto o usuário responder "S".</p>
 *
 * @author William Nascimento
 * @version 1.0
 * @since 2026
 */
import java.util.Scanner;
public class MaiorIdadeParaDirigir {

    /**
     * Método principal responsável pela execução do programa.
     *
     * <p>Utiliza a classe {@link Scanner} para receber os dados
     * informados pelo usuário através do teclado.</p>
     *
     * <p>O método também contém a estrutura de repetição {@code do-while},
     * permitindo que o usuário faça várias consultas sem precisar
     * executar o programa novamente.</p>
     *
     * @param args argumentos recebidos pela linha de comando.
     */
    public static void main(String[] args) {

        // Cria o objeto Scanner para receber dados do teclado
        Scanner sc = new Scanner(System.in);

        // Armazena a resposta do usuário sobre continuar ou não o programa
        String continuar;

        /*
         * O bloco do será executado pelo menos uma vez.
         * Depois da consulta, o usuário poderá escolher
         * se deseja realizar uma nova consulta.
         */
        do {

            System.out.println("\n=================================");
            System.out.println("     VERIFICAÇÃO PARA DIRIGIR");
            System.out.println("=================================");

            // Solicita a idade do usuário
            System.out.print("Qual é a sua idade? ");
            int idade = sc.nextInt();

            // Solicita a informação sobre emancipação
            System.out.print("Você é emancipado? (true/false): ");
            boolean emancipado = sc.nextBoolean();

            /*
             * Verifica se o usuário pode dirigir.
             *
             * A primeira condição verifica se a idade é igual
             * ou superior a 18 anos.
             *
             * A segunda condição verifica se a pessoa é emancipada
             * e possui pelo menos 16 anos.
             */
            if (idade >= 18 || (emancipado && idade >= 16)) {

                System.out.println("\nParabéns! Você pode dirigir.");

            } else {

                System.out.println("\nInfelizmente, você não pode dirigir.");
            }

            // Pergunta se o usuário deseja realizar uma nova consulta
            System.out.print("\nDeseja realizar uma nova consulta? (S/N): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("S"));

        // Mensagem exibida quando o usuário decide encerrar o programa
        System.out.println("\n=================================");
        System.out.println("\nPrograma encerrado!");
        System.out.println("Obrigado por utilizar o Programa Maior Idade para Dirigir.");
        System.out.println("Programa Desenvolvido por: Engenheiro de Software, Evanei Freitas.");
        System.out.println("=================================");

        // Fecha o Scanner
        sc.close();
    }
}


