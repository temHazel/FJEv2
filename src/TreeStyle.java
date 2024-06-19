package FunnyJsonExplorerv2.src;
import java.util.ArrayList;

public class TreeStyle extends Style {
    public String getType(){
        return "Style";
    }
    public void draw(Component root, Strategy IconFamily){
        ArrayList<Boolean> boolArray = new ArrayList<>();
        printTree(root, 0, IconFamily, boolArray);
    }
    private void printTree(Component node, int level, Strategy iconFamily, ArrayList<Boolean> boolArray) {
        String indent = "\u2502  ".repeat(level); // Calculate indentation based on the level
        boolArray.add(false);

        int childCount = node.childNodes.size();
        int currentIndex = 0;
        Iterator iter = new Iterator(node);

        while (!iter.isEnd()) {
            Component child = iter.getNextNode();
            currentIndex++;
            boolean isLastEntry = currentIndex == childCount;

            // Determine icon based on whether the entry is a leaf or a subtree
            String icon = (child instanceof Composite) ? iconFamily.getMiddleIcon() : iconFamily.getLeafIcon();
            String connector = isLastEntry ? "\u2514\u2500" : "\u251C\u2500";

            // Adjust indent for subsequent entries at the same level
            indent = "";
            if (!isLastEntry) {
            } else {
                boolArray.set(level, true);
            }
            for (int i = 0; i < level; ++i) {
                if (boolArray.get(i)) {
                    indent += "   ";
                } else {
                    indent += "\u2502  ";
                }
            }

            if (indent.equals("  "))
                System.out.println(11111);
            System.out.print(indent + connector + icon + child.key); // Print key with icon

            if (child instanceof Composite) {
                // If the value is a Composite, print a new line and recursively print the subtree
                System.out.println();
                printTree(child, level + 1, iconFamily, boolArray);
            } else {
                Leaf leaf = (Leaf) child;
                // If the value is a Leaf, print the value on the same line
                if (leaf.value != null)
                    System.out.print(": " + leaf.value);
                System.out.println("");
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
