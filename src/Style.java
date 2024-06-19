package FunnyJsonExplorerv2.src;

public abstract class Style implements Strategy {
    public String getType(){
        return "Style";
    }
    public String ComponentType = "Style";
    public abstract void draw(Component n, Strategy iconFamily);
}


