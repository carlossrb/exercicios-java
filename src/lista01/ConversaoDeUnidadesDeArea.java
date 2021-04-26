package lista01;

public class ConversaoDeUnidadesDeArea {
    public static double metro2ParaPe2(double value) {
        return value * 10.76;
    }

    public static double pe2ToCm2(double value) {
        return value * 929;
    }

    public static double milha2ParaAcres(double value) {
        return value * 640;
    }

    public static double AcreParaPe2(double value) {
        return value * 43560;
    }

    
    public static double metro2ParaCm2(double value) {
        return pe2ToCm2(metro2ParaPe2(value));
    }

}

