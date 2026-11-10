package defpackage;

import android.os.Looper;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc5 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ pc5(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = 1;
        byte b2 = 8;
        switch (this.j) {
            case 0:
                Object obj2 = this.t;
                ox0 ox0Var = (ox0) this.a;
                my1 my1Var = (my1) obj;
                if (obj2 == Thread.currentThread()) {
                    my1Var.g();
                } else {
                    m50.T(ox0Var, null, new gv0(my1Var, null, b), 3);
                }
                return og5.g;
            case 1:
                nc5 nc5Var = (nc5) this.t;
                nc5 nc5Var2 = (nc5) this.a;
                nc5Var.m.add(nc5Var2);
                return new fc2(nc5Var, nc5Var2, (byte) 5);
            case 2:
                return new fc2((nc5) this.t, (cc5) this.a, (byte) 6);
            case 3:
                wh4 wh4Var = (wh4) this.t;
                hf5 hf5Var = (hf5) this.a;
                kf5 kf5Var = (kf5) obj;
                synchronized (((l76) wh4Var.j)) {
                    try {
                        boolean zR = kf5Var.r();
                        kz2 kz2Var = (kz2) wh4Var.t;
                        if (zR) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return og5.g;
            case 4:
                yp5 yp5Var = (yp5) this.t;
                View view = (View) this.a;
                yp5Var.g(view);
                return new fc2(yp5Var, view, b2);
            default:
                es5 es5Var = (es5) this.t;
                nm0 nm0Var = (nm0) this.a;
                mo0 mo0Var = (mo0) obj;
                if (!es5Var.a) {
                    gu2 gu2VarN = mo0Var.n();
                    View view2 = mo0Var.g;
                    ju2 ju2VarA = gu2VarN.a();
                    es5Var.q = nm0Var;
                    if (es5Var.m == null) {
                        if (yf2.p(Looper.myLooper(), view2.getHandler().getLooper())) {
                            es5Var.m = ju2VarA;
                            ju2VarA.g(es5Var);
                        } else {
                            view2.post(new nl0(es5Var, ju2VarA, (byte) 8));
                        }
                    } else if (ju2VarA.t.compareTo(wt2.a) >= 0) {
                        es5Var.t.A(new nm0(-1723985096, true, new nn(es5Var, mo0Var, nm0Var, b2)));
                    }
                }
                return og5.g;
        }
    }
}
