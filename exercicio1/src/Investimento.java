public class Investimento {

    private int investimentoInicial;
    private double taxaJuros;
    private int tempoInvestimento;

    public Investimento(int investimentoInicial, double taxaJuros, int tempoInvestimento) {
        this.investimentoInicial = investimentoInicial;
        this.taxaJuros = taxaJuros;
        this.tempoInvestimento = tempoInvestimento;
    }

    public static double calcularRetorno (int investimentoInicial, double taxaJuros, int tempoInvestimento) {
        return investimentoInicial * Math.pow(1 + taxaJuros / 100, tempoInvestimento);
    }


    public static String classificarInvestidor(int investimentoInicial) {
        if (investimentoInicial < 10000) {
            return "Pequeno investidor";
        } else if (investimentoInicial >= 10000 && investimentoInicial < 100000) {
            return "Médio investidor";
        } else {
            return "Grande investidor";
        }
    }

    // Getters e setters podem ser adicionados se necessário
}
