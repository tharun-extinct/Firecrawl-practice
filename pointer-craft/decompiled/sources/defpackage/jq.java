package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class jq implements oh1, hz4 {
    public Context j;

    public /* synthetic */ jq(Context context, boolean z) {
        this.j = context;
    }

    @Override // defpackage.hz4
    public iz4 a(ok2 ok2Var) {
        Context context = this.j;
        String str = (String) ok2Var.r;
        gz4 gz4Var = (gz4) ok2Var.n;
        gz4Var.getClass();
        if (str == null || str.length() == 0) {
            l0.u("Must set a non-null database name to a configuration that uses the no backup directory.");
            return null;
        }
        ok2 ok2Var2 = new ok2(context, str, gz4Var, true);
        return new ey1((Context) ok2Var2.y, (String) ok2Var2.r, (gz4) ok2Var2.n, ok2Var2.g);
    }

    @Override // defpackage.oh1
    public void g(ue5 ue5Var) {
        kp0 kp0Var = new kp0("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), kp0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new v21(this, ue5Var, threadPoolExecutor));
    }

    public pz0 y() {
        Context context = this.j;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        pz0 pz0Var = new pz0();
        pz0Var.j = rb1.g(gp4.s);
        byte b = 1;
        wx0 wx0Var = new wx0(context, (byte) 1);
        pz0Var.t = wx0Var;
        byte b2 = 0;
        pz0Var.a = rb1.g(new u53(wx0Var, new wx0(wx0Var, (byte) 0), b2));
        wx0 wx0Var2 = pz0Var.t;
        pz0Var.m = new pl1(wx0Var2, (byte) 1);
        p14 p14VarG = rb1.g(new u53(pz0Var.m, rb1.g(new pl1(wx0Var2, (byte) 0)), b));
        pz0Var.q = p14VarG;
        ql1 ql1Var = new ql1((byte) 2);
        wx0 wx0Var3 = pz0Var.t;
        ke4 ke4Var = new ke4(wx0Var3, p14VarG, ql1Var, b2);
        p14 p14Var = pz0Var.j;
        p14 p14Var2 = pz0Var.a;
        pz0Var.w = rb1.g(new ke4(new z21(p14Var, p14Var2, ke4Var, p14VarG, p14VarG), new vh5(wx0Var3, p14Var2, p14VarG, ke4Var, p14Var, p14VarG, p14VarG), new jr5(p14Var, p14VarG, ke4Var, p14VarG), b));
        return pz0Var;
    }
}
