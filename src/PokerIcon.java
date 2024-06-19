package FunnyJsonExplorerv2.src;

public class PokerIcon extends useIcon {
    public String getType(){
        return "useIcon";
    }
    public String getLeafIcon() {
        return "♢ "; // Poker face icon for intermediate nodes
    }
    public String getMiddleIcon() {
        return "♤ "; // Poker face icon for intermediate nodes
    }
    public void draw(Component n, Strategy iconFamily){
        System.err.println("Could not call this Function From Style!");
    }
}
