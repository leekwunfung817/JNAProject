package itransceiver;
import jna.JNAApiInterface;
import com.sun.jna.Library;
public class ITransceiver {
    public static void main(String[] args) {
        // TODO code application logic here
        JNAApiInterface.INSTANCE.printf("Hello %s \n", "World");
    }
}