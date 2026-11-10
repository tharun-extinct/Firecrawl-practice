package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class w8 {
    public static final Class g;
    public static final boolean y;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        g = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        y = cls2 != null;
    }

    public static boolean g() {
        return (g == null || y) ? false : true;
    }
}
