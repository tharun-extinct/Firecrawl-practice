package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sf2 {
    public static final /* synthetic */ sf2[] a;
    public static final sf2 j;
    public static final sf2 t;

    static {
        sf2 sf2Var = new sf2("Min", 0);
        j = sf2Var;
        sf2 sf2Var2 = new sf2("Max", 1);
        t = sf2Var2;
        a = new sf2[]{sf2Var, sf2Var2};
    }

    public static sf2 valueOf(String str) {
        return (sf2) Enum.valueOf(sf2.class, str);
    }

    public static sf2[] values() {
        return (sf2[]) a.clone();
    }
}
