package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements mq {
    public final Serializable a;
    public final Object j;
    public Object t;

    public t(x94 x94Var) {
        x94Var.getClass();
        this.j = x94Var;
        this.t = new AtomicBoolean(false);
        this.a = new o05(new gd4(this, (byte) 5));
    }

    public gy1 g() {
        x94 x94Var = (x94) this.j;
        x94Var.g();
        if (((AtomicBoolean) this.t).compareAndSet(false, true)) {
            return (gy1) ((o05) this.a).getValue();
        }
        String strM = m();
        x94Var.getClass();
        x94Var.g();
        x94Var.y();
        return x94Var.t().K().t(strM);
    }

    public abstract String m();

    @Override // defpackage.mq
    public void p() {
        ArrayList arrayList = (ArrayList) this.a;
        this.t = arrayList.remove(arrayList.size() - 1);
    }

    public void q() {
        Object obj = this.j;
        obj.getClass();
        ((jh1) obj).y.clear();
    }

    @Override // defpackage.mq
    public void r(Object obj) {
        ((ArrayList) this.a).add(this.t);
        this.t = obj;
    }

    @Override // defpackage.mq
    public Object t() {
        return this.t;
    }

    public void v() {
        ((ArrayList) this.a).clear();
        this.t = this.j;
        q();
    }

    public void w(gy1 gy1Var) {
        gy1Var.getClass();
        if (gy1Var == ((gy1) ((o05) this.a).getValue())) {
            ((AtomicBoolean) this.t).set(false);
        }
    }

    public t(Object obj) {
        this.j = obj;
        this.a = new ArrayList();
        this.t = obj;
    }
}
