package defpackage;

import android.content.Context;
import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mg implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    public /* synthetic */ mg(xy1 xy1Var, xl4 xl4Var, my1 my1Var, xy1 xy1Var2) {
        this.j = (byte) 7;
        this.m = xy1Var;
        this.t = xl4Var;
        this.a = my1Var;
        this.q = xy1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0153  */
    @Override // defpackage.xy1
    public final Object a(Object obj) throws Exception {
        Integer numValueOf;
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj2 = this.q;
        Object obj3 = this.a;
        Object obj4 = this.t;
        Object obj5 = this.m;
        switch (b) {
            case 0:
                qg qgVar = (qg) obj4;
                pi piVar = (pi) obj3;
                xy1 xy1Var = (xy1) obj5;
                q54 q54Var = (q54) obj2;
                ni niVar = (ni) obj;
                kq2.Y(niVar, qgVar.r);
                tp3 tp3Var = niVar.v;
                Object objY = qgVar.y(tp3Var.getValue());
                if (!yf2.p(objY, tp3Var.getValue())) {
                    qgVar.r.t.setValue(objY);
                    piVar.t.setValue(objY);
                    if (xy1Var != null) {
                        xy1Var.a(qgVar);
                    }
                    niVar.g();
                    q54Var.j = true;
                } else if (xy1Var != null) {
                    xy1Var.a(qgVar);
                }
                return og5Var;
            case 1:
                mt2 mt2Var = (mt2) obj4;
                v65 v65Var = (v65) obj3;
                k65 k65Var = (k65) obj5;
                ma2 ma2Var = (ma2) obj2;
                if (mt2Var.y()) {
                    rk4 rk4Var = mt2Var.n;
                    kw0 kw0Var = mt2Var.o;
                    kw0 kw0Var2 = mt2Var.f;
                    u54 u54Var = new u54();
                    q2 q2Var = new q2(rk4Var, kw0Var, u54Var, (byte) 27);
                    xt3 xt3Var = v65Var.g;
                    xt3Var.g(k65Var, ma2Var, q2Var, kw0Var2);
                    y65 y65Var = new y65(v65Var, xt3Var);
                    v65Var.y.set(y65Var);
                    u54Var.j = y65Var;
                    mt2Var.v = y65Var;
                }
                return new ae((byte) 2);
            case 2:
                r54 r54Var = (r54) obj4;
                u83 u83Var = (u83) obj3;
                lg4 lg4Var = (lg4) obj5;
                qc qcVar = (qc) obj2;
                ni niVar2 = (ni) obj;
                float fFloatValue = ((Number) niVar2.v.getValue()).floatValue() - r54Var.j;
                if (fb6.v(fFloatValue)) {
                    if (((Boolean) qcVar.a(Float.valueOf(r54Var.j))).booleanValue()) {
                        niVar2.g();
                    }
                } else if (fb6.v(fFloatValue - u83Var.n(lg4Var, fFloatValue))) {
                    r54Var.j += fFloatValue;
                    if (((Boolean) qcVar.a(Float.valueOf(r54Var.j))).booleanValue()) {
                        niVar2.g();
                    }
                } else {
                    niVar2.g();
                }
                return og5Var;
            case 3:
                ob3 ob3Var = (ob3) obj2;
                o04 o04Var = (o04) obj;
                o04Var.getClass();
                xq2.E(o04Var, (Context) obj4, (yi2) obj3, (l62) obj5, ((x93) ob3Var.getValue()).g, ((x93) ob3Var.getValue()).r);
                return og5Var;
            case 4:
                gx3 gx3Var = (gx3) obj4;
                hm3 hm3Var = (hm3) obj3;
                ob3 ob3Var2 = (ob3) obj5;
                ob3 ob3Var3 = (ob3) obj2;
                String str = (String) obj;
                str.getClass();
                String strT = xi3.t("option_", hm3Var.y);
                boolean z = hm3Var.l;
                numValueOf = (2 & 2) == 0 ? Integer.valueOf(R.string.premium_feature_fullscreen_mode) : null;
                boolean z2 = (2 & 4) == 0 ? z : true;
                gx3Var.getClass();
                if (!z2 || gx3Var.g) {
                    ob3Var2.setValue(str);
                    ob3Var3.setValue(false);
                } else {
                    gx3Var.n.l(strT, numValueOf);
                }
                return og5Var;
            case 5:
                gx3 gx3Var2 = (gx3) obj4;
                ob3 ob3Var4 = (ob3) obj5;
                ob3 ob3Var5 = (ob3) obj2;
                float fFloatValue2 = ((Float) obj).floatValue();
                String strConcat = "option_".concat(((km3) obj3).y);
                numValueOf = (2 & 2) == 0 ? Integer.valueOf(R.string.premium_feature_fullscreen_mode) : null;
                boolean z3 = (2 & 4) != 0;
                gx3Var2.getClass();
                if (!z3 || gx3Var2.g) {
                    ob3Var4.setValue(true);
                    ob3Var5.setValue(Integer.valueOf((int) (fFloatValue2 * 100.0f)));
                } else {
                    gx3Var2.n.l(strConcat, numValueOf);
                }
                return og5Var;
            case 6:
                gx3.g((gx3) obj4, "option_".concat(((jm3) obj3).y), false, new nm1((ob3) obj5, ((Boolean) obj).booleanValue(), (String) obj2), 2);
                return og5Var;
            default:
                es2 es2Var = (es2) obj;
                es2Var.getClass();
                List list = (List) ((xy1) obj5).a((xl4) obj4);
                es2Var.H(list.size(), null, new wk0(list, (byte) 8), new nm0(2039820996, true, new om4(list, list, (my1) obj3, (xy1) obj2)));
                return og5Var;
        }
    }

    public /* synthetic */ mg(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
    }
}
