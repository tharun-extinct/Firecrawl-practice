package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hr5 {
    public static final hr5 a;
    public static final /* synthetic */ hr5[] c;
    public static final hr5 j;
    public static final hr5 m;
    public static final hr5 q;
    public static final hr5 t;
    public static final hr5 w;

    static {
        hr5 hr5Var = new hr5("ENQUEUED", 0);
        j = hr5Var;
        hr5 hr5Var2 = new hr5("RUNNING", 1);
        t = hr5Var2;
        hr5 hr5Var3 = new hr5("SUCCEEDED", 2);
        a = hr5Var3;
        hr5 hr5Var4 = new hr5("FAILED", 3);
        m = hr5Var4;
        hr5 hr5Var5 = new hr5("BLOCKED", 4);
        q = hr5Var5;
        hr5 hr5Var6 = new hr5("CANCELLED", 5);
        w = hr5Var6;
        c = new hr5[]{hr5Var, hr5Var2, hr5Var3, hr5Var4, hr5Var5, hr5Var6};
    }

    public static hr5 valueOf(String str) {
        return (hr5) Enum.valueOf(hr5.class, str);
    }

    public static hr5[] values() {
        return (hr5[]) c.clone();
    }

    public final boolean g() {
        return this == a || this == m || this == w;
    }
}
