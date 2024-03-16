import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcaoMenuDeOperacoes = 0;

        System.out.println("Digite seu nome completo:");
        String nomeDoUsuario = leitura.nextLine();

        System.out.println("Digite se o tipo da sua conta é 'Corrente' ou 'Poupança':");
        String tipoDaConta = leitura.nextLine();

        System.out.println("Digite seu saldo inicial:");
        double saldoInicial = leitura.nextDouble();

        System.out.printf("""
                ********************************************\s
                Nome:           %s
                Tipo conta:     %s
                Saldo inicial:  R$%.2f
                ********************************************""", nomeDoUsuario, tipoDaConta, saldoInicial);
        while (opcaoMenuDeOperacoes != 4) {
            System.out.println("""


                    Operações

                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair

                    Digite a opção desejada:""");

            opcaoMenuDeOperacoes = leitura.nextInt();
            if (opcaoMenuDeOperacoes < 1 || opcaoMenuDeOperacoes > 4){
                System.out.println("Opção inválida!");
            } else {
                switch (opcaoMenuDeOperacoes){
                    case 1:
                        System.out.printf("O saldo atual é de R$%.2f", saldoInicial);
                        break;
                    case 2:
                        System.out.println("Informe o valor a receber:");
                        double valorAReceber = leitura.nextDouble();
                        saldoInicial += valorAReceber;
                        System.out.printf("Saldo atualizado: R$%.2f", saldoInicial);
                        break;
                    case 3:
                        System.out.println("Informe o valor que deseja transferir:");
                        double valorATransferir = leitura.nextDouble();
                        if (valorATransferir > saldoInicial){
                            System.out.println("Não há saldo suficiente para fazer essa transferência.");
                        } else {
                            saldoInicial -= valorATransferir;
                            System.out.printf("Saldo atualizado: R$%.2f", saldoInicial);
                        }
                        break;
                    case 4:
                        System.out.println("Saindo da aplicação! Obrigada pela preferência!");
                        break;
                }
            }
        }
    }
}