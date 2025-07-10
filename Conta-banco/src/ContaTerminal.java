public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        // Segundo cenário de teste
        saldo = 15.0;
        valorSolicitado = 22.0;

        System.out.println("--- Segundo Cenário ---");
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("Valor Solicitado: " + valorSolicitado);

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Saldo Final: " + saldo);
        System.out.println("-----------------------");
    }
}
