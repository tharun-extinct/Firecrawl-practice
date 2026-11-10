package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class al1 extends xi4 {
    public final p44 g;
    public final wi4 r;
    public final fa4 y;

    public al1(d31 d31Var, fa4 fa4Var, p44 p44Var, wi4 wi4Var) {
        d31Var.y.add(this);
        xs2.l(p44Var != null);
        this.y = fa4Var;
        this.g = p44Var;
        this.r = wi4Var;
    }

    @Override // defpackage.xi4
    public final void g(Object obj, boolean z) {
        int iF = this.y.F(obj);
        if (iF >= 0) {
            this.r.accept(new xa0(this, iF, (byte) 1));
        } else {
            Log.w("EventsRelays", "Item change notification received for unknown item: " + obj);
        }
    }
}
