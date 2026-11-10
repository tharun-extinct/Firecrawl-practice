package defpackage;

import io.appground.blek.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class xk implements yj3 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ MainActivity y;

    public /* synthetic */ xk(MainActivity mainActivity, byte b) {
        this.g = b;
        this.y = mainActivity;
    }

    @Override // defpackage.yj3
    public final void g(yl0 yl0Var) {
        byte b = this.g;
        MainActivity mainActivity = this.y;
        switch (b) {
            case 0:
                kl klVarI = mainActivity.i();
                klVarI.g();
                ((ji) mainActivity.m.a).a("androidx:appcompat");
                klVarI.r();
                break;
            default:
                if (!mainActivity.K) {
                    mainActivity.K = true;
                    ((i03) mainActivity.n()).getClass();
                }
                break;
        }
    }
}
