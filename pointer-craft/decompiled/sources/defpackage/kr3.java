package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kr3 {
    public static final kr3 a;
    public static final kr3 c;
    public static final /* synthetic */ kr3[] i;
    public static final kr3 j;
    public static final kr3 m;
    public static final kr3 q;
    public static final kr3 t;
    public static final kr3 w;

    static {
        kr3 kr3Var = new kr3("Invalid", 0);
        j = kr3Var;
        kr3 kr3Var2 = new kr3("Cancelled", 1);
        t = kr3Var2;
        kr3 kr3Var3 = new kr3("InitialPending", 2);
        a = kr3Var3;
        kr3 kr3Var4 = new kr3("RecomposePending", 3);
        m = kr3Var4;
        kr3 kr3Var5 = new kr3("Recomposing", 4);
        q = kr3Var5;
        kr3 kr3Var6 = new kr3("ApplyPending", 5);
        w = kr3Var6;
        kr3 kr3Var7 = new kr3("Applied", 6);
        c = kr3Var7;
        i = new kr3[]{kr3Var, kr3Var2, kr3Var3, kr3Var4, kr3Var5, kr3Var6, kr3Var7};
    }

    public static kr3 valueOf(String str) {
        return (kr3) Enum.valueOf(kr3.class, str);
    }

    public static kr3[] values() {
        return (kr3[]) i.clone();
    }
}
