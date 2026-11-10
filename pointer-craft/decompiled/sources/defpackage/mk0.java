package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mk0 extends z {
    public final ma3 R;
    public final ma3 S;
    public qu3 T;
    public iv4 U;
    public iv4 V;
    public boolean W;
    public boolean X;
    public long Y;
    public boolean Z;
    public ob2 a0;
    public iv4 b0;
    public iv4 c0;
    public boolean d0;
    public boolean e0;
    public long f0;
    public boolean g0;

    public mk0(my1 my1Var, ja3 ja3Var) {
        super(ja3Var, null, false, true, null, null, my1Var);
        int i = my2.g;
        this.R = new ma3(6);
        this.S = new ma3(6);
        this.Y = -1L;
        this.f0 = -1L;
    }

    @Override // defpackage.wb2
    public final void C() {
        g1(true);
    }

    @Override // defpackage.i73
    public final void K0() {
        j1();
    }

    @Override // defpackage.z, defpackage.tu3
    public final void L(ju3 ju3Var, ku3 ku3Var, long j) {
        super.L(ju3Var, ku3Var, j);
        if (ku3Var != ku3.t) {
            if (ku3Var != ku3.a || this.T == null || this.X) {
                return;
            }
            List list = ju3Var.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                qu3 qu3Var = (qu3) list.get(i);
                if (qu3Var.q() && qu3Var != this.T) {
                    g1(false);
                    return;
                }
            }
            return;
        }
        if (this.T == null) {
            if (r25.v(ju3Var, true)) {
                qu3 qu3Var2 = (qu3) ju3Var.g.get(0);
                qu3Var2.g();
                this.T = qu3Var2;
                if (this.C) {
                    iv4 iv4Var = this.V;
                    if (iv4Var != null && iv4Var.y()) {
                        ((bl5) v70.b(this, hp0.z)).getClass();
                        if (qu3Var2.y - this.Y < 40) {
                            this.Z = true;
                            return;
                        }
                        this.W = true;
                        iv4 iv4Var2 = this.V;
                        if (iv4Var2 != null) {
                            iv4Var2.x(null);
                        }
                        this.V = null;
                    }
                    this.X = false;
                    Z0(qu3Var2);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = ju3Var.r;
        List list2 = ju3Var.g;
        if (this.X) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!fd6.n((qu3) list2.get(i3))) {
                    int size3 = list2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((qu3) list2.get(i4)).g();
                    }
                    return;
                }
            }
            qu3 qu3Var3 = (qu3) list2.get(0);
            qu3Var3.g();
            long j2 = qu3Var3.y;
            qu3 qu3Var4 = this.T;
            qu3Var4.getClass();
            i1(j2, qu3Var4);
            return;
        }
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            if (!fd6.r((qu3) list2.get(i5))) {
                long jV0 = V0(j);
                int size5 = list2.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    qu3 qu3Var5 = (qu3) list2.get(i6);
                    if (qu3Var5.q() || fd6.x(qu3Var5, j, jV0)) {
                        g1(false);
                        return;
                    }
                }
                return;
            }
        }
        qu3 qu3Var6 = (qu3) list2.get(0);
        qu3Var6.g();
        long j3 = qu3Var6.y;
        qu3 qu3Var7 = this.T;
        qu3Var7.getClass();
        i1(j3, qu3Var7);
    }

    @Override // defpackage.z
    public final void b1() {
        j1();
    }

    @Override // defpackage.z
    public final boolean c1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.z
    public final void d1(KeyEvent keyEvent) {
        long jR = mx5.r(keyEvent);
        ma3 ma3Var = this.R;
        boolean z = false;
        if (ma3Var.n(jR) != null) {
            dh2 dh2Var = (dh2) ma3Var.n(jR);
            if (dh2Var != null) {
                if (dh2Var.y()) {
                    dh2Var.x(null);
                } else {
                    z = true;
                }
            }
            ma3Var.x(jR);
        }
        if (z) {
            return;
        }
        e1();
    }

    public final void g1(boolean z) {
        if (z) {
            this.a0 = null;
            iv4 iv4Var = this.b0;
            if (iv4Var != null) {
                iv4Var.x(null);
            }
            this.b0 = null;
            iv4 iv4Var2 = this.c0;
            if (iv4Var2 != null) {
                iv4Var2.x(null);
            }
            this.c0 = null;
            this.d0 = false;
            this.e0 = false;
            this.f0 = -1L;
            this.g0 = false;
        } else {
            this.T = null;
            iv4 iv4Var3 = this.U;
            if (iv4Var3 != null) {
                iv4Var3.x(null);
            }
            this.U = null;
            iv4 iv4Var4 = this.V;
            if (iv4Var4 != null) {
                iv4Var4.x(null);
            }
            this.V = null;
            this.W = false;
            this.X = false;
            this.Y = -1L;
            this.Z = false;
        }
        W0(z);
    }

    @Override // defpackage.wb2
    public final void h(ld1 ld1Var, ku3 ku3Var) {
        ArrayList arrayList = (ArrayList) ld1Var.r;
        a1();
        if (this.C && this.G == null) {
            i12 i12VarY = dg6.y(this);
            Q0(i12VarY);
            this.G = i12VarY;
        }
        int i = 0;
        if (ku3Var != ku3.t) {
            if (ku3Var != ku3.a || this.a0 == null || this.e0) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                ob2 ob2Var = (ob2) arrayList.get(i);
                if (ob2Var.t && ob2Var != this.a0) {
                    g1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.a0 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (ai6.y((ob2) arrayList.get(i2))) {
                    ob2 ob2Var2 = (ob2) arrayList.get(0);
                    ob2Var2.t = true;
                    this.a0 = ob2Var2;
                    if (this.C) {
                        iv4 iv4Var = this.c0;
                        if (iv4Var != null && iv4Var.y()) {
                            ((bl5) v70.b(this, hp0.z)).getClass();
                            if (ob2Var2.y - this.f0 < 40) {
                                this.g0 = true;
                                return;
                            }
                            this.d0 = true;
                            iv4 iv4Var2 = this.c0;
                            if (iv4Var2 != null) {
                                iv4Var2.x(null);
                            }
                            this.c0 = null;
                        }
                        this.e0 = false;
                        Y0(ob2Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.e0) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ob2 ob2Var3 = (ob2) arrayList.get(i3);
                if (!ob2Var3.j || ob2Var3.n) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((ob2) arrayList.get(i)).t = true;
                        i++;
                    }
                    return;
                }
            }
            ob2 ob2Var4 = (ob2) arrayList.get(0);
            ob2Var4.t = true;
            long j = ob2Var4.y;
            ob2 ob2Var5 = this.a0;
            ob2Var5.getClass();
            h1(j, ob2Var5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            ob2 ob2Var6 = (ob2) arrayList.get(i4);
            if (ob2Var6.v() || !ob2Var6.n() || ob2Var6.r()) {
                float fN = ((bl5) v70.b(this, hp0.z)).n();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    ob2 ob2Var7 = (ob2) arrayList.get(i5);
                    long j2 = ob2Var7.r;
                    ob2 ob2Var8 = this.a0;
                    ob2Var8.getClass();
                    boolean z = Math.abs(wi3.r(wi3.n(j2, ob2Var8.r))) > fN;
                    if (ob2Var7.t || z) {
                        g1(true);
                        return;
                    }
                }
                return;
            }
        }
        ob2 ob2Var9 = (ob2) arrayList.get(0);
        ob2Var9.t = true;
        long j3 = ob2Var9.y;
        ob2 ob2Var10 = this.a0;
        ob2Var10.getClass();
        h1(j3, ob2Var10);
    }

    public final void h1(long j, ob2 ob2Var) {
        if (this.C && !this.g0) {
            X0(ob2Var.r, true);
            this.f0 = j;
            if (!this.e0 && !this.d0) {
                e1();
            }
        }
        this.a0 = null;
        this.g0 = false;
        this.d0 = false;
        iv4 iv4Var = this.b0;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        this.b0 = null;
        this.e0 = false;
    }

    public final void i1(long j, qu3 qu3Var) {
        if (this.C && !this.Z) {
            X0(qu3Var.r, false);
            this.Y = j;
            if (!this.X && !this.W) {
                e1();
            }
        }
        this.T = null;
        this.Z = false;
        this.W = false;
        iv4 iv4Var = this.U;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        this.U = null;
        this.X = false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    public final void j1() {
        char c;
        long j;
        long j2;
        ma3 ma3Var = this.R;
        Object[] objArr = ma3Var.r;
        long[] jArr = ma3Var.g;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((dh2) objArr[(i << 3) + i3]).x(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        ma3Var.g();
        ma3 ma3Var2 = this.S;
        Object[] objArr2 = ma3Var2.r;
        long[] jArr2 = ma3Var2.g;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((lk0) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        ma3Var2.g();
    }

    @Override // defpackage.tu3
    public final void m0() {
        p72 p72Var;
        ja3 ja3Var = this.k;
        if (ja3Var != null && (p72Var = this.K) != null) {
            ja3Var.r(new q72(p72Var));
        }
        this.K = null;
        g1(false);
    }

    @Override // defpackage.z
    public final void T0(nj4 nj4Var) {
    }
}
