package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class oz1 {
    public static final oz1 a;
    public static final oz1 j;
    public static final oz1 m;
    public static final /* synthetic */ oz1[] q;
    public static final oz1 t;

    static {
        oz1 oz1Var = new oz1("SEND_HID_KEY", 0);
        j = oz1Var;
        oz1 oz1Var2 = new oz1("SEND_MEDIA_KEY", 1);
        t = oz1Var2;
        oz1 oz1Var3 = new oz1("SEND_KEYSTROKES", 2);
        a = oz1Var3;
        oz1 oz1Var4 = new oz1("DELAY", 3);
        m = oz1Var4;
        q = new oz1[]{oz1Var, oz1Var2, oz1Var3, oz1Var4};
    }

    public static oz1 valueOf(String str) {
        return (oz1) Enum.valueOf(oz1.class, str);
    }

    public static oz1[] values() {
        return (oz1[]) q.clone();
    }
}
