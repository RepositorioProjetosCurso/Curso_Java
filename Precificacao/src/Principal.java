public class Principal {

    public static void main(String[] args) {
        double precoCompraFornecedor = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        double precoVenda = servicoDePrecificacao.calcularPrecoDeVenda(precoCompraFornecedor);

        System.out.printf("Preço: %.2f%n", precoVenda);
    }
}