package gerenciamentoaluguelcarro;

public class Aluguel {
    private Usuario usuario;
    private Carro carro;
    private final int quantidadeDias;
    private double kmInicial;
    private double kmFinal;
    private double valorTotalAluguel;

    public Aluguel(Usuario usuario, Carro carro, int quantidadeDias) {
        this.usuario = usuario;
        this.carro = carro;
        this.quantidadeDias = quantidadeDias;
    }

    

    public void cadastrarCarro(Carro carro) {
        this.carro = carro;
    }

    public void cadastrarUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void iniciarAluguel(double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public void fecharLocacao(double kmFinal) {
        this.kmFinal = kmFinal;

        double valorBase = quantidadeDias * carro.getValorPorKm();
        if (quantidadeDias > 20) {
            valorBase *= 0.8; // 20% de desconto
        } else if (quantidadeDias > 10) {
            valorBase *= 0.9; // 10% de desconto
        }

        valorTotalAluguel = valorBase * (kmFinal - kmInicial);
    }

    public String mostrarResumoLocacao() {
        String resumo = "Resumo Aluguel\n";
        resumo += "Cliente\n" + usuario.mostrarDados() + "\n";
        resumo += "Carro\n" + carro.mostrarDados() + "\n";
        resumo += "Aluguel\nQuantidade de dias: " + quantidadeDias + "\n";
        resumo += "Km Inicial: " + kmInicial + "\n";
        resumo += "Km Final: " + kmFinal + "\n";
        resumo += "Valor Total: R$" + valorTotalAluguel + "\n";
        return resumo;
    }
}
