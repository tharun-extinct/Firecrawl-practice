package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z31 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ a41 t;

    public /* synthetic */ z31(a41 a41Var, byte b) {
        this.j = b;
        this.t = a41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nj6 nj6VarA;
        Executor executor;
        gc0 gc0Var;
        byte b = this.j;
        byte b2 = 1;
        a41 a41Var = this.t;
        switch (b) {
            case 0:
                r11 r11Var = a41Var.g;
                nj6VarA = r11Var.q.g(false).a(r11Var.l, new q11(r11Var));
                executor = a41Var.y;
                gc0Var = new gc0(a41Var, b2);
                break;
            default:
                r11 r11Var2 = a41Var.g;
                nj6VarA = r11Var2.q.g(false).a(r11Var2.l, new q11(r11Var2));
                executor = a41Var.y;
                gc0Var = new gc0(a41Var, b2);
                break;
        }
        nj6VarA.r(executor, gc0Var);
    }
}
