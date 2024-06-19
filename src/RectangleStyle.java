package FunnyJsonExplorerv2.src;

public class RectangleStyle extends Style{
    public String getType(){
        return "Style";
    }

    public void draw(Component n, Strategy iconFamily) {
        int isParentEnd = -1;
        printRectangle(n, 0, iconFamily, isParentEnd);
    }

    private void printRectangle(Component node, int level, Strategy iconFamily, int isParentEnd) {
        String indent = "   ".repeat(level); // Calculate indentation based on the level
        int Rectanglelen = 60;
        int currentlen = 0;
        Iterator iter = new Iterator(node);

        while(!iter.isEnd()) {
            Component nextNode = iter.getNextNode();
            // System.out.print(nextNode.childNodes.size());
            currentlen = 0;
            Boolean isLastChild = iter.isEnd();

            // Adjust indent for subsequent entries at the same level
            if(isParentEnd==-1){
                indent = "\u250C\u2500\u2500";
            }else if(isParentEnd==1&&isLastChild){
                indent = "\u2514\u2500\u2500";
            }else{
                indent = "\u2502  ".repeat(level);
            }
            
            // Determine icon based on whether the entry is a leaf or a subtree
            String icon = (nextNode.childNodes!=null) ? iconFamily.getMiddleIcon() : iconFamily.getLeafIcon();
            String connector = indent=="\u2514\u2500\u2500" ? "\u2514\u2500\u2500" : "\u251C\u2500\u2500";
            if(isParentEnd==-1){
                connector = "\u2500\u2500\u2500";
            }
            if(level==0){
                if(isParentEnd==-1) connector = "";
                isParentEnd = isLastChild?1:0;
            }

            System.out.print(indent + connector + icon + nextNode.key); // Print key with icon
            currentlen += (indent + connector + icon + nextNode.key).length();

            if (nextNode.childNodes!=null) {
                // If the value is a Map, print a new line and recursively print the subtree
                String endStr = "\u2500".repeat(Rectanglelen-currentlen);
                if(indent=="\u250C\u2500\u2500"){
                    endStr+="\u2510";
                }
                else if(indent=="\u2514\u2500\u2500"){
                    endStr+="\u2518";
                }
                else{
                    endStr+="\u2524";
                }
                System.out.print(endStr);
                System.out.println();
                if(isParentEnd==1&&isLastChild){
                    printRectangle(nextNode, level + 1, iconFamily, 1);
                }else{
                    printRectangle(nextNode, level + 1, iconFamily, 0);
                }
            } else {
                Leaf leaf = (Leaf)nextNode;
                // If the value is not a Map, print the value on the same line
                if(leaf.value!=null){
                    System.out.print(": " + leaf.value);
                    currentlen += 2 + leaf.value.length();
                }
                String endStr = "\u2500".repeat(Rectanglelen-currentlen);
                if(indent=="\u250C\u2500\u2500"){
                    endStr+="\u2510";
                }
                else if(indent=="\u2514\u2500\u2500"){
                    endStr+="\u2518";
                }
                else{
                    endStr+="\u2524";
                }
                System.out.println(endStr);
            }
        }
    }
    public String getMiddleIcon(){
        System.err.println("Could not call this Function From Style!");
        return null;
    }
    public String getLeafIcon(){
        System.err.println("Could not call this Function From Style!");
        return null;
    }
}
