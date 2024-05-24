
import java.io.*;

class MyObjectOutputStream extends ObjectOutputStream {


    MyObjectOutputStream(OutputStream o) throws IOException {
        super(o);
    }

    @Override
    public void writeStreamHeader() throws IOException {
    }
}

public class User implements Serializable {

    String name, gender, uname, pword;

    public User(String n, String g, String u, String p) {
        name = n;
        gender = g;
        uname = u;
        pword = p;
    }
}
