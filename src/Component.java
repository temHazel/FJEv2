package FunnyJsonExplorerv2.src;

import java.util.ArrayList;

public abstract class Component {
    public String key;
    public ArrayList<Component> childNodes;
    Component(String s){
        this.key = s;
        this.childNodes = new ArrayList<Component>();
    }
}
