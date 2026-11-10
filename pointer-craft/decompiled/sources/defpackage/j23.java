package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j23 {
    public static final j23 a;
    public static final j23 j;
    public static final j23 m;
    public static final /* synthetic */ j23[] q;
    public static final j23 t;

    static {
        j23 j23Var = new j23("NONE", 0);
        j = j23Var;
        j23 j23Var2 = new j23("START", 1);
        t = j23Var2;
        j23 j23Var3 = new j23("END", 2);
        a = j23Var3;
        j23 j23Var4 = new j23("BOTH", 3);
        m = j23Var4;
        q = new j23[]{j23Var, j23Var2, j23Var3, j23Var4};
    }

    public static j23 valueOf(String str) {
        return (j23) Enum.valueOf(j23.class, str);
    }

    public static j23[] values() {
        return (j23[]) q.clone();
    }
}
