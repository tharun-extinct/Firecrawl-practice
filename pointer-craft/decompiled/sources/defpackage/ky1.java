package defpackage;

import android.content.Context;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class ky1 extends zz4 implements bz1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ q8 c;
    public final /* synthetic */ gx3 i;
    public boolean q;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky1(boolean z, q8 q8Var, gx3 gx3Var, Context context, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = z;
        this.c = q8Var;
        this.i = gx3Var;
        this.b = context;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new ky1(this.w, this.c, this.i, this.b, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((ky1) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        oi oiVar;
        boolean z = this.q;
        og5 og5Var = og5.g;
        if (z) {
            if (z) {
                js2.o(obj);
                return og5Var;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        if (this.w) {
            q8 q8Var = this.c;
            if (q8Var.j.getValue() == ac1.t) {
                Integer num = new Integer(R.string.premium_feature_fullscreen_mode);
                gx3 gx3Var = this.i;
                gx3Var.getClass();
                if (gx3Var.g) {
                    kq2.U(gp4.F(this.b));
                } else {
                    gx3Var.n.l("fullscreen_drag_msg", num);
                }
                this.q = true;
                if (q8Var.r()) {
                    oiVar = q8Var.n;
                    if (oiVar == null) {
                        yf2.Y("snapAnimationSpec");
                        throw null;
                    }
                } else {
                    oiVar = h7.g;
                }
                n7 n7Var = new n7(q8Var, oiVar, null);
                Object objG = q8Var.g(ac1.j, ub3.j, n7Var, this);
                px0 px0Var = px0.j;
                if (objG != px0Var) {
                    objG = og5Var;
                }
                if (objG == px0Var) {
                    return px0Var;
                }
            }
        }
        return og5Var;
    }
}
