public class Calculadora {

    static double calcularMedia(int[] numeros) {
        int total = 0;

//        Mesma coisa que o for com indice abaixo.
        for (int numero : numeros) {
            total += numero;
        }

//        for (int i = 0; i < numeros.length; i++) {
//            total += numeros[i];
//        }

//        numeros.fori (Metodo para criar um for mais rapido)

        return (double) total / numeros.length;
    }
}
