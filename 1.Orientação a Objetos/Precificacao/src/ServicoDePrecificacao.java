public class ServicoDePrecificacao {

    void definifirPrecoVenda(Produto produto, double percentualMargemLucro) {

        double precoVendaCalculado = Calculos.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
