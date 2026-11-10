package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mc3 implements gu2, wl5, a52, id4 {
    public final Bundle a;
    public boolean b;
    public final Bundle c;
    public final ji i;
    public final jq j;
    public wt2 m;
    public final ju2 p = new ju2(this, true);
    public final q64 q;
    public final o05 s;
    public ad3 t;
    public wt2 u;
    public final String w;

    public mc3(jq jqVar, ad3 ad3Var, Bundle bundle, wt2 wt2Var, q64 q64Var, String str, Bundle bundle2) {
        this.j = jqVar;
        this.t = ad3Var;
        this.a = bundle;
        this.m = wt2Var;
        this.q = q64Var;
        this.w = str;
        this.c = bundle2;
        byte b = 0;
        this.i = new ji(new hd4(this, new gd4(this, b)));
        this.s = new o05(new lc3(b));
        new o05(new lc3((byte) 1));
        this.u = wt2.t;
    }

    @Override // defpackage.gu2
    public final ju2 a() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        boolean zL;
        if (obj != null && (obj instanceof mc3)) {
            mc3 mc3Var = (mc3) obj;
            Bundle bundle = mc3Var.a;
            Bundle bundle2 = this.a;
            if (yf2.p(bundle2, bundle)) {
                zL = true;
            } else {
                zL = (bundle2 == null || bundle == null) ? false : sp2.l(bundle2, bundle);
            }
            if (this.w.equals(mc3Var.w) && yf2.p(this.t, mc3Var.t) && yf2.p(this.p, mc3Var.p) && ((ji) this.i.a) == ((ji) mc3Var.i.a) && zL) {
                return true;
            }
        }
        return false;
    }

    public final Bundle g() {
        Bundle bundle = this.a;
        if (bundle == null) {
            return null;
        }
        Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
        bundleN.putAll(bundle);
        return bundleN;
    }

    public final int hashCode() {
        int iHashCode = this.t.hashCode() + (this.w.hashCode() * 31);
        Bundle bundle = this.a;
        if (bundle != null) {
            iHashCode = (iHashCode * 31) + sp2.j(bundle);
        }
        int iHashCode2 = this.p.hashCode();
        return ((ji) this.i.a).hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    @Override // defpackage.a52
    public final ea3 l() {
        Application application;
        ea3 ea3Var = new ea3(0);
        tg1 tg1Var = k33.A;
        LinkedHashMap linkedHashMap = ea3Var.g;
        linkedHashMap.put(tg1Var, this);
        linkedHashMap.put(k33.B, this);
        Bundle bundleG = g();
        if (bundleG != null) {
            linkedHashMap.put(k33.C, bundleG);
        }
        jq jqVar = this.j;
        if (jqVar == null) {
            application = null;
        } else {
            Context context = jqVar.j;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(sl5.n, application2);
        }
        return ea3Var;
    }

    public final void n() {
        if (!this.b) {
            ji jiVar = this.i;
            jiVar.P();
            this.b = true;
            if (this.q != null) {
                k33.G(this);
            }
            jiVar.Q(this.c);
        }
        int iOrdinal = this.m.ordinal();
        int iOrdinal2 = this.u.ordinal();
        ju2 ju2Var = this.p;
        if (iOrdinal < iOrdinal2) {
            ju2Var.l(this.m);
        } else {
            ju2Var.l(this.u);
        }
    }

    @Override // defpackage.id4
    public final ji r() {
        return (ji) this.i.a;
    }

    @Override // defpackage.wl5
    public final vl5 t() {
        if (!this.b) {
            l0.z("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (this.p.t == wt2.j) {
            l0.z("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        q64 q64Var = this.q;
        if (q64Var == null) {
            l0.z("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        hb3 hb3Var = ((yl5) ((o05) ((zl5) q64Var.t).r).getValue()).y;
        String str = this.w;
        Object objL = hb3Var.l(str);
        if (objL == null) {
            objL = new xl5(str);
            hb3Var.c(str, objL);
        }
        return ((xl5) objL).y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(v54.g(sb.getClass()).r());
        sb.append("(" + this.w + ")");
        sb.append(" destination=");
        sb.append(this.t);
        return sb.toString();
    }

    @Override // defpackage.a52
    public final tl5 x() {
        return (kd4) this.s.getValue();
    }
}
