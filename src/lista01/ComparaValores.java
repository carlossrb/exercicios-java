package lista01;

public class ComparaValores {

    public static int maiorEntreDois(int valor1, int valor2) {
        return valor1 > valor2 ? valor1 : valor2;
    }

    public static double maiorEntreDois(double valor1, double valor2) {
        return valor1 > valor2 ? valor1 : valor2;
    }

    public static int maiorEntreTres(int valor1, int valor2, int valor3) {
        return maiorEntreDois(valor1, valor2) > valor3 ? maiorEntreDois(valor1, valor2) : valor3;
    }

    public static double maiorEntreTres(double valor1, double valor2, double valor3) {
        return maiorEntreDois(valor1, valor2) > valor3 ? maiorEntreDois(valor1, valor2) : valor3;
    }

    public static int maiorEntreQuatro(int valor1, int valor2, int valor3, int valor4) {
        if (maiorEntreTres(valor1, valor2, valor3) > valor4) {
            return maiorEntreTres(valor1, valor2, valor3);
        }
        return valor4;
    }

    public static double maiorEntreQuatro(double valor1, double valor2, double valor3, double valor4) {
        if (maiorEntreTres(valor1, valor2, valor3) > valor4) {
            return maiorEntreTres(valor1, valor2, valor3);
        }
        return valor4;
    }

    public static int maiorEntreCinco(int valor1, int valor2, int valor3, int valor4, int valor5) {
        if (maiorEntreQuatro(valor1, valor2, valor3, valor4) > valor5) {
            return maiorEntreQuatro(valor1, valor2, valor3, valor4);
        }
        return valor5;
    }

    public static double maiorEntreCinco(double valor1, double valor2, double valor3, double valor4, double valor5) {
        if (maiorEntreQuatro(valor1, valor2, valor3, valor4) > valor5) {
            return maiorEntreQuatro(valor1, valor2, valor3, valor4);
        }
        return valor5;
    }
}
