package FunnyJsonExplorerv2.src;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConfigIcon extends useIcon {
    private static String leafIcon;
    private static String middleIcon;

    // Static block to read from YAML file once when the class is loaded
    static {
        try {
            // Read file content as a string
            String content = new String(Files.readAllBytes(Paths.get("config.yaml")), StandardCharsets.UTF_8);
            String[] lines = content.split("\\n");

            leafIcon = lines[3].replaceAll("\\s", "")+" ";
            middleIcon = lines[1].replaceAll("\\s", "")+" ";
            System.out.println("LeafIcon:"+leafIcon);
            System.out.println("MiddleIcon:"+middleIcon);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load icons from config.yaml", e);
        }
    }

    @Override
    public String getLeafIcon() {
        return leafIcon;
    }

    @Override
    public String getMiddleIcon() {
        return middleIcon;
    }

    public void draw(Component n, Strategy iconFamily){
        System.err.println("Could not call this Function From Style!");
    }
}
