package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class re1 implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    public /* synthetic */ re1(we1 we1Var, j51 j51Var, zu4 zu4Var, zu4 zu4Var2, zu4 zu4Var3) {
        this.j = (byte) 3;
        this.t = we1Var;
        this.a = j51Var;
        this.m = zu4Var;
        this.q = zu4Var2;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        byte b2 = 0;
        byte b3 = 1;
        mu0 mu0Var = null;
        og5 og5Var = og5.g;
        Object obj = this.q;
        Object obj2 = this.m;
        Object obj3 = this.a;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                ox0 ox0Var = (ox0) obj4;
                ob3 ob3Var = (ob3) obj2;
                ob3 ob3Var2 = (ob3) obj;
                if (((Boolean) ((ob3) obj3).getValue()).booleanValue()) {
                    kq2.W((Context) ob3Var.getValue());
                }
                m50.T(ox0Var, null, new se1(ob3Var2, mu0Var, b2), 3);
                break;
            case 1:
                Float f = (Float) obj4;
                bc2 bc2Var = (bc2) obj3;
                Float f2 = (Float) obj2;
                ac2 ac2Var = (ac2) obj;
                if (!f.equals(bc2Var.j) || !f2.equals(bc2Var.t)) {
                    bc2Var.j = f;
                    bc2Var.t = f2;
                    bc2Var.m = new t25(ac2Var, m50.w, f, f2, null);
                    bc2Var.i.y.setValue(Boolean.TRUE);
                    bc2Var.q = false;
                    bc2Var.w = true;
                }
                break;
            case 2:
                String str = (String) obj4;
                String str2 = (String) obj3;
                qr0 qr0Var = (qr0) obj2;
                z6 z6Var = (z6) obj;
                if (str != null) {
                    if (str2 == null) {
                        z6Var.a(str);
                    } else {
                        qr0Var.v(str2);
                        qr0Var.B = m50.T(v70.d(qr0Var), null, new rz(qr0Var, str, mu0Var, b3), 3);
                    }
                }
                break;
            default:
                we1 we1Var = (we1) obj4;
                we1Var.r.setValue((j51) obj3);
                we1Var.n = (zu4) obj2;
                we1Var.v = (zu4) obj;
                break;
        }
        return og5Var;
    }

    public /* synthetic */ re1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
    }
}
