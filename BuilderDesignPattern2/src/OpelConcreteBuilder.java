public class OpelConcreteBuilder extends AbstractArabaBuilder{

    public OpelConcreteBuilder() {
        araba = new Araba();
    }

    @Override
    public void setMarka() {
        araba.marka = "Opel";
    }

    @Override
    public void setModel() {
        araba.model = "Astra";
    }

    @Override
    public void setKM() {
        araba.km = 100;
    }

    @Override
    public void setVites() {
        araba.vites = true;
    }
}
