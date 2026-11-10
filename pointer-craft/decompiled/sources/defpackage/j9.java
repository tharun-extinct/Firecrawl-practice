package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j9 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ u54 t;

    public /* synthetic */ j9(u54 u54Var, byte b) {
        this.j = b;
        this.t = u54Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        boolean z;
        byte b = this.j;
        u54 u54Var = this.t;
        switch (b) {
            case 0:
                u54Var.j = (cu1) obj;
                return Boolean.TRUE;
            case 1:
                h12 h12Var = (h12) obj;
                if (yf2.p(h12Var.x0(), "waiting")) {
                    u54Var.j = h12Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                o72 o72Var = (o72) obj;
                Object obj2 = u54Var.j;
                if (obj2 == null && o72Var.k) {
                    u54Var.j = o72Var;
                } else if (obj2 != null) {
                    o72Var.getClass();
                }
                return Boolean.TRUE;
            case 3:
                ((ob3) u54Var.j).setValue((bl2) obj);
                return og5.g;
            default:
                hd5 hd5Var = (hd5) obj;
                hd5Var.getClass();
                pr2 pr2Var = ((jd5) hd5Var).o;
                List listA = (List) u54Var.j;
                if (listA != null) {
                    listA.add(pr2Var);
                } else {
                    listA = pw5.A(pr2Var);
                }
                u54Var.j = listA;
                return gd5.t;
        }
    }
}
