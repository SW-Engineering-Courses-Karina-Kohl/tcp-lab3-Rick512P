public class TrianguloEquilatero extends FiguraGeometrica implements CalculosGeometricos {
    private double Lado;

    public TrianguloEquilatero(String Cor, double Lado) {
        super(Cor);
        this.Lado = Lado;
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double Lado) {
        this.Lado = Lado;
    }
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(Lado, 2);
    }
    public double calcularPerimetro() {
        return 3 * Lado;
    }

    public String getTipoFigura(){
        return  "Triângulo Equilátero";
    }
    public String getInfo(){
        return "Tipo: Triangulo Equilátero, " + super.getInfo();
    }
    public String GetDetales(){
        String Infos = getInfo();
        return Infos + ", Número de Lados: 3, Tamanho do(s) Lados: " + Lado;
    }
}
