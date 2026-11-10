package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kb5 implements mj5 {
    public static kb5 q;
    public Object a;
    public Object j;
    public Object m;
    public Object t;

    public kb5(Typeface typeface, w53 w53Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.m = typeface;
        this.j = w53Var;
        this.a = new x53(1024);
        int iG = w53Var.g(6);
        if (iG != 0) {
            int i5 = iG + w53Var.j;
            i = ((ByteBuffer) w53Var.m).getInt(((ByteBuffer) w53Var.m).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.t = new char[i * 2];
        int iG2 = w53Var.g(6);
        if (iG2 != 0) {
            int i6 = iG2 + w53Var.j;
            i2 = ((ByteBuffer) w53Var.m).getInt(((ByteBuffer) w53Var.m).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            ff5 ff5Var = new ff5(this, i7);
            v53 v53VarY = ff5Var.y();
            int iG3 = v53VarY.g(4);
            Character.toChars(iG3 != 0 ? ((ByteBuffer) v53VarY.m).getInt(iG3 + v53VarY.j) : 0, (char[]) this.t, i7 * 2);
            v53 v53VarY2 = ff5Var.y();
            int iG4 = v53VarY2.g(16);
            if (iG4 != 0) {
                int i8 = iG4 + v53VarY2.j;
                i3 = ((ByteBuffer) v53VarY2.m).getInt(((ByteBuffer) v53VarY2.m).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            xs2.x("invalid metadata codepoint length", i3 > 0);
            x53 x53Var = (x53) this.a;
            v53 v53VarY3 = ff5Var.y();
            int iG5 = v53VarY3.g(16);
            if (iG5 != 0) {
                int i9 = iG5 + v53VarY3.j;
                i4 = ((ByteBuffer) v53VarY3.m).getInt(((ByteBuffer) v53VarY3.m).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            x53Var.g(ff5Var, 0, i4 - 1);
        }
    }

    public static void t(kb5 kb5Var, hf3 hf3Var) {
        kb5Var.getClass();
        hf3Var.getClass();
        if (((ya3) kb5Var.a).g(hf3Var)) {
            kf3 kf3Var = (kf3) kb5Var.t;
            if (hf3Var.v != null) {
                uo1.C(hf3Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            kf3Var.v.addFirst(hf3Var);
            hf3Var.v = kb5Var;
            kf3Var.y();
        }
    }

    public static synchronized kb5 z(Context context, zl5 zl5Var) {
        kb5 kb5Var;
        kb5Var = q;
        if (kb5Var == null) {
            kb5Var = new kb5();
            Context applicationContext = context.getApplicationContext();
            kb5Var.j = new d00(applicationContext, zl5Var);
            kb5Var.t = new e00(applicationContext, zl5Var);
            kb5Var.a = new rg3(applicationContext, zl5Var);
            kb5Var.m = new nx4(applicationContext, zl5Var);
            q = kb5Var;
        }
        return kb5Var;
    }

    public void a(jf3 jf3Var) {
        if (((ya3) this.m).g(jf3Var)) {
            ((kf3) this.t).g(this, jf3Var, -1);
        }
    }

    public pw1 b(String str) {
        for (tx1 tx1Var : ((HashMap) this.t).values()) {
            if (tx1Var != null) {
                pw1 pw1VarB = tx1Var.r;
                if (!str.equals(pw1VarB.q)) {
                    pw1VarB = pw1VarB.C.r.b(str);
                }
                if (pw1VarB != null) {
                    return pw1VarB;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r7 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.ou0 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.m
            p01 r0 = (defpackage.p01) r0
            boolean r1 = r7 instanceof defpackage.wz0
            if (r1 == 0) goto L17
            r1 = r7
            wz0 r1 = (defpackage.wz0) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.c = r2
            goto L1c
        L17:
            wz0 r1 = new wz0
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.q
            int r2 = r1.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            kb5 r6 = r1.m
            defpackage.js2.o(r7)
            goto L61
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r6)
            return r3
        L35:
            kb5 r6 = r1.m
            defpackage.js2.o(r7)
            goto L70
        L3b:
            defpackage.js2.o(r7)
            java.lang.Object r7 = r6.a
            java.util.List r7 = (java.util.List) r7
            px0 r2 = defpackage.px0.j
            if (r7 == 0) goto L64
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4d
            goto L64
        L4d:
            xp4 r7 = r0.n()
            zz0 r5 = new zz0
            r5.<init>(r0, r6, r3)
            r1.m = r6
            r1.c = r4
            java.lang.Object r7 = r7.y(r5, r1)
            if (r7 != r2) goto L61
            goto L6f
        L61:
            rz0 r7 = (defpackage.rz0) r7
            goto L72
        L64:
            r1.m = r6
            r1.c = r5
            r7 = 0
            java.lang.Object r7 = r0.t(r7, r1)
            if (r7 != r2) goto L70
        L6f:
            return r2
        L70:
            rz0 r7 = (defpackage.rz0) r7
        L72:
            java.lang.Object r6 = r6.m
            p01 r6 = (defpackage.p01) r6
            q64 r6 = r6.j
            r6.w(r7)
            og5 r6 = defpackage.og5.g
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb5.c(ou0):java.lang.Object");
    }

    public Bundle d(String str, Bundle bundle) {
        HashMap map = (HashMap) this.a;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void e(ju3 ju3Var) {
        if (((wu3) this.t) == wu3.t) {
            gh3 gh3Var = (gh3) this.j;
            if (gh3Var == null) {
                l0.z("layoutCoordinates not set");
                return;
            }
            sd6.y(ju3Var, gh3Var.N(0L), new xu3((yu3) this.m, (byte) 1));
        }
        this.t = wu3.a;
    }

    public void f(tx1 tx1Var) {
        HashMap map = (HashMap) this.t;
        pw1 pw1Var = tx1Var.r;
        if (pw1Var.J) {
            ((nx1) this.m).j(pw1Var);
        }
        if (map.get(pw1Var.q) == tx1Var && ((tx1) map.put(pw1Var.q, null)) != null && kx1.N(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + pw1Var);
        }
    }

    public pl5 h(tf0 tf0Var, String str) {
        pl5 pl5Var;
        pl5 pl5VarG;
        synchronized (((d52) this.m)) {
            try {
                pl5Var = (pl5) ((vl5) this.j).g.get(str);
                if (tf0Var.n(pl5Var)) {
                    tl5 tl5Var = (tl5) this.t;
                    if (tl5Var instanceof kd4) {
                        kd4 kd4Var = (kd4) tl5Var;
                        pl5Var.getClass();
                        ju2 ju2Var = kd4Var.n;
                        if (ju2Var != null) {
                            ji jiVar = kd4Var.v;
                            jiVar.getClass();
                            dz5.g(pl5Var, jiVar, ju2Var);
                        }
                    }
                    pl5Var.getClass();
                } else {
                    ea3 ea3Var = new ea3((zx0) this.a);
                    ea3Var.g.put(og0.f, str);
                    tl5 tl5Var2 = (tl5) this.t;
                    tl5Var2.getClass();
                    try {
                        try {
                            pl5VarG = tl5Var2.r(tf0Var, ea3Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = tf0Var.g;
                            cls.getClass();
                            pl5VarG = tl5Var2.g(cls);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = tf0Var.g;
                        cls2.getClass();
                        pl5VarG = tl5Var2.y(cls2, ea3Var);
                    }
                    pl5Var = pl5VarG;
                    vl5 vl5Var = (vl5) this.j;
                    vl5Var.getClass();
                    pl5Var.getClass();
                    pl5 pl5Var2 = (pl5) vl5Var.g.put(str, pl5Var);
                    if (pl5Var2 != null) {
                        pl5Var2.y();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pl5Var;
    }

    public pw1 i(String str) {
        tx1 tx1Var = (tx1) ((HashMap) this.t).get(str);
        if (tx1Var != null) {
            return tx1Var.r;
        }
        return null;
    }

    @Override // defpackage.jj5
    public vi j(vi viVar, vi viVar2, vi viVar3) {
        vi viVarR = (vi) this.m;
        if (viVarR == null) {
            viVarR = viVar3.r();
            this.m = viVarR;
        }
        int iY = viVarR.y();
        int i = 0;
        while (true) {
            vi viVar4 = (vi) this.m;
            if (i >= iY) {
                if (viVar4 != null) {
                    return viVar4;
                }
                yf2.Y("endVelocityVector");
                throw null;
            }
            if (viVar4 == null) {
                yf2.Y("endVelocityVector");
                throw null;
            }
            viVar4.v(i, ((wi) this.j).get(i).v(viVar.g(i), viVar2.g(i), viVar3.g(i)));
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(ou0 ou0Var) throws Throwable {
        rb4 rb4Var;
        cc3 cc3Var;
        Throwable th;
        cc3 cc3Var2;
        kb5 kb5Var;
        if (ou0Var instanceof rb4) {
            rb4Var = (rb4) ou0Var;
            int i = rb4Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                rb4Var.i = i - Integer.MIN_VALUE;
            } else {
                rb4Var = new rb4(this, ou0Var);
            }
        } else {
            rb4Var = new rb4(this, ou0Var);
        }
        Object obj = rb4Var.w;
        int i2 = rb4Var.i;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        try {
            if (i2 == 0) {
                js2.o(obj);
                if (((el0) this.t).d0()) {
                    return og5Var;
                }
                cc3Var = (ec3) this.j;
                rb4Var.m = this;
                rb4Var.q = cc3Var;
                rb4Var.i = 1;
                if (cc3Var.y(rb4Var) != px0Var) {
                }
                return px0Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cc3Var2 = rb4Var.q;
                kb5Var = rb4Var.m;
                try {
                    js2.o(obj);
                    ((el0) kb5Var.t).f0(og5Var);
                    cc3Var2.x(null);
                    return og5Var;
                } catch (Throwable th2) {
                    th = th2;
                    cc3Var2.x(null);
                    throw th;
                }
            }
            cc3 cc3Var3 = rb4Var.q;
            kb5 kb5Var2 = rb4Var.m;
            js2.o(obj);
            cc3Var = cc3Var3;
            this = kb5Var2;
            if (((el0) this.t).d0()) {
                cc3Var.x(null);
                return og5Var;
            }
            rb4Var.m = this;
            rb4Var.q = cc3Var;
            rb4Var.i = 2;
            if (this.c(rb4Var) != px0Var) {
                kb5Var = this;
                cc3Var2 = cc3Var;
                ((el0) kb5Var.t).f0(og5Var);
                cc3Var2.x(null);
                return og5Var;
            }
            return px0Var;
        } catch (Throwable th3) {
            cc3 cc3Var4 = cc3Var;
            th = th3;
            cc3Var2 = cc3Var4;
            cc3Var2.x(null);
            throw th;
        }
    }

    @Override // defpackage.jj5
    public vi l(long j, vi viVar, vi viVar2, vi viVar3) {
        vi viVarR = (vi) this.t;
        if (viVarR == null) {
            viVarR = viVar.r();
            this.t = viVarR;
        }
        int iY = viVarR.y();
        int i = 0;
        while (true) {
            vi viVar4 = (vi) this.t;
            if (i >= iY) {
                if (viVar4 != null) {
                    return viVar4;
                }
                yf2.Y("valueVector");
                throw null;
            }
            if (viVar4 == null) {
                yf2.Y("valueVector");
                throw null;
            }
            long j2 = j;
            viVar4.v(i, ((wi) this.j).get(i).y(j2, viVar.g(i), viVar2.g(i), viVar3.g(i)));
            i++;
            j = j2;
        }
    }

    public void m(kj3 kj3Var, int i) {
        if (i != 1 && i != 0) {
            l0.t(xi3.j("Unsupported priority value: ", i));
        } else if (((ya3) this.m).g(kj3Var)) {
            ((kf3) this.t).g(this, kj3Var, i);
        }
    }

    public void o(tx1 tx1Var) {
        pw1 pw1Var = tx1Var.r;
        String str = pw1Var.q;
        HashMap map = (HashMap) this.t;
        if (map.get(str) != null) {
            return;
        }
        map.put(pw1Var.q, tx1Var);
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + pw1Var);
        }
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (tx1 tx1Var : ((HashMap) this.t).values()) {
            if (tx1Var != null) {
                arrayList.add(tx1Var.r);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public void q(jf3 jf3Var, ff3 ff3Var) {
        kf3 kf3Var = (kf3) this.t;
        if (kf3Var.l != 0) {
            return;
        }
        hf3 hf3VarR = kf3Var.r(-1);
        kf3Var.x = hf3VarR;
        kf3Var.l = -1;
        kf3Var.j = jf3Var;
        if (ff3Var != null) {
            if (hf3VarR != null) {
                hf3VarR.n(ff3Var);
            }
            kf3Var.g.m(null, new mf3(ff3Var));
        }
    }

    public void r(pw1 pw1Var) {
        if (((ArrayList) this.j).contains(pw1Var)) {
            uo1.j(pw1Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.j)) {
            ((ArrayList) this.j).add(pw1Var);
        }
        pw1Var.p = true;
    }

    public ArrayList s() {
        ArrayList arrayList = new ArrayList();
        for (tx1 tx1Var : ((HashMap) this.t).values()) {
            if (tx1Var != null) {
                arrayList.add(tx1Var);
            }
        }
        return arrayList;
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.j).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.j)) {
            arrayList = new ArrayList((ArrayList) this.j);
        }
        return arrayList;
    }

    @Override // defpackage.jj5
    public vi v(long j, vi viVar, vi viVar2, vi viVar3) {
        vi viVarR = (vi) this.a;
        if (viVarR == null) {
            viVarR = viVar3.r();
            this.a = viVarR;
        }
        int iY = viVarR.y();
        int i = 0;
        while (true) {
            vi viVar4 = (vi) this.a;
            if (i >= iY) {
                if (viVar4 != null) {
                    return viVar4;
                }
                yf2.Y("velocityVector");
                throw null;
            }
            if (viVar4 == null) {
                yf2.Y("velocityVector");
                throw null;
            }
            long j2 = j;
            viVar4.v(i, ((wi) this.j).get(i).r(j2, viVar.g(i), viVar2.g(i), viVar3.g(i)));
            i++;
            j = j2;
        }
    }

    public void w(ju3 ju3Var, boolean z) {
        yu3 yu3Var = (yu3) this.m;
        List list = ju3Var.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((qu3) list.get(i)).q()) {
                e(ju3Var);
                return;
            }
        }
        gh3 gh3Var = (gh3) this.j;
        if (gh3Var == null) {
            l0.z("layoutCoordinates not set");
            return;
        }
        sd6.r(ju3Var, gh3Var.N(0L), new kn2(this, yu3Var, (byte) 9));
        if (((wu3) this.t) == wu3.t) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((qu3) list.get(i2)).g();
                }
            }
            mf2 mf2Var = ju3Var.y;
            if (mf2Var != null) {
                mf2Var.l(!yu3Var.r);
            }
        }
    }

    @Override // defpackage.jj5
    public long y(vi viVar, vi viVar2, vi viVar3) {
        int iY = viVar.y();
        long jMax = 0;
        for (int i = 0; i < iY; i++) {
            jMax = Math.max(jMax, ((wi) this.j).get(i).n(viVar.g(i), viVar2.g(i), viVar3.g(i)));
        }
        return jMax;
    }

    public kb5(byte b) {
        switch (b) {
            case 7:
                this.j = new mr(0);
                this.t = new SparseArray();
                this.a = new uy2((Object) null);
                this.m = new mr(0);
                break;
            default:
                this.j = new ArrayList();
                this.t = new HashMap();
                this.a = new HashMap();
                break;
        }
    }

    public kb5(vl5 vl5Var, tl5 tl5Var, zx0 zx0Var) {
        vl5Var.getClass();
        tl5Var.getClass();
        zx0Var.getClass();
        this.j = vl5Var;
        this.t = tl5Var;
        this.a = zx0Var;
        this.m = new d52((byte) 16);
    }

    public kb5(wi wiVar) {
        this.j = wiVar;
    }

    public kb5(gq1 gq1Var) {
        this(new et4(gq1Var, (byte) 5));
    }
}
