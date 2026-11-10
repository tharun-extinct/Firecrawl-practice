package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wv2 {
    public static df2 g(long j, Object obj) {
        df2 df2Var = (df2) ih5.a(j, obj);
        if (((a1) df2Var).j) {
            return df2Var;
        }
        int size = df2Var.size();
        df2 df2VarT = df2Var.t(size == 0 ? 10 : size * 2);
        ih5.s(j, obj, df2VarT);
        return df2VarT;
    }
}
