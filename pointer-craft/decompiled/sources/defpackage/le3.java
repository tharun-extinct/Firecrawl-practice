package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class le3 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nm0 c;
    public final /* synthetic */ ee3 j;
    public final /* synthetic */ zu4 m;
    public final /* synthetic */ bz1 q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean w;

    public le3(ee3 ee3Var, boolean z, boolean z2, zu4 zu4Var, bz1 bz1Var, boolean z3, nm0 nm0Var) {
        this.j = ee3Var;
        this.t = z;
        this.a = z2;
        this.m = zu4Var;
        this.q = bz1Var;
        this.w = z3;
        this.c = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        long j;
        j73 mh0Var;
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.a;
            boolean z2 = this.t;
            ee3 ee3Var = this.j;
            if (z) {
                j = z2 ? ee3Var.g : ee3Var.n;
            } else {
                j = ee3Var.x;
            }
            bw4 bw4VarG = aq4.g(j, this.m, null, h02Var, 0, 12);
            if (this.q == null || !(this.w || z2)) {
                h02Var.X(-634793532);
                h02Var.b(false);
                mh0Var = g73.g;
            } else {
                h02Var.X(-634794445);
                Object objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new m92((byte) 21);
                    h02Var.i0(objK);
                }
                AtomicInteger atomicInteger = dj4.g;
                mh0Var = new mh0((xy1) objK);
                h02Var.b(false);
            }
            t33 t33VarR = z50.r(hi0.t, false);
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
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            vf1 vf1Var = mt0.g;
            jj0 jj0Var = (jj0) bw4VarG.getValue();
            long j2 = jj0Var.g;
            og0.y(vf1Var.g(jj0Var), this.c, h02Var, 8);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
