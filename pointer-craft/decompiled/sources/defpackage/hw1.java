package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw1 implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ pw1 t;

    public /* synthetic */ hw1(pw1 pw1Var, Bundle bundle, byte b) {
        this.j = b;
        this.t = pw1Var;
        this.a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        Bundle bundle = this.a;
        pw1 pw1Var = this.t;
        switch (b) {
            case 0:
                pw1Var.F(bundle);
                break;
            case 1:
                pw1Var.e(bundle);
                break;
            default:
                pw1Var.J(bundle);
                break;
        }
    }
}
