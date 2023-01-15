public abstract class AbstractArabaBuilder { //abstract builder
    protected Araba araba;

    public Araba getAraba(){
        return araba;
    }

    public abstract void setMarka();
    public abstract void setModel();
    public abstract void setKM();
    public abstract void setVites();
}
