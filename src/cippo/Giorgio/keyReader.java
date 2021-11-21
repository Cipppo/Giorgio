package cippo.Giorgio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class keyReader {
    
    private final File file;
    
    public keyReader(File file) {
        this.file = file;
    }
    
    public String read() throws IOException {
        final BufferedReader r = new BufferedReader(new FileReader(this.file));
        final String s = r.readLine();
        r.close();
        return s;
    }
}
