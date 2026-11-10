package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xw5 {
    public static final xw5 j;
    public static final /* synthetic */ xw5[] t;

    static {
        xw5 xw5Var = new xw5("DEFAULT", 0);
        j = xw5Var;
        t = new xw5[]{xw5Var, new xw5("SIGNED", 1), new xw5("FIXED", 2)};
    }

    public static xw5[] values() {
        return (xw5[]) t.clone();
    }
}
