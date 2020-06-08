package cc.fovea.openwith;

public interface AsyncReader<T>{
    void onData(T data, int readedData);
    void onError(Exception error);
}
