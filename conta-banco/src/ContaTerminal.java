import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta = 1000;
        int numeroAgencia = 1010;
        String nomeCliente = "undefined";
        double saldoCliente = 254.99;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        numeroConta = scanner.nextInt();
        
        System.out.println("Digite o número da agência:");
        numeroAgencia = scanner.nextInt();

        scanner.nextLine();
        
        System.out.println("Digite o seu nome completo");
        nomeCliente = scanner.nextLine();

        System.out.print("Buscando saldo do cliente");
        for(int i=0; i < 5; i++) { 
            Thread.sleep(300); 
            System.out.print(".");
        }

        System.out.println("\n");
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " \ne seu saldo de R$ " + saldoCliente + " já está disponível para saque.");
        System.out.println("\n");
        System.out.println("\nObrigado!");

        scanner.close(); 
    }
}
