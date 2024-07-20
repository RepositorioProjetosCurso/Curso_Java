public class ServicoDePrecificacao {

    void definifirPrecoVenda(Produto produto, double percentualMargemLucro) {
        produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
    }
}
