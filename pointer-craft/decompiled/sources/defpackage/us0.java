package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class us0 extends ts0 {
    public int A0;
    public kc0[] B0;
    public kc0[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final vy L0;
    public ArrayList q0 = new ArrayList();
    public final ro r0 = new ro(this);
    public final t51 s0;
    public int t0;
    public gs0 u0;
    public boolean v0;
    public final kv2 w0;
    public int x0;
    public int y0;
    public int z0;

    public us0() {
        t51 t51Var = new t51();
        t51Var.g = true;
        t51Var.y = true;
        t51Var.v = new ArrayList();
        new ArrayList();
        t51Var.l = null;
        t51Var.j = new vy();
        t51Var.x = new ArrayList();
        t51Var.r = this;
        t51Var.n = this;
        this.s0 = t51Var;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new kv2();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new kc0[4];
        this.C0 = new kc0[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new vy();
    }

    public static void V(ts0 ts0Var, gs0 gs0Var, vy vyVar) {
        int i;
        int i2;
        if (gs0Var == null) {
            return;
        }
        int i3 = ts0Var.g0;
        int[] iArr = ts0Var.z;
        if (i3 == 8 || (ts0Var instanceof m42) || (ts0Var instanceof bx)) {
            vyVar.v = 0;
            vyVar.x = 0;
            return;
        }
        int[] iArr2 = ts0Var.p0;
        vyVar.g = iArr2[0];
        vyVar.y = iArr2[1];
        vyVar.r = ts0Var.s();
        vyVar.n = ts0Var.m();
        vyVar.t = false;
        vyVar.a = 0;
        boolean z = vyVar.g == 3;
        boolean z2 = vyVar.y == 3;
        boolean z3 = z && ts0Var.W > 0.0f;
        boolean z4 = z2 && ts0Var.W > 0.0f;
        if (z && ts0Var.z(0) && ts0Var.p == 0 && !z3) {
            vyVar.g = 2;
            if (z2 && ts0Var.u == 0) {
                vyVar.g = 1;
            }
            z = false;
        }
        if (z2 && ts0Var.z(1) && ts0Var.u == 0 && !z4) {
            vyVar.y = 2;
            if (z && ts0Var.p == 0) {
                vyVar.y = 1;
            }
            z2 = false;
        }
        if (ts0Var.A()) {
            vyVar.g = 1;
            z = false;
        }
        if (ts0Var.B()) {
            vyVar.y = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                vyVar.g = 1;
            } else if (!z2) {
                if (vyVar.y == 1) {
                    i2 = vyVar.n;
                } else {
                    vyVar.g = 2;
                    gs0Var.y(ts0Var, vyVar);
                    i2 = vyVar.x;
                }
                vyVar.g = 1;
                vyVar.r = (int) (ts0Var.W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                vyVar.y = 1;
            } else if (!z) {
                if (vyVar.g == 1) {
                    i = vyVar.r;
                } else {
                    vyVar.y = 2;
                    gs0Var.y(ts0Var, vyVar);
                    i = vyVar.v;
                }
                vyVar.y = 1;
                int i4 = ts0Var.X;
                float f = ts0Var.W;
                if (i4 == -1) {
                    vyVar.n = (int) (i / f);
                } else {
                    vyVar.n = (int) (f * i);
                }
            }
        }
        gs0Var.y(ts0Var, vyVar);
        ts0Var.O(vyVar.v);
        ts0Var.L(vyVar.x);
        ts0Var.E = vyVar.j;
        ts0Var.I(vyVar.l);
        vyVar.a = 0;
    }

    @Override // defpackage.ts0
    public final void C() {
        this.w0.z();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.ts0
    public final void F(ro roVar) {
        super.F(roVar);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((ts0) this.q0.get(i)).F(roVar);
        }
    }

    @Override // defpackage.ts0
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((ts0) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(ts0 ts0Var, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            kc0[] kc0VarArr = this.C0;
            if (i2 >= kc0VarArr.length) {
                kc0VarArr = (kc0[]) Arrays.copyOf(kc0VarArr, kc0VarArr.length * 2);
                this.C0 = kc0VarArr;
            }
            int i3 = this.z0;
            kc0VarArr[i3] = new kc0(ts0Var, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            kc0[] kc0VarArr2 = this.B0;
            if (i4 >= kc0VarArr2.length) {
                kc0VarArr2 = (kc0[]) Arrays.copyOf(kc0VarArr2, kc0VarArr2.length * 2);
                this.B0 = kc0VarArr2;
            }
            int i5 = this.A0;
            kc0VarArr2[i5] = new kc0(ts0Var, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(kv2 kv2Var) {
        us0 us0Var;
        kv2 kv2Var2;
        boolean zW = W(64);
        y(kv2Var, zW);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ts0 ts0Var = (ts0) this.q0.get(i);
            boolean[] zArr = ts0Var.S;
            zArr[0] = false;
            zArr[1] = false;
            if (ts0Var instanceof bx) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ts0 ts0Var2 = (ts0) this.q0.get(i2);
                if (ts0Var2 instanceof bx) {
                    bx bxVar = (bx) ts0Var2;
                    for (int i3 = 0; i3 < bxVar.r0; i3++) {
                        ts0 ts0Var3 = bxVar.q0[i3];
                        if (bxVar.t0 || ts0Var3.r()) {
                            int i4 = bxVar.s0;
                            if (i4 == 0 || i4 == 1) {
                                ts0Var3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                ts0Var3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ts0 ts0Var4 = (ts0) this.q0.get(i5);
            ts0Var4.getClass();
            boolean z2 = ts0Var4 instanceof tm5;
            if (z2 || (ts0Var4 instanceof m42)) {
                if (z2) {
                    hashSet.add(ts0Var4);
                } else {
                    ts0Var4.y(kv2Var, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tm5 tm5Var = (tm5) ((ts0) it.next());
                for (int i6 = 0; i6 < tm5Var.r0; i6++) {
                    if (hashSet.contains(tm5Var.q0[i6])) {
                        tm5Var.y(kv2Var, zW);
                        hashSet.remove(tm5Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ts0) it2.next()).y(kv2Var, zW);
                }
                hashSet.clear();
            }
        }
        if (kv2.s) {
            HashSet<ts0> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                ts0 ts0Var5 = (ts0) this.q0.get(i7);
                ts0Var5.getClass();
                if (!(ts0Var5 instanceof tm5) && !(ts0Var5 instanceof m42)) {
                    hashSet2.add(ts0Var5);
                }
            }
            us0Var = this;
            kv2Var2 = kv2Var;
            us0Var.g(this, kv2Var2, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            for (ts0 ts0Var6 : hashSet2) {
                y94.u(us0Var, kv2Var2, ts0Var6);
                ts0Var6.y(kv2Var2, zW);
            }
        } else {
            us0Var = this;
            kv2Var2 = kv2Var;
            for (int i8 = 0; i8 < size; i8++) {
                ts0 ts0Var7 = (ts0) us0Var.q0.get(i8);
                if (ts0Var7 instanceof us0) {
                    int[] iArr = ts0Var7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        ts0Var7.M(1);
                    }
                    if (i10 == 2) {
                        ts0Var7.N(1);
                    }
                    ts0Var7.y(kv2Var2, zW);
                    if (i9 == 2) {
                        ts0Var7.M(i9);
                    }
                    if (i10 == 2) {
                        ts0Var7.N(i10);
                    }
                } else {
                    y94.u(us0Var, kv2Var2, ts0Var7);
                    if (!(ts0Var7 instanceof tm5) && !(ts0Var7 instanceof m42)) {
                        ts0Var7.y(kv2Var2, zW);
                    }
                }
            }
        }
        if (us0Var.z0 > 0) {
            m50.d(us0Var, kv2Var2, null, 0);
        }
        if (us0Var.A0 > 0) {
            m50.d(us0Var, kv2Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    public final boolean T(int i, boolean z) {
        boolean z2;
        t51 t51Var = this.s0;
        ArrayList arrayList = (ArrayList) t51Var.v;
        us0 us0Var = (us0) t51Var.r;
        boolean z3 = false;
        int iA = us0Var.a(0);
        int iA2 = us0Var.a(1);
        int iP = us0Var.p();
        int iU = us0Var.u();
        if (z && (iA == 2 || iA2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                eo5 eo5Var = (eo5) obj;
                if (eo5Var.x == i && !eo5Var.m()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iA == 2) {
                    us0Var.M(1);
                    us0Var.O(t51Var.n(us0Var, 0));
                    us0Var.n.v.n(us0Var.s());
                }
            } else if (z && iA2 == 2) {
                us0Var.N(1);
                us0Var.L(t51Var.n(us0Var, 1));
                us0Var.v.v.n(us0Var.m());
            }
        }
        int[] iArr = us0Var.p0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iS = us0Var.s() + iP;
                us0Var.n.t.n(iS);
                us0Var.n.v.n(iS - iP);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int iM = us0Var.m() + iU;
                us0Var.v.t.n(iM);
                us0Var.v.v.n(iM - iU);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        t51Var.o();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            eo5 eo5Var2 = (eo5) obj2;
            if (eo5Var2.x == i && (eo5Var2.y != us0Var || eo5Var2.l)) {
                eo5Var2.v();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList.get(i6);
            i6++;
            eo5 eo5Var3 = (eo5) obj3;
            if (eo5Var3.x == i && (z2 || eo5Var3.y != us0Var)) {
                if (!eo5Var3.j.a || !eo5Var3.t.a || (!(eo5Var3 instanceof lc0) && !eo5Var3.v.a)) {
                    us0Var.M(iA);
                    us0Var.N(iA2);
                    return z3;
                }
            }
        }
        z3 = true;
        us0Var.M(iA);
        us0Var.N(iA2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:296:0x0524  */
    /* JADX WARN: Code duplicated, block: B:297:0x0526  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [ts0, us0] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public final void U() {
        ?? r21;
        int i;
        boolean z;
        char c;
        as0 as0Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r2;
        ?? r17;
        boolean z7;
        ?? r0;
        boolean z8;
        int i2;
        boolean z9;
        ?? r1;
        ?? r14;
        boolean z10;
        int i3;
        boolean z11;
        boolean z12;
        ?? r3;
        ?? r4;
        int i4;
        boolean z13;
        boolean[] zArr = y94.a;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size = this.q0.size();
        int iMax = Math.max(0, s());
        int iMax2 = Math.max(0, m());
        int[] iArr = this.p0;
        int i5 = iArr[1];
        int i6 = iArr[0];
        int i7 = this.t0;
        as0 as0Var2 = this.J;
        as0 as0Var3 = this.I;
        if (i7 == 0 && y94.k(this.D0, 1)) {
            gs0 gs0Var = this.u0;
            int i8 = iArr[0];
            int i9 = iArr[1];
            E();
            ArrayList arrayList = this.q0;
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((ts0) arrayList.get(i10)).E();
            }
            boolean z14 = this.v0;
            if (i8 == 1) {
                J(0, s());
            } else {
                as0Var3.q(0);
                this.Y = 0;
            }
            int i11 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i11 < size2) {
                int i12 = i11;
                ts0 ts0Var = (ts0) arrayList.get(i11);
                int[] iArr2 = iArr;
                if (ts0Var instanceof m42) {
                    m42 m42Var = (m42) ts0Var;
                    z13 = z15;
                    if (m42Var.u0 == 1) {
                        int i13 = m42Var.r0;
                        if (i13 != -1) {
                            m42Var.R(i13);
                        } else if (m42Var.s0 != -1 && A()) {
                            m42Var.R(s() - m42Var.s0);
                        } else if (A()) {
                            m42Var.R((int) ((m42Var.q0 * s()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    z13 = z15;
                    if ((ts0Var instanceof bx) && ((bx) ts0Var).U() == 0) {
                        z15 = z13;
                        z16 = true;
                    }
                    i11 = i12 + 1;
                    iArr = iArr2;
                }
                z15 = z13;
                i11 = i12 + 1;
                iArr = iArr2;
            }
            r21 = iArr;
            if (z15) {
                for (int i14 = 0; i14 < size2; i14 = i4 + 1) {
                    ts0 ts0Var2 = (ts0) arrayList.get(i14);
                    if (ts0Var2 instanceof m42) {
                        m42 m42Var2 = (m42) ts0Var2;
                        i4 = i14;
                        if (m42Var2.u0 == 1) {
                            ue5.U(0, gs0Var, m42Var2, z14);
                        }
                    } else {
                        i4 = i14;
                    }
                }
            }
            ue5.U(0, gs0Var, this, z14);
            if (z16) {
                for (int i15 = 0; i15 < size2; i15++) {
                    ts0 ts0Var3 = (ts0) arrayList.get(i15);
                    if (ts0Var3 instanceof bx) {
                        bx bxVar = (bx) ts0Var3;
                        if (bxVar.U() == 0 && bxVar.T()) {
                            ue5.U(1, gs0Var, bxVar, z14);
                        }
                    }
                }
            }
            if (i9 == 1) {
                K(0, m());
            } else {
                as0Var2.q(0);
                this.Z = 0;
            }
            int i16 = 0;
            boolean z17 = false;
            boolean z18 = false;
            while (i16 < size2) {
                ts0 ts0Var4 = (ts0) arrayList.get(i16);
                int i17 = i16;
                if (ts0Var4 instanceof m42) {
                    m42 m42Var3 = (m42) ts0Var4;
                    if (m42Var3.u0 == 0) {
                        int i18 = m42Var3.r0;
                        if (i18 != -1) {
                            m42Var3.R(i18);
                        } else if (m42Var3.s0 != -1 && B()) {
                            m42Var3.R(m() - m42Var3.s0);
                        } else if (B()) {
                            m42Var3.R((int) ((m42Var3.q0 * m()) + 0.5f));
                        }
                        z17 = true;
                    }
                } else if ((ts0Var4 instanceof bx) && ((bx) ts0Var4).U() == 1) {
                    z18 = true;
                }
                i16 = i17 + 1;
            }
            if (z17) {
                for (int i19 = 0; i19 < size2; i19++) {
                    ts0 ts0Var5 = (ts0) arrayList.get(i19);
                    if (ts0Var5 instanceof m42) {
                        m42 m42Var4 = (m42) ts0Var5;
                        if (m42Var4.u0 == 0) {
                            ue5.v0(1, gs0Var, m42Var4);
                        }
                    }
                }
            }
            ue5.v0(0, gs0Var, this);
            if (z18) {
                for (int i20 = 0; i20 < size2; i20++) {
                    ts0 ts0Var6 = (ts0) arrayList.get(i20);
                    if (ts0Var6 instanceof bx) {
                        bx bxVar2 = (bx) ts0Var6;
                        if (bxVar2.U() == 1 && bxVar2.T()) {
                            ue5.v0(1, gs0Var, bxVar2);
                        }
                    }
                }
            }
            for (int i21 = 0; i21 < size2; i21++) {
                ts0 ts0Var7 = (ts0) arrayList.get(i21);
                if (ts0Var7.e() && ue5.B(ts0Var7)) {
                    V(ts0Var7, gs0Var, ue5.t);
                    if (!(ts0Var7 instanceof m42)) {
                        ue5.U(0, gs0Var, ts0Var7, z14);
                        ue5.v0(0, gs0Var, ts0Var7);
                    } else if (((m42) ts0Var7).u0 == 0) {
                        ue5.v0(0, gs0Var, ts0Var7);
                    } else {
                        ue5.U(0, gs0Var, ts0Var7, z14);
                    }
                }
            }
            for (int i22 = 0; i22 < size; i22++) {
                ts0 ts0Var8 = (ts0) this.q0.get(i22);
                if (ts0Var8.e() && !(ts0Var8 instanceof m42) && !(ts0Var8 instanceof bx) && !(ts0Var8 instanceof tm5) && !ts0Var8.F) {
                    int iA = ts0Var8.a(0);
                    int iA2 = ts0Var8.a(1);
                    if (iA != 3 || ts0Var8.p == 1 || iA2 != 3 || ts0Var8.u == 1) {
                        V(ts0Var8, this.u0, new vy());
                    }
                }
            }
        } else {
            r21 = iArr;
        }
        int i23 = 2;
        if (size <= 2 || !((i6 == 2 || i5 == 2) && y94.k(this.D0, 1024) && kg6.r(this, this.u0))) {
            i = iMax;
            z = false;
        } else {
            if (i6 == 2) {
                if (iMax >= s() || iMax <= 0) {
                    iMax = s();
                } else {
                    O(iMax);
                    this.E0 = true;
                }
            }
            if (i5 == 2) {
                if (iMax2 >= m() || iMax2 <= 0) {
                    iMax2 = m();
                } else {
                    L(iMax2);
                    this.F0 = true;
                }
            }
            i = iMax;
            z = true;
        }
        boolean z19 = W(64) || W(128);
        kv2 kv2Var = this.w0;
        kv2Var.getClass();
        kv2Var.j = false;
        if (this.D0 == 0 || !z19) {
            c = 1;
        } else {
            c = 1;
            kv2Var.j = true;
        }
        ArrayList arrayList2 = this.q0;
        boolean z20 = r21[0] == 2 || r21[c] == 2;
        this.z0 = 0;
        this.A0 = 0;
        int i24 = 0;
        while (i24 < size) {
            ts0 ts0Var9 = (ts0) this.q0.get(i24);
            int i25 = i23;
            if (ts0Var9 instanceof us0) {
                ((us0) ts0Var9).U();
            }
            i24++;
            i23 = i25;
        }
        int i26 = i23;
        boolean zW = W(64);
        ?? r15 = z;
        int i27 = 0;
        boolean z21 = true;
        while (z21) {
            int i28 = i27 + 1;
            try {
                kv2Var.z();
                z2 = z20;
                try {
                    this.z0 = 0;
                    this.A0 = 0;
                    l(kv2Var);
                    for (int i29 = 0; i29 < size; i29++) {
                        ((ts0) this.q0.get(i29)).l(kv2Var);
                    }
                    S(kv2Var);
                    try {
                        WeakReference weakReference = this.G0;
                        if (weakReference == null || weakReference.get() == null) {
                            as0Var = as0Var2;
                        } else {
                            as0Var = as0Var2;
                            try {
                                kv2Var.x(kv2Var.m((as0) this.G0.get()), kv2Var.m(as0Var2), 0, 5);
                                this.G0 = null;
                            } catch (Exception e) {
                                e = e;
                                z3 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z4 = z3;
                            }
                        }
                        WeakReference weakReference2 = this.I0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            kv2Var.x(kv2Var.m(this.L), kv2Var.m((as0) this.I0.get()), 0, 5);
                            this.I0 = null;
                        }
                        WeakReference weakReference3 = this.H0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            kv2Var.x(kv2Var.m((as0) this.H0.get()), kv2Var.m(as0Var3), 0, 5);
                            this.H0 = null;
                        }
                        WeakReference weakReference4 = this.J0;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            kv2Var.x(kv2Var.m(this.K), kv2Var.m((as0) this.J0.get()), 0, 5);
                            this.J0 = null;
                        }
                        kv2Var.b();
                        z4 = true;
                    } catch (Exception e2) {
                        e = e2;
                        as0Var = as0Var2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    as0Var = as0Var2;
                    z3 = z21;
                }
            } catch (Exception e4) {
                e = e4;
                as0Var = as0Var2;
                z2 = z20;
                z3 = z21;
            }
            if (z4) {
                zArr[i26] = false;
                boolean zW2 = W(64);
                Q(kv2Var, zW2);
                int size3 = this.q0.size();
                int i30 = 0;
                boolean z22 = false;
                while (i30 < size3) {
                    ts0 ts0Var10 = (ts0) this.q0.get(i30);
                    ts0Var10.Q(kv2Var, zW2);
                    boolean z23 = zW2;
                    int i31 = size3;
                    if (ts0Var10.j != -1 || ts0Var10.t != -1) {
                        z22 = true;
                    }
                    i30++;
                    zW2 = z23;
                    size3 = i31;
                    z22 = z22;
                }
                z5 = z22;
            } else {
                Q(kv2Var, zW);
                for (int i32 = 0; i32 < size; i32++) {
                    ((ts0) this.q0.get(i32)).Q(kv2Var, zW);
                }
                z5 = false;
            }
            if (z2 && i28 < 8 && zArr[i26]) {
                int i33 = 0;
                int iMax3 = 0;
                int iMax4 = 0;
                while (i33 < size) {
                    ts0 ts0Var11 = (ts0) this.q0.get(i33);
                    iMax4 = Math.max(iMax4, ts0Var11.s() + ts0Var11.Y);
                    iMax3 = Math.max(iMax3, ts0Var11.m() + ts0Var11.Z);
                    i33++;
                    zW = zW;
                }
                z6 = zW;
                int iMax5 = Math.max(this.b0, iMax4);
                int iMax6 = Math.max(this.c0, iMax3);
                int i34 = i26;
                r15 = r15;
                z5 = z5;
                if (i6 == i34 && s() < iMax5) {
                    r15 = r15;
                    z5 = z5;
                    O(iMax5);
                    r21[0] = i34;
                    r15 = 1;
                    z5 = true;
                }
                if (i5 == i34 && m() < iMax6) {
                    L(iMax6);
                    r21[1] = i34;
                    r15 = 1;
                    z5 = true;
                }
            } else {
                z6 = zW;
            }
            int iMax7 = Math.max(this.b0, s());
            if (iMax7 > s()) {
                O(iMax7);
                r2 = 1;
                r21[0] = 1;
                z7 = true;
                r17 = 1;
            } else {
                r2 = 1;
                r17 = r15;
                z7 = z5;
            }
            int iMax8 = Math.max(this.c0, m());
            if (iMax8 > m()) {
                L(iMax8);
                r21[r2] = r2;
                r4 = r2;
                z8 = r4 == true ? 1 : 0;
            } else {
                r0 = r17;
            }
            if (r0 == 0) {
                z8 = z7;
                if (r21[0] == 2 && i > 0) {
                    r3 = r0;
                    z12 = z8;
                    if (s() > i) {
                        this.E0 = r2;
                        r21[0] = r2;
                        O(i);
                        ?? r5 = r2;
                        z12 = r5 == true ? 1 : 0;
                        r3 = r5;
                    }
                }
                r0 = r4;
                r3 = r0;
                r3 = r0;
                z12 = z8;
                z12 = z8;
                i2 = 2;
                r1 = r3;
                r1 = r3;
                z9 = z12;
                z9 = z12;
                if (r21[r2] == 2 && iMax2 > 0 && m() > iMax2) {
                    this.F0 = r2;
                    r21[r2] = r2;
                    L(iMax2);
                    i3 = 8;
                    z10 = true;
                    r14 = 1;
                }
                if (i28 > i3) {
                    r1 = r3;
                    z9 = z12;
                    z11 = false;
                } else {
                    r1 = r3;
                    z9 = z12;
                    z11 = z10;
                }
                i27 = i28;
                i26 = i2;
                z20 = z2;
                as0Var3 = as0Var3;
                as0Var2 = as0Var;
                zW = z6;
                r15 = r14;
                z21 = z11;
            } else {
                z8 = z7;
                r0 = r4;
                i2 = 2;
                r1 = r0;
                z9 = z8;
            }
            r1 = r3;
            z9 = z12;
            r14 = r1;
            z10 = z9;
            i3 = 8;
            if (i28 > i3) {
                r1 = r3;
                z9 = z12;
                z11 = false;
            } else {
                r1 = r3;
                z9 = z12;
                z11 = z10;
            }
            i27 = i28;
            i26 = i2;
            z20 = z2;
            as0Var3 = as0Var3;
            as0Var2 = as0Var;
            zW = z6;
            r15 = r14;
            z21 = z11;
        }
        this.q0 = arrayList2;
        if (r15 != 0) {
            r21[0] = i6;
            r21[1] = i5;
        }
        F(kv2Var.w);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.ts0
    public final void c(StringBuilder sb) {
        sb.append(this.a + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ts0) obj).c(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
