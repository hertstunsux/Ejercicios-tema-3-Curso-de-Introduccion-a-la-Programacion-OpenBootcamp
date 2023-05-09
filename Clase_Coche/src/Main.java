
public class Main {
    public static void main(String[] args) {
        Coche micoche = new Coche();
        micoche.Aumentar_puertas();
        System.out.println(micoche.num_puertas);
    }
}
class Coche {
    public int num_puertas = 4;
    public void Aumentar_puertas(){
        this.num_puertas++;
    }
}