public class Principal {

    public static void main(String[] args) {
        Produto.custoEmbalagem = 10;

        Produto produto1 = new Produto();
        // produto1.precoCusto = 100;
        produto1.alterarPrecoCusto(80);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definifirPrecoVenda(produto1, 20);

        System.out.printf("Preço Custo: %.2f%n", produto1.precoCusto);
        System.out.printf("Preço Venda: %.2f%n", produto1.precoVenda);
    }
}