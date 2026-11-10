package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xg2 {
    public static final Integer g;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        g = num2;
    }
}
