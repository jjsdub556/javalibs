import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.output.DeferredFileOutputStream;

public class DeSerializingObject {
public static void main(String[] args) {
FileInputStream fis = null;
ObjectInputStream ois = null;
try {
fis = new FileInputStream("/opt/ysoserial/eWPTX/payload");
ois = new ObjectInputStream(fis);
Object x = ois.readObject();
ois.close();
fis.close();
} catch (IOException | ClassNotFoundException e) {
e.printStackTrace();
}
}
}
