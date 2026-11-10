package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class m76 {
    public static final Charset g = Charset.forName("UTF-8");
    public static final byte[] y;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        y = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int g(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
