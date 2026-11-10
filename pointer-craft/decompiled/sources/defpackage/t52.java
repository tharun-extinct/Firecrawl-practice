package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t52 {
    public final Object g;
    public final Object j;
    public final Object l;
    public final Object n;
    public final Object r;
    public final Object v;
    public final Object x;
    public final Object y;

    public t52() {
        Boolean bool = Boolean.FALSE;
        this.g = kq2.M(bool);
        this.y = new pp3(1.0f);
        this.r = kq2.M(bool);
        this.n = new pp3(1.0f);
        this.v = kq2.M(bool);
        this.x = kq2.M(new vb5(vb5.y));
        this.l = kq2.M(bool);
        this.j = kq2.M(new jj0(jj0.l));
    }

    public String g() {
        int i = ((AtomicInteger) this.x).get();
        int i2 = ((AtomicInteger) this.l).get();
        int i3 = ((AtomicInteger) this.j).get();
        StringBuilder sbS = du4.s(i, i2, "regGen=", " abandoned=", " staleUnreg=");
        sbS.append(i3);
        return sbS.toString();
    }

    public t52(d5 d5Var) {
        this.g = d5Var;
        this.y = new ec3();
        this.r = new AtomicReference(null);
        this.n = new AtomicReference(null);
        this.v = new AtomicBoolean(false);
        this.x = new AtomicInteger(0);
        this.l = new AtomicInteger(0);
        this.j = new AtomicInteger(0);
    }
}
