public class BMWConcreteBuilder extends AbstractArabaBuilder {
    public BMWConcreteBuilder() {
        araba = new Araba();
    }

    @Override
    public void setMarka() {
        araba.marka = "BMW";
    }

    @Override
    public void setModel() {
        araba.model = "X30";
    }

    @Override
    public void setKM() {
        araba.km = 25;
    }

    @Override
    public void setVites() {
        araba.vites = true;
    }
}
