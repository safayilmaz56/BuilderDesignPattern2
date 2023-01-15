public class Main {
    public static void main(String[] args) {
        AbstractArabaBuilder araba = new OpelConcreteBuilder();
        ArabaUret uret = new ArabaUret();
        uret.arabaUret(araba);

        System.out.println(araba.araba.toString());
        System.out.println("************************");
        araba = new ToyotaConcreteBuilder();
        uret.arabaUret(araba);
        System.out.println(araba.araba.toString());

    }
}