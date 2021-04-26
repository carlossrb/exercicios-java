package atv01;

public class Linha {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Linha(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Linha(double x2, double y2) {
        this.x1 = 0.0;
        this.x2 = x2;
        this.y1 = 0.0;
        this.y2 = y2;
    }

    public double[] getCoordenates() {
        return new double[] { x1, x2, y1, y2 };
    }
}
