public class Principal {

    public static void main(String[] args) {

        Visitante visitante1 = new Visitante();
        visitante1.nome = "Pedro";
        visitante1.idade = 19;

        if (visitante1.possuiAcessoRestritoPorIdade()) {
            System.out.printf("Acesso não liberado para menores de %d%n", Visitante.IDADE_MINIMA_PARA_ACESSO);
        } else {
            System.out.println("Acesso liberado");
            System.out.println("Teste do Pull");

            CadastroPortaria cadastroPortaria = new CadastroPortaria();
            cadastroPortaria.cadastrar(visitante1, 5);
        }
    }
}
