public class testResta {

    /**
     * Valor acumulado para operaciones de resta.
     */
    private double valorAcumulado;

    /**
     * Constructor que inicializa el valor acumulado en cero.
     */
    public Resta() {
        this.valorAcumulado = 0;
    }

    /**
     * Resta dos números reales.
     *
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return Resultado de la resta a - b.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return Resultado de la resta a - b.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Resta tres números reales.
     *
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return Resultado de la resta a - b - c.
     */
    public double restar(double a, double b, double c) {
        return a - b - c;
    }

    /**
     * Realiza una resta con el valor acumulado.
     *
     * @param valor Número a restar del valor acumulado.
     * @return Nuevo valor acumulado después de la resta.
     */
    public double restarAcumulado(double valor) {
        this.valorAcumulado -= valor;
        return this.valorAcumulado;
    }

    /**
     * Obtiene el valor acumulado.
     *
     * @return Valor acumulado actual.
     */
    public double getValorAcumulado() {
        return this.valorAcumulado;
    }

    /**
     * Reinicia el valor acumulado a cero.
     */
    public void resetValorAcumulado() {
        this.valorAcumulado = 0;
    }

}

