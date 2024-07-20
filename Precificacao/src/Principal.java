public class Principal {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.precoCusto = 100;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definifirPrecoVenda(produto1, 20);

        System.out.printf("Preço: %.2f%n", produto1.precoVenda);
    }
}