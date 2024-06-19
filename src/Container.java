package FunnyJsonExplorerv2.src;

import java.util.Map;

public class Container {
    private Strategy style;
    private Strategy Icon;
    public Component rootNode;
    public Container(){}
    public Container(Strategy style, Strategy icon){
        this.add(style);
        this.add(icon);
    }

    public void construct(Map<String, Object> json, Component root) {
        if(root == null){
            root = new Composite(""); // Root node doesn't need a key
        }
    
        for (Map.Entry<String, Object> entry : json.entrySet()) {
            if (entry.getValue() instanceof Map) {
                Component childNode = new Composite(entry.getKey());
                // childNode.childNodes = new ArrayList<Component>();
                construct((Map<String, Object>) entry.getValue(), childNode);
                root.childNodes.add(childNode);
            } else {
                Component leafNode = new Leaf(entry.getKey(), (String)entry.getValue());
                root.childNodes.add(leafNode);
            }
        }

        this.rootNode = root;
    }
    
    public void add(Strategy strategy){
        if(strategy.getType() == "Style"){
            this.style = strategy;
        }
        else if(strategy.getType() == "useIcon"){
            this.Icon = strategy;
        }
        else{
            System.out.println(11111);
        }
    }
    public void draw(){
        if(style==null||Icon==null){
            throw new IllegalStateException("Missing style or icon component");
        }
        this.style.draw(this.rootNode, this.Icon);
    }
}
