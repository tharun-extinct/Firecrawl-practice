package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xx1 implements a52, id4, wl5 {
    public final fw1 a;
    public final pw1 j;
    public tl5 m;
    public final vl5 t;
    public ju2 q = null;
    public ji w = null;

    public xx1(pw1 pw1Var, vl5 vl5Var, fw1 fw1Var) {
        this.j = pw1Var;
        this.t = vl5Var;
        this.a = fw1Var;
    }

    @Override // defpackage.gu2
    public final ju2 a() {
        n();
        return this.q;
    }

    public final void g(vt2 vt2Var) {
        this.q.n(vt2Var);
    }

    @Override // defpackage.a52
    public final ea3 l() {
        Application application;
        pw1 pw1Var = this.j;
        Context applicationContext = pw1Var.N().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        ea3 ea3Var = new ea3(0);
        LinkedHashMap linkedHashMap = ea3Var.g;
        if (application != null) {
            linkedHashMap.put(sl5.n, application);
        }
        linkedHashMap.put(k33.A, pw1Var);
        linkedHashMap.put(k33.B, this);
        Bundle bundle = pw1Var.w;
        if (bundle != null) {
            linkedHashMap.put(k33.C, bundle);
        }
        return ea3Var;
    }

    public final void n() {
        if (this.q == null) {
            this.q = new ju2(this, true);
            ji jiVar = new ji(new hd4(this, new gd4(this, (byte) 0)));
            this.w = jiVar;
            jiVar.P();
            this.a.run();
        }
    }

    @Override // defpackage.id4
    public final ji r() {
        n();
        return (ji) this.w.a;
    }

    @Override // defpackage.wl5
    public final vl5 t() {
        n();
        return this.t;
    }

    @Override // defpackage.a52
    public final tl5 x() {
        Application application;
        pw1 pw1Var = this.j;
        tl5 tl5VarX = pw1Var.x();
        if (!tl5VarX.equals(pw1Var.b0)) {
            this.m = tl5VarX;
            return tl5VarX;
        }
        tl5 tl5Var = this.m;
        if (tl5Var != null) {
            return tl5Var;
        }
        for (Context applicationContext = pw1Var.N().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                kd4 kd4Var = new kd4(application, pw1Var, pw1Var.w);
                this.m = kd4Var;
                return kd4Var;
            }
        }
        application = null;
        kd4 kd4Var2 = new kd4(application, pw1Var, pw1Var.w);
        this.m = kd4Var2;
        return kd4Var2;
    }
}
