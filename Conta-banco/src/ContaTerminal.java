public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        System.out.println("--- Primeio Cenario --- ");
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("valor Solicitado: " + valorSolicitado);

        if(valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Saldo Atual: " + saldo);
    }
}
