package gerenciamentoaluguelcarro;

public class Carro {
    private String modelo;
    private String marca;
    private double valorPorKm;

    public Carro(String modelo, String marca, double valorPorKm) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorPorKm = valorPorKm;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }

    public String mostrarDados() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nValor por Km: " + valorPorKm;
    }
}
