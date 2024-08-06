import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numeroJogos01 = {20, 30, 14, 25, 89};
        int[] numeroJogos02 = Arrays.copyOf(numeroJogos01, numeroJogos01.length + 1);
        numeroJogos02[numeroJogos02.length - 1] = 93;

        System.out.println(Arrays.toString(numeroJogos01));
        System.out.println(Arrays.toString(numeroJogos02));
    }
}