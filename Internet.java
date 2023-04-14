import java.util.*;

public class Internet{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int mb, valor;
        
        System.out.println("Informe quantos Mb's foram gastos:");
        mb = input.nextInt();
        if (mb > 100) {
            valor = (mb - 100) * 2 + 40;
            System.out.println("valor à ser pago: R$" + valor + ",00");
        } else {
            System.out.println("Valor à ser pago: R$40,00");
        }
    }
}

