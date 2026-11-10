package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vp implements bz1 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ eq t;

    public /* synthetic */ vp(eq eqVar, Context context) {
        this.t = eqVar;
        this.a = context;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && h02Var.e()) {
                    h02Var.Q();
                } else {
                    vf1 vf1Var = ep0.y;
                    Context context = this.a;
                    m14 m14VarG = vf1Var.g(context);
                    vf1 vf1Var2 = ep0.n;
                    eq eqVar = this.t;
                    m14 m14VarG2 = vf1Var2.g(eqVar.x);
                    vf1 vf1Var3 = fp0.g;
                    Bundle bundle = (Bundle) eqVar.t.getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    og0.r(new m14[]{m14VarG, m14VarG2, vf1Var3.g(bundle), ep0.r.g(eqVar.j.getValue())}, ue5.m0(-1811403166, new vp(eqVar, context), h02Var), h02Var, 56);
                }
                break;
            default:
                h02 h02Var2 = (h02) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && h02Var2.e()) {
                    h02Var2.Q();
                } else {
                    Object objK = h02Var2.K();
                    l76 l76Var = oo0.g;
                    if (objK == l76Var) {
                        objK = kq2.M(new yb1(0L));
                        h02Var2.i0(objK);
                    }
                    ob3 ob3Var = (ob3) objK;
                    Boolean bool = Boolean.FALSE;
                    eq eqVar2 = this.t;
                    boolean zJ = h02Var2.j(eqVar2);
                    Context context2 = this.a;
                    boolean zJ2 = h02Var2.j(context2) | zJ;
                    Object objK2 = h02Var2.K();
                    og5 og5Var2 = null;
                    if (zJ2 || objK2 == l76Var) {
                        s3 s3Var = new s3((Object) eqVar2, context2, (Object) ob3Var, (mu0) null, (byte) 3);
                        h02Var2.i0(s3Var);
                        objK2 = s3Var;
                    }
                    if (((Boolean) aq2.e((bz1) objK2, h02Var2, bool).getValue()).booleanValue()) {
                        h02Var2.X(-1541018146);
                        Object objK3 = h02Var2.K();
                        if (objK3 == l76Var) {
                            objK3 = new bd0(new s3(eqVar2.v, context2, eqVar2.x, (mu0) null), ni1.j, -2, f70.j);
                            h02Var2.i0(objK3);
                        }
                        bz1 bz1Var = (bz1) v13.l((er1) objK3, null, h02Var2, 48, 2).getValue();
                        if (bz1Var == null) {
                            h02Var2.X(-1540889931);
                            h02Var2.b(false);
                        } else {
                            h02Var2.X(-1540889930);
                            kq2.g(0, ((yb1) ob3Var.getValue()).g, bz1Var, h02Var2, eqVar2.l);
                            h02Var2.b(false);
                            og5Var2 = og5Var;
                        }
                        if (og5Var2 == null) {
                            h02Var2.X(-1296630672);
                            jh6.g(0, h02Var2);
                            h02Var2.b(false);
                        } else {
                            h02Var2.X(-1296636252);
                            h02Var2.b(false);
                        }
                        h02Var2.b(false);
                    } else {
                        h02Var2.X(-1540810446);
                        jh6.g(0, h02Var2);
                        h02Var2.b(false);
                    }
                    boolean zJ3 = h02Var2.j(eqVar2);
                    Object objK4 = h02Var2.K();
                    if (zJ3 || objK4 == l76Var) {
                        objK4 = new qd(eqVar2, (byte) 4);
                        h02Var2.i0(objK4);
                    }
                    k33.z((my1) objK4, h02Var2);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ vp(Context context, eq eqVar) {
        this.a = context;
        this.t = eqVar;
    }
}
