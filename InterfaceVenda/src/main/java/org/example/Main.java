package org.example;

public class Main {

    public static void main(String[] args) {


        Venda v = new Venda();
        v.setTotalVendido(350.0);

        // Teste com pagamento a vista
        RegraDePagamento pagamento = new PagamentoAVista();
        v.setPagamento(pagamento);
        System.out.println(v.calcularTotal()); // Saída 315.0

        // Teste com pagamento a prazo
        v.setPagamento(new PagamentoAPrazo());
        System.out.println(v.calcularTotal()); // Saída 378.0
    }


}
