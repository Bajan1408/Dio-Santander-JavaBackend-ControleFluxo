import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n12Atenção: você deverá digitar dois números positivos, e o segundo número deverá ser maior que o primeiro. Não seja teimoso!\n");
        System.out.println("Digite o primeiro número positivo: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número positivo: ");
        int num2 = scanner.nextInt();

        try {
            analisarParametros(num1, num2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void analisarParametros(int num1, int num2) throws ParametrosInvalidosException {
        if(num1 >= num2) {
            throw new ParametrosInvalidosException("Atenção: o segundo número deverá ser maior que o primeiro!");
        }
        int contador = num2 - num1;
        System.out.println("Imprimindo os números do primeiro até o segundo parâmetro: ");
        for(int i = 0; i <= contador; i++) {
            System.out.println(num1 + i);
        }
    }
}
