package lista01;

public class VolumeDePiscinaOlimpica extends ConversaoDeUnidadesDeVolume {
    private final static int volume = 1890;

    public static void main(String args[]) {
        getValorLitros();
        getValorPe3();
    }

    public static void getValorLitros() {
        System.out.printf("O volume da piscina em litros: %s \n", metro3ParaLitro(volume));
    }

    public static void getValorPe3() {
        System.out.printf("O volume da piscina em pé cúbico : %s \n", metro3ParaPe3(volume));
    }

    public static void getValorCm3() {
        System.out.printf("O volume da piscina em centímetro cúbico : %s \n", metro3ParaCm3(volume));
    }

}
