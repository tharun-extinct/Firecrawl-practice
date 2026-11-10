package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vt2 {
    private static final /* synthetic */ ik1 $ENTRIES;
    private static final /* synthetic */ vt2[] $VALUES;
    public static final tt2 Companion;
    public static final vt2 ON_ANY;
    public static final vt2 ON_CREATE;
    public static final vt2 ON_DESTROY;
    public static final vt2 ON_PAUSE;
    public static final vt2 ON_RESUME;
    public static final vt2 ON_START;
    public static final vt2 ON_STOP;

    static {
        vt2 vt2Var = new vt2("ON_CREATE", 0);
        ON_CREATE = vt2Var;
        vt2 vt2Var2 = new vt2("ON_START", 1);
        ON_START = vt2Var2;
        vt2 vt2Var3 = new vt2("ON_RESUME", 2);
        ON_RESUME = vt2Var3;
        vt2 vt2Var4 = new vt2("ON_PAUSE", 3);
        ON_PAUSE = vt2Var4;
        vt2 vt2Var5 = new vt2("ON_STOP", 4);
        ON_STOP = vt2Var5;
        vt2 vt2Var6 = new vt2("ON_DESTROY", 5);
        ON_DESTROY = vt2Var6;
        vt2 vt2Var7 = new vt2("ON_ANY", 6);
        ON_ANY = vt2Var7;
        vt2[] vt2VarArr = {vt2Var, vt2Var2, vt2Var3, vt2Var4, vt2Var5, vt2Var6, vt2Var7};
        $VALUES = vt2VarArr;
        $ENTRIES = new jk1(vt2VarArr);
        Companion = new tt2();
    }

    public static vt2 valueOf(String str) {
        return (vt2) Enum.valueOf(vt2.class, str);
    }

    public static vt2[] values() {
        return (vt2[]) $VALUES.clone();
    }

    public final wt2 g() {
        switch (ut2.g[ordinal()]) {
            case 1:
            case 2:
                return wt2.a;
            case 3:
            case 4:
                return wt2.m;
            case 5:
                return wt2.q;
            case 6:
                return wt2.j;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                uo1.g();
                return null;
        }
    }
}
