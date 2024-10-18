package semana4.ejercicio1;

public class Config {
    private static Config instancia;

    private String configGeneral;
    private int time;

    private Config() {
        this.configGeneral = "Configuracion por defecto";
        this.time = 30;
    }

    public static Config getInstancia() {
        if (instancia == null) {
            instancia = new Config();
        }
        return instancia;
    }

    public String getConfigGeneral() {
        return configGeneral;
    }

    public void setConfigGeneral(String configGeneral) {
        this.configGeneral = configGeneral;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
