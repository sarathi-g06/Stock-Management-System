
import java.io.*;

public class UserAction {

    public static void add(User ob1) throws Exception {
        File f = new File("user.txt");
        try {
            if (f.length() == 0) {
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt", true))) {
                    oos.writeObject(ob1);
                }
            } else {
                try (MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream("user.txt",
                        true))) {
                    oos.writeObject(ob1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Occurred" + e);
        }
    }

    public static boolean search(String u, String p) throws Exception {
        try (ObjectInputStream fread = new ObjectInputStream(new FileInputStream("user.txt"))) {
            User ob;
            while (true) {
                try {
                    ob = (User) fread.readObject();
                    if (ob.uname.equals(u) && ob.pword.equals(p)) {
                        fread.close();
                        return true;
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        }
        return false;
    }
}
