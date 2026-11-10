package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class od0 {
    public static final Charset g;
    public static final Charset n;
    public static final Charset r;
    public static volatile Charset v;
    public static volatile Charset x;
    public static final Charset y;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        g = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        charsetForName2.getClass();
        y = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        charsetForName3.getClass();
        r = charsetForName3;
        Charset.forName("US-ASCII").getClass();
        Charset charsetForName4 = Charset.forName("ISO-8859-1");
        charsetForName4.getClass();
        n = charsetForName4;
    }
}
