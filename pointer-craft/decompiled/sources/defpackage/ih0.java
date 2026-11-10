package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ih0 {
    public static final ih0 a;
    public static final ih0 j;
    public static final /* synthetic */ ih0[] m;
    public static final ih0 t;

    static {
        ih0 ih0Var = new ih0("Idle", 0);
        j = ih0Var;
        ih0 ih0Var2 = new ih0("WaitingForOff", 1);
        t = ih0Var2;
        ih0 ih0Var3 = new ih0("WaitingForOn", 2);
        a = ih0Var3;
        m = new ih0[]{ih0Var, ih0Var2, ih0Var3};
    }

    public static ih0 valueOf(String str) {
        return (ih0) Enum.valueOf(ih0.class, str);
    }

    public static ih0[] values() {
        return (ih0[]) m.clone();
    }
}
