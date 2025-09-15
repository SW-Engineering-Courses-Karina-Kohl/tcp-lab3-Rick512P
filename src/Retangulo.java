public class Retangulo extends FiguraGeometrica implements CalculosGeometricos{
    private double Comprimento;
    private double Altura;

    public Retangulo(String Cor, double Comprimento,  double Altura) {
        super(Cor);
        this.Comprimento = Comprimento;
        this.Altura = Altura;
    }

    public double getComprimento() {
        return Comprimento;
    }
    public void setComprimento(double Comprimento) {
        this.Comprimento = Comprimento;
    }
    public double getAltura() {
        return Altura;
    }
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    @Override
    public double calcularArea() {
        return Comprimento*Altura;
    }
    @Override
    public double calcularPerimetro() {
        return (2*Comprimento) + (2*Altura);
    }
    public String getTipoFigura() {
        return "Retângulo";
    }

    @Override
    public String getInfo(){
        return "Tipo: Retângulo, " + super.getInfo();
    }
    public String getDetalhes(){
        String Infos = getInfo();
        return Infos + ", Número de Lados: 4, Comprimento: " + Comprimento + ", Altura: " + Altura;
    }
}
