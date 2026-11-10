package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ya implements n21, View.OnAttachStateChangeListener {
    public kt0 a;
    public long b;
    public ha3 i;
    public final ba j;
    public hj4 p;
    public final ha3 s;
    public final w9 t;
    public boolean u;
    public final k z;
    public final ArrayList m = new ArrayList();
    public ua q = ua.j;
    public boolean w = true;
    public final m70 c = v70.y(1, 6, null);

    public ya(ba baVar, w9 w9Var) {
        this.j = baVar;
        this.t = w9Var;
        new Handler(Looper.getMainLooper());
        ha3 ha3Var = ie2.g;
        ha3Var.getClass();
        this.i = ha3Var;
        this.s = new ha3();
        this.p = new hj4(baVar.getSemanticsOwner().g(), ha3Var);
        this.z = new k(this, (byte) 2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005d A[LOOP:0: B:5:0x0017->B:15:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[EDGE_INSN: B:19:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005d], SYNTHETIC] */
    public final void c() {
        ha3 ha3Var = this.s;
        ha3Var.r();
        he2 he2VarN = n();
        int[] iArr = he2VarN.y;
        Object[] objArr = he2VarN.r;
        long[] jArr = he2VarN.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            ha3Var.t(iArr[i4], new hj4(((ij4) objArr[i4]).y(), n()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.p = new hj4(this.j.getSemanticsOwner().g(), n());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (defpackage.yf2.e(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ou0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.xa
            if (r0 == 0) goto L13
            r0 = r9
            xa r0 = (defpackage.xa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xa r0 = new xa
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.q
            int r1 = r0.c
            r2 = 2
            r3 = 1
            px0 r4 = defpackage.px0.j
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            h70 r1 = r0.m
            defpackage.js2.o(r9)
        L2b:
            r9 = r1
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r8)
            r8 = 0
            return r8
        L34:
            h70 r1 = r0.m
            defpackage.js2.o(r9)
            goto L52
        L3a:
            defpackage.js2.o(r9)
            h70 r9 = new h70
            m70 r1 = r8.c
            r9.<init>(r1)
        L44:
            r0.m = r9
            r0.c = r3
            java.lang.Object r1 = r9.y(r0)
            if (r1 != r4) goto L4f
            goto L85
        L4f:
            r7 = r1
            r1 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r1.r()
            boolean r9 = r8.v()
            if (r9 == 0) goto L66
            r8.l()
        L66:
            ba r9 = r8.j
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.u
            if (r5 != 0) goto L79
            if (r9 == 0) goto L79
            r8.u = r3
            k r5 = r8.z
            r9.post(r5)
        L79:
            r0.m = r1
            r0.c = r2
            r5 = 100
            java.lang.Object r9 = defpackage.yf2.e(r5, r0)
            if (r9 != r4) goto L2b
        L85:
            return r4
        L86:
            og5 r8 = defpackage.og5.g
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya.g(ou0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(gj4 gj4Var, hj4 hj4Var) {
        ta taVar = new ta(hj4Var, this, 0 == true ? 1 : 0);
        gj4Var.getClass();
        List listT = gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0);
        int size = listT.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listT.get(i2);
            if (n().g(((gj4) obj).x)) {
                taVar.l(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listT2 = gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0);
        int size2 = listT2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            gj4 gj4Var2 = (gj4) listT2.get(i3);
            he2 he2VarN = n();
            int i4 = gj4Var2.x;
            if (he2VarN.g(i4)) {
                ha3 ha3Var = this.s;
                if (ha3Var.g(i4)) {
                    Object objY = ha3Var.y(i4);
                    if (objY == null) {
                        mc2.r("node not present in pruned tree before this change");
                        l0.x();
                        return;
                    }
                    j(gj4Var2, (hj4) objY);
                } else {
                    continue;
                }
            }
        }
    }

    public final void l() {
        kt0 kt0Var = this.a;
        if (kt0Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.m;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                it0 it0Var = (it0) arrayList.get(i);
                int iOrdinal = it0Var.r().ordinal();
                if (iOrdinal == 0) {
                    s25 s25VarY = it0Var.y();
                    if (s25VarY != null) {
                        ((rk4) kt0Var).G(s25VarY.w());
                    }
                } else {
                    if (iOrdinal != 1) {
                        uo1.g();
                        return;
                    }
                    rk4 rk4Var = (rk4) kt0Var;
                    AutofillId autofillIdE = rk4Var.E(it0Var.g());
                    if (autofillIdE != null) {
                        rk4Var.H(autofillIdE);
                    }
                }
            }
            ((rk4) kt0Var).z();
            arrayList.clear();
        }
    }

    public final void m(String str, int i) {
        kt0 kt0Var;
        if (Build.VERSION.SDK_INT >= 29 && (kt0Var = this.a) != null) {
            rk4 rk4Var = (rk4) kt0Var;
            AutofillId autofillIdE = rk4Var.E(i);
            if (autofillIdE != null) {
                rk4Var.I(autofillIdE, str);
            } else {
                mc2.r("Invalid content capture ID");
                l0.x();
            }
        }
    }

    public final he2 n() {
        if (this.w) {
            this.w = false;
            this.i = fe6.r(this.j.getSemanticsOwner(), new m9((byte) 2));
            this.b = System.currentTimeMillis();
        }
        return this.i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.j.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.z);
        this.a = null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x017e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    public final void q(int i, gj4 gj4Var) {
        xy1 xy1Var;
        q64 q64VarP;
        AutofillId autofillIdR;
        k44 k44VarG;
        s25 s25Var;
        String strV;
        xy1 xy1Var2;
        if (v()) {
            hb3 hb3Var = gj4Var.n.j;
            Object objL = hb3Var.l(kj4.E);
            if (objL == null) {
                objL = null;
            }
            Boolean bool = (Boolean) objL;
            if (this.q == ua.j && yf2.p(bool, Boolean.TRUE)) {
                Object objL2 = hb3Var.l(yi4.w);
                if (objL2 == null) {
                    objL2 = null;
                }
                p1 p1Var = (p1) objL2;
                if (p1Var != null && (xy1Var2 = (xy1) p1Var.y) != null) {
                }
            } else if (this.q == ua.t && yf2.p(bool, Boolean.FALSE)) {
                Object objL3 = hb3Var.l(yi4.w);
                if (objL3 == null) {
                    objL3 = null;
                }
                p1 p1Var2 = (p1) objL3;
                if (p1Var2 != null && (xy1Var = (xy1) p1Var2.y) != null) {
                }
            }
            int i2 = gj4Var.x;
            kt0 kt0Var = this.a;
            if (kt0Var == null || Build.VERSION.SDK_INT < 29 || (q64VarP = jr2.p(this.j)) == null) {
                s25Var = null;
            } else {
                gj4 gj4VarQ = gj4Var.q();
                int i3 = gj4Var.x;
                if (gj4VarQ != null) {
                    autofillIdR = ((rk4) kt0Var).E(gj4VarQ.x);
                    if (autofillIdR == null) {
                        s25Var = null;
                    }
                } else {
                    autofillIdR = y8.r(q64VarP.t);
                }
                s25 s25VarF = ((rk4) kt0Var).F(autofillIdR, i3);
                if (s25VarF == null) {
                    s25Var = null;
                } else {
                    aj4 aj4Var = gj4Var.n;
                    mj4 mj4Var = kj4.N;
                    hb3 hb3Var2 = aj4Var.j;
                    if (hb3Var2.r(mj4Var)) {
                        s25Var = null;
                    } else {
                        Bundle bundleN = s25VarF.n();
                        if (bundleN != null) {
                            bundleN.putLong("android.view.contentcapture.EventTimestamp", this.b);
                            bundleN.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objL4 = hb3Var2.l(kj4.A);
                        if (objL4 == null) {
                            objL4 = null;
                        }
                        String str = (String) objL4;
                        if (str != null) {
                            s25VarF.a(str, i3);
                        }
                        Object objL5 = hb3Var2.l(kj4.c);
                        if (objL5 == null) {
                            objL5 = null;
                        }
                        if (((Boolean) objL5) != null) {
                            s25VarF.l("android.widget.ViewGroup");
                        }
                        Object objL6 = hb3Var2.l(kj4.C);
                        if (objL6 == null) {
                            objL6 = null;
                        }
                        List list = (List) objL6;
                        if (list != null) {
                            s25VarF.l("android.widget.TextView");
                            s25VarF.m(tw2.g(list, "\n", null, 62));
                        }
                        Object objL7 = hb3Var2.l(kj4.G);
                        if (objL7 == null) {
                            objL7 = null;
                        }
                        cj cjVar = (cj) objL7;
                        if (cjVar != null) {
                            s25VarF.l("android.widget.EditText");
                            s25VarF.m(cjVar);
                        }
                        Object objL8 = hb3Var2.l(kj4.g);
                        if (objL8 == null) {
                            objL8 = null;
                        }
                        List list2 = (List) objL8;
                        if (list2 != null) {
                            s25VarF.j(tw2.g(list2, "\n", null, 62));
                        }
                        Object objL9 = hb3Var2.l(kj4.e);
                        if (objL9 == null) {
                            objL9 = null;
                        }
                        o94 o94Var = (o94) objL9;
                        if (o94Var != null && (strV = sf6.v(o94Var.g)) != null) {
                            s25VarF.l(strV);
                        }
                        j75 j75VarR = sf6.r(aj4Var);
                        if (j75VarR != null) {
                            i75 i75Var = j75VarR.g;
                            k85 k85Var = i75Var.y;
                            j51 j51Var = i75Var.l;
                            s25VarF.q(j51Var.w() * j51Var.y() * n85.r(k85Var.g.y));
                        }
                        gh3 gh3VarN = gj4Var.n();
                        if (gh3VarN == null) {
                            k44VarG = k44.v;
                        } else {
                            gh3 gh3Var = gh3VarN.Y0().h ? gh3VarN : null;
                            if (gh3Var != null) {
                                k44VarG = gj4Var.g(gh3Var);
                            } else {
                                k44VarG = k44.v;
                            }
                        }
                        float f = k44VarG.g;
                        float f2 = k44VarG.y;
                        s25VarF.t((int) f, (int) f2, (int) (k44VarG.r - f), (int) (k44VarG.n - f2));
                        s25Var = s25VarF;
                    }
                }
            }
            if (s25Var != null) {
                this.m.add(new it0(i2, this.b, jt0.j, s25Var));
            }
            List listT = gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0);
            int size = listT.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listT.get(i5);
                if (n().g(((gj4) obj).x)) {
                    q(i4, (gj4) obj);
                    i4++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0175 A[EDGE_INSN: B:105:0x0175->B:80:0x0175 BREAK  A[LOOP:4: B:48:0x00eb->B:79:0x016e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd A[LOOP:2: B:21:0x0071->B:42:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016e A[LOOP:4: B:48:0x00eb->B:79:0x016e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d6 A[EDGE_INSN: B:99:0x00d6->B:44:0x00d6 BREAK  A[LOOP:2: B:21:0x0071->B:42:0x00cd], SYNTHETIC] */
    public final void r(he2 he2Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        he2 he2Var2 = he2Var;
        int[] iArr3 = he2Var2.y;
        long[] jArr = he2Var2.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        hj4 hj4Var = (hj4) this.s.y(i7);
                        ij4 ij4Var = (ij4) he2Var2.y(i7);
                        gj4 gj4VarY = ij4Var != null ? ij4Var.y() : null;
                        if (gj4VarY == null) {
                            mc2.r("no value for specified key");
                            l0.x();
                            return;
                        }
                        j2 = j6;
                        int i8 = gj4VarY.x;
                        hb3 hb3Var = gj4VarY.n.j;
                        if (hj4Var == null) {
                            Object[] objArr = hb3Var.y;
                            long[] jArr2 = hb3Var.g;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                mj4 mj4Var = (mj4) objArr[(i10 << 3) + i12];
                                                mj4 mj4Var2 = kj4.C;
                                                if (yf2.p(mj4Var, mj4Var2)) {
                                                    Object objL = hb3Var.l(mj4Var2);
                                                    if (objL == null) {
                                                        objL = null;
                                                    }
                                                    List list = (List) objL;
                                                    m(String.valueOf(list != null ? (cj) cj0.l0(list) : null), i8);
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = hb3Var.y;
                            long[] jArr3 = hb3Var.g;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                mj4 mj4Var3 = (mj4) objArr2[(i13 << 3) + i15];
                                                mj4 mj4Var4 = kj4.C;
                                                if (yf2.p(mj4Var3, mj4Var4)) {
                                                    Object objL2 = hj4Var.g.j.l(mj4Var4);
                                                    if (objL2 == null) {
                                                        objL2 = null;
                                                    }
                                                    List list2 = (List) objL2;
                                                    cj cjVar = list2 != null ? (cj) cj0.l0(list2) : null;
                                                    Object objL3 = hb3Var.l(mj4Var4);
                                                    if (objL3 == null) {
                                                        objL3 = null;
                                                    }
                                                    List list3 = (List) objL3;
                                                    cj cjVar2 = list3 != null ? (cj) cj0.l0(list3) : null;
                                                    if (!yf2.p(cjVar, cjVar2)) {
                                                        m(String.valueOf(cjVar2), i8);
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    he2Var2 = he2Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            he2Var2 = he2Var;
            iArr3 = iArr;
        }
    }

    public final boolean v() {
        return this.a != null;
    }

    public final void w(gj4 gj4Var) {
        if (v()) {
            this.m.add(new it0(gj4Var.x, this.b, jt0.t, null));
            List listT = gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0);
            int size = listT.size();
            for (int i = 0; i < size; i++) {
                w((gj4) listT.get(i));
            }
        }
    }

    @Override // defpackage.n21
    public final void x(gu2 gu2Var) {
        this.a = (kt0) this.t.g();
        q(-1, this.j.getSemanticsOwner().g());
        l();
    }

    @Override // defpackage.n21
    public final void y(gu2 gu2Var) {
        w(this.j.getSemanticsOwner().g());
        l();
        this.a = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
