package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z80 implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ int t;

    public /* synthetic */ z80(int i, qp3 qp3Var, ob3 ob3Var) {
        this.t = i;
        this.a = qp3Var;
        this.m = ob3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj = this.m;
        int i = this.t;
        Object obj2 = this.a;
        switch (b) {
            case 0:
                ((qp3) obj2).e(i);
                ((ob3) obj).setValue(Boolean.FALSE);
                break;
            default:
                p82 p82Var = (p82) obj2;
                try {
                    p82Var.E.b(i, (kk1) obj);
                } catch (IOException e) {
                    kk1 kk1Var = kk1.m;
                    p82Var.y(kk1Var, kk1Var, e);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ z80(p82 p82Var, int i, kk1 kk1Var) {
        this.a = p82Var;
        this.t = i;
        this.m = kk1Var;
    }
}
