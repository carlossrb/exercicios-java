package lista01;

public class CampoDeFutebol extends ConversaoDeUnidadesDeArea {
    private final static double area = 8250.00;

    public static void main(String args[]) {
        getValorEmPe2();
        getValorEmCm2();
    }

    public static void getValorEmPe2() {
        System.out.printf("O tamanho do campo em pés quadrados é: %s \n", metro2ParaPe2(area));
    }

    public static void getValorEmCm2() {
        System.out.printf("O tamanho do campo em acres é: %s \n", metro2ParaCm2(area));
    }
}
