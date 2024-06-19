package FunnyJsonExplorerv2.src;

public abstract class useIcon implements Strategy {
    public String getType(){
        return "useIcon";
    }
    public abstract String getLeafIcon();
    public abstract String getMiddleIcon();
}
