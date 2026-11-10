package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xw0 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ yw0 t;

    public /* synthetic */ xw0(yw0 yw0Var, nj4 nj4Var) {
        this.j = (byte) 3;
        this.t = yw0Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        boolean z = false;
        yw0 yw0Var = this.t;
        switch (b) {
            case 0:
                tp3 tp3Var = yw0Var.e.z;
                Boolean bool = Boolean.TRUE;
                tp3Var.setValue(bool);
                yw0Var.e.u.setValue(bool);
                mt2 mt2Var = yw0Var.e;
                wb wbVar = (wb) ((jo1) obj);
                CharSequence textValue = wbVar.g.isText() ? wbVar.g.getTextValue() : null;
                textValue.getClass();
                yw0.T0(mt2Var, (String) textValue, yw0Var.A, yw0Var.B);
                return bool;
            case 1:
                List list = (List) obj;
                if (yw0Var.e.n() != null) {
                    k75 k75VarN = yw0Var.e.n();
                    k75VarN.getClass();
                    list.add(k75VarN.g);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                yw0.T0(yw0Var.e, ((cj) obj).t, yw0Var.A, yw0Var.B);
                return Boolean.TRUE;
            default:
                cj cjVar = (cj) obj;
                if (!yw0Var.A && yw0Var.B) {
                    y65 y65Var = yw0Var.e.v;
                    if (y65Var != null) {
                        List listD = pw5.d(new mo1(), new rk0(cjVar, 1));
                        mt2 mt2Var2 = yw0Var.e;
                        rk4 rk4Var = mt2Var2.n;
                        kw0 kw0Var = mt2Var2.o;
                        k65 k65VarW = rk4Var.w(listD);
                        y65Var.g(null, k65VarW);
                        kw0Var.a(k65VarW);
                    } else {
                        k65 k65Var = yw0Var.d;
                        String str = k65Var.g.t;
                        long j = k65Var.y;
                        int i = u75.r;
                        String string = tx4.e0(str, (int) (j >> 32), (int) (j & 4294967295L), cjVar).toString();
                        int length = cjVar.t.length() + ((int) (yw0Var.d.y >> 32));
                        yw0Var.e.o.a(new k65(string, sp2.y(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ xw0(yw0 yw0Var, byte b) {
        this.j = b;
        this.t = yw0Var;
    }
}
