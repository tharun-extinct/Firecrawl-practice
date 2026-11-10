package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ts0 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final as0 I;
    public final as0 J;
    public final as0 K;
    public final as0 L;
    public final as0 M;
    public final as0 N;
    public final as0 O;
    public final as0 P;
    public final as0[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public us0 T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public String a;
    public int a0;
    public int b;
    public int b0;
    public boolean c;
    public int c0;
    public int d;
    public float d0;
    public float e;
    public float e0;
    public float f;
    public View f0;
    public int g0;
    public int h;
    public String h0;
    public int i;
    public int i0;
    public int j0;
    public int k;
    public final float[] k0;
    public final ts0[] l0;
    public boolean m;
    public final ts0[] m0;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public boolean q;
    public lc0 r;
    public int s;
    public int u;
    public boolean w;
    public lc0 y;
    public final int[] z;
    public boolean g = false;
    public l72 n = null;
    public hk5 v = null;
    public final boolean[] x = {true, true};
    public boolean l = true;
    public int j = -1;
    public int t = -1;

    public ts0() {
        new HashMap();
        this.m = false;
        this.q = false;
        this.w = false;
        this.c = false;
        this.i = -1;
        this.b = -1;
        this.s = 0;
        this.p = 0;
        this.u = 0;
        this.z = new int[2];
        this.h = 0;
        this.o = 0;
        this.f = 1.0f;
        this.k = 0;
        this.d = 0;
        this.e = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        as0 as0Var = new as0(this, 2);
        this.I = as0Var;
        as0 as0Var2 = new as0(this, 3);
        this.J = as0Var2;
        as0 as0Var3 = new as0(this, 4);
        this.K = as0Var3;
        as0 as0Var4 = new as0(this, 5);
        this.L = as0Var4;
        as0 as0Var5 = new as0(this, 6);
        this.M = as0Var5;
        as0 as0Var6 = new as0(this, 8);
        this.N = as0Var6;
        as0 as0Var7 = new as0(this, 9);
        this.O = as0Var7;
        as0 as0Var8 = new as0(this, 7);
        this.P = as0Var8;
        this.Q = new as0[]{as0Var, as0Var3, as0Var2, as0Var4, as0Var5, as0Var8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new ts0[]{null, null};
        this.m0 = new ts0[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(as0Var);
        arrayList.add(as0Var2);
        arrayList.add(as0Var3);
        arrayList.add(as0Var4);
        arrayList.add(as0Var6);
        arrayList.add(as0Var7);
        arrayList.add(as0Var8);
        arrayList.add(as0Var5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void b(StringBuilder sb, String str, as0 as0Var) {
        if (as0Var.x == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(as0Var.x);
        sb.append("'");
        if (as0Var.j != Integer.MIN_VALUE || as0Var.l != 0) {
            sb.append(",");
            sb.append(as0Var.l);
            if (as0Var.j != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(as0Var.j);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public static void i(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        sb.append(str);
        sb.append(" :  {\n");
        String strH = fj.h(i6);
        if (!"FIXED".equals(strH)) {
            du4.B(sb, "      behavior", " :   ", strH, ",\n");
        }
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public boolean A() {
        if (this.m) {
            return true;
        }
        return this.I.r && this.K.r;
    }

    public boolean B() {
        if (this.q) {
            return true;
        }
        return this.J.r && this.L.r;
    }

    public void C() {
        this.I.a();
        this.J.a();
        this.K.a();
        this.L.a();
        this.M.a();
        this.N.a();
        this.O.a();
        this.P.a();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.i = -1;
        this.b = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.p = 0;
        this.u = 0;
        this.f = 1.0f;
        this.e = 1.0f;
        this.o = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.h = 0;
        this.k = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.x;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.l = true;
        int[] iArr3 = this.z;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.j = -1;
        this.t = -1;
    }

    public final void D() {
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((as0) arrayList.get(i)).a();
        }
    }

    public final void E() {
        this.m = false;
        this.q = false;
        this.w = false;
        this.c = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            as0 as0Var = (as0) arrayList.get(i);
            as0Var.r = false;
            as0Var.y = 0;
        }
    }

    public void F(ro roVar) {
        this.I.m();
        this.J.m();
        this.K.m();
        this.L.m();
        this.M.m();
        this.P.m();
        this.N.m();
        this.O.m();
    }

    public final void I(int i) {
        this.a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.m) {
            return;
        }
        this.I.q(i);
        this.K.q(i2);
        this.Y = i;
        this.U = i2 - i;
        this.m = true;
    }

    public final void K(int i, int i2) {
        if (this.q) {
            return;
        }
        this.J.q(i);
        this.L.q(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.q(i + this.a0);
        }
        this.q = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        l72 l72Var = this.n;
        boolean z3 = z & l72Var.l;
        hk5 hk5Var = this.v;
        boolean z4 = z2 & hk5Var.l;
        int i3 = l72Var.j.l;
        int i4 = hk5Var.j.l;
        int i5 = l72Var.t.l;
        int i6 = hk5Var.t.l;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(kv2 kv2Var, boolean z) {
        int i;
        int i2;
        hk5 hk5Var;
        l72 l72Var;
        kv2Var.getClass();
        int iC = kv2.c(this.I);
        int iC2 = kv2.c(this.J);
        int iC3 = kv2.c(this.K);
        int iC4 = kv2.c(this.L);
        if (z && (l72Var = this.n) != null) {
            u51 u51Var = l72Var.j;
            if (u51Var.a) {
                u51 u51Var2 = l72Var.t;
                if (u51Var2.a) {
                    iC = u51Var.l;
                    iC3 = u51Var2.l;
                }
            }
        }
        if (z && (hk5Var = this.v) != null) {
            u51 u51Var3 = hk5Var.j;
            if (u51Var3.a) {
                u51 u51Var4 = hk5Var.t;
                if (u51Var4.a) {
                    iC2 = u51Var3.l;
                    iC4 = u51Var4.l;
                }
            }
        }
        int i3 = iC4 - iC2;
        if (iC3 - iC < 0 || i3 < 0 || iC == Integer.MIN_VALUE || iC == Integer.MAX_VALUE || iC2 == Integer.MIN_VALUE || iC2 == Integer.MAX_VALUE || iC3 == Integer.MIN_VALUE || iC3 == Integer.MAX_VALUE || iC4 == Integer.MIN_VALUE || iC4 == Integer.MAX_VALUE) {
            iC = 0;
            iC2 = 0;
            iC3 = 0;
            iC4 = 0;
        }
        int i4 = iC3 - iC;
        int i5 = iC4 - iC2;
        this.Y = iC;
        this.Z = iC2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        } else {
            i8 = i4;
        }
        int i9 = this.o;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(i8, i9);
        }
        int i10 = this.d;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.j = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.t = i12;
        }
    }

    public final int a(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public void c(StringBuilder sb) {
        sb.append("  " + this.a + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        b(sb, "left", this.I);
        b(sb, "top", this.J);
        b(sb, "right", this.K);
        b(sb, "bottom", this.L);
        b(sb, "baseline", this.M);
        b(sb, "centerX", this.N);
        b(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.h;
        int i5 = this.p;
        float f = this.f;
        int[] iArr2 = this.p0;
        int i6 = iArr2[0];
        float[] fArr = this.k0;
        float f2 = fArr[0];
        i(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.V;
        int i8 = this.c0;
        int i9 = iArr[1];
        int i10 = this.k;
        int i11 = this.u;
        float f3 = this.e;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        i(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.W;
        int i13 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final boolean d() {
        as0 as0Var = this.J;
        as0 as0Var2 = as0Var.x;
        if (as0Var2 != null && as0Var2.x == as0Var) {
            return true;
        }
        as0 as0Var3 = this.L;
        as0 as0Var4 = as0Var3.x;
        return as0Var4 != null && as0Var4.x == as0Var3;
    }

    public final boolean e() {
        return this.l && this.g0 != 8;
    }

    public final boolean f(int i) {
        as0 as0Var;
        as0 as0Var2;
        int i2 = i * 2;
        as0[] as0VarArr = this.Q;
        as0 as0Var3 = as0VarArr[i2];
        as0 as0Var4 = as0Var3.x;
        return (as0Var4 == null || as0Var4.x == as0Var3 || (as0Var2 = (as0Var = as0VarArr[i2 + 1]).x) == null || as0Var2.x != as0Var) ? false : true;
    }

    public final void g(us0 us0Var, kv2 kv2Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            y94.u(us0Var, kv2Var, this);
            hashSet.remove(this);
            y(kv2Var, us0Var.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.g;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((as0) it.next()).n.g(us0Var, kv2Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.g;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((as0) it2.next()).n.g(us0Var, kv2Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.g;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((as0) it3.next()).n.g(us0Var, kv2Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.g;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((as0) it4.next()).n.g(us0Var, kv2Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.g;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((as0) it5.next()).n.g(us0Var, kv2Var, hashSet, i, true);
            }
        }
    }

    public final boolean h(int i, int i2) {
        as0 as0Var;
        as0 as0Var2;
        as0 as0Var3;
        as0 as0Var4;
        if (i == 0) {
            as0 as0Var5 = this.I;
            as0 as0Var6 = as0Var5.x;
            if (as0Var6 == null || !as0Var6.r || (as0Var4 = (as0Var3 = this.K).x) == null || !as0Var4.r) {
                return false;
            }
            return (as0Var4.n() - as0Var3.v()) - (as0Var5.v() + as0Var5.x.n()) >= i2;
        }
        as0 as0Var7 = this.J;
        as0 as0Var8 = as0Var7.x;
        if (as0Var8 == null || !as0Var8.r || (as0Var2 = (as0Var = this.L).x) == null || !as0Var2.r) {
            return false;
        }
        return (as0Var2.n() - as0Var.v()) - (as0Var7.v() + as0Var7.x.n()) >= i2;
    }

    public final void j() {
        if (this.n == null) {
            this.n = new l72(this);
        }
        if (this.v == null) {
            this.v = new hk5(this);
        }
    }

    public final boolean k() {
        as0 as0Var = this.I;
        as0 as0Var2 = as0Var.x;
        if (as0Var2 != null && as0Var2.x == as0Var) {
            return true;
        }
        as0 as0Var3 = this.K;
        as0 as0Var4 = as0Var3.x;
        return as0Var4 != null && as0Var4.x == as0Var3;
    }

    public final void l(kv2 kv2Var) {
        kv2Var.m(this.I);
        kv2Var.m(this.J);
        kv2Var.m(this.K);
        kv2Var.m(this.L);
        if (this.a0 > 0) {
            kv2Var.m(this.M);
        }
    }

    public final int m() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x0402  */
    /* JADX WARN: Code duplicated, block: B:240:0x041f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0452  */
    /* JADX WARN: Code duplicated, block: B:259:0x0458  */
    /* JADX WARN: Code duplicated, block: B:270:0x046d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0477  */
    /* JADX WARN: Code duplicated, block: B:277:0x047b  */
    /* JADX WARN: Code duplicated, block: B:278:0x047d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0485  */
    /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r0
  0x0493: PHI (r0v15 int) = (r0v14 int), (r0v19 int), (r0v19 int), (r0v19 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:294:0x04af  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:337:0x0521  */
    public final void n(kv2 kv2Var, boolean z, boolean z2, boolean z3, boolean z4, eu4 eu4Var, eu4 eu4Var2, int i, boolean z5, as0 as0Var, as0 as0Var2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        boolean z14;
        int i10;
        int i11;
        boolean z15;
        eu4 eu4VarM;
        eu4 eu4VarM2;
        as0 as0Var3;
        eu4 eu4Var3;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        ts0 ts0Var;
        boolean z20;
        int iMin2;
        boolean z21;
        int i14;
        int iV;
        int i15;
        int i16;
        HashSet hashSet;
        boolean z22;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z23;
        boolean z24;
        int i22;
        kv2Var = kv2Var;
        int i23 = i8;
        int i24 = i9;
        eu4 eu4VarM3 = kv2Var.m(as0Var);
        eu4 eu4VarM4 = kv2Var.m(as0Var2);
        eu4 eu4VarM5 = kv2Var.m(as0Var.x);
        eu4 eu4VarM6 = kv2Var.m(as0Var2.x);
        boolean zJ = as0Var.j();
        boolean zJ2 = as0Var2.j();
        boolean zJ3 = this.P.j();
        int i25 = zJ2 ? (zJ ? 1 : 0) + 1 : zJ ? 1 : 0;
        if (zJ3) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i6;
        int iD = du4.D(i);
        boolean z25 = (iD == 0 || iD == 1 || iD != 2 || i27 == 4) ? false : true;
        int i28 = this.j;
        if (i28 == -1 || !z) {
            i28 = i3;
            z12 = z25;
        } else {
            this.j = -1;
            z12 = false;
        }
        int i29 = this.t;
        if (i29 == -1 || z) {
            z13 = z12;
        } else {
            this.t = -1;
            i28 = i29;
            z13 = false;
        }
        boolean z26 = z13;
        if (this.g0 == 8) {
            z14 = false;
            iMin = 0;
        } else {
            iMin = i28;
            z14 = z26;
        }
        if (z11) {
            if (!zJ && !zJ2 && !zJ3) {
                kv2Var.n(eu4VarM3, i2);
            } else if (zJ && !zJ2) {
                i10 = 8;
                kv2Var.v(eu4VarM3, eu4VarM5, as0Var.v(), 8);
            }
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (z14 != 0) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    kv2Var.x(eu4VarM4, eu4VarM3, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        kv2Var.l(eu4VarM4, eu4VarM3, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        kv2Var.v(eu4VarM4, eu4VarM3, iMin, 8);
                    } else if (z8) {
                        kv2Var.v(eu4VarM4, eu4VarM3, iMin, 5);
                        kv2Var.l(eu4VarM4, eu4VarM3, iMin, 8);
                    } else {
                        kv2Var.v(eu4VarM4, eu4VarM3, iMin, 5);
                        kv2Var.l(eu4VarM4, eu4VarM3, iMin, 8);
                    }
                } else if (i27 == 2) {
                    int i30 = as0Var.v;
                    if (i30 == 3 || i30 == 5) {
                        eu4VarM = kv2Var.m(this.T.t(3));
                        eu4VarM2 = kv2Var.m(this.T.t(5));
                    } else {
                        eu4VarM = kv2Var.m(this.T.t(2));
                        eu4VarM2 = kv2Var.m(this.T.t(4));
                    }
                    nr nrVarQ = kv2Var.q();
                    int i31 = i23;
                    nrVarQ.n.l(eu4VarM4, -1.0f);
                    nrVarQ.n.l(eu4VarM3, 1.0f);
                    nrVarQ.n.l(eu4VarM2, f2);
                    nrVarQ.n.l(eu4VarM, -f2);
                    kv2Var.r(nrVarQ);
                    if (z2) {
                        z14 = false;
                    }
                    z15 = z4;
                    i11 = i31;
                } else {
                    i11 = i23;
                    z15 = true;
                }
            } else {
                int iMax = Math.max(i23, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                kv2Var.v(eu4VarM4, eu4VarM3, iMax, 8);
                z15 = z4;
                i11 = i23;
                z14 = false;
            }
            if (z11 || z8) {
                boolean z27 = z15;
                if (i26 >= 2 && z2 && z27) {
                    kv2Var.x(eu4VarM3, eu4Var, 0, 8);
                    as0 as0Var4 = this.M;
                    boolean z28 = z || as0Var4.x == null;
                    if (!z && (as0Var3 = as0Var4.x) != null) {
                        ts0 ts0Var2 = as0Var3.n;
                        if (ts0Var2.W != 0.0f) {
                            int[] iArr = ts0Var2.p0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                        } else {
                            z28 = false;
                        }
                    }
                    if (z28) {
                        kv2Var.x(eu4Var2, eu4VarM4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zJ || zJ2 || zJ3) {
                if (zJ && !zJ2) {
                    as0Var2 = as0Var2;
                    eu4VarM4 = eu4VarM4;
                    z15 = z15;
                    eu4Var3 = eu4VarM6;
                    z20 = z2;
                    i22 = (z2 && (as0Var.x.n instanceof bx)) ? 8 : 5;
                } else if (zJ || !zJ2) {
                    eu4Var3 = eu4VarM6;
                    if (zJ && zJ2) {
                        ts0 ts0Var3 = as0Var.x.n;
                        ts0 ts0Var4 = as0Var2.x.n;
                        z15 = z15;
                        us0 us0Var = this.T;
                        int i32 = 6;
                        if (z14) {
                            if (i27 == 0) {
                                if (i24 != 0 || i11 != 0) {
                                    i20 = 5;
                                    i21 = 5;
                                    z23 = true;
                                    z24 = false;
                                    z17 = true;
                                } else if (eu4VarM5.w && eu4Var3.w) {
                                    kv2Var.v(eu4VarM3, eu4VarM5, as0Var.v(), 8);
                                    kv2Var.v(eu4VarM4, eu4Var3, -as0Var2.v(), 8);
                                    return;
                                } else {
                                    i20 = 8;
                                    i21 = 8;
                                    z23 = false;
                                    z24 = true;
                                    z17 = false;
                                }
                                if ((ts0Var3 instanceof bx) || (ts0Var4 instanceof bx)) {
                                    kv2Var = kv2Var;
                                    i27 = i27;
                                    eu4VarM3 = eu4VarM3;
                                    eu4VarM4 = eu4VarM4;
                                    z18 = z24;
                                    eu4Var2 = eu4Var2;
                                    i12 = i20;
                                    eu4VarM5 = eu4VarM5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = 4;
                                } else {
                                    kv2Var = kv2Var;
                                    eu4VarM3 = eu4VarM3;
                                    eu4VarM4 = eu4VarM4;
                                    z18 = z24;
                                    i12 = i20;
                                    eu4VarM5 = eu4VarM5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = i21;
                                    i27 = i27;
                                    eu4Var2 = eu4Var2;
                                }
                            } else {
                                if (i27 == 2) {
                                    if ((ts0Var3 instanceof bx) || (ts0Var4 instanceof bx)) {
                                        i12 = 5;
                                    } else {
                                        kv2Var = kv2Var;
                                        i27 = i27;
                                        eu4VarM3 = eu4VarM3;
                                        eu4VarM4 = eu4VarM4;
                                        eu4VarM5 = eu4VarM5;
                                        i32 = 6;
                                        i12 = 5;
                                        i13 = 5;
                                    }
                                    z16 = true;
                                    z17 = true;
                                    z18 = false;
                                    eu4Var2 = eu4Var2;
                                } else if (i27 == 1) {
                                    i12 = 8;
                                } else if (i27 == 3) {
                                    i27 = i27;
                                    if (this.A != -1) {
                                        if (z6) {
                                            if (i7 == 2 || i7 == 1) {
                                                i18 = 5;
                                                i19 = 4;
                                            } else {
                                                i18 = 8;
                                                i19 = 5;
                                            }
                                            i13 = i19;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        } else {
                                            if (i24 > 0) {
                                                kv2Var = kv2Var;
                                                eu4Var2 = eu4Var2;
                                                eu4VarM3 = eu4VarM3;
                                                eu4VarM4 = eu4VarM4;
                                                eu4VarM5 = eu4VarM5;
                                                i32 = 6;
                                                i12 = 5;
                                            } else if (i24 != 0 || i11 != 0) {
                                                kv2Var = kv2Var;
                                                eu4Var2 = eu4Var2;
                                                eu4VarM3 = eu4VarM3;
                                                eu4VarM4 = eu4VarM4;
                                                eu4VarM5 = eu4VarM5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 4;
                                            } else if (z9) {
                                                i18 = (ts0Var3 == us0Var || ts0Var4 == us0Var) ? 5 : 4;
                                                i13 = 4;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                            } else {
                                                kv2Var = kv2Var;
                                                eu4Var2 = eu4Var2;
                                                eu4VarM3 = eu4VarM3;
                                                eu4VarM4 = eu4VarM4;
                                                eu4VarM5 = eu4VarM5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 8;
                                            }
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        }
                                        i12 = i18;
                                        kv2Var = kv2Var;
                                    } else if (z9) {
                                        kv2Var = kv2Var;
                                        eu4Var2 = eu4Var2;
                                        eu4VarM3 = eu4VarM3;
                                        eu4VarM4 = eu4VarM4;
                                        eu4VarM5 = eu4VarM5;
                                        i12 = 8;
                                        i32 = z2 ? 5 : 4;
                                    } else {
                                        kv2Var = kv2Var;
                                        eu4Var2 = eu4Var2;
                                        eu4VarM3 = eu4VarM3;
                                        eu4VarM4 = eu4VarM4;
                                        eu4VarM5 = eu4VarM5;
                                        i12 = 8;
                                        i32 = 8;
                                    }
                                    i13 = 5;
                                    z16 = true;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    i12 = 5;
                                    i13 = 4;
                                    z16 = false;
                                    z17 = false;
                                }
                                i13 = 4;
                                z16 = true;
                                z17 = true;
                                z18 = false;
                                eu4Var2 = eu4Var2;
                            }
                            if (z17 || eu4VarM5 != eu4Var3 || ts0Var3 == us0Var) {
                                z19 = true;
                            } else {
                                z17 = false;
                                z19 = false;
                            }
                            if (z16) {
                                if (z14 && !z7 && !z9 && eu4VarM5 == eu4Var && eu4Var3 == eu4Var2) {
                                    i32 = 8;
                                    z20 = false;
                                    i17 = 8;
                                    z22 = false;
                                } else {
                                    z20 = z2;
                                    z22 = z19;
                                    i17 = i12;
                                }
                                eu4 eu4Var4 = eu4VarM5;
                                ts0Var = ts0Var4;
                                kv2Var.y(eu4VarM3, eu4Var4, as0Var.v(), f, eu4Var3, eu4VarM4, as0Var2.v(), i32);
                                eu4VarM5 = eu4Var4;
                                i12 = i17;
                                z19 = z22;
                            } else {
                                ts0Var = ts0Var4;
                                z20 = z2;
                            }
                            if (this.g0 != 8 && ((hashSet = as0Var2.g) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z17) {
                                if (z20 && eu4VarM5 != eu4Var3 && !z14 && ((ts0Var3 instanceof bx) || (ts0Var instanceof bx))) {
                                    i12 = 6;
                                }
                                kv2Var.x(eu4VarM3, eu4VarM5, as0Var.v(), i12);
                                kv2Var.l(eu4VarM4, eu4Var3, -as0Var2.v(), i12);
                            }
                            if (z20 || !z10 || (ts0Var3 instanceof bx) || (ts0Var instanceof bx) || ts0Var == us0Var) {
                                iMin2 = i13;
                                z21 = z19;
                            } else {
                                iMin2 = 6;
                                i12 = 6;
                                z21 = true;
                            }
                            if (z21) {
                                if (z18 && (!z9 || z3)) {
                                    if (ts0Var3 != us0Var && ts0Var != us0Var) {
                                        i32 = iMin2;
                                    }
                                    if ((ts0Var3 instanceof m42) || (ts0Var instanceof m42)) {
                                        i32 = 5;
                                    }
                                    if ((ts0Var3 instanceof bx) || (ts0Var instanceof bx)) {
                                        i32 = 5;
                                    }
                                    if (z9) {
                                        i16 = 5;
                                    } else {
                                        i16 = i32;
                                    }
                                    iMin2 = Math.max(i16, iMin2);
                                }
                                if (z20) {
                                    iMin2 = Math.min(i12, iMin2);
                                    if (z6 || z9 || !(ts0Var3 == us0Var || ts0Var == us0Var)) {
                                        i15 = iMin2;
                                    } else {
                                        i15 = 4;
                                    }
                                } else {
                                    i15 = iMin2;
                                }
                                kv2Var.v(eu4VarM3, eu4VarM5, as0Var.v(), i15);
                                kv2Var.v(eu4VarM4, eu4Var3, -as0Var2.v(), i15);
                            }
                            if (z20) {
                                if (eu4Var == eu4VarM5) {
                                    iV = as0Var.v();
                                } else {
                                    iV = 0;
                                }
                                if (eu4VarM5 != eu4Var) {
                                    kv2Var.x(eu4VarM3, eu4Var, iV, 5);
                                }
                            }
                            if (z20 || !z14 || i4 != 0 || i11 != 0) {
                                i14 = 5;
                            } else if (z14 && i27 == 3) {
                                kv2Var.x(eu4VarM4, eu4VarM3, 0, 8);
                                i14 = 5;
                            } else {
                                i14 = 5;
                                kv2Var.x(eu4VarM4, eu4VarM3, 0, 5);
                            }
                        } else {
                            if (eu4VarM5.w && eu4Var3.w) {
                                kv2Var.y(eu4VarM3, eu4VarM5, as0Var.v(), f, eu4Var3, eu4VarM4, as0Var2.v(), 8);
                                if (z2 && z15) {
                                    int iV2 = as0Var2.x != null ? as0Var2.v() : 0;
                                    if (eu4Var3 != eu4Var2) {
                                        kv2Var.x(eu4Var2, eu4VarM4, iV2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i12 = 5;
                            i13 = 4;
                            z16 = true;
                            z17 = true;
                        }
                        z18 = false;
                        if (z17) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z16) {
                            if (z14) {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            } else {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            }
                            eu4 eu4Var5 = eu4VarM5;
                            ts0Var = ts0Var4;
                            kv2Var.y(eu4VarM3, eu4Var5, as0Var.v(), f, eu4Var3, eu4VarM4, as0Var2.v(), i32);
                            eu4VarM5 = eu4Var5;
                            i12 = i17;
                            z19 = z22;
                        } else {
                            ts0Var = ts0Var4;
                            z20 = z2;
                        }
                        if (this.g0 != 8) {
                        }
                        if (z17) {
                            if (z20) {
                                i12 = 6;
                            }
                            kv2Var.x(eu4VarM3, eu4VarM5, as0Var.v(), i12);
                            kv2Var.l(eu4VarM4, eu4Var3, -as0Var2.v(), i12);
                        }
                        if (z20) {
                            iMin2 = i13;
                            z21 = z19;
                        } else {
                            iMin2 = i13;
                            z21 = z19;
                        }
                        if (z21) {
                            if (z18) {
                                if (ts0Var3 != us0Var) {
                                    i32 = iMin2;
                                }
                                if (ts0Var3 instanceof m42) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (ts0Var3 instanceof bx) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (z9) {
                                    i16 = 5;
                                } else {
                                    i16 = i32;
                                }
                                iMin2 = Math.max(i16, iMin2);
                            }
                            if (z20) {
                                iMin2 = Math.min(i12, iMin2);
                                if (z6) {
                                    i15 = iMin2;
                                } else {
                                    i15 = iMin2;
                                }
                            } else {
                                i15 = iMin2;
                            }
                            kv2Var.v(eu4VarM3, eu4VarM5, as0Var.v(), i15);
                            kv2Var.v(eu4VarM4, eu4Var3, -as0Var2.v(), i15);
                        }
                        if (z20) {
                            if (eu4Var == eu4VarM5) {
                                iV = as0Var.v();
                            } else {
                                iV = 0;
                            }
                            if (eu4VarM5 != eu4Var) {
                                kv2Var.x(eu4VarM3, eu4Var, iV, 5);
                            }
                        }
                        if (z20) {
                            i14 = 5;
                        } else {
                            i14 = 5;
                        }
                    }
                    i22 = i14;
                } else {
                    eu4Var3 = eu4VarM6;
                    kv2Var.v(eu4VarM4, eu4Var3, -as0Var2.v(), 8);
                    if (z2) {
                        kv2Var.x(eu4VarM3, eu4Var, 0, 5);
                        as0Var2 = as0Var2;
                        i14 = 5;
                        eu4VarM4 = eu4VarM4;
                        z15 = z15;
                    }
                    z20 = z2;
                    i22 = i14;
                }
                if (z20 || !z15) {
                    return;
                }
                int iV3 = as0Var2.x != null ? as0Var2.v() : 0;
                if (eu4Var3 != eu4Var2) {
                    kv2Var.x(eu4Var2, eu4VarM4, iV3, i22);
                    return;
                }
                return;
            }
            eu4Var3 = eu4VarM6;
            i14 = 5;
            z20 = z2;
            i22 = i14;
            if (z20) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            kv2Var.v(eu4VarM4, eu4VarM3, 0, 3);
            if (i4 > 0) {
                kv2Var.x(eu4VarM4, eu4VarM3, i4, i10);
            }
            if (i5 < Integer.MAX_VALUE) {
                kv2Var.l(eu4VarM4, eu4VarM3, i5, i10);
            }
        } else {
            kv2Var.v(eu4VarM4, eu4VarM3, iMin, i10);
        }
        z15 = z4;
        i11 = i23;
        if (z11) {
        }
        boolean z29 = z15;
        if (i26 >= 2) {
        }
    }

    public final void o(int i, int i2, int i3, int i4, ts0 ts0Var) {
        t(i).y(ts0Var.t(i2), i3, i4, true);
    }

    public final int p() {
        us0 us0Var = this.T;
        return us0Var != null ? us0Var.x0 + this.Y : this.Y;
    }

    public final ts0 q(int i) {
        as0 as0Var;
        as0 as0Var2;
        if (i != 0) {
            if (i == 1 && (as0Var2 = (as0Var = this.L).x) != null && as0Var2.x == as0Var) {
                return as0Var2.n;
            }
            return null;
        }
        as0 as0Var3 = this.K;
        as0 as0Var4 = as0Var3.x;
        if (as0Var4 == null || as0Var4.x != as0Var3) {
            return null;
        }
        return as0Var4.n;
    }

    public boolean r() {
        return this.g0 != 8;
    }

    public final int s() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public as0 t(int i) {
        switch (du4.D(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(du4.C(i));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.h0 != null ? du4.b(new StringBuilder("id: "), this.h0, " ") : "");
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        return xi3.m(sb, this.V, ")");
    }

    public final int u() {
        us0 us0Var = this.T;
        return us0Var != null ? us0Var.y0 + this.Z : this.Z;
    }

    public final void v(int i, ts0 ts0Var, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    v(2, ts0Var, i2, 0);
                    v(4, ts0Var, i2, 0);
                    t(7).g(ts0Var.t(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        v(3, ts0Var, i2, 0);
                        v(5, ts0Var, i2, 0);
                        t(7).g(ts0Var.t(i2), 0);
                        return;
                    }
                    return;
                }
            }
            as0 as0VarT = t(2);
            as0 as0VarT2 = t(4);
            as0 as0VarT3 = t(3);
            as0 as0VarT4 = t(5);
            boolean z2 = true;
            if ((as0VarT == null || !as0VarT.j()) && (as0VarT2 == null || !as0VarT2.j())) {
                v(2, ts0Var, 2, 0);
                v(4, ts0Var, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((as0VarT3 == null || !as0VarT3.j()) && (as0VarT4 == null || !as0VarT4.j())) {
                v(3, ts0Var, 3, 0);
                v(5, ts0Var, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                t(7).g(ts0Var.t(7), 0);
                return;
            } else if (z) {
                t(8).g(ts0Var.t(8), 0);
                return;
            } else {
                if (z2) {
                    t(9).g(ts0Var.t(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            as0 as0VarT5 = t(2);
            as0 as0VarT6 = ts0Var.t(i2);
            as0 as0VarT7 = t(4);
            as0VarT5.g(as0VarT6, 0);
            as0VarT7.g(as0VarT6, 0);
            t(8).g(as0VarT6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            as0 as0VarT8 = ts0Var.t(i2);
            t(3).g(as0VarT8, 0);
            t(5).g(as0VarT8, 0);
            t(9).g(as0VarT8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            t(2).g(ts0Var.t(2), 0);
            t(4).g(ts0Var.t(4), 0);
            t(8).g(ts0Var.t(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            t(3).g(ts0Var.t(3), 0);
            t(5).g(ts0Var.t(5), 0);
            t(9).g(ts0Var.t(i2), 0);
            return;
        }
        as0 as0VarT9 = t(i);
        as0 as0VarT10 = ts0Var.t(i2);
        if (as0VarT9.t(as0VarT10)) {
            if (i == 6) {
                as0 as0VarT11 = t(3);
                as0 as0VarT12 = t(5);
                if (as0VarT11 != null) {
                    as0VarT11.a();
                }
                if (as0VarT12 != null) {
                    as0VarT12.a();
                }
            } else if (i == 3 || i == 5) {
                as0 as0VarT13 = t(6);
                if (as0VarT13 != null) {
                    as0VarT13.a();
                }
                as0 as0VarT14 = t(7);
                if (as0VarT14.x != as0VarT10) {
                    as0VarT14.a();
                }
                as0 as0VarX = t(i).x();
                as0 as0VarT15 = t(9);
                if (as0VarT15.j()) {
                    as0VarX.a();
                    as0VarT15.a();
                }
            } else if (i == 2 || i == 4) {
                as0 as0VarT16 = t(7);
                if (as0VarT16.x != as0VarT10) {
                    as0VarT16.a();
                }
                as0 as0VarX2 = t(i).x();
                as0 as0VarT17 = t(8);
                if (as0VarT17.j()) {
                    as0VarX2.a();
                    as0VarT17.a();
                }
            }
            as0VarT9.g(as0VarT10, i3);
        }
    }

    public final ts0 w(int i) {
        as0 as0Var;
        as0 as0Var2;
        if (i != 0) {
            if (i == 1 && (as0Var2 = (as0Var = this.J).x) != null && as0Var2.x == as0Var) {
                return as0Var2.n;
            }
            return null;
        }
        as0 as0Var3 = this.I;
        as0 as0Var4 = as0Var3.x;
        if (as0Var4 == null || as0Var4.x != as0Var3) {
            return null;
        }
        return as0Var4.n;
    }

    public final void x(as0 as0Var, as0 as0Var2, int i) {
        if (as0Var.n == this) {
            v(as0Var.v, as0Var2.n, as0Var2.v, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:125:0x0208  */
    /* JADX WARN: Code duplicated, block: B:128:0x0211  */
    /* JADX WARN: Code duplicated, block: B:130:0x0217  */
    /* JADX WARN: Code duplicated, block: B:131:0x0220  */
    /* JADX WARN: Code duplicated, block: B:134:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0233  */
    /* JADX WARN: Code duplicated, block: B:145:0x0259  */
    /* JADX WARN: Code duplicated, block: B:157:0x0283  */
    /* JADX WARN: Code duplicated, block: B:161:0x0292  */
    /* JADX WARN: Code duplicated, block: B:164:0x029b  */
    /* JADX WARN: Code duplicated, block: B:165:0x029e  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:173:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:174:0x02be  */
    /* JADX WARN: Code duplicated, block: B:177:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:183:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:187:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:250:0x03a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x03ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:258:0x03cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f2 A[PHI: r4
  0x03f2: PHI (r4v39 int) = (r4v4 int), (r4v4 int), (r4v41 int) binds: [B:258:0x03cc, B:259:0x03ce, B:249:0x03a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:270:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:274:0x0413 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:277:0x0419  */
    /* JADX WARN: Code duplicated, block: B:279:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x0425  */
    /* JADX WARN: Code duplicated, block: B:286:0x042d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0433  */
    /* JADX WARN: Code duplicated, block: B:291:0x0436  */
    /* JADX WARN: Code duplicated, block: B:294:0x0452  */
    /* JADX WARN: Code duplicated, block: B:313:0x0499  */
    /* JADX WARN: Code duplicated, block: B:329:0x0540  */
    /* JADX WARN: Code duplicated, block: B:345:0x0593  */
    /* JADX WARN: Code duplicated, block: B:348:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:351:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:388:0x066a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:390:0x0670  */
    /* JADX WARN: Code duplicated, block: B:392:0x0679  */
    /* JADX WARN: Code duplicated, block: B:393:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:396:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:399:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x013d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    /* JADX WARN: Code duplicated, block: B:86:0x0160  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r58v0, types: [ts0] */
    public void y(kv2 kv2Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean[] zArr;
        int i5;
        int i6;
        boolean z2;
        HashSet hashSet;
        us0 us0Var;
        WeakReference weakReference;
        WeakReference weakReference2;
        us0 us0Var2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        as0 as0Var;
        boolean[] zArr3;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        boolean z5;
        int i13;
        boolean z6;
        float f;
        int i14;
        int i15;
        as0 as0Var2;
        int i16;
        int i17;
        int i18;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        as0 as0Var3;
        int i19;
        ?? r4;
        int[] iArr2;
        as0 as0Var4;
        eu4 eu4Var;
        eu4 eu4Var2;
        eu4 eu4Var3;
        boolean z11;
        ?? r3;
        int i20;
        eu4 eu4Var4;
        eu4 eu4Var5;
        eu4 eu4Var6;
        int i21;
        int i22;
        boolean z12;
        int i23;
        eu4 eu4Var7;
        int i24;
        float f2;
        ?? r27;
        hk5 hk5Var;
        boolean z13;
        l72 l72Var;
        int i25;
        boolean zK;
        int i26;
        boolean zD;
        l72 l72Var2;
        hk5 hk5Var2;
        boolean z14;
        ArrayList arrayList;
        int size;
        int i27;
        HashSet hashSet2;
        kv2 kv2Var2 = kv2Var;
        as0 as0Var5 = this.I;
        eu4 eu4VarM = kv2Var2.m(as0Var5);
        as0 as0Var6 = this.K;
        eu4 eu4VarM2 = kv2Var2.m(as0Var6);
        as0 as0Var7 = this.J;
        eu4 eu4VarM3 = kv2Var2.m(as0Var7);
        as0 as0Var8 = this.L;
        eu4 eu4VarM4 = kv2Var2.m(as0Var8);
        as0 as0Var9 = this.M;
        eu4 eu4VarM5 = kv2Var2.m(as0Var9);
        us0 us0Var3 = this.T;
        if (us0Var3 != null) {
            int[] iArr3 = us0Var3.p0;
            i = 0;
            i3 = iArr3[0] == 2 ? 1 : 0;
            int i28 = iArr3[1] == 2 ? 1 : 0;
            int i29 = this.s;
            if (i29 != 1) {
                if (i29 == 2) {
                    i3 = 0;
                } else if (i29 != 3) {
                }
                i2 = i28;
            } else {
                i2 = 0;
            }
            i4 = this.g0;
            zArr = this.S;
            i5 = i2;
            if (i4 == 8) {
                arrayList = this.R;
                size = arrayList.size();
                i6 = i3;
                i27 = i;
                while (true) {
                    if (i27 < size) {
                        if (!zArr[i] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i30 = size;
                    hashSet2 = ((as0) arrayList.get(i27)).g;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i27++;
                    size = i30;
                }
            } else {
                i6 = i3;
            }
            z2 = this.m;
            if (z2 || this.q) {
                if (z2) {
                    kv2Var2.n(eu4VarM, this.Y);
                    kv2Var2.n(eu4VarM2, this.Y + this.U);
                    if (i6 != 0 && (us0Var2 = this.T) != null) {
                        weakReference3 = us0Var2.H0;
                        if (weakReference3 != null || weakReference3.get() == null || as0Var5.n() > ((as0) us0Var2.H0.get()).n()) {
                            us0Var2.H0 = new WeakReference(as0Var5);
                        }
                        weakReference4 = us0Var2.J0;
                        if (weakReference4 != null || weakReference4.get() == null || as0Var6.n() > ((as0) us0Var2.J0.get()).n()) {
                            us0Var2.J0 = new WeakReference(as0Var6);
                        }
                    }
                }
                if (this.q) {
                    kv2Var2.n(eu4VarM3, this.Z);
                    kv2Var2.n(eu4VarM4, this.Z + this.V);
                    hashSet = as0Var9.g;
                    if (hashSet != null && hashSet.size() > 0) {
                        kv2Var2.n(eu4VarM5, this.Z + this.a0);
                    }
                    if (i5 != 0 && (us0Var = this.T) != null) {
                        weakReference = us0Var.G0;
                        if (weakReference != null || weakReference.get() == null || as0Var7.n() > ((as0) us0Var.G0.get()).n()) {
                            us0Var.G0 = new WeakReference(as0Var7);
                        }
                        weakReference2 = us0Var.I0;
                        if (weakReference2 != null || weakReference2.get() == null || as0Var8.n() > ((as0) us0Var.I0.get()).n()) {
                            us0Var.I0 = new WeakReference(as0Var8);
                        }
                    }
                }
                if (this.m && this.q) {
                    ?? r12 = i;
                    this.m = r12;
                    this.q = r12;
                    return;
                }
            }
            zArr2 = this.x;
            if (z || (l72Var2 = this.n) == null || (hk5Var2 = this.v) == null) {
                as0Var = as0Var9;
                zArr3 = zArr2;
            } else {
                as0Var = as0Var9;
                u51 u51Var = l72Var2.j;
                zArr3 = zArr2;
                if (u51Var.a && l72Var2.t.a && hk5Var2.j.a && hk5Var2.t.a) {
                    kv2Var2.n(eu4VarM, u51Var.l);
                    kv2Var2.n(eu4VarM2, this.n.t.l);
                    kv2Var2.n(eu4VarM3, this.v.j.l);
                    kv2Var2.n(eu4VarM4, this.v.t.l);
                    kv2Var2.n(eu4VarM5, this.v.m.l);
                    if (this.T == null) {
                        z14 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !k()) {
                            kv2Var2.x(kv2Var2.m(this.T.K), eu4VarM2, 0, 8);
                        }
                        if (i5 == 0 || !zArr3[1] || d()) {
                            z14 = false;
                        } else {
                            z14 = false;
                            kv2Var2.x(kv2Var2.m(this.T.L), eu4VarM4, 0, 8);
                        }
                    }
                    this.m = z14;
                    this.q = z14;
                    return;
                }
            }
            if (this.T != null) {
                if (f(0)) {
                    this.T.R(this, 0);
                    zK = true;
                    i26 = 1;
                } else {
                    zK = k();
                    i26 = 1;
                }
                if (f(i26)) {
                    this.T.R(this, i26);
                    zD = true;
                } else {
                    zD = d();
                }
                if (zK && i6 != 0 && this.g0 != 8 && as0Var5.x == null && as0Var6.x == null) {
                    kv2Var2.x(kv2Var2.m(this.T.K), eu4VarM2, 0, 1);
                }
                if (!zD && i5 != 0 && this.g0 != 8 && as0Var7.x == null && as0Var8.x == null && as0Var == null) {
                    kv2Var2.x(kv2Var2.m(this.T.L), eu4VarM4, 0, 1);
                }
                z4 = zD;
                z3 = zK;
            } else {
                as0Var5 = as0Var5;
                z3 = false;
                z4 = false;
            }
            i7 = this.U;
            i8 = this.b0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.V;
            i10 = this.c0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            iArr = this.p0;
            i12 = iArr[0];
            if (i12 != 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            i13 = iArr[1];
            if (i13 != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i31 = this.X;
            this.A = i31;
            float f3 = this.W;
            this.B = f3;
            f = f3;
            i14 = this.p;
            i15 = this.u;
            if (f > 0.0f) {
                as0Var2 = as0Var8;
                if (this.g0 != 8) {
                    if (i12 == 3 || i14 != 0) {
                        i17 = i14;
                    } else {
                        i17 = 3;
                    }
                    if (i13 == 3 || i15 != 0) {
                        i25 = i15;
                    } else {
                        i25 = 3;
                    }
                    if (i12 == 3 || i13 != 3 || i17 != 3 || i25 != 3) {
                        if (i12 != 3 && i17 == 3) {
                            this.A = 0;
                            i8 = (int) (f * i9);
                            if (i13 != 3) {
                                as0Var = as0Var;
                                i16 = i11;
                                i31 = 0;
                                i17 = 4;
                                z7 = false;
                            } else {
                                i16 = i11;
                                i31 = 0;
                            }
                            i18 = i25;
                            int[] iArr4 = this.z;
                            iArr4[0] = i17;
                            iArr4[1] = i18;
                            if (z7 || !(i31 == 0 || i31 == -1)) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (z7 || !(i31 == 1 || i31 == -1)) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (iArr[0] == 2 || !(this instanceof us0)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                i8 = 0;
                            }
                            as0Var3 = this.P;
                            boolean z15 = !as0Var3.j();
                            char c = '\b';
                            boolean z16 = zArr[0];
                            boolean z17 = zArr[1];
                            i19 = this.i;
                            int[] iArr5 = this.C;
                            if (i19 != 2 || this.m) {
                                r4 = i5;
                                iArr2 = iArr;
                                as0Var4 = as0Var;
                                eu4Var = eu4VarM;
                                eu4Var2 = eu4VarM2;
                                eu4Var3 = eu4VarM5;
                                z11 = z3;
                                r3 = i6;
                                i20 = i17;
                            } else {
                                if (z && (l72Var = this.n) != null) {
                                    u51 u51Var2 = l72Var.j;
                                    if (u51Var2.a && l72Var.t.a) {
                                        if (z) {
                                            kv2Var2.n(eu4VarM, u51Var2.l);
                                            kv2Var2.n(eu4VarM2, this.n.t.l);
                                            if (this.T != null && i6 != 0 && zArr3[0] && !k()) {
                                                kv2Var2.x(kv2Var2.m(this.T.K), eu4VarM2, 0, 8);
                                            }
                                        }
                                        r4 = i5;
                                        iArr2 = iArr;
                                        as0Var4 = as0Var;
                                        eu4Var = eu4VarM;
                                        eu4Var2 = eu4VarM2;
                                        eu4Var3 = eu4VarM5;
                                        z11 = z3;
                                        r3 = i6;
                                        i20 = i17;
                                    } else {
                                        c = '\b';
                                    }
                                }
                                us0 us0Var4 = this.T;
                                eu4 eu4VarM6 = us0Var4 != null ? kv2Var2.m(us0Var4.K) : null;
                                us0 us0Var5 = this.T;
                                eu4 eu4VarM7 = us0Var5 != null ? kv2Var2.m(us0Var5.I) : null;
                                z11 = z3;
                                ?? r5 = i6;
                                i20 = i17;
                                ?? r6 = i5;
                                iArr2 = iArr;
                                eu4Var2 = eu4VarM2;
                                eu4Var = eu4VarM;
                                as0Var4 = as0Var;
                                eu4Var3 = eu4VarM5;
                                kv2Var2 = kv2Var;
                                n(kv2Var2, true, r5, r6, zArr3[0], eu4VarM7, eu4VarM6, iArr[0], z10, this.I, this.K, this.Y, i8, this.b0, iArr5[0], this.d0, z8, iArr[1] == 3, z11, z4, z16, i20, i18, this.h, this.o, this.f, z15);
                                r3 = r5;
                                r4 = r6;
                            }
                            if (z || (hk5Var = this.v) == null) {
                                eu4Var4 = r33;
                                eu4Var5 = eu4VarM4;
                                eu4Var6 = eu4Var3;
                                i21 = 0;
                                i22 = 8;
                                z12 = true;
                                i23 = 1;
                            } else {
                                u51 u51Var3 = hk5Var.j;
                                if (u51Var3.a && hk5Var.t.a) {
                                    int i32 = u51Var3.l;
                                    eu4Var4 = eu4VarM3;
                                    kv2Var2.n(eu4Var4, i32);
                                    eu4Var5 = eu4VarM4;
                                    kv2Var2.n(eu4Var5, this.v.t.l);
                                    eu4Var6 = eu4Var3;
                                    kv2Var2.n(eu4Var6, this.v.m.l);
                                    us0 us0Var6 = this.T;
                                    if (us0Var6 == null || z4 || r4 == 0) {
                                        i21 = 0;
                                        i22 = 8;
                                        z13 = true;
                                    } else {
                                        z13 = true;
                                        z13 = true;
                                        if (zArr3[1]) {
                                            i21 = 0;
                                            i22 = 8;
                                            kv2Var2.x(kv2Var2.m(us0Var6.L), eu4Var5, 0, 8);
                                        } else {
                                            i21 = 0;
                                            i22 = 8;
                                        }
                                    }
                                    i23 = i21;
                                    z12 = z13;
                                } else {
                                    eu4Var4 = r33;
                                    eu4Var5 = eu4VarM4;
                                    eu4Var6 = eu4Var3;
                                    i21 = 0;
                                    i22 = 8;
                                    z12 = true;
                                    i23 = 1;
                                }
                            }
                            if (this.b == 2) {
                                i23 = i21;
                            }
                            if (i23 != 0 || this.q) {
                                eu4Var7 = eu4Var4;
                            } else {
                                int i33 = (iArr2[z12 ? 1 : 0] == 2 && (this instanceof us0)) ? z12 ? 1 : 0 : i21;
                                int i34 = i33 != 0 ? i21 : i16;
                                us0 us0Var7 = this.T;
                                eu4 eu4VarM8 = us0Var7 != null ? kv2Var2.m(us0Var7.L) : null;
                                us0 us0Var8 = this.T;
                                eu4 eu4VarM9 = us0Var8 != null ? kv2Var2.m(us0Var8.J) : null;
                                int i35 = this.a0;
                                if (i35 > 0 || this.g0 == i22) {
                                    r27 = z15;
                                    as0 as0Var10 = as0Var4;
                                    if (as0Var10.x != null) {
                                        kv2Var2.v(eu4Var6, eu4Var4, i35, i22);
                                        kv2Var2.v(eu4Var6, kv2Var2.m(as0Var10.x), as0Var10.v(), i22);
                                        if (r4 != 0) {
                                            kv2Var2.x(eu4VarM8, kv2Var2.m(as0Var2), i21, 5);
                                        }
                                        r27 = i21;
                                    } else if (this.g0 == i22) {
                                        kv2Var2.v(eu4Var6, eu4Var4, as0Var10.v(), i22);
                                        r27 = z15;
                                    } else {
                                        kv2Var2.v(eu4Var6, eu4Var4, i35, i22);
                                        r27 = z15;
                                    }
                                }
                                r27 = z15;
                                boolean z18 = zArr3[z12 ? 1 : 0];
                                int i36 = i21;
                                int i37 = iArr2[z12 ? 1 : 0];
                                int i38 = this.Z;
                                int i39 = this.c0;
                                int i40 = iArr5[z12 ? 1 : 0];
                                float f4 = this.e0;
                                int i41 = iArr2[i36];
                                boolean z19 = z12 ? 1 : 0;
                                ?? r18 = z12;
                                if (i41 != 3) {
                                    r18 = i36;
                                }
                                eu4Var7 = eu4Var4;
                                kv2Var2 = kv2Var;
                                n(kv2Var2, false, r4, r3, z18, eu4VarM9, eu4VarM8, i37, i33, this.J, this.L, i38, i34, i39, i40, f4, z9, r18, z4, z11, z17, i18, i20, this.k, this.d, this.e, r27);
                            }
                            if (z7) {
                                i24 = this.A;
                                f2 = this.B;
                                if (i24 == 1) {
                                    nr nrVarQ = kv2Var2.q();
                                    nrVarQ.n.l(eu4Var5, -1.0f);
                                    nrVarQ.n.l(eu4Var7, 1.0f);
                                    nrVarQ.n.l(eu4Var2, f2);
                                    nrVarQ.n.l(eu4Var, -f2);
                                    kv2Var2.r(nrVarQ);
                                } else {
                                    nr nrVarQ2 = kv2Var2.q();
                                    nrVarQ2.n.l(eu4Var2, -1.0f);
                                    nrVarQ2.n.l(eu4Var, 1.0f);
                                    nrVarQ2.n.l(eu4Var5, f2);
                                    nrVarQ2.n.l(eu4Var7, -f2);
                                    kv2Var2.r(nrVarQ2);
                                }
                            }
                            if (as0Var3.j()) {
                                ts0 ts0Var = as0Var3.x.n;
                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                int iV = as0Var3.v();
                                eu4 eu4VarM10 = kv2Var2.m(t(2));
                                eu4 eu4VarM11 = kv2Var2.m(t(3));
                                eu4 eu4VarM12 = kv2Var2.m(t(4));
                                eu4 eu4VarM13 = kv2Var2.m(t(5));
                                eu4 eu4VarM14 = kv2Var2.m(ts0Var.t(2));
                                eu4 eu4VarM15 = kv2Var2.m(ts0Var.t(3));
                                eu4 eu4VarM16 = kv2Var2.m(ts0Var.t(4));
                                eu4 eu4VarM17 = kv2Var2.m(ts0Var.t(5));
                                nr nrVarQ3 = kv2Var2.q();
                                double d = radians;
                                double dSin = Math.sin(d);
                                double d2 = iV;
                                nrVarQ3.n.l(eu4VarM15, 0.5f);
                                nrVarQ3.n.l(eu4VarM17, 0.5f);
                                nrVarQ3.n.l(eu4VarM11, -0.5f);
                                nrVarQ3.n.l(eu4VarM13, -0.5f);
                                nrVarQ3.y = -((float) (dSin * d2));
                                kv2Var2.r(nrVarQ3);
                                nr nrVarQ4 = kv2Var2.q();
                                float fCos = (float) (Math.cos(d) * d2);
                                nrVarQ4.n.l(eu4VarM14, 0.5f);
                                nrVarQ4.n.l(eu4VarM16, 0.5f);
                                nrVarQ4.n.l(eu4VarM10, -0.5f);
                                nrVarQ4.n.l(eu4VarM12, -0.5f);
                                nrVarQ4.y = -fCos;
                                kv2Var2.r(nrVarQ4);
                            }
                            this.m = false;
                            this.q = false;
                        }
                        if (i13 != 3 && i25 == 3) {
                            this.A = 1;
                            if (i31 == -1) {
                                float f5 = 1.0f / f;
                                this.B = f5;
                                f = f5;
                            }
                            i16 = (int) (i7 * f);
                            if (i12 != 3) {
                                i17 = i17;
                                i31 = 1;
                                i18 = 4;
                            } else {
                                i31 = 1;
                            }
                        }
                        z7 = true;
                        i18 = i25;
                        int[] iArr6 = this.z;
                        iArr6[0] = i17;
                        iArr6[1] = i18;
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z7) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (iArr[0] == 2) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i8 = 0;
                        }
                        as0Var3 = this.P;
                        boolean z110 = !as0Var3.j();
                        char c2 = '\b';
                        boolean z111 = zArr[0];
                        boolean z112 = zArr[1];
                        i19 = this.i;
                        int[] iArr7 = this.C;
                        if (i19 != 2) {
                            r4 = i5;
                            iArr2 = iArr;
                            as0Var4 = as0Var;
                            eu4Var = eu4VarM;
                            eu4Var2 = eu4VarM2;
                            eu4Var3 = eu4VarM5;
                            z11 = z3;
                            r3 = i6;
                            i20 = i17;
                        } else {
                            r4 = i5;
                            iArr2 = iArr;
                            as0Var4 = as0Var;
                            eu4Var = eu4VarM;
                            eu4Var2 = eu4VarM2;
                            eu4Var3 = eu4VarM5;
                            z11 = z3;
                            r3 = i6;
                            i20 = i17;
                        }
                        if (z) {
                            eu4Var4 = r33;
                            eu4Var5 = eu4VarM4;
                            eu4Var6 = eu4Var3;
                            i21 = 0;
                            i22 = 8;
                            z12 = true;
                            i23 = 1;
                        } else {
                            eu4Var4 = r33;
                            eu4Var5 = eu4VarM4;
                            eu4Var6 = eu4Var3;
                            i21 = 0;
                            i22 = 8;
                            z12 = true;
                            i23 = 1;
                        }
                        if (this.b == 2) {
                            i23 = i21;
                        }
                        if (i23 != 0) {
                            eu4Var7 = eu4Var4;
                        } else {
                            eu4Var7 = eu4Var4;
                        }
                        if (z7) {
                            i24 = this.A;
                            f2 = this.B;
                            if (i24 == 1) {
                                nr nrVarQ5 = kv2Var2.q();
                                nrVarQ5.n.l(eu4Var5, -1.0f);
                                nrVarQ5.n.l(eu4Var7, 1.0f);
                                nrVarQ5.n.l(eu4Var2, f2);
                                nrVarQ5.n.l(eu4Var, -f2);
                                kv2Var2.r(nrVarQ5);
                            } else {
                                nr nrVarQ6 = kv2Var2.q();
                                nrVarQ6.n.l(eu4Var2, -1.0f);
                                nrVarQ6.n.l(eu4Var, 1.0f);
                                nrVarQ6.n.l(eu4Var5, f2);
                                nrVarQ6.n.l(eu4Var7, -f2);
                                kv2Var2.r(nrVarQ6);
                            }
                        }
                        if (as0Var3.j()) {
                            ts0 ts0Var2 = as0Var3.x.n;
                            float radians2 = (float) Math.toRadians(this.D + 90.0f);
                            int iV2 = as0Var3.v();
                            eu4 eu4VarM18 = kv2Var2.m(t(2));
                            eu4 eu4VarM19 = kv2Var2.m(t(3));
                            eu4 eu4VarM110 = kv2Var2.m(t(4));
                            eu4 eu4VarM111 = kv2Var2.m(t(5));
                            eu4 eu4VarM112 = kv2Var2.m(ts0Var2.t(2));
                            eu4 eu4VarM113 = kv2Var2.m(ts0Var2.t(3));
                            eu4 eu4VarM114 = kv2Var2.m(ts0Var2.t(4));
                            eu4 eu4VarM115 = kv2Var2.m(ts0Var2.t(5));
                            nr nrVarQ7 = kv2Var2.q();
                            double d3 = radians2;
                            double dSin2 = Math.sin(d3);
                            double d4 = iV2;
                            nrVarQ7.n.l(eu4VarM113, 0.5f);
                            nrVarQ7.n.l(eu4VarM115, 0.5f);
                            nrVarQ7.n.l(eu4VarM19, -0.5f);
                            nrVarQ7.n.l(eu4VarM111, -0.5f);
                            nrVarQ7.y = -((float) (dSin2 * d4));
                            kv2Var2.r(nrVarQ7);
                            nr nrVarQ8 = kv2Var2.q();
                            float fCos2 = (float) (Math.cos(d3) * d4);
                            nrVarQ8.n.l(eu4VarM112, 0.5f);
                            nrVarQ8.n.l(eu4VarM114, 0.5f);
                            nrVarQ8.n.l(eu4VarM18, -0.5f);
                            nrVarQ8.n.l(eu4VarM110, -0.5f);
                            nrVarQ8.y = -fCos2;
                            kv2Var2.r(nrVarQ8);
                        }
                        this.m = false;
                        this.q = false;
                    }
                    if (i31 == -1) {
                        if (z5 && !z6) {
                            this.A = 0;
                            i31 = 0;
                        } else if (!z5 && z6) {
                            this.A = 1;
                            if (i31 == -1) {
                                this.B = 1.0f / f;
                            }
                            i31 = 1;
                        }
                    }
                    if (i31 == 0 && (!as0Var7.j() || !as0Var2.j())) {
                        this.A = 1;
                    } else if (this.A == 1 && (!as0Var5.j() || !as0Var6.j())) {
                        this.A = 0;
                    }
                    if (this.A == -1 && (!as0Var7.j() || !as0Var2.j() || !as0Var5.j() || !as0Var6.j())) {
                        if (as0Var7.j() && as0Var2.j()) {
                            this.A = 0;
                        } else if (as0Var5.j() && as0Var6.j()) {
                            this.B = 1.0f / this.B;
                            this.A = 1;
                        }
                    }
                    int i42 = this.A;
                    if (i42 == -1) {
                        int i43 = this.h;
                        if (i43 > 0 && this.k == 0) {
                            this.A = 0;
                            i42 = 0;
                        } else if (i43 == 0 && this.k > 0) {
                            this.B = 1.0f / this.B;
                            this.A = 1;
                            i42 = 1;
                        }
                    }
                    i31 = i42;
                    i16 = i11;
                    z7 = true;
                    i18 = i25;
                    int[] iArr8 = this.z;
                    iArr8[0] = i17;
                    iArr8[1] = i18;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z7) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (iArr[0] == 2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i8 = 0;
                    }
                    as0Var3 = this.P;
                    boolean z113 = !as0Var3.j();
                    char c3 = '\b';
                    boolean z114 = zArr[0];
                    boolean z115 = zArr[1];
                    i19 = this.i;
                    int[] iArr9 = this.C;
                    if (i19 != 2) {
                        r4 = i5;
                        iArr2 = iArr;
                        as0Var4 = as0Var;
                        eu4Var = eu4VarM;
                        eu4Var2 = eu4VarM2;
                        eu4Var3 = eu4VarM5;
                        z11 = z3;
                        r3 = i6;
                        i20 = i17;
                    } else {
                        r4 = i5;
                        iArr2 = iArr;
                        as0Var4 = as0Var;
                        eu4Var = eu4VarM;
                        eu4Var2 = eu4VarM2;
                        eu4Var3 = eu4VarM5;
                        z11 = z3;
                        r3 = i6;
                        i20 = i17;
                    }
                    if (z) {
                        eu4Var4 = r33;
                        eu4Var5 = eu4VarM4;
                        eu4Var6 = eu4Var3;
                        i21 = 0;
                        i22 = 8;
                        z12 = true;
                        i23 = 1;
                    } else {
                        eu4Var4 = r33;
                        eu4Var5 = eu4VarM4;
                        eu4Var6 = eu4Var3;
                        i21 = 0;
                        i22 = 8;
                        z12 = true;
                        i23 = 1;
                    }
                    if (this.b == 2) {
                        i23 = i21;
                    }
                    if (i23 != 0) {
                        eu4Var7 = eu4Var4;
                    } else {
                        eu4Var7 = eu4Var4;
                    }
                    if (z7) {
                        i24 = this.A;
                        f2 = this.B;
                        if (i24 == 1) {
                            nr nrVarQ9 = kv2Var2.q();
                            nrVarQ9.n.l(eu4Var5, -1.0f);
                            nrVarQ9.n.l(eu4Var7, 1.0f);
                            nrVarQ9.n.l(eu4Var2, f2);
                            nrVarQ9.n.l(eu4Var, -f2);
                            kv2Var2.r(nrVarQ9);
                        } else {
                            nr nrVarQ10 = kv2Var2.q();
                            nrVarQ10.n.l(eu4Var2, -1.0f);
                            nrVarQ10.n.l(eu4Var, 1.0f);
                            nrVarQ10.n.l(eu4Var5, f2);
                            nrVarQ10.n.l(eu4Var7, -f2);
                            kv2Var2.r(nrVarQ10);
                        }
                    }
                    if (as0Var3.j()) {
                        ts0 ts0Var3 = as0Var3.x.n;
                        float radians3 = (float) Math.toRadians(this.D + 90.0f);
                        int iV3 = as0Var3.v();
                        eu4 eu4VarM116 = kv2Var2.m(t(2));
                        eu4 eu4VarM117 = kv2Var2.m(t(3));
                        eu4 eu4VarM118 = kv2Var2.m(t(4));
                        eu4 eu4VarM119 = kv2Var2.m(t(5));
                        eu4 eu4VarM1110 = kv2Var2.m(ts0Var3.t(2));
                        eu4 eu4VarM1111 = kv2Var2.m(ts0Var3.t(3));
                        eu4 eu4VarM1112 = kv2Var2.m(ts0Var3.t(4));
                        eu4 eu4VarM1113 = kv2Var2.m(ts0Var3.t(5));
                        nr nrVarQ11 = kv2Var2.q();
                        double d5 = radians3;
                        double dSin3 = Math.sin(d5);
                        double d6 = iV3;
                        nrVarQ11.n.l(eu4VarM1111, 0.5f);
                        nrVarQ11.n.l(eu4VarM1113, 0.5f);
                        nrVarQ11.n.l(eu4VarM117, -0.5f);
                        nrVarQ11.n.l(eu4VarM119, -0.5f);
                        nrVarQ11.y = -((float) (dSin3 * d6));
                        kv2Var2.r(nrVarQ11);
                        nr nrVarQ12 = kv2Var2.q();
                        float fCos3 = (float) (Math.cos(d5) * d6);
                        nrVarQ12.n.l(eu4VarM1110, 0.5f);
                        nrVarQ12.n.l(eu4VarM1112, 0.5f);
                        nrVarQ12.n.l(eu4VarM116, -0.5f);
                        nrVarQ12.n.l(eu4VarM118, -0.5f);
                        nrVarQ12.y = -fCos3;
                        kv2Var2.r(nrVarQ12);
                    }
                    this.m = false;
                    this.q = false;
                }
                z7 = false;
                int[] iArr10 = this.z;
                iArr10[0] = i17;
                iArr10[1] = i18;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (iArr[0] == 2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                as0Var3 = this.P;
                boolean z116 = !as0Var3.j();
                char c4 = '\b';
                boolean z117 = zArr[0];
                boolean z118 = zArr[1];
                i19 = this.i;
                int[] iArr11 = this.C;
                if (i19 != 2) {
                    r4 = i5;
                    iArr2 = iArr;
                    as0Var4 = as0Var;
                    eu4Var = eu4VarM;
                    eu4Var2 = eu4VarM2;
                    eu4Var3 = eu4VarM5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                } else {
                    r4 = i5;
                    iArr2 = iArr;
                    as0Var4 = as0Var;
                    eu4Var = eu4VarM;
                    eu4Var2 = eu4VarM2;
                    eu4Var3 = eu4VarM5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                }
                if (z) {
                    eu4Var4 = r33;
                    eu4Var5 = eu4VarM4;
                    eu4Var6 = eu4Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                } else {
                    eu4Var4 = r33;
                    eu4Var5 = eu4VarM4;
                    eu4Var6 = eu4Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                }
                if (this.b == 2) {
                    i23 = i21;
                }
                if (i23 != 0) {
                    eu4Var7 = eu4Var4;
                } else {
                    eu4Var7 = eu4Var4;
                }
                if (z7) {
                    i24 = this.A;
                    f2 = this.B;
                    if (i24 == 1) {
                        nr nrVarQ13 = kv2Var2.q();
                        nrVarQ13.n.l(eu4Var5, -1.0f);
                        nrVarQ13.n.l(eu4Var7, 1.0f);
                        nrVarQ13.n.l(eu4Var2, f2);
                        nrVarQ13.n.l(eu4Var, -f2);
                        kv2Var2.r(nrVarQ13);
                    } else {
                        nr nrVarQ14 = kv2Var2.q();
                        nrVarQ14.n.l(eu4Var2, -1.0f);
                        nrVarQ14.n.l(eu4Var, 1.0f);
                        nrVarQ14.n.l(eu4Var5, f2);
                        nrVarQ14.n.l(eu4Var7, -f2);
                        kv2Var2.r(nrVarQ14);
                    }
                }
                if (as0Var3.j()) {
                    ts0 ts0Var4 = as0Var3.x.n;
                    float radians4 = (float) Math.toRadians(this.D + 90.0f);
                    int iV4 = as0Var3.v();
                    eu4 eu4VarM1114 = kv2Var2.m(t(2));
                    eu4 eu4VarM1115 = kv2Var2.m(t(3));
                    eu4 eu4VarM1116 = kv2Var2.m(t(4));
                    eu4 eu4VarM1117 = kv2Var2.m(t(5));
                    eu4 eu4VarM1118 = kv2Var2.m(ts0Var4.t(2));
                    eu4 eu4VarM1119 = kv2Var2.m(ts0Var4.t(3));
                    eu4 eu4VarM11110 = kv2Var2.m(ts0Var4.t(4));
                    eu4 eu4VarM11111 = kv2Var2.m(ts0Var4.t(5));
                    nr nrVarQ15 = kv2Var2.q();
                    double d7 = radians4;
                    double dSin4 = Math.sin(d7);
                    double d8 = iV4;
                    nrVarQ15.n.l(eu4VarM1119, 0.5f);
                    nrVarQ15.n.l(eu4VarM11111, 0.5f);
                    nrVarQ15.n.l(eu4VarM1115, -0.5f);
                    nrVarQ15.n.l(eu4VarM1117, -0.5f);
                    nrVarQ15.y = -((float) (dSin4 * d8));
                    kv2Var2.r(nrVarQ15);
                    nr nrVarQ16 = kv2Var2.q();
                    float fCos4 = (float) (Math.cos(d7) * d8);
                    nrVarQ16.n.l(eu4VarM1118, 0.5f);
                    nrVarQ16.n.l(eu4VarM11110, 0.5f);
                    nrVarQ16.n.l(eu4VarM1114, -0.5f);
                    nrVarQ16.n.l(eu4VarM1116, -0.5f);
                    nrVarQ16.y = -fCos4;
                    kv2Var2.r(nrVarQ16);
                }
                this.m = false;
                this.q = false;
            }
            as0Var2 = as0Var8;
            eu4VarM4 = eu4VarM4;
            i16 = i11;
            i17 = i14;
            i18 = i15;
            z7 = false;
            int[] iArr12 = this.z;
            iArr12[0] = i17;
            iArr12[1] = i18;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (iArr[0] == 2) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i8 = 0;
            }
            as0Var3 = this.P;
            boolean z119 = !as0Var3.j();
            char c5 = '\b';
            boolean z1110 = zArr[0];
            boolean z1111 = zArr[1];
            i19 = this.i;
            int[] iArr13 = this.C;
            if (i19 != 2) {
                r4 = i5;
                iArr2 = iArr;
                as0Var4 = as0Var;
                eu4Var = eu4VarM;
                eu4Var2 = eu4VarM2;
                eu4Var3 = eu4VarM5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            } else {
                r4 = i5;
                iArr2 = iArr;
                as0Var4 = as0Var;
                eu4Var = eu4VarM;
                eu4Var2 = eu4VarM2;
                eu4Var3 = eu4VarM5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            }
            if (z) {
                eu4Var4 = r33;
                eu4Var5 = eu4VarM4;
                eu4Var6 = eu4Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            } else {
                eu4Var4 = r33;
                eu4Var5 = eu4VarM4;
                eu4Var6 = eu4Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            }
            if (this.b == 2) {
                i23 = i21;
            }
            if (i23 != 0) {
                eu4Var7 = eu4Var4;
            } else {
                eu4Var7 = eu4Var4;
            }
            if (z7) {
                i24 = this.A;
                f2 = this.B;
                if (i24 == 1) {
                    nr nrVarQ17 = kv2Var2.q();
                    nrVarQ17.n.l(eu4Var5, -1.0f);
                    nrVarQ17.n.l(eu4Var7, 1.0f);
                    nrVarQ17.n.l(eu4Var2, f2);
                    nrVarQ17.n.l(eu4Var, -f2);
                    kv2Var2.r(nrVarQ17);
                } else {
                    nr nrVarQ18 = kv2Var2.q();
                    nrVarQ18.n.l(eu4Var2, -1.0f);
                    nrVarQ18.n.l(eu4Var, 1.0f);
                    nrVarQ18.n.l(eu4Var5, f2);
                    nrVarQ18.n.l(eu4Var7, -f2);
                    kv2Var2.r(nrVarQ18);
                }
            }
            if (as0Var3.j()) {
                ts0 ts0Var5 = as0Var3.x.n;
                float radians5 = (float) Math.toRadians(this.D + 90.0f);
                int iV5 = as0Var3.v();
                eu4 eu4VarM11112 = kv2Var2.m(t(2));
                eu4 eu4VarM11113 = kv2Var2.m(t(3));
                eu4 eu4VarM11114 = kv2Var2.m(t(4));
                eu4 eu4VarM11115 = kv2Var2.m(t(5));
                eu4 eu4VarM11116 = kv2Var2.m(ts0Var5.t(2));
                eu4 eu4VarM11117 = kv2Var2.m(ts0Var5.t(3));
                eu4 eu4VarM11118 = kv2Var2.m(ts0Var5.t(4));
                eu4 eu4VarM11119 = kv2Var2.m(ts0Var5.t(5));
                nr nrVarQ19 = kv2Var2.q();
                double d9 = radians5;
                double dSin5 = Math.sin(d9);
                double d10 = iV5;
                nrVarQ19.n.l(eu4VarM11117, 0.5f);
                nrVarQ19.n.l(eu4VarM11119, 0.5f);
                nrVarQ19.n.l(eu4VarM11113, -0.5f);
                nrVarQ19.n.l(eu4VarM11115, -0.5f);
                nrVarQ19.y = -((float) (dSin5 * d10));
                kv2Var2.r(nrVarQ19);
                nr nrVarQ110 = kv2Var2.q();
                float fCos5 = (float) (Math.cos(d9) * d10);
                nrVarQ110.n.l(eu4VarM11116, 0.5f);
                nrVarQ110.n.l(eu4VarM11118, 0.5f);
                nrVarQ110.n.l(eu4VarM11112, -0.5f);
                nrVarQ110.n.l(eu4VarM11114, -0.5f);
                nrVarQ110.y = -fCos5;
                kv2Var2.r(nrVarQ110);
            }
            this.m = false;
            this.q = false;
        }
        i = 0;
        i2 = i;
        i3 = i2;
        i4 = this.g0;
        zArr = this.S;
        i5 = i2;
        if (i4 == 8) {
            arrayList = this.R;
            size = arrayList.size();
            i6 = i3;
            i27 = i;
            while (true) {
                if (i27 < size) {
                    if (!zArr[i]) {
                        break;
                    } else {
                        return;
                    }
                }
                int i310 = size;
                hashSet2 = ((as0) arrayList.get(i27)).g;
                if (hashSet2 != null) {
                    break;
                    break;
                }
                i27++;
                size = i310;
            }
        } else {
            i6 = i3;
        }
        z2 = this.m;
        if (z2) {
            if (z2) {
                kv2Var2.n(eu4VarM, this.Y);
                kv2Var2.n(eu4VarM2, this.Y + this.U);
                if (i6 != 0) {
                    weakReference3 = us0Var2.H0;
                    if (weakReference3 != null) {
                        us0Var2.H0 = new WeakReference(as0Var5);
                    } else {
                        us0Var2.H0 = new WeakReference(as0Var5);
                    }
                    weakReference4 = us0Var2.J0;
                    if (weakReference4 != null) {
                        us0Var2.J0 = new WeakReference(as0Var6);
                    } else {
                        us0Var2.J0 = new WeakReference(as0Var6);
                    }
                }
            }
            if (this.q) {
                kv2Var2.n(eu4VarM3, this.Z);
                kv2Var2.n(eu4VarM4, this.Z + this.V);
                hashSet = as0Var9.g;
                if (hashSet != null) {
                    kv2Var2.n(eu4VarM5, this.Z + this.a0);
                }
                if (i5 != 0) {
                    weakReference = us0Var.G0;
                    if (weakReference != null) {
                        us0Var.G0 = new WeakReference(as0Var7);
                    } else {
                        us0Var.G0 = new WeakReference(as0Var7);
                    }
                    weakReference2 = us0Var.I0;
                    if (weakReference2 != null) {
                        us0Var.I0 = new WeakReference(as0Var8);
                    } else {
                        us0Var.I0 = new WeakReference(as0Var8);
                    }
                }
            }
            if (this.m) {
                ?? r13 = i;
                this.m = r13;
                this.q = r13;
                return;
            }
        } else {
            if (z2) {
                kv2Var2.n(eu4VarM, this.Y);
                kv2Var2.n(eu4VarM2, this.Y + this.U);
                if (i6 != 0) {
                    weakReference3 = us0Var2.H0;
                    if (weakReference3 != null) {
                        us0Var2.H0 = new WeakReference(as0Var5);
                    } else {
                        us0Var2.H0 = new WeakReference(as0Var5);
                    }
                    weakReference4 = us0Var2.J0;
                    if (weakReference4 != null) {
                        us0Var2.J0 = new WeakReference(as0Var6);
                    } else {
                        us0Var2.J0 = new WeakReference(as0Var6);
                    }
                }
            }
            if (this.q) {
                kv2Var2.n(eu4VarM3, this.Z);
                kv2Var2.n(eu4VarM4, this.Z + this.V);
                hashSet = as0Var9.g;
                if (hashSet != null) {
                    kv2Var2.n(eu4VarM5, this.Z + this.a0);
                }
                if (i5 != 0) {
                    weakReference = us0Var.G0;
                    if (weakReference != null) {
                        us0Var.G0 = new WeakReference(as0Var7);
                    } else {
                        us0Var.G0 = new WeakReference(as0Var7);
                    }
                    weakReference2 = us0Var.I0;
                    if (weakReference2 != null) {
                        us0Var.I0 = new WeakReference(as0Var8);
                    } else {
                        us0Var.I0 = new WeakReference(as0Var8);
                    }
                }
            }
            if (this.m) {
                ?? r14 = i;
                this.m = r14;
                this.q = r14;
                return;
            }
        }
        zArr2 = this.x;
        if (z) {
            as0Var = as0Var9;
            zArr3 = zArr2;
        } else {
            as0Var = as0Var9;
            zArr3 = zArr2;
        }
        if (this.T != null) {
            if (f(0)) {
                this.T.R(this, 0);
                zK = true;
                i26 = 1;
            } else {
                zK = k();
                i26 = 1;
            }
            if (f(i26)) {
                this.T.R(this, i26);
                zD = true;
            } else {
                zD = d();
            }
            if (zK) {
            }
            if (!zD) {
                kv2Var2.x(kv2Var2.m(this.T.L), eu4VarM4, 0, 1);
            }
            z4 = zD;
            z3 = zK;
        } else {
            as0Var5 = as0Var5;
            z3 = false;
            z4 = false;
        }
        i7 = this.U;
        i8 = this.b0;
        if (i7 >= i8) {
            i8 = i7;
        }
        i9 = this.V;
        i10 = this.c0;
        if (i9 < i10) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        iArr = this.p0;
        i12 = iArr[0];
        if (i12 != 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        i13 = iArr[1];
        if (i13 != 3) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i311 = this.X;
        this.A = i311;
        float f6 = this.W;
        this.B = f6;
        f = f6;
        i14 = this.p;
        i15 = this.u;
        if (f > 0.0f) {
            as0Var2 = as0Var8;
            if (this.g0 != 8) {
                if (i12 == 3) {
                    i17 = i14;
                } else {
                    i17 = i14;
                }
                if (i13 == 3) {
                    i25 = i15;
                } else {
                    i25 = i15;
                }
                if (i12 == 3) {
                    if (i12 != 3) {
                        if (i13 != 3) {
                            i16 = i11;
                        } else {
                            i16 = i11;
                        }
                        z7 = true;
                    } else {
                        if (i13 != 3) {
                            i16 = i11;
                        } else {
                            i16 = i11;
                        }
                        z7 = true;
                    }
                } else if (i12 != 3) {
                    if (i13 != 3) {
                        i16 = i11;
                    } else {
                        i16 = i11;
                    }
                    z7 = true;
                } else {
                    if (i13 != 3) {
                        i16 = i11;
                    } else {
                        i16 = i11;
                    }
                    z7 = true;
                }
                i18 = i25;
                int[] iArr14 = this.z;
                iArr14[0] = i17;
                iArr14[1] = i18;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (iArr[0] == 2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                as0Var3 = this.P;
                boolean z1112 = !as0Var3.j();
                char c6 = '\b';
                boolean z1113 = zArr[0];
                boolean z1114 = zArr[1];
                i19 = this.i;
                int[] iArr15 = this.C;
                if (i19 != 2) {
                    r4 = i5;
                    iArr2 = iArr;
                    as0Var4 = as0Var;
                    eu4Var = eu4VarM;
                    eu4Var2 = eu4VarM2;
                    eu4Var3 = eu4VarM5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                } else {
                    r4 = i5;
                    iArr2 = iArr;
                    as0Var4 = as0Var;
                    eu4Var = eu4VarM;
                    eu4Var2 = eu4VarM2;
                    eu4Var3 = eu4VarM5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                }
                if (z) {
                    eu4Var4 = r33;
                    eu4Var5 = eu4VarM4;
                    eu4Var6 = eu4Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                } else {
                    eu4Var4 = r33;
                    eu4Var5 = eu4VarM4;
                    eu4Var6 = eu4Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                }
                if (this.b == 2) {
                    i23 = i21;
                }
                if (i23 != 0) {
                    eu4Var7 = eu4Var4;
                } else {
                    eu4Var7 = eu4Var4;
                }
                if (z7) {
                    i24 = this.A;
                    f2 = this.B;
                    if (i24 == 1) {
                        nr nrVarQ111 = kv2Var2.q();
                        nrVarQ111.n.l(eu4Var5, -1.0f);
                        nrVarQ111.n.l(eu4Var7, 1.0f);
                        nrVarQ111.n.l(eu4Var2, f2);
                        nrVarQ111.n.l(eu4Var, -f2);
                        kv2Var2.r(nrVarQ111);
                    } else {
                        nr nrVarQ112 = kv2Var2.q();
                        nrVarQ112.n.l(eu4Var2, -1.0f);
                        nrVarQ112.n.l(eu4Var, 1.0f);
                        nrVarQ112.n.l(eu4Var5, f2);
                        nrVarQ112.n.l(eu4Var7, -f2);
                        kv2Var2.r(nrVarQ112);
                    }
                }
                if (as0Var3.j()) {
                    ts0 ts0Var6 = as0Var3.x.n;
                    float radians6 = (float) Math.toRadians(this.D + 90.0f);
                    int iV6 = as0Var3.v();
                    eu4 eu4VarM111110 = kv2Var2.m(t(2));
                    eu4 eu4VarM111111 = kv2Var2.m(t(3));
                    eu4 eu4VarM111112 = kv2Var2.m(t(4));
                    eu4 eu4VarM111113 = kv2Var2.m(t(5));
                    eu4 eu4VarM111114 = kv2Var2.m(ts0Var6.t(2));
                    eu4 eu4VarM111115 = kv2Var2.m(ts0Var6.t(3));
                    eu4 eu4VarM111116 = kv2Var2.m(ts0Var6.t(4));
                    eu4 eu4VarM111117 = kv2Var2.m(ts0Var6.t(5));
                    nr nrVarQ113 = kv2Var2.q();
                    double d11 = radians6;
                    double dSin6 = Math.sin(d11);
                    double d12 = iV6;
                    nrVarQ113.n.l(eu4VarM111115, 0.5f);
                    nrVarQ113.n.l(eu4VarM111117, 0.5f);
                    nrVarQ113.n.l(eu4VarM111111, -0.5f);
                    nrVarQ113.n.l(eu4VarM111113, -0.5f);
                    nrVarQ113.y = -((float) (dSin6 * d12));
                    kv2Var2.r(nrVarQ113);
                    nr nrVarQ114 = kv2Var2.q();
                    float fCos6 = (float) (Math.cos(d11) * d12);
                    nrVarQ114.n.l(eu4VarM111114, 0.5f);
                    nrVarQ114.n.l(eu4VarM111116, 0.5f);
                    nrVarQ114.n.l(eu4VarM111110, -0.5f);
                    nrVarQ114.n.l(eu4VarM111112, -0.5f);
                    nrVarQ114.y = -fCos6;
                    kv2Var2.r(nrVarQ114);
                }
                this.m = false;
                this.q = false;
            }
            z7 = false;
            int[] iArr16 = this.z;
            iArr16[0] = i17;
            iArr16[1] = i18;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (iArr[0] == 2) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i8 = 0;
            }
            as0Var3 = this.P;
            boolean z1115 = !as0Var3.j();
            char c7 = '\b';
            boolean z1116 = zArr[0];
            boolean z1117 = zArr[1];
            i19 = this.i;
            int[] iArr17 = this.C;
            if (i19 != 2) {
                r4 = i5;
                iArr2 = iArr;
                as0Var4 = as0Var;
                eu4Var = eu4VarM;
                eu4Var2 = eu4VarM2;
                eu4Var3 = eu4VarM5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            } else {
                r4 = i5;
                iArr2 = iArr;
                as0Var4 = as0Var;
                eu4Var = eu4VarM;
                eu4Var2 = eu4VarM2;
                eu4Var3 = eu4VarM5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            }
            if (z) {
                eu4Var4 = r33;
                eu4Var5 = eu4VarM4;
                eu4Var6 = eu4Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            } else {
                eu4Var4 = r33;
                eu4Var5 = eu4VarM4;
                eu4Var6 = eu4Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            }
            if (this.b == 2) {
                i23 = i21;
            }
            if (i23 != 0) {
                eu4Var7 = eu4Var4;
            } else {
                eu4Var7 = eu4Var4;
            }
            if (z7) {
                i24 = this.A;
                f2 = this.B;
                if (i24 == 1) {
                    nr nrVarQ115 = kv2Var2.q();
                    nrVarQ115.n.l(eu4Var5, -1.0f);
                    nrVarQ115.n.l(eu4Var7, 1.0f);
                    nrVarQ115.n.l(eu4Var2, f2);
                    nrVarQ115.n.l(eu4Var, -f2);
                    kv2Var2.r(nrVarQ115);
                } else {
                    nr nrVarQ116 = kv2Var2.q();
                    nrVarQ116.n.l(eu4Var2, -1.0f);
                    nrVarQ116.n.l(eu4Var, 1.0f);
                    nrVarQ116.n.l(eu4Var5, f2);
                    nrVarQ116.n.l(eu4Var7, -f2);
                    kv2Var2.r(nrVarQ116);
                }
            }
            if (as0Var3.j()) {
                ts0 ts0Var7 = as0Var3.x.n;
                float radians7 = (float) Math.toRadians(this.D + 90.0f);
                int iV7 = as0Var3.v();
                eu4 eu4VarM111118 = kv2Var2.m(t(2));
                eu4 eu4VarM111119 = kv2Var2.m(t(3));
                eu4 eu4VarM1111110 = kv2Var2.m(t(4));
                eu4 eu4VarM1111111 = kv2Var2.m(t(5));
                eu4 eu4VarM1111112 = kv2Var2.m(ts0Var7.t(2));
                eu4 eu4VarM1111113 = kv2Var2.m(ts0Var7.t(3));
                eu4 eu4VarM1111114 = kv2Var2.m(ts0Var7.t(4));
                eu4 eu4VarM1111115 = kv2Var2.m(ts0Var7.t(5));
                nr nrVarQ117 = kv2Var2.q();
                double d13 = radians7;
                double dSin7 = Math.sin(d13);
                double d14 = iV7;
                nrVarQ117.n.l(eu4VarM1111113, 0.5f);
                nrVarQ117.n.l(eu4VarM1111115, 0.5f);
                nrVarQ117.n.l(eu4VarM111119, -0.5f);
                nrVarQ117.n.l(eu4VarM1111111, -0.5f);
                nrVarQ117.y = -((float) (dSin7 * d14));
                kv2Var2.r(nrVarQ117);
                nr nrVarQ118 = kv2Var2.q();
                float fCos7 = (float) (Math.cos(d13) * d14);
                nrVarQ118.n.l(eu4VarM1111112, 0.5f);
                nrVarQ118.n.l(eu4VarM1111114, 0.5f);
                nrVarQ118.n.l(eu4VarM111118, -0.5f);
                nrVarQ118.n.l(eu4VarM1111110, -0.5f);
                nrVarQ118.y = -fCos7;
                kv2Var2.r(nrVarQ118);
            }
            this.m = false;
            this.q = false;
        }
        as0Var2 = as0Var8;
        eu4VarM4 = eu4VarM4;
        i16 = i11;
        i17 = i14;
        i18 = i15;
        z7 = false;
        int[] iArr18 = this.z;
        iArr18[0] = i17;
        iArr18[1] = i18;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (z7) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (iArr[0] == 2) {
            z10 = false;
        } else {
            z10 = false;
        }
        if (z10) {
            i8 = 0;
        }
        as0Var3 = this.P;
        boolean z1118 = !as0Var3.j();
        char c8 = '\b';
        boolean z1119 = zArr[0];
        boolean z11110 = zArr[1];
        i19 = this.i;
        int[] iArr19 = this.C;
        if (i19 != 2) {
            r4 = i5;
            iArr2 = iArr;
            as0Var4 = as0Var;
            eu4Var = eu4VarM;
            eu4Var2 = eu4VarM2;
            eu4Var3 = eu4VarM5;
            z11 = z3;
            r3 = i6;
            i20 = i17;
        } else {
            r4 = i5;
            iArr2 = iArr;
            as0Var4 = as0Var;
            eu4Var = eu4VarM;
            eu4Var2 = eu4VarM2;
            eu4Var3 = eu4VarM5;
            z11 = z3;
            r3 = i6;
            i20 = i17;
        }
        if (z) {
            eu4Var4 = r33;
            eu4Var5 = eu4VarM4;
            eu4Var6 = eu4Var3;
            i21 = 0;
            i22 = 8;
            z12 = true;
            i23 = 1;
        } else {
            eu4Var4 = r33;
            eu4Var5 = eu4VarM4;
            eu4Var6 = eu4Var3;
            i21 = 0;
            i22 = 8;
            z12 = true;
            i23 = 1;
        }
        if (this.b == 2) {
            i23 = i21;
        }
        if (i23 != 0) {
            eu4Var7 = eu4Var4;
        } else {
            eu4Var7 = eu4Var4;
        }
        if (z7) {
            i24 = this.A;
            f2 = this.B;
            if (i24 == 1) {
                nr nrVarQ119 = kv2Var2.q();
                nrVarQ119.n.l(eu4Var5, -1.0f);
                nrVarQ119.n.l(eu4Var7, 1.0f);
                nrVarQ119.n.l(eu4Var2, f2);
                nrVarQ119.n.l(eu4Var, -f2);
                kv2Var2.r(nrVarQ119);
            } else {
                nr nrVarQ1110 = kv2Var2.q();
                nrVarQ1110.n.l(eu4Var2, -1.0f);
                nrVarQ1110.n.l(eu4Var, 1.0f);
                nrVarQ1110.n.l(eu4Var5, f2);
                nrVarQ1110.n.l(eu4Var7, -f2);
                kv2Var2.r(nrVarQ1110);
            }
        }
        if (as0Var3.j()) {
            ts0 ts0Var8 = as0Var3.x.n;
            float radians8 = (float) Math.toRadians(this.D + 90.0f);
            int iV8 = as0Var3.v();
            eu4 eu4VarM1111116 = kv2Var2.m(t(2));
            eu4 eu4VarM1111117 = kv2Var2.m(t(3));
            eu4 eu4VarM1111118 = kv2Var2.m(t(4));
            eu4 eu4VarM1111119 = kv2Var2.m(t(5));
            eu4 eu4VarM11111110 = kv2Var2.m(ts0Var8.t(2));
            eu4 eu4VarM11111111 = kv2Var2.m(ts0Var8.t(3));
            eu4 eu4VarM11111112 = kv2Var2.m(ts0Var8.t(4));
            eu4 eu4VarM11111113 = kv2Var2.m(ts0Var8.t(5));
            nr nrVarQ1111 = kv2Var2.q();
            double d15 = radians8;
            double dSin8 = Math.sin(d15);
            double d16 = iV8;
            nrVarQ1111.n.l(eu4VarM11111111, 0.5f);
            nrVarQ1111.n.l(eu4VarM11111113, 0.5f);
            nrVarQ1111.n.l(eu4VarM1111117, -0.5f);
            nrVarQ1111.n.l(eu4VarM1111119, -0.5f);
            nrVarQ1111.y = -((float) (dSin8 * d16));
            kv2Var2.r(nrVarQ1111);
            nr nrVarQ1112 = kv2Var2.q();
            float fCos8 = (float) (Math.cos(d15) * d16);
            nrVarQ1112.n.l(eu4VarM11111110, 0.5f);
            nrVarQ1112.n.l(eu4VarM11111112, 0.5f);
            nrVarQ1112.n.l(eu4VarM1111116, -0.5f);
            nrVarQ1112.n.l(eu4VarM1111118, -0.5f);
            nrVarQ1112.y = -fCos8;
            kv2Var2.r(nrVarQ1112);
        }
        this.m = false;
        this.q = false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean z(int i) {
        if (i == 0) {
            if ((this.I.x != null ? 1 : 0) + (this.K.x != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.J.x != null ? 1 : 0) + (this.L.x != null ? 1 : 0) + (this.M.x != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }
}
