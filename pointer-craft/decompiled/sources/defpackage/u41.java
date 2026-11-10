package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u41 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ fa4 m;
    public final /* synthetic */ w41 t;

    public /* synthetic */ u41(w41 w41Var, Runnable runnable, fa4 fa4Var, byte b) {
        this.j = b;
        this.t = w41Var;
        this.a = runnable;
        this.m = fa4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        final fa4 fa4Var = this.m;
        final Runnable runnable = this.a;
        w41 w41Var = this.t;
        switch (b) {
            case 0:
                final byte b2 = 0;
                w41Var.j.execute(new Runnable() { // from class: s41
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        byte b3 = b2;
                        fa4 fa4Var2 = fa4Var;
                        Runnable runnable2 = runnable;
                        switch (b3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    fa4Var2.L(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    fa4Var2.L(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    fa4Var2.K(null);
                                    return;
                                } catch (Exception e3) {
                                    fa4Var2.L(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 2;
                w41Var.j.execute(new Runnable() { // from class: s41
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        byte b4 = b3;
                        fa4 fa4Var2 = fa4Var;
                        Runnable runnable2 = runnable;
                        switch (b4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    fa4Var2.L(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    fa4Var2.L(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    fa4Var2.K(null);
                                    return;
                                } catch (Exception e3) {
                                    fa4Var2.L(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b4 = 1;
                w41Var.j.execute(new Runnable() { // from class: s41
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        byte b5 = b4;
                        fa4 fa4Var2 = fa4Var;
                        Runnable runnable2 = runnable;
                        switch (b5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    fa4Var2.L(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    fa4Var2.L(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    fa4Var2.K(null);
                                    return;
                                } catch (Exception e3) {
                                    fa4Var2.L(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
