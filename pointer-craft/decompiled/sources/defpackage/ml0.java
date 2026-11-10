package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ml0 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ yl0 t;

    public /* synthetic */ ml0(yl0 yl0Var, byte b) {
        this.j = b;
        this.t = yl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        yl0 yl0Var = this.t;
        switch (b) {
            case 0:
                yl0.w(yl0Var);
                break;
            default:
                yl0Var.invalidateOptionsMenu();
                break;
        }
    }
}
