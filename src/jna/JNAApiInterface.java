package jna;
import com.sun.jna.*;
public interface JNAApiInterface extends Library {
    JNAApiInterface INSTANCE = (JNAApiInterface) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"), JNAApiInterface.class);
    void printf(String format, Object... args);
    int sprintf(byte[] buffer, String format, Object... args);
    int scanf(String format, Object... args);
}