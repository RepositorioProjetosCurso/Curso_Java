public class ServicoDePrecificacao {

    void definifirPrecoVenda(Produto produto, double percentualMargemLucro) {

        double precoVendaCalculado = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
