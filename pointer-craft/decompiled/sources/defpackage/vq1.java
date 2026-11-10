package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class vq1 implements cz1 {
    public final /* synthetic */ nm0 j;

    public vq1(nm0 nm0Var) {
        this.j = nm0Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        h02 h02Var = (h02) obj2;
        ((Number) obj3).intValue();
        Object objK = h02Var.K();
        if (objK == oo0.g) {
            objK = new q21((byte) 11);
            h02Var.i0(objK);
        }
        AtomicInteger atomicInteger = dj4.g;
        mh0 mh0Var = new mh0((xy1) objK);
        kb4 kb4VarG = jb4.g(v70.y, hi0.p, h02Var, 0);
        int iS = pw5.s(h02Var);
        tr3 tr3VarQ = h02Var.q();
        j73 j73VarW = m50.W(h02Var, mh0Var);
        jo0.n.getClass();
        h02Var.b0();
        if (h02Var.S) {
            h02Var.m(um2.Z);
        } else {
            h02Var.l0();
        }
        xs2.E(tg1.w, h02Var, kb4VarG);
        xs2.E(tg1.q, h02Var, tr3VarQ);
        on0 on0Var = tg1.c;
        if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
            du4.f(iS, h02Var, iS, on0Var);
        }
        xs2.E(tg1.m, h02Var, j73VarW);
        mq2.y(h02Var, mq4.q(g73.g, m50.d));
        this.j.l(h02Var, 0);
        h02Var.b(true);
        return og5.g;
    }
}
