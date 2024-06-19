package FunnyJsonExplorerv2.src;

public class DefaultIcon extends useIcon {
    public String getType(){
        return "useIcon";
    }
    public String getLeafIcon() {
        return "☁ "; // Default icon
    }
    public String getMiddleIcon() {
        return "☀ "; // Default icon
    }
    public void draw(Component n, Strategy iconFamily){
        System.err.println("Could not call this Function From Style!");
    }
}

