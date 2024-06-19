package FunnyJsonExplorerv2.src;

public interface Strategy {
    public String getType();
    public abstract void draw(Component n, Strategy useIcon);
    public abstract String getLeafIcon();
    public abstract String getMiddleIcon();
}
