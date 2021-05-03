package heranca02;

public class Automovel {
    public static final byte MOVIDOAGASOLINA = 1;
    public static final byte MOVIDOAALCOOL = 2;
    public static final byte MOVIDOADIESEL = 3;
    public static final byte MOVIDOAGAS = 4;
    private static final byte NUMEROMAXIDEPRESTACOES = 24;
    private String modelo;
    private String cor;
    private byte combustivel;

    Automovel(String m, String c, byte comb) {
        modelo = m;
        cor = c;
        combustivel = comb;
    }

    public float quantoCusta() {
        float preco = 0;
        switch (combustivel) {
            case MOVIDOAGASOLINA:
                preco = 12000.0f;
            case MOVIDOAALCOOL:
                preco = 10500.0f;
            case MOVIDOADIESEL:
                preco = 11000.0f;
            case MOVIDOAGAS:
                preco = 13000.0f;
        }
        return preco;
    }

    public byte quantasPrestacoes() {
        return NUMEROMAXIDEPRESTACOES;
    }

    public String toString() {
        String resultado;
        resultado = modelo + " " + cor + "\n";
        switch (combustivel) {
            case MOVIDOAGASOLINA:
                resultado += "Movido a Gasolina\n";
                break;
            case MOVIDOAALCOOL:
                resultado += "Movido a  lcool\n";
                break;
            case MOVIDOADIESEL:
                resultado += "Movido a Diesel\n";
                break;
            case MOVIDOAGAS:
                resultado += "Movido a G s\n";
                break;
        }
        return resultado;
    }

}
