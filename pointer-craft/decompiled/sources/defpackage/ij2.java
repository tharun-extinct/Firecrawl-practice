package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ij2 extends zz4 implements bz1 {
    public final /* synthetic */ sj2 c;
    public final /* synthetic */ String i;
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij2(sj2 sj2Var, String str, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = sj2Var;
        this.i = str;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        String str = this.i;
        sj2 sj2Var = this.c;
        switch (b) {
            case 0:
                ij2 ij2Var = new ij2(sj2Var, str, mu0Var, (byte) 0);
                ij2Var.w = obj;
                return ij2Var;
            default:
                ij2 ij2Var2 = new ij2(sj2Var, str, mu0Var, (byte) 1);
                ij2Var2.w = obj;
                return ij2Var2;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        db3 db3Var = (db3) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                ((ij2) b(mu0Var, db3Var)).u(og5Var);
                break;
            default:
                ((ij2) b(mu0Var, db3Var)).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        String str = this.i;
        sj2 sj2Var = this.c;
        db3 db3Var = (db3) this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                Context context = sj2Var.r;
                LinkedHashSet linkedHashSetC = nl4.C(vp2.v(db3Var, context), str);
                db3Var.v(yl4.g, linkedHashSetC);
                rw3 rw3Var = yl4.y;
                if (yf2.p(db3Var.r(rw3Var), str)) {
                    String strR = (String) cj0.k0(linkedHashSetC);
                    if (strR == null) {
                        strR = vp2.r(context);
                    }
                    db3Var.x(rw3Var, strR);
                }
                break;
            default:
                js2.o(obj);
                db3Var.v(yl4.g, nl4.D(vp2.v(db3Var, sj2Var.r), str));
                db3Var.v(yl4.y, str);
                break;
        }
        return og5Var;
    }
}
