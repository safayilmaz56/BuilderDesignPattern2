public class Araba { //product
    public String marka;
    public String model;
    public double km;
    public boolean vites;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public boolean isVites() {
        return vites;
    }

    public void setVites(boolean vites) {
        this.vites = vites;
    }

    @Override
    public String toString() {
        return getMarka() +" marka araba " + getModel() + "modelinde " + getKm() + " kilometrede " + isVites() + " vites olarak uretilmistir.";
    }
}
