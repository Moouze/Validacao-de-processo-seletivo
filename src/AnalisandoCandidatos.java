import java.util.Scanner;

public class AnalisandoCandidatos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja vem vindo a entrevista");
        System.out.println("digite o salário pretendido: ");

        double salario = sc.nextDouble();
        sc.close();

        analisarCandidato(salario);


    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {

            System.out.println("Ligar para o candidato");

        } else if (salarioBase == salarioPretendido) {

            System.out.println("Ligar para o candidato com contra proposta");

        } else

            System.out.println("Aguardando o resultado dos demais candidatos");
    }
}
