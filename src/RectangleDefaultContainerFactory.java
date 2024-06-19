package FunnyJsonExplorerv2.src;

public class RectangleDefaultContainerFactory implements ContainerFactory{
    public Container createContainer(){
        Strategy style = new RectangleStyle();
        Strategy icon = new DefaultIcon();
        return new Container(style, icon);
    }
}
