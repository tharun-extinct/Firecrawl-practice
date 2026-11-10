package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bc implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ bc(g52 g52Var, String str, String str2, rw3 rw3Var) {
        this.j = (byte) 3;
        this.t = str;
        this.a = str2;
        this.m = rw3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        mu0 mu0Var;
        byte b = this.j;
        boolean zBooleanValue = false;
        og5 og5Var = og5.g;
        byte b2 = 1;
        mu0 mu0Var2 = null;
        Object obj2 = this.m;
        Object obj3 = this.a;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                kx1 kx1Var = (kx1) obj4;
                wt2 wt2Var = (wt2) obj2;
                pw1 pw1VarD = kx1Var.D(((ww1) obj3).n().getId());
                if (pw1VarD != null && !kx1Var.S() && wt2Var.compareTo(wt2.a) >= 0) {
                    fw fwVar = new fw(kx1Var);
                    fwVar.i = true;
                    fwVar.t(pw1VarD, wt2Var);
                    if (fwVar.l) {
                        l0.z("This transaction is already being added to the back stack");
                        return null;
                    }
                    fwVar.s.B(fwVar, false);
                }
                return new fc((byte) 0);
            case 1:
                fl5 fl5Var = (fl5) obj4;
                um2 um2Var = (um2) obj3;
                fl5 fl5Var2 = (fl5) obj2;
                nb0 nb0VarB = ((xd1) obj).E().b();
                if (fl5Var.t.getVisibility() != 8) {
                    fl5Var.F = true;
                    pn3 pn3Var = um2Var.h;
                    ba baVar = pn3Var instanceof ba ? (ba) pn3Var : null;
                    if (baVar != null) {
                        Canvas canvasG = d9.g(nb0VarB);
                        baVar.getAndroidViewsHandler$ui().getClass();
                        fl5Var2.draw(canvasG);
                    }
                    fl5Var.F = false;
                }
                return og5Var;
            case 2:
                nt1 nt1Var = (nt1) obj3;
                xy1 xy1Var = (xy1) obj2;
                cu1 cu1Var = (cu1) obj;
                if (!yf2.p(cu1Var, (cu1) obj4)) {
                    if (yf2.p(cu1Var, nt1Var.r)) {
                        l0.z("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) xy1Var.a(cu1Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 3:
                String str = (String) obj4;
                String str2 = (String) obj3;
                rw3 rw3Var = (rw3) obj2;
                db3 db3Var = (db3) obj;
                rw3 rw3Var2 = g52.r;
                rw3 rw3Var3 = g52.n;
                String str3 = "";
                if (((String) m50.O(db3Var, rw3Var3, "")).equals(str)) {
                    rw3 rw3VarR = g52.r(db3Var, str);
                    if (rw3VarR != null && !rw3VarR.g.equals(str2)) {
                        g52.n(db3Var, str);
                        HashSet hashSet = new HashSet((Collection) m50.O(db3Var, rw3Var, new HashSet()));
                        hashSet.add(str);
                        db3Var.x(rw3Var, hashSet);
                    }
                    return null;
                }
                long jLongValue = ((Long) m50.O(db3Var, rw3Var2, 0L)).longValue();
                if (jLongValue + 1 == 30) {
                    long jLongValue2 = ((Long) m50.O(db3Var, rw3Var2, 0L)).longValue();
                    Set hashSet2 = new HashSet();
                    String str4 = null;
                    for (Map.Entry entry : db3Var.g().entrySet()) {
                        if (entry.getValue() instanceof Set) {
                            Set<String> set = (Set) entry.getValue();
                            for (String str5 : set) {
                                mu0 mu0Var3 = mu0Var2;
                                if (str4 == null || str4.compareTo(str5) > 0) {
                                    str3 = ((rw3) entry.getKey()).g;
                                    str4 = str5;
                                    hashSet2 = set;
                                }
                                mu0Var2 = mu0Var3;
                            }
                        }
                        mu0Var2 = mu0Var2;
                    }
                    mu0Var = mu0Var2;
                    HashSet hashSet3 = new HashSet(hashSet2);
                    hashSet3.remove(str4);
                    str3.getClass();
                    db3Var.x(new rw3(str3), hashSet3);
                    jLongValue = jLongValue2 - 1;
                    db3Var.x(rw3Var2, Long.valueOf(jLongValue));
                } else {
                    mu0Var = null;
                }
                HashSet hashSet4 = new HashSet((Collection) m50.O(db3Var, rw3Var, new HashSet()));
                hashSet4.add(str);
                db3Var.x(rw3Var, hashSet4);
                db3Var.x(rw3Var2, Long.valueOf(jLongValue + 1));
                db3Var.x(rw3Var3, str);
                return mu0Var;
            case 4:
                gu2 gu2Var = (gu2) obj4;
                final ou2 ou2Var = (ou2) obj3;
                final xy1 xy1Var2 = (xy1) obj2;
                final u54 u54Var = new u54();
                du2 du2Var = new du2() { // from class: au2
                    @Override // defpackage.du2
                    public final void b(gu2 gu2Var2, vt2 vt2Var) {
                        int i = cu2.g[vt2Var.ordinal()];
                        u54 u54Var2 = u54Var;
                        if (i == 1) {
                            u54Var2.j = xy1Var2.a(ou2Var);
                        } else {
                            if (i != 2) {
                                return;
                            }
                            pu2 pu2Var = (pu2) u54Var2.j;
                            if (pu2Var != null) {
                                pu2Var.g();
                            }
                            u54Var2.j = null;
                        }
                    }
                };
                gu2Var.a().g(du2Var);
                return new bh(gu2Var, du2Var, u54Var, (byte) 1);
            case 5:
                xy1 xy1Var3 = (xy1) obj3;
                rp3 rp3Var = (rp3) obj2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (((gu2) obj4).a().t.compareTo(wt2.q) >= 0 && jCurrentTimeMillis - rp3Var.d() >= 500) {
                    rp3Var.e(jCurrentTimeMillis);
                    xy1Var3.a(obj);
                }
                return og5Var;
            case 6:
                gu2 gu2Var2 = (gu2) obj4;
                b30 b30Var = (b30) obj3;
                ((wa1) obj).getClass();
                ol0 ol0Var = new ol0(b30Var, (Context) obj2, b2);
                gu2Var2.a().g(ol0Var);
                gu2Var2.a().g(b30Var.r.g);
                return new bh(gu2Var2, ol0Var, b30Var, (byte) 2);
            case 7:
                qr0 qr0Var = (qr0) obj4;
                g61 g61Var = (g61) obj;
                g61Var.getClass();
                qr0Var.v(g61Var.t);
                qr0Var.B = m50.T(v70.d(qr0Var), null, new rz(qr0Var, (String) obj3, mu0Var2, b2), 3);
                ((gp) obj2).v.setValue(null);
                return og5Var;
            case 8:
                we1 we1Var = (we1) obj3;
                ox0 ox0Var = (ox0) obj2;
                nj4 nj4Var = (nj4) obj;
                lj4.l(nj4Var, (String) obj4);
                if (we1Var.r()) {
                    nj4Var.g(yi4.o, new p1(null, new co(we1Var, ox0Var)));
                }
                return og5Var;
            default:
                sc4 sc4Var = (sc4) obj4;
                xc4 xc4Var = (xc4) obj2;
                hb3 hb3Var = sc4Var.t;
                if (hb3Var.y(obj3)) {
                    uo1.C(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                sc4Var.j.remove(obj3);
                hb3Var.c(obj3, xc4Var);
                return new bh(sc4Var, obj3, xc4Var, (byte) 3);
        }
    }

    public /* synthetic */ bc(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }
}
