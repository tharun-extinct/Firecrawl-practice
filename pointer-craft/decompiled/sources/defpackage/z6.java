package defpackage;

import android.bluetooth.BluetoothDevice;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z6 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ z6(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0459  */
    /* JADX WARN: Code duplicated, block: B:197:0x04c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [mu0] */
    /* JADX WARN: Type inference failed for: r9v27 */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        int i;
        m30 m30Var;
        long j;
        nc ncVarN;
        nb0 nb0Var;
        pb0 pb0Var;
        ro roVar;
        float f;
        float f2;
        long jG;
        ls2 ls2Var;
        ib0 ib0Var;
        byte b = 3;
        float f3 = 0.0f;
        int iZ = 0;
        ls2 ls2Var2 = 0;
        ib0 ib0Var2 = null;
        boolean z = true;
        switch (this.j) {
            case 0:
                a7 a7Var = (a7) this.t;
                b7 b7Var = (b7) obj;
                og5 og5Var = og5.g;
                if (b7Var.Q() != Integer.MAX_VALUE) {
                    if (b7Var.r().y) {
                        b7Var.s();
                    }
                    for (Map.Entry entry : b7Var.r().t.entrySet()) {
                        a7Var.g((v6) entry.getKey(), ((Number) entry.getValue()).intValue(), b7Var.i());
                    }
                    gh3 gh3Var = b7Var.i().D;
                    gh3Var.getClass();
                    while (!gh3Var.equals(a7Var.g.i())) {
                        for (v6 v6Var : a7Var.r(gh3Var).keySet()) {
                            a7Var.g(v6Var, a7Var.n(gh3Var, v6Var), gh3Var);
                        }
                        gh3Var = gh3Var.D;
                        gh3Var.getClass();
                    }
                }
                return og5Var;
            case 1:
                xy2 xy2Var = (xy2) obj;
                ba baVar = ((u9) this.t).f;
                if (baVar.getInsetsListener().c.d() > 0) {
                    ha3 ha3Var = cq5.g;
                    long jL = xy2Var.g().L();
                    hb3 hb3Var = baVar.getInsetsListener().w;
                    int i2 = (int) (jL >> 32);
                    int i3 = (int) (jL & 4294967295L);
                    for (aq5 aq5Var : cq5.y) {
                        Object objL = hb3Var.l(aq5Var);
                        objL.getClass();
                        qq5 qq5Var = (qq5) objL;
                        cq5.g(xy2Var, ((bq5) aq5Var).r, qq5Var.j, i2, i3);
                        if (((Boolean) qq5Var.y.getValue()).booleanValue()) {
                            cq5.g(xy2Var, qq5Var.x, qq5Var.a, i2, i3);
                            cq5.g(xy2Var, qq5Var.l, qq5Var.m, i2, i3);
                        }
                        cq5.g(xy2Var, ((bq5) aq5Var).n, qq5Var.t, i2, i3);
                    }
                    xa3 xa3Var = baVar.getInsetsListener().i;
                    if (xa3Var.a()) {
                        st4 st4Var = baVar.getInsetsListener().b;
                        Object[] objArr = xa3Var.g;
                        int i4 = xa3Var.y;
                        while (iZ < i4) {
                            ob3 ob3Var = (ob3) objArr[iZ];
                            tc2 tc2Var = (tc2) st4Var.get(iZ);
                            Rect rect = (Rect) ob3Var.getValue();
                            xy2Var.r(tc2Var.y(), rect.left);
                            xy2Var.r(tc2Var.n(), rect.top);
                            xy2Var.r(tc2Var.r(), rect.right);
                            xy2Var.r(tc2Var.g(), rect.bottom);
                            iZ++;
                        }
                    }
                }
                return og5.g;
            case 2:
                ((um2) this.t).b0((j51) obj);
                return og5.g;
            case 3:
                ((o84) obj).r(((Number) ((my1) this.t).g()).floatValue());
                return og5.g;
            case 4:
                l35 l35Var = (l35) obj;
                ((ob3) this.t).setValue(l35Var.n() ? l35Var.r() : l35Var.y());
                return og5.g;
            case 5:
                x40 x40Var = (x40) this.t;
                ja0 ja0Var = (ja0) obj;
                if (ja0Var.y() * x40Var.d < 0.0f || cq4.y(ja0Var.j.n()) <= 0.0f) {
                    return ja0Var.g(new m9((byte) 17));
                }
                final float fMin = Math.min(vb1.y(x40Var.d, 0.0f) ? 1.0f : (float) Math.ceil(ja0Var.y() * x40Var.d), (float) Math.ceil(cq4.y(ja0Var.j.n()) / 2.0f));
                final float f4 = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ja0Var.j.n() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ja0Var.j.n() & 4294967295L)) - fMin)) & 4294967295L);
                float f5 = fMin * 2.0f;
                boolean z2 = f5 > cq4.y(ja0Var.j.n());
                br2 br2VarG = x40Var.A.g(ja0Var.j.n(), ja0Var.j.getLayoutDirection(), ja0Var);
                if (!(br2VarG instanceof xm3)) {
                    if (!(br2VarG instanceof zm3)) {
                        boolean z3 = z2;
                        if (!(br2VarG instanceof ym3)) {
                            uo1.g();
                            return null;
                        }
                        final cu4 cu4Var = x40Var.e;
                        if (z3) {
                            jFloatToRawIntBits = 0;
                        }
                        final long j2 = jFloatToRawIntBits;
                        if (z3) {
                            jFloatToRawIntBits2 = ja0Var.j.n();
                        }
                        final long j3 = jFloatToRawIntBits2;
                        final yd1 by4Var = z3 ? go1.g : new by4(fMin, 0.0f, 0, 0, 30);
                        return ja0Var.g(new xy1() { // from class: u40
                            @Override // defpackage.xy1
                            public final Object a(Object obj2) {
                                wm2 wm2Var = (wm2) obj2;
                                wm2Var.g();
                                xd1.b0(wm2Var, cu4Var, j2, j3, 0.0f, by4Var, 104);
                                return og5.g;
                            }
                        });
                    }
                    final cu4 cu4Var2 = x40Var.e;
                    ha4 ha4Var = ((zm3) br2VarG).n;
                    if (v13.p(ha4Var)) {
                        final long j4 = ha4Var.v;
                        final by4 by4Var2 = new by4(fMin, 0.0f, 0, 0, 30);
                        final boolean z4 = z2;
                        return ja0Var.g(new xy1() { // from class: v40
                            @Override // defpackage.xy1
                            public final Object a(Object obj2) throws Throwable {
                                long j5;
                                wm2 wm2Var = (wm2) obj2;
                                wm2Var.g();
                                pb0 pb0Var2 = wm2Var.j;
                                boolean z5 = z4;
                                z60 z60Var = cu4Var2;
                                long j6 = j4;
                                if (z5) {
                                    xd1.I(wm2Var, z60Var, 0L, 0L, j6, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                                    float f6 = f4;
                                    if (fIntBitsToFloat < f6) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pb0Var2.n() >> 32));
                                        float f7 = fMin;
                                        float f8 = fIntBitsToFloat2 - f7;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (pb0Var2.n() & 4294967295L)) - f7;
                                        ro roVar2 = pb0Var2.t;
                                        long jG2 = roVar2.G();
                                        roVar2.b().q();
                                        try {
                                            ((ro) ((y22) roVar2.t).t).b().x(f7, f7, f8, fIntBitsToFloat3, 0);
                                            j5 = jG2;
                                            try {
                                                xd1.I(wm2Var, z60Var, 0L, 0L, j6, null, 246);
                                                du4.d(roVar2, j5);
                                            } catch (Throwable th) {
                                                th = th;
                                                du4.d(roVar2, j5);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j5 = jG2;
                                        }
                                    } else {
                                        xd1.I(wm2Var, z60Var, jFloatToRawIntBits, jFloatToRawIntBits2, y94.K(f6, j6), by4Var2, 208);
                                    }
                                }
                                return og5.g;
                            }
                        });
                    }
                    boolean z5 = z2;
                    t40 t40Var = x40Var.k;
                    if (t40Var == null) {
                        t40Var = new t40();
                        x40Var.k = t40Var;
                    }
                    ld ldVarL = t40Var.l();
                    ldVarL.l();
                    ld.r(ldVarL, ha4Var);
                    if (!z5) {
                        ld ldVarG = nd.g();
                        ld.r(ldVarG, new ha4(fMin, fMin, (ha4Var.r - ha4Var.g) - fMin, (ha4Var.n - ha4Var.y) - fMin, y94.K(fMin, ha4Var.v), y94.K(fMin, ha4Var.x), y94.K(fMin, ha4Var.l), y94.K(fMin, ha4Var.j)));
                        ldVarL.x(ldVarL, ldVarG, 0);
                    }
                    return ja0Var.g(new xf(ldVarL, cu4Var2, b));
                }
                cu4 cu4Var3 = x40Var.e;
                xm3 xm3Var = (xm3) br2VarG;
                ld ldVar = xm3Var.n;
                if (z2) {
                    return ja0Var.g(new m(xm3Var, cu4Var3, (byte) 11));
                }
                if (cu4Var3 != null) {
                    m30Var = new m30(5, jj0.y(1.0f, cu4Var3.g));
                    i = 1;
                } else {
                    i = 0;
                    m30Var = null;
                }
                k44 k44VarN = ldVar.n();
                float f6 = k44VarN.y;
                float f7 = k44VarN.g;
                t40 t40Var2 = x40Var.k;
                if (t40Var2 == null) {
                    t40Var2 = new t40();
                    x40Var.k = t40Var2;
                }
                ld ldVarL2 = t40Var2.l();
                ldVarL2.l();
                ld.y(ldVarL2, k44VarN);
                ldVarL2.x(ldVarL2, ldVar, 0);
                u54 u54Var = new u54();
                long jCeil = (((long) ((int) Math.ceil(k44VarN.r - f7))) << 32) | (((long) ((int) Math.ceil(k44VarN.n - f6))) & 4294967295L);
                t40 t40Var3 = x40Var.k;
                t40Var3.getClass();
                nc ncVar = t40Var3.g;
                nb0 nb0Var2 = t40Var3.y;
                aa2 aa2Var = ncVar != null ? new aa2(ncVar.g()) : null;
                if (aa2Var != null && aa2Var.g == 0) {
                    iZ = 1;
                } else {
                    aa2 aa2Var2 = ncVar != null ? new aa2(ncVar.g()) : null;
                    if (aa2Var2 != null && i == aa2Var2.g) {
                        iZ = 1;
                    }
                }
                try {
                    try {
                        if (ncVar != null && nb0Var2 != null) {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (ja0Var.j.n() >> 32));
                            Bitmap bitmap = ncVar.g;
                            j = 4294967295L;
                            if (fIntBitsToFloat <= bitmap.getWidth() && Float.intBitsToFloat((int) (ja0Var.j.n() & 4294967295L)) <= bitmap.getHeight() && iZ != 0) {
                                ncVarN = ncVar;
                                nb0Var = nb0Var2;
                            }
                            pb0Var = t40Var3.r;
                            if (pb0Var == null) {
                                pb0Var = new pb0();
                                t40Var3.r = pb0Var;
                            }
                            roVar = pb0Var.t;
                            ob0 ob0Var = pb0Var.j;
                            long jN = y94.N(jCeil);
                            fl2 layoutDirection = ja0Var.j.getLayoutDirection();
                            j51 j51Var = ob0Var.g;
                            pb0 pb0Var2 = pb0Var;
                            fl2 fl2Var = ob0Var.y;
                            nb0 nb0Var3 = ob0Var.r;
                            nc ncVar2 = ncVarN;
                            long j5 = ob0Var.n;
                            ob0Var.g = ja0Var;
                            ob0Var.y = layoutDirection;
                            ob0Var.r = nb0Var;
                            ob0Var.n = jN;
                            c9 c9Var = (c9) nb0Var;
                            c9Var.q();
                            xd1.B(pb0Var2, jj0.y, 0L, jN, 0.0f, 58);
                            f = -f7;
                            f2 = -f6;
                            ((y22) roVar.t).D(f, f2);
                            xd1.z(pb0Var2, xm3Var.n, cu4Var3, 0.0f, new by4(f5, 0.0f, 0, 0, 30), 52);
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (pb0Var2.n() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (pb0Var2.n() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (pb0Var2.n() & j)) + 1.0f) / Float.intBitsToFloat((int) (pb0Var2.n() & j));
                            long jE0 = pb0Var2.e0();
                            jG = roVar.G();
                            roVar.b().q();
                            ((y22) roVar.t).A(fIntBitsToFloat2, fIntBitsToFloat3, jE0);
                            xd1.z(pb0Var2, ldVarL2, cu4Var3, 0.0f, null, 28);
                            roVar.b().t();
                            roVar.b0(jG);
                            ((y22) roVar.t).D(-f, -f2);
                            c9Var.t();
                            ob0Var.g = j51Var;
                            ob0Var.y = fl2Var;
                            ob0Var.r = nb0Var3;
                            ob0Var.n = j5;
                            ncVar2.g.prepareToDraw();
                            u54Var.j = ncVar2;
                            return ja0Var.g(new w40(k44VarN, u54Var, jCeil, m30Var));
                        }
                        j = 4294967295L;
                        ((y22) roVar.t).A(fIntBitsToFloat2, fIntBitsToFloat3, jE0);
                        xd1.z(pb0Var2, ldVarL2, cu4Var3, 0.0f, null, 28);
                        roVar.b().t();
                        roVar.b0(jG);
                        ((y22) roVar.t).D(-f, -f2);
                        c9Var.t();
                        ob0Var.g = j51Var;
                        ob0Var.y = fl2Var;
                        ob0Var.r = nb0Var3;
                        ob0Var.n = j5;
                        ncVar2.g.prepareToDraw();
                        u54Var.j = ncVar2;
                        return ja0Var.g(new w40(k44VarN, u54Var, jCeil, m30Var));
                    } catch (Throwable th) {
                        roVar.b().t();
                        roVar.b0(jG);
                        throw th;
                    }
                    xd1.z(pb0Var2, xm3Var.n, cu4Var3, 0.0f, new by4(f5, 0.0f, 0, 0, 30), 52);
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (pb0Var2.n() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (pb0Var2.n() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (pb0Var2.n() & j)) + 1.0f) / Float.intBitsToFloat((int) (pb0Var2.n() & j));
                    long jE1 = pb0Var2.e0();
                    jG = roVar.G();
                    roVar.b().q();
                } catch (Throwable th2) {
                    ((y22) roVar.t).D(-f, -f2);
                    throw th2;
                }
                ncVarN = pw5.n((int) (jCeil >> 32), (int) (jCeil & j), i);
                t40Var3.g = ncVarN;
                Canvas canvas = d9.g;
                c9 c9Var2 = new c9();
                c9Var2.g = new Canvas(y94.b(ncVarN));
                t40Var3.y = c9Var2;
                nb0Var = c9Var2;
                pb0Var = t40Var3.r;
                if (pb0Var == null) {
                    pb0Var = new pb0();
                    t40Var3.r = pb0Var;
                }
                roVar = pb0Var.t;
                ob0 ob0Var2 = pb0Var.j;
                long jN2 = y94.N(jCeil);
                fl2 layoutDirection2 = ja0Var.j.getLayoutDirection();
                j51 j51Var2 = ob0Var2.g;
                pb0 pb0Var3 = pb0Var;
                fl2 fl2Var2 = ob0Var2.y;
                nb0 nb0Var4 = ob0Var2.r;
                nc ncVar3 = ncVarN;
                long j6 = ob0Var2.n;
                ob0Var2.g = ja0Var;
                ob0Var2.y = layoutDirection2;
                ob0Var2.r = nb0Var;
                ob0Var2.n = jN2;
                c9 c9Var3 = (c9) nb0Var;
                c9Var3.q();
                xd1.B(pb0Var3, jj0.y, 0L, jN2, 0.0f, 58);
                f = -f7;
                f2 = -f6;
                ((y22) roVar.t).D(f, f2);
                break;
            case 6:
                i60 i60Var = (i60) this.t;
                k44 k44Var = (k44) obj;
                if (i60Var.h) {
                    m50.T(i60Var.E0(), null, new q(i60Var, k44Var, ls2Var2, (byte) 9), 3);
                }
                return og5.g;
            case 7:
                nj4 nj4Var = (nj4) this.t;
                hd5 hd5Var = (hd5) obj;
                hd5Var.getClass();
                ((wp3) hd5Var).Q0(nj4Var);
                return Boolean.FALSE;
            case 8:
                c64 c64Var = (c64) obj;
                ((ez3) this.t).z(new yf0((BluetoothDevice) c64Var.y, c64Var.r, c64Var.g));
                return og5.g;
            case 9:
                mo0 mo0Var = (mo0) this.t;
                ue ueVar = mo0Var.k;
                if (ueVar != null) {
                    return ueVar;
                }
                ue ueVar2 = new ue(mo0Var.g);
                mo0Var.k = ueVar2;
                return ueVar2;
            case 10:
                gm5 gm5Var = (gm5) this.t;
                tr3 tr3Var = (tr3) obj;
                vf1 vf1Var = n72.g;
                tr3Var.getClass();
                View view = ((hm5) a11.e(tr3Var, vf1Var)).g;
                while (view != null) {
                    Object tag = view.getTag(gm5Var.l());
                    if (tag != null) {
                        return tag;
                    }
                    Object objS = sp2.s(view);
                    view = objS instanceof View ? (View) objS : null;
                }
                return null;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((bv0) this.t).r.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return og5.g;
            case 12:
                xd1 xd1Var = (xd1) obj;
                long j7 = ((jj0) ((bw4) this.t).getValue()).g;
                if (!tf5.g(j7, jj0.j)) {
                    xd1.B(xd1Var, j7, 0L, 0L, 0.0f, 126);
                }
                return og5.g;
            case 13:
                hf5 hf5Var = (hf5) obj;
                return ((mu1) this.t).g(new hf5(null, hf5Var.y, hf5Var.r, hf5Var.n, hf5Var.v)).getValue();
            case 14:
                q8 q8Var = (q8) this.t;
                ((j51) obj).getClass();
                return new je2(((long) k33.Z(q8Var.a.d())) & 4294967295L);
            case kq2.x /* 15 */:
                j51 j51Var3 = (j51) this.t;
                gd1 gd1Var = (gd1) obj;
                gd1Var.getClass();
                gd1Var.g(ac1.j, 0.0f);
                gd1Var.g(ac1.t, j51Var3.e(48.0f));
                return og5.g;
            case 16:
                m70 m70Var = (m70) this.t;
                og5 og5Var2 = og5.g;
                if (e32.y.compareAndSet(false, true)) {
                    m70Var.z(og5Var2);
                }
                return og5Var2;
            case 17:
                a42 a42Var = (a42) this.t;
                xd1 xd1Var2 = (xd1) obj;
                nb0 nb0VarB = xd1Var2.E().b();
                bz1 bz1Var = a42Var.m;
                if (bz1Var != null) {
                    bz1Var.l(nb0VarB, (x32) xd1Var2.E().a);
                }
                return og5.g;
            case 18:
                j42 j42Var = (j42) this.t;
                li5 li5Var = (li5) obj;
                j42Var.l(li5Var);
                xy1 xy1Var = j42Var.t;
                if (xy1Var != null) {
                    xy1Var.a(li5Var);
                }
                return og5.g;
            case 19:
                return new e5((vq2) this.t, z ? 1 : 0);
            case 20:
                return new e5((kr2) this.t, b);
            case 21:
                ss2 ss2Var = (ss2) this.t;
                float f8 = -((Float) obj).floatValue();
                if ((f8 >= 0.0f || ss2Var.r()) && (f8 <= 0.0f || ss2Var.g())) {
                    if (Math.abs(ss2Var.j) > 0.5f) {
                        pc2.r("entered drag with non-zero pending scroll");
                    }
                    ss2Var.n = true;
                    float f9 = ss2Var.j + f8;
                    ss2Var.j = f9;
                    if (Math.abs(f9) > 0.5f) {
                        float f10 = ss2Var.j;
                        int iRound = Math.round(f10);
                        ls2 ls2VarJ = ((ls2) ss2Var.x.getValue()).j(iRound, !ss2Var.y);
                        if (ls2VarJ == null || (ls2Var = ss2Var.r) == null) {
                            ls2Var2 = ls2VarJ;
                        } else {
                            ls2 ls2VarJ2 = ls2Var.j(iRound, true);
                            if (ls2VarJ2 != null) {
                                ss2Var.r = ls2VarJ2;
                                ls2Var2 = ls2VarJ;
                            }
                        }
                        if (ls2Var2 != 0) {
                            ss2Var.l(ls2Var2, ss2Var.y, true);
                            ss2Var.f.setValue(og5.g);
                            ss2Var.m(f10 - ss2Var.j, ls2Var2);
                        } else {
                            um2 um2Var = ss2Var.q;
                            if (um2Var != null) {
                                um2Var.q();
                            }
                            ss2Var.m(f10 - ss2Var.j, ss2Var.a());
                        }
                    }
                    if (Math.abs(ss2Var.j) > 0.5f) {
                        f8 -= ss2Var.j;
                        ss2Var.j = 0.0f;
                    }
                    f3 = f8;
                }
                return Float.valueOf(-f3);
            case 22:
                uc4 uc4Var = (uc4) this.t;
                return Boolean.valueOf(uc4Var != null ? uc4Var.n(obj) : true);
            case 23:
                ((gp) this.t).v.setValue((String) obj);
                return og5.g;
            case 24:
                Bundle bundle = (Bundle) this.t;
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(!bundle.containsKey(str));
            case 25:
                we1 we1Var = (we1) this.t;
                j51 j51Var4 = (j51) obj;
                float fD = we1Var.y.a.d();
                if (!Float.isNaN(fD)) {
                    iZ = k33.Z(fD);
                } else if (!we1Var.r()) {
                    iZ = -j51Var4.V(qe1.g);
                }
                return new je2(((long) iZ) << 32);
            case 26:
                ((xa3) this.t).g((h73) obj);
                return Boolean.TRUE;
            case 27:
                ((yo0) this.t).d(obj);
                return og5.g;
            case 28:
                a44 a44Var = (a44) this.t;
                Throwable th3 = (Throwable) obj;
                CancellationException cancellationExceptionV = k33.v("Recomposer effect job completed", th3);
                synchronized (a44Var.n) {
                    try {
                        dh2 dh2Var = a44Var.v;
                        if (dh2Var != null) {
                            ew4 ew4Var = a44Var.f;
                            x34 x34Var = x34.t;
                            ew4Var.getClass();
                            ew4Var.m(null, x34Var);
                            if (a44Var.z) {
                                ib0Var = a44Var.u;
                                if (ib0Var != null) {
                                }
                                a44Var.u = null;
                                dh2Var.A(new xf(a44Var, th3, (byte) 24));
                                ib0Var2 = ib0Var;
                            } else {
                                dh2Var.x(cancellationExceptionV);
                            }
                            ib0Var = null;
                            a44Var.u = null;
                            dh2Var.A(new xf(a44Var, th3, (byte) 24));
                            ib0Var2 = ib0Var;
                        } else {
                            a44Var.x = cancellationExceptionV;
                            ew4 ew4Var2 = a44Var.f;
                            x34 x34Var2 = x34.j;
                            ew4Var2.getClass();
                            ew4Var2.m(null, x34Var2);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (ib0Var2 != null) {
                    ib0Var2.j(og5.g);
                }
                return og5.g;
            default:
                t51 t51Var = (t51) this.t;
                zx1 zx1Var = (zx1) obj;
                zx1Var.getClass();
                t51Var.j = zx1Var;
                return og5.g;
        }
    }
}
