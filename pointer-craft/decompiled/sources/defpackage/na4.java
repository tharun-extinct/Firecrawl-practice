package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class na4 {
    public static final ma4 g;

    static {
        mr3 mr3VarR = v70.r(50);
        g = new ma4(mr3VarR, mr3VarR, mr3VarR, mr3VarR);
    }

    public static ma4 g(int i) {
        return new ma4(v70.r((i & 1) != 0 ? 0 : 50), v70.r((i & 2) != 0 ? 0 : 50), v70.r((i & 4) != 0 ? 0 : 50), v70.r((i & 8) != 0 ? 0 : 50));
    }

    public static final ma4 y(float f) {
        wb1 wb1Var = new wb1(f);
        return new ma4(wb1Var, wb1Var, wb1Var, wb1Var);
    }
}
