public class Principal {

    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalDeAssentos = 100;

        System.out.printf("GOL (%s): %d assentos disponiveis%n", aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDisponiveis());
    }
}