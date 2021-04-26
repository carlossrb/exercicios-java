package atv01;

public class Lampada {
    private String tipo;
    private String estado;
    private String potencia;

    public Lampada() {
        this.tipo = "LED";
        this.estado = "Ligada";
        this.potencia = "60w";
    }

    public Lampada(String tipo, String estado, String potencia) {
        this.tipo = tipo;
        this.estado = estado;
        this.potencia = potencia;
    }

    public String[] getValues(){
        return new String[] {tipo, estado, potencia};
    }
}