public class Aeronave {

    boolean ativo = true;
    int totalDeAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalDeAssentos - assentosReservados;
    }

    void reservarAssentos(int numeroDeAssentos) {
        if (ativo) {
            assentosReservados += numeroDeAssentos;
            System.out.printf("Foram reservados %d assentos.%n", assentosReservados);
        } else {
            System.out.println("Aeronave desativada");
        }
    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }
}
