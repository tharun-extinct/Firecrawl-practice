package defpackage;

import android.app.Application;
import io.appground.blek.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b30 extends pl5 {
    public static final /* synthetic */ int l = 0;
    public final f34 n;
    public final v20 r;
    public final ew4 v;
    public final f34 x;
    public final Application y;

    static {
        HashMap map = new HashMap();
        Integer numValueOf = Integer.valueOf(R.drawable.ic_baseline_star_outline_24);
        map.put("donation", numValueOf);
        map.put(v20.r, numValueOf);
        map.put("premium_yearly", numValueOf);
    }

    public b30(Application application, v20 v20Var) {
        application.getClass();
        v20Var.getClass();
        this.y = application;
        this.r = v20Var;
        this.n = pw5.N(new w00(v20Var.y("premium_yearly"), (byte) 1), v70.d(this), ro4.g, null);
        ew4 ew4VarW = y94.w(new w14(null, null, 15));
        this.v = ew4VarW;
        this.x = pw5.j(ew4VarW);
    }

    public final f10 v(String str) {
        str.getClass();
        v20 v20Var = this.r;
        v20Var.getClass();
        w10 w10Var = v20Var.g;
        w10Var.getClass();
        Object obj = w10Var.o.get(str);
        obj.getClass();
        return new f10((ew4) obj, (byte) 0);
    }

    public final void x() {
        ew4 ew4Var = this.v;
        if (((w14) ew4Var.getValue()).n) {
            return;
        }
        ew4Var.m(null, new w14(null, null, 7));
        this.r.g.e();
        m50.T(v70.d(this), null, new y20(this, null), 3);
    }
}
