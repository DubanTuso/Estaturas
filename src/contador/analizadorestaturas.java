
package contador;


public class analizadorestaturas {
    private double[] estaturas;

    // Constructor que recibe el arreglo de estaturas
    public analizadorestaturas(double[] estaturas) {
        this.estaturas = estaturas;
    }

    // Método para determinar la estatura mayor
    public double determinarEstaturaMayor() {
        double mayor = estaturas[0];
        for (double estatura : estaturas) {
            if (estatura > mayor) {
                mayor = estatura;
            }
        }
        return mayor;
    }

    // Método para determinar la estatura menor
    public double determinarEstaturaMenor() {
        double menor = estaturas[0];
        for (double estatura : estaturas) {
            if (estatura < menor) {
                menor = estatura;
            }
        }
        return menor;
    }
}
