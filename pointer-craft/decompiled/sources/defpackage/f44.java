package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class f44 {
    public static final f44 a;
    public static final f44 j;
    public static final f44 m;
    public static final /* synthetic */ f44[] q;
    public static final f44 t;

    static {
        f44 f44Var = new f44("Idle", 0);
        j = f44Var;
        f44 f44Var2 = new f44("Recorded", 1);
        t = f44Var2;
        f44 f44Var3 = new f44("Recording", 2);
        a = f44Var3;
        f44 f44Var4 = new f44("Replaying", 3);
        m = f44Var4;
        q = new f44[]{f44Var, f44Var2, f44Var3, f44Var4};
    }

    public static f44 valueOf(String str) {
        return (f44) Enum.valueOf(f44.class, str);
    }

    public static f44[] values() {
        return (f44[]) q.clone();
    }
}
