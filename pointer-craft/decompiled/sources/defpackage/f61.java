package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f61 {
    public static final f61 a;
    public static final /* synthetic */ f61[] c;
    public static final f61 j;
    public static final f61 m;
    public static final f61 q;
    public static final f61 t;
    public static final f61 w;

    static {
        f61 f61Var = new f61("NEVER_CONNECTED", 0);
        j = f61Var;
        f61 f61Var2 = new f61("PROFILE_NEVER_CONNECTED", 1);
        t = f61Var2;
        f61 f61Var3 = new f61("HOST_REJECTED", 2);
        a = f61Var3;
        f61 f61Var4 = new f61("PROFILE_BRIEFLY_CONNECTED", 3);
        m = f61Var4;
        f61 f61Var5 = new f61("NORMAL_DISCONNECT", 4);
        q = f61Var5;
        f61 f61Var6 = new f61("BOND_LOST", 5);
        w = f61Var6;
        c = new f61[]{f61Var, f61Var2, f61Var3, f61Var4, f61Var5, f61Var6};
    }

    public static f61 valueOf(String str) {
        return (f61) Enum.valueOf(f61.class, str);
    }

    public static f61[] values() {
        return (f61[]) c.clone();
    }
}
