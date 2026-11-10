package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mq5 implements du2 {
    public final /* synthetic */ a44 a;
    public final /* synthetic */ ku0 j;
    public final /* synthetic */ u54 m;
    public final /* synthetic */ qf t;

    public mq5(ku0 ku0Var, qf qfVar, a44 a44Var, u54 u54Var) {
        this.j = ku0Var;
        this.t = qfVar;
        this.a = a44Var;
        this.m = u54Var;
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        boolean z;
        hb0 hb0VarD = null;
        switch (lq5.g[vt2Var.ordinal()]) {
            case 1:
                m50.T(this.j, null, new sg(this.m, this.a, gu2Var, this, null, (byte) 6), 1);
                return;
            case 2:
                qf qfVar = this.t;
                if (qfVar != null) {
                    ok2 ok2Var = (ok2) qfVar.a;
                    synchronized (ok2Var.y) {
                        try {
                            synchronized (ok2Var.y) {
                                z = ok2Var.g;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) ok2Var.r;
                                ok2Var.r = (ArrayList) ok2Var.n;
                                ok2Var.n = arrayList;
                                ok2Var.g = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((mu0) arrayList.get(i)).j(og5.g);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                a44 a44Var = this.a;
                synchronized (a44Var.n) {
                    if (a44Var.o) {
                        a44Var.o = false;
                        hb0VarD = a44Var.d();
                    }
                    break;
                }
                if (hb0VarD != null) {
                    ((ib0) hb0VarD).j(og5.g);
                    return;
                }
                return;
            case 3:
                a44 a44Var2 = this.a;
                synchronized (a44Var2.n) {
                    a44Var2.o = true;
                }
                return;
            case 4:
                this.a.k();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                uo1.g();
                return;
        }
    }
}
