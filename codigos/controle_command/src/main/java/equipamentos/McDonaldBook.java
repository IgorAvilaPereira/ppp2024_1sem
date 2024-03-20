package equipamentos;

public class McDonaldBook {
    private String name;
    private String hardware;

    public void ligar(){
        System.out.println("ligar");
    }

    public void ligarModoDesempenho(){
        System.out.println("mode on");
    }

    public void powerOff(){
        System.out.println("Desligando...");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHardware() {
        return hardware;
    }
    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    

}
