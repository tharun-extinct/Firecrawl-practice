package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class fk1 extends t {
    public final void b(Object obj) {
        gy1 gy1VarG = g();
        try {
            c(gy1VarG, obj);
            gy1VarG.t.executeInsert();
        } finally {
            w(gy1VarG);
        }
    }

    public abstract void c(gy1 gy1Var, Object obj);
}
