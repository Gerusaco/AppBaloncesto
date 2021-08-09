package modelos;

public class Estadistica {

    private float ppp;
    private float rpp;
    private float app;


    public Estadistica(float ppp, float rpp, float app) {
        this.ppp = ppp;
        this.rpp = rpp;
        this.app = app;
    }

    public float getPpp() {
        return ppp;
    }

    public void setPpp(float ppp) {
        this.ppp = ppp;
    }

    public float getRpp() {
        return rpp;
    }

    public void setRpp(float rpp) {
        this.rpp = rpp;
    }

    public float getApp() {
        return app;
    }

    public void setApp(float app) {
        this.app = app;
    }

    @Override
    public String toString() {
        return "ppp=" + ppp +
                ", rpp=" + rpp +
                ", app=" + app;
    }
}
