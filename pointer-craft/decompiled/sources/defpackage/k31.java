package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k31 implements Runnable {
    public final /* synthetic */ qu4 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ r31 t;

    public /* synthetic */ k31(r31 r31Var, qu4 qu4Var, byte b) {
        this.j = b;
        this.t = r31Var;
        this.a = qu4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        qu4 qu4Var = this.a;
        r31 r31Var = this.t;
        switch (b) {
            case 0:
                r31Var.g(qu4Var);
                break;
            case 1:
                if (r31Var.y.contains(qu4Var)) {
                    su4 su4Var = qu4Var.g;
                    View view = qu4Var.r.O;
                    view.getClass();
                    su4Var.g(view, r31Var.g);
                }
                break;
            default:
                r31Var.y.remove(qu4Var);
                r31Var.r.remove(qu4Var);
                break;
        }
    }
}
