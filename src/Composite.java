package FunnyJsonExplorerv2.src;

import java.util.ArrayList;

public class Composite extends Component {
    public String key;
    public ArrayList<Component> childNodes;
    Composite(String s){
        super(s);
        this.childNodes = new ArrayList<Component>();
    }
}
