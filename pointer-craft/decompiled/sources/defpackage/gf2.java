package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class gf2 {
    public static final Charset g;
    public static final byte[] y;

    static {
        Charset.forName("US-ASCII");
        g = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        y = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new oi0(bArr, 0, 0, false).q(0);
        } catch (ig2 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        l0.q(str);
    }

    public static int y(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
