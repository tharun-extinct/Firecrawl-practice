package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ve6 implements xj3, nu0 {
    public final Object j;
    public final Object t;

    public ve6(Context context) {
        this.t = new AtomicLong(-1L);
        this.j = new vv5(context, vv5.m, new f35("mlkit:vision"), j32.y);
    }

    @Override // defpackage.nu0
    public Object o(nj6 nj6Var) {
        Bundle bundle;
        ob4 ob4Var = (ob4) this.j;
        Bundle bundle2 = (Bundle) this.t;
        ob4Var.getClass();
        return (nj6Var.t() && (bundle = (Bundle) nj6Var.l()) != null && bundle.containsKey("google.messenger")) ? ob4Var.r(bundle2).a(dp1.a, t32.z) : nj6Var;
    }

    @Override // defpackage.xj3
    public void s(nj6 nj6Var) {
        jj6 jj6Var = (jj6) this.j;
        x25 x25Var = (x25) this.t;
        synchronized (jj6Var.x) {
            jj6Var.v.remove(x25Var);
        }
    }

    public /* synthetic */ ve6(Object obj, Object obj2) {
        this.j = obj;
        this.t = obj2;
    }
}
