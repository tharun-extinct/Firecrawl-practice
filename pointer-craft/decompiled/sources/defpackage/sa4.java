package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sa4 {
    public final t5 g;
    public final ArrayList l;
    public final boolean n;
    public final l34 r;
    public final List v;
    public int x;
    public final fa4 y;

    public sa4(t5 t5Var, fa4 fa4Var, l34 l34Var, boolean z) {
        List<Proxy> listSelect;
        List listW;
        fa4Var.getClass();
        this.g = t5Var;
        this.y = fa4Var;
        this.r = l34Var;
        this.n = z;
        this.v = pi1.j;
        this.l = new ArrayList();
        a92 a92Var = t5Var.t;
        Proxy proxy = t5Var.l;
        l34Var.m.getClass();
        if (proxy != null) {
            listW = pw5.k(proxy);
        } else {
            URI uriL = a92Var.l();
            if (uriL.getHost() == null) {
                listW = ws5.w(new Proxy[]{Proxy.NO_PROXY});
            } else {
                try {
                    listSelect = t5Var.j.select(uriL);
                } catch (IllegalArgumentException unused) {
                    listSelect = null;
                }
                listW = (listSelect == null || listSelect.isEmpty()) ? ws5.w(new Proxy[]{Proxy.NO_PROXY}) : ws5.q(listSelect);
            }
        }
        this.v = listW;
        this.x = 0;
        dl1 dl1Var = this.r.m;
        List list = this.v;
        dl1Var.getClass();
        list.getClass();
    }

    public final boolean g() {
        return this.x < this.v.size() || !this.l.isEmpty();
    }
}
