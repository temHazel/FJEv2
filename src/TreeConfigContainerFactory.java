package FunnyJsonExplorerv2.src;

public class TreeConfigContainerFactory implements ContainerFactory{
    public Container createContainer(){
        Strategy style = new TreeStyle();
        Strategy icon = new ConfigIcon();
        return new Container(style, icon);
    }
}