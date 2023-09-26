import gerenciamentoaluguelcarro.Aluguel;
import gerenciamentoaluguelcarro.Carro;
import gerenciamentoaluguelcarro.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Rogério", "123.123.123-11", "(11)1111-1111");
        Carro carro = new Carro("HB20", "Hyundai", 5.0);
        Aluguel aluguel = new Aluguel(usuario, carro, 1);

        aluguel.iniciarAluguel(100);
        aluguel.fecharLocacao(200);

        String resumo = aluguel.mostrarResumoLocacao();
        System.out.println(resumo);
    }
}
    

