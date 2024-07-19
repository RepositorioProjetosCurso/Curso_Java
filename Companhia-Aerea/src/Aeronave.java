public class Aeronave {

    boolean ativo = true;
    int totalDeAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalDeAssentos - assentosReservados;
    }
}
