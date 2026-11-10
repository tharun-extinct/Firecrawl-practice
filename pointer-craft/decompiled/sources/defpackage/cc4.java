package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface cc4 extends AutoCloseable {
    boolean H();

    default boolean e() {
        return getLong(0) != 0;
    }

    void g(int i);

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void l(int i, byte[] bArr);

    void m(String str, int i);

    void n(int i, long j);

    String q(int i);

    void reset();

    void v();
}
