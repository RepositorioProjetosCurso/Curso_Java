public class PrincipalTerciario {

    public static void main(String[] args) {

        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecoCusto(200);

        System.out.printf("Custos totais: %.2f", Produto.calcularCustosTotais(produto));
    }
}
