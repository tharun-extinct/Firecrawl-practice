package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class md0 extends nh4 {
    public final m70 c;
    public final /* synthetic */ AtomicReferenceArray i;

    public md0(long j, md0 md0Var, m70 m70Var, int i) {
        super(j, md0Var, i);
        this.c = m70Var;
        this.i = new AtomicReferenceArray(o70.y * 2);
    }

    public final void c(int i, Object obj) {
        this.i.set(i * 2, obj);
    }

    public final void i(int i, Object obj) {
        this.i.set((i * 2) + 1, obj);
    }

    @Override // defpackage.nh4
    public final void j(int i, fx0 fx0Var) {
        m70 m70Var;
        int i2 = o70.y;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.i.get(i * 2);
        while (true) {
            Object objQ = q(i);
            boolean z2 = objQ instanceof an5;
            m70Var = this.c;
            if (z2 || (objQ instanceof bn5)) {
                if (m(i, objQ, z ? o70.a : o70.m)) {
                    c(i, null);
                    w(i, !z);
                    if (z) {
                        m70Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objQ == o70.a || objQ == o70.m) {
                    break;
                }
                if (objQ != o70.l && objQ != o70.x) {
                    if (objQ == o70.t || objQ == o70.n || objQ == o70.q) {
                        return;
                    }
                    l0.b(objQ, "unexpected state: ");
                    return;
                }
            }
        }
        c(i, null);
        if (z) {
            m70Var.getClass();
        }
    }

    @Override // defpackage.nh4
    public final int l() {
        return o70.y;
    }

    public final boolean m(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.i;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object q(int i) {
        return this.i.get((i * 2) + 1);
    }

    public final void w(int i, boolean z) {
        if (z) {
            m70 m70Var = this.c;
            m70Var.getClass();
            m70Var.N((this.m * ((long) o70.y)) + ((long) i));
        }
        t();
    }
}
