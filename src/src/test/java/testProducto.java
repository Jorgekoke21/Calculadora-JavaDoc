public class testProducto {

    public class Producto {
        /**
         * Método que calcula el producto de dos números reales.
         *
         * @param num1 El primer número real.
         * @param num2 El segundo número real.
         * @return El producto de los dos números reales.
         */
        public double productoReal(double num1, double num2) {
            return num1 * num2;
        }

        /**
         * Método que calcula el producto de dos números enteros.
         *
         * @param num1 El primer número entero.
         * @param num2 El segundo número entero.
         * @return El producto de los dos números enteros.
         */
        public int productoEntero(int num1, int num2) {
            return num1 * num2;
        }

        /**
         * Método que calcula el producto de tres números reales.
         *
         * @param num1 El primer número real.
         * @param num2 El segundo número real.
         * @param num3 El tercer número real.
         * @return El producto de los tres números reales.
         */
        public double productoReal3(double num1, double num2, double num3) {
            return num1 * num2 * num3;
        }

        /**
         * Método que calcula la potencia de un número real.
         *
         * @param base El número base.
         * @param exponente La potencia al que se eleva el número base.
         * @return El resultado de la potencia.
         */
        public double potencia(double base, double exponente) {
            return Math.pow(base, exponente);
        }
    }

}
