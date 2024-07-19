public class Principal {

    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalDeAssentos = 100;

        aviaoGol.desativar();
        aviaoGol.ativar();

        aviaoGol.reservarAssentos(10);

        System.out.printf("GOL (%s): %d assentos disponiveis%n", aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDisponiveis());

        Aeronave aviaoLatam = new Aeronave();
        aviaoLatam.totalDeAssentos = 120;

        aviaoLatam.desativar();

        aviaoLatam.reservarAssentos(30);

        System.out.printf("LATAM (%s): %d assentos disponiveis%n%n", aviaoLatam.ativo ? "Ativo" : "Inativo", aviaoLatam.calcularAssentosDisponiveis());
    }
}