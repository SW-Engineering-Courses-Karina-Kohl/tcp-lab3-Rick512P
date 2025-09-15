public abstract class FiguraGeometrica {
    private String Cor;
    private String ID;
    private static int TotalFiguras = 0;
    public FiguraGeometrica(String Cor) {
        this.Cor = Cor;
        this.ID = String.format("F%05d", TotalFiguras);
        TotalFiguras++;
    }
    public String getCor() {
        return Cor;
    }
    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public static int getTotalFiguras() {
        return TotalFiguras;
    }
    public String getInfo() {
        return "Cor: " + Cor + ", ID: " + ID;
    }
    public abstract String getDetalhes();
}
