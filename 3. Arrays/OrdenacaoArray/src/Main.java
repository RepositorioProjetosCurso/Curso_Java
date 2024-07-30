import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Integer[] notas = {10, 5, 8, 9, 7};

//        Ordem Crescente!!
        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));

//        Ordem Decrescente!!
        Arrays.sort(notas, Comparator.reverseOrder());
        System.out.println(Arrays.toString(notas));
    }
}