package FunnyJsonExplorerv2.src;

import java.util.ArrayList;
import java.util.List;

public class Leaf extends Component {
    public String key;
    public String value;
    public List<Component> childNodes = null;
    // 构造函数
    Leaf(String key, String value) {
        super(key);
        this.value = value;
        this.childNodes = new ArrayList<Component>();
    }
}
