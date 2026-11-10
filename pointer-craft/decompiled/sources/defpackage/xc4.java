package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xc4 implements uc4, id4 {
    public ji a;
    public final /* synthetic */ vc4 j;
    public ju2 t;

    public xc4(vc4 vc4Var) {
        this.j = vc4Var;
        Object objX = vc4Var.x("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objX instanceof Bundle ? (Bundle) objX : null;
        if (bundle != null && this.a == null) {
            ji jiVar = new ji(new hd4(this, new gd4(this, (byte) 0)));
            this.a = jiVar;
            jiVar.Q(bundle);
        }
        vc4Var.g("androidx.savedstate.SavedStateRegistry", new gf(this, (byte) 28));
    }

    @Override // defpackage.gu2
    public final ju2 a() {
        ju2 ju2Var = this.t;
        if (ju2Var != null) {
            return ju2Var;
        }
        ju2 ju2Var2 = new ju2(this, false);
        this.t = ju2Var2;
        return ju2Var2;
    }

    @Override // defpackage.uc4
    public final tc4 g(String str, my1 my1Var) {
        return this.j.g(str, my1Var);
    }

    @Override // defpackage.uc4
    public final boolean n(Object obj) {
        return this.j.n(obj);
    }

    @Override // defpackage.id4
    public final ji r() {
        ji jiVar = this.a;
        if (jiVar == null) {
            ji jiVar2 = new ji(new hd4(this, new gd4(this, (byte) 0)));
            this.a = jiVar2;
            jiVar2.Q(null);
            jiVar = jiVar2;
        }
        return (ji) jiVar.a;
    }

    @Override // defpackage.uc4
    public final Map v() {
        return this.j.v();
    }

    @Override // defpackage.uc4
    public final Object x(String str) {
        return this.j.x(str);
    }
}
