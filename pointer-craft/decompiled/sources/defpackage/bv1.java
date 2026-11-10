package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bv1 implements et0 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ bv1(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.et0
    public final void accept(Object obj) {
        switch (this.g) {
            case 0:
                cv1 cv1Var = (cv1) obj;
                if (cv1Var == null) {
                    cv1Var = new cv1(-3);
                }
                ((rk4) this.y).J(cv1Var);
                return;
            case 1:
                cv1 cv1Var2 = (cv1) obj;
                synchronized (dv1.r) {
                    try {
                        sp4 sp4Var = dv1.n;
                        ArrayList arrayList = (ArrayList) sp4Var.get((String) this.y);
                        if (arrayList == null) {
                            return;
                        }
                        sp4Var.remove((String) this.y);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((et0) arrayList.get(i)).accept(cv1Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                x20 x20Var = (x20) obj;
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                el0 el0Var = (el0) ((q64) this.y).t;
                x20Var.getClass();
                el0Var.f0(new kz3(x20Var, arrayList2));
                return;
            default:
                ((v92) this.y).M((x20) obj);
                return;
        }
    }
}
