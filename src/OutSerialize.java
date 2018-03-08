import java.io.*;
import java.util.*;

public class OutSerialize {
    public static void serialize (People p, String path) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        out.writeObject(p);
        out.close();
    }
}
