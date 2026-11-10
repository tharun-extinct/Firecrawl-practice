package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pb2 {
    public static final pb2 a;
    public static final pb2 j;
    public static final /* synthetic */ pb2[] m;
    public static final pb2 t;

    static {
        pb2 pb2Var = new pb2("Yes", 0);
        j = pb2Var;
        pb2 pb2Var2 = new pb2("No", 1);
        t = pb2Var2;
        pb2 pb2Var3 = new pb2("NotInitialized", 2);
        a = pb2Var3;
        m = new pb2[]{pb2Var, pb2Var2, pb2Var3};
    }

    public static pb2 valueOf(String str) {
        return (pb2) Enum.valueOf(pb2.class, str);
    }

    public static pb2[] values() {
        return (pb2[]) m.clone();
    }
}
