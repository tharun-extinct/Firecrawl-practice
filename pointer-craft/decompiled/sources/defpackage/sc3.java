package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc3 implements du2 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ sc3(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        byte b = this.j;
        int i = 0;
        Object obj = this.t;
        switch (b) {
            case 0:
                vc3 vc3Var = (vc3) obj;
                vc3Var.s = vt2Var.g();
                if (vc3Var.r != null) {
                    ArrayList arrayListG0 = cj0.G0(vc3Var.x);
                    int size = arrayListG0.size();
                    while (i < size) {
                        Object obj2 = arrayListG0.get(i);
                        i++;
                        mc3 mc3Var = (mc3) obj2;
                        mc3Var.getClass();
                        mc3Var.m = vt2Var.g();
                        mc3Var.n();
                    }
                }
                break;
            default:
                hd4 hd4Var = (hd4) obj;
                if (vt2Var == vt2.ON_START) {
                    hd4Var.j = true;
                } else if (vt2Var == vt2.ON_STOP) {
                    hd4Var.j = false;
                }
                break;
        }
    }
}
