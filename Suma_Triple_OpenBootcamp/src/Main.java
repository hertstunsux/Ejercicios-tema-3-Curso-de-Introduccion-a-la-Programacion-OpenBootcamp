public class Main {
        public static void main (String[] args) {
            int num_1 = 1;
            int num_2 = 2;
            int num_3 = 3;
            int resultado = suma_tres_enteros(num_1,num_2,num_3);
            System.out.println(resultado);
        }

        public static int suma_tres_enteros(int a, int b, int c){
            return a + b + c;
        }
}
