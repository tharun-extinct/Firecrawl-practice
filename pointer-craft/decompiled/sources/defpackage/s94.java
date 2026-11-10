package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s94 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ s94(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                q01 q01Var = (q01) obj;
                q01Var.getClass();
                return ((x94) obj2).l(q01Var);
            case 1:
                uc4 uc4Var = ((sc4) obj2).a;
                return Boolean.valueOf(uc4Var != null ? uc4Var.n(obj) : true);
            case 2:
                rf4 rf4Var = (rf4) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                qp3 qp3Var = rf4Var.g;
                float fD = qp3Var.d() + fFloatValue + rf4Var.l;
                float fQ = xs2.q(fD, 0.0f, rf4Var.x.d());
                boolean z = fD == fQ;
                float fD2 = fQ - qp3Var.d();
                int iRound = Math.round(fD2);
                qp3Var.e(qp3Var.d() + iRound);
                rf4Var.l = fD2 - iRound;
                if (!z) {
                    fFloatValue = fD2;
                }
                return Float.valueOf(fFloatValue);
            case 3:
                ng4 ng4Var = (ng4) obj2;
                return new wi3(ng4Var.n(ng4Var.m, ((wi3) obj).g, ng4Var.a));
            case 4:
                lj4.t((nj4) obj, ((o94) obj2).g);
                return og5.g;
            case 5:
                ((List) obj).add((Float) ((zr2) obj2).g());
                return true;
            case 6:
                obj.getClass();
                return ((y4) obj2).g();
            case 7:
                tp4 tp4Var = (tp4) obj2;
                o84 o84Var = (o84) obj;
                o84Var.j(tp4Var.o);
                o84Var.t(tp4Var.f);
                o84Var.r(tp4Var.k);
                float f = tp4Var.d;
                if (o84Var.q != f) {
                    o84Var.j |= 8;
                    o84Var.q = f;
                }
                o84Var.i(tp4Var.e);
                o84Var.a(tp4Var.A);
                float f2 = tp4Var.B;
                if (o84Var.s != f2) {
                    o84Var.j |= 256;
                    o84Var.s = f2;
                }
                float f3 = tp4Var.C;
                if (o84Var.p != f3) {
                    o84Var.j |= 512;
                    o84Var.p = f3;
                }
                float f4 = tp4Var.D;
                if (o84Var.u != f4) {
                    o84Var.j |= 1024;
                    o84Var.u = f4;
                }
                float f5 = tp4Var.E;
                if (o84Var.z != f5) {
                    o84Var.j |= 2048;
                    o84Var.z = f5;
                }
                o84Var.c(tp4Var.F);
                o84Var.m(tp4Var.G);
                o84Var.x(tp4Var.H);
                o84Var.v(tp4Var.I);
                o84Var.q(tp4Var.J);
                int i = tp4Var.K;
                if (o84Var.k != i) {
                    o84Var.j |= 32768;
                    o84Var.k = i;
                }
                int i2 = tp4Var.L;
                if (o84Var.D != i2) {
                    o84Var.j |= 524288;
                    o84Var.D = i2;
                }
                m30 m30Var = tp4Var.M;
                if (!yf2.p(o84Var.C, m30Var)) {
                    o84Var.j |= 262144;
                    o84Var.C = m30Var;
                }
                qk2 qk2Var = tp4Var.N;
                if (!yf2.p(o84Var.e, qk2Var)) {
                    o84Var.j |= 1048576;
                    o84Var.e = qk2Var;
                }
                return og5.g;
            case 8:
                zp4 zp4Var = (zp4) obj2;
                wj4 wj4Var = zp4Var.x;
                wj4Var.getClass();
                if (!yf2.p(zp4Var.x, wj4Var)) {
                    aw3.y("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                ib3 ib3Var = zp4Var.v;
                Object obj3 = zp4Var.r;
                if (ib3Var != null) {
                    if (obj3 != null) {
                        aw3.y("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    ib3Var.g(obj);
                } else if (obj3 == null) {
                    zp4Var.r = obj;
                } else {
                    ib3 ib3Var2 = fe4.g;
                    ib3 ib3Var3 = new ib3();
                    ib3Var3.g(obj3);
                    ib3Var3.g(obj);
                    zp4Var.v = ib3Var3;
                    zp4Var.r = null;
                }
                return og5.g;
            case 9:
                ut4 ut4Var = (ut4) obj2;
                synchronized (ut4Var.l) {
                    tt4 tt4Var = ut4Var.t;
                    tt4Var.getClass();
                    Object obj4 = tt4Var.y;
                    obj4.getClass();
                    int i3 = tt4Var.n;
                    ta3 ta3Var = tt4Var.r;
                    if (ta3Var == null) {
                        ta3Var = new ta3();
                        tt4Var.r = ta3Var;
                        tt4Var.x.c(obj4, ta3Var);
                    }
                    tt4Var.y(obj, i3, obj4, ta3Var);
                }
                return og5.g;
            case 10:
                ni niVar = (ni) obj;
                ((bz1) obj2).l(niVar.v.getValue(), m50.w.y.a(niVar.x));
                return og5.g;
            default:
                p75 p75Var = (p75) obj2;
                bj bjVar = (bj) obj;
                yi yiVar = (yi) bjVar.g;
                if (yiVar instanceof nv2) {
                    nv2 nv2Var = (nv2) yiVar;
                    if (nv2Var.g() == null) {
                        return bj.g(bjVar, nv2.y(nv2Var, p75Var), 0, 14);
                    }
                }
                if (!(yiVar instanceof mv2)) {
                    return bjVar;
                }
                mv2 mv2Var = (mv2) yiVar;
                return mv2Var.g() == null ? bj.g(bjVar, mv2.y(mv2Var, p75Var), 0, 14) : bjVar;
        }
    }
}
