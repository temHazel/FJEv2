package FunnyJsonExplorerv2.src;

public class Iterator {
    private int index;
    private Component root;
    Iterator(Component root){
        this.root = root;
        index = 0;
    }
    public Component getNextNode(){
        if(root.childNodes==null) return null;
        if(index<root.childNodes.size()){
            return root.childNodes.get(index++);
        }
        return null;
    }
    public Boolean isEnd(){
        return index == root.childNodes.size();
    }
}
