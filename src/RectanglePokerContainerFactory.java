package FunnyJsonExplorerv2.src;

public class RectanglePokerContainerFactory implements ContainerFactory{
    public Container createContainer(){
        Strategy style = new RectangleStyle();
        Strategy icon = new PokerIcon();
        return new Container(style, icon);
    }
}
