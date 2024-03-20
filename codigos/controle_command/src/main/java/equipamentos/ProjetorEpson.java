package equipamentos;

public class ProjetorEpson {
    private int lumens;
    private String modelo;

    public void on(){
        System.out.println("on projetor");
    }

    public void off(){
        System.out.println("off projetor");
    }

    public void enableHDMI(){
        System.out.println("hdmi on em projetor epson");
    }

}
