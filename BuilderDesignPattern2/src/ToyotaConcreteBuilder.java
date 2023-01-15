public class ToyotaConcreteBuilder extends AbstractArabaBuilder{

    public ToyotaConcreteBuilder() {
        araba = new Araba();
    }

    @Override
    public void setMarka() {
        araba.marka = "Toyota";
    }

    @Override
    public void setModel() {
        araba.model = "Corolla";
    }

    @Override
    public void setKM() {
        araba.km = 150;
    }

    @Override
    public void setVites() {
        araba.vites = true;
    }
}
