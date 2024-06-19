package FunnyJsonExplorerv2.src;

public class TreeDefaultContainerFactory implements ContainerFactory{
    public Container createContainer(){
        Strategy style = new TreeStyle();
        Strategy icon = new DefaultIcon();
        return new Container(style, icon);
    }
}
