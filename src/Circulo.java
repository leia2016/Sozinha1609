public class Circulo {

    private double raio;

    public Circulo() {
        this.raio = 15.0;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularDiametro() {
        return 2 * raio; // diâmetro = 2 * raio
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio; // perímetro = 2 * π * raio
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2); // área = π * raio^2
    }

    public void exibirDados() {
        System.out.println("Raio: " + raio);
        System.out.println("Diâmetro: " + calcularDiametro());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
}
