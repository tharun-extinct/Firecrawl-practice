package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s80 implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int m;
    public final /* synthetic */ ob3 q;
    public final /* synthetic */ Object t;

    public /* synthetic */ s80(jo5 jo5Var, int i, ob3 ob3Var, qp3 qp3Var) {
        this.j = (byte) 2;
        this.t = jo5Var;
        this.m = i;
        this.q = ob3Var;
        this.a = qp3Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    @Override // defpackage.my1
    public final Object g() {
        int iZ;
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj = this.a;
        ob3 ob3Var = this.q;
        int i = this.m;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                gx3 gx3Var = (gx3) obj2;
                xy1 xy1Var = (xy1) obj;
                gx3Var.getClass();
                if (gx3Var.g) {
                    xy1Var.a(Integer.valueOf(i));
                } else {
                    gx3Var.n.l("step_click", null);
                }
                ob3Var.setValue(Boolean.FALSE);
                break;
            case 1:
                gx3 gx3Var2 = (gx3) obj2;
                xy1 xy1Var2 = (xy1) obj;
                gx3Var2.getClass();
                if (gx3Var2.g) {
                    xy1Var2.a(Integer.valueOf(i + 1));
                } else {
                    gx3Var2.n.l("step_click", null);
                }
                ob3Var.setValue(Boolean.FALSE);
                break;
            default:
                qp3 qp3Var = (qp3) obj;
                View view = ((jo5) obj2).g;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i2 = rect.top;
                int i3 = rect.bottom;
                bl2 bl2Var = (bl2) ob3Var.getValue();
                k44 k44VarR = (bl2Var == null || !bl2Var.W()) ? k44.v : kq2.r(bl2Var.t(0L), y94.N(bl2Var.L()));
                int i4 = i2 + i;
                int i5 = i3 - i;
                float f = k44VarR.y;
                if (f <= i3) {
                    float f2 = k44VarR.n;
                    if (f2 < i2) {
                        iZ = i5 - i4;
                    } else {
                        iZ = k33.Z(Math.max(f - i4, i5 - f2));
                    }
                } else {
                    iZ = i5 - i4;
                }
                qp3Var.e(Math.max(iZ, 0));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ s80(gx3 gx3Var, xy1 xy1Var, int i, ob3 ob3Var, byte b) {
        this.j = b;
        this.t = gx3Var;
        this.a = xy1Var;
        this.m = i;
        this.q = ob3Var;
    }
}
