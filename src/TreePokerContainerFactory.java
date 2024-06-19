package FunnyJsonExplorerv2.src;

public class TreePokerContainerFactory implements ContainerFactory{
    public Container createContainer(){
        Strategy style = new TreeStyle();
        Strategy icon = new PokerIcon();
        return new Container(style, icon);
    }
}