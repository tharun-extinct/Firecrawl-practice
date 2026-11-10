package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ql4 {
    public final boolean A;
    public final boolean B;
    public final String C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final Set n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public ql4(boolean z, boolean z2, boolean z3, Set set, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i2, int i3, String str, boolean z14, boolean z15, boolean z16, boolean z17, int i4, String str2, boolean z18, boolean z19, boolean z20, boolean z21, String str3, String str4, boolean z22, boolean z23, boolean z24) {
        this.g = z;
        this.y = z2;
        this.r = z3;
        this.n = set;
        this.v = z4;
        this.x = z5;
        this.l = z6;
        this.j = z7;
        this.t = z8;
        this.a = i;
        this.m = z9;
        this.q = z10;
        this.w = z11;
        this.c = z12;
        this.i = z13;
        this.b = i2;
        this.s = i3;
        this.p = str;
        this.u = z14;
        this.z = z15;
        this.h = z16;
        this.o = z17;
        this.f = i4;
        this.k = str2;
        this.d = z18;
        this.e = z19;
        this.A = z20;
        this.B = z21;
        this.C = str3;
        this.D = str4;
        this.E = z22;
        this.F = z23;
        this.G = z24;
    }

    public static ql4 g(ql4 ql4Var, boolean z, boolean z2, Set set, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, int i3, String str, boolean z11, boolean z12, boolean z13, boolean z14, int i4, String str2, boolean z15, boolean z16, boolean z17, boolean z18, String str3, String str4, boolean z19, boolean z20, boolean z21, int i5, int i6) {
        boolean z22 = ql4Var.g;
        boolean z23 = (i5 & 2) != 0 ? ql4Var.y : z;
        boolean z24 = (i5 & 4) != 0 ? ql4Var.r : z2;
        Set set2 = (i5 & 8) != 0 ? ql4Var.n : set;
        boolean z25 = (i5 & 16) != 0 ? ql4Var.v : z3;
        boolean z26 = (i5 & 32) != 0 ? ql4Var.x : z4;
        boolean z27 = ql4Var.l;
        boolean z28 = z23;
        boolean z29 = z24;
        Set set3 = set2;
        boolean z30 = z25;
        boolean z31 = z26;
        boolean z32 = ql4Var.j;
        boolean z33 = (i5 & 256) != 0 ? ql4Var.t : z5;
        int i7 = (i5 & 512) != 0 ? ql4Var.a : i;
        boolean z34 = (i5 & 1024) != 0 ? ql4Var.m : z6;
        boolean z35 = (i5 & 2048) != 0 ? ql4Var.q : z7;
        boolean z36 = (i5 & 4096) != 0 ? ql4Var.w : z8;
        boolean z37 = (i5 & 8192) != 0 ? ql4Var.c : z9;
        boolean z38 = (i5 & 16384) != 0 ? ql4Var.i : z10;
        int i8 = (i5 & 32768) != 0 ? ql4Var.b : i2;
        int i9 = (i5 & 65536) != 0 ? ql4Var.s : i3;
        String str5 = (i5 & 131072) != 0 ? ql4Var.p : str;
        boolean z39 = (i5 & 262144) != 0 ? ql4Var.u : z11;
        boolean z40 = (i5 & 524288) != 0 ? ql4Var.z : z12;
        boolean z41 = (i5 & 1048576) != 0 ? ql4Var.h : z13;
        boolean z42 = (i5 & 2097152) != 0 ? ql4Var.o : z14;
        int i10 = (i5 & 4194304) != 0 ? ql4Var.f : i4;
        String str6 = (i5 & 8388608) != 0 ? ql4Var.k : str2;
        boolean z43 = (i5 & 16777216) != 0 ? ql4Var.d : z15;
        boolean z44 = (i5 & 33554432) != 0 ? ql4Var.e : z16;
        boolean z45 = (i5 & 67108864) != 0 ? ql4Var.A : z17;
        boolean z46 = (i5 & 134217728) != 0 ? ql4Var.B : z18;
        String str7 = (i5 & 268435456) != 0 ? ql4Var.C : str3;
        String str8 = (i5 & 536870912) != 0 ? ql4Var.D : str4;
        boolean z47 = (i5 & 1073741824) != 0 ? ql4Var.E : z19;
        boolean z48 = (i5 & Integer.MIN_VALUE) != 0 ? ql4Var.F : z20;
        boolean z49 = (i6 & 1) != 0 ? ql4Var.G : z21;
        ql4Var.getClass();
        set3.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new ql4(z22, z28, z29, set3, z30, z31, z27, z32, z33, i7, z34, z35, z36, z37, z38, i8, i9, str5, z39, z40, z41, z42, i10, str6, z43, z44, z45, z46, str7, str8, z47, z48, z49);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql4)) {
            return false;
        }
        ql4 ql4Var = (ql4) obj;
        return this.g == ql4Var.g && this.y == ql4Var.y && this.r == ql4Var.r && this.n.equals(ql4Var.n) && this.v == ql4Var.v && this.x == ql4Var.x && this.l == ql4Var.l && this.j == ql4Var.j && this.t == ql4Var.t && this.a == ql4Var.a && this.m == ql4Var.m && this.q == ql4Var.q && this.w == ql4Var.w && this.c == ql4Var.c && this.i == ql4Var.i && this.b == ql4Var.b && this.s == ql4Var.s && this.p.equals(ql4Var.p) && this.u == ql4Var.u && this.z == ql4Var.z && this.h == ql4Var.h && this.o == ql4Var.o && this.f == ql4Var.f && this.k.equals(ql4Var.k) && this.d == ql4Var.d && this.e == ql4Var.e && this.A == ql4Var.A && this.B == ql4Var.B && this.C.equals(ql4Var.C) && this.D.equals(ql4Var.D) && this.E == ql4Var.E && this.F == ql4Var.F && this.G == ql4Var.G;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.G) + xi3.l(xi3.l(xi3.x(xi3.x(xi3.l(xi3.l(xi3.l(xi3.l(xi3.x(du4.r(this.f, xi3.l(xi3.l(xi3.l(xi3.l(xi3.x(du4.r(this.s, du4.r(this.b, xi3.l(xi3.l(xi3.l(xi3.l(xi3.l(du4.r(this.a, xi3.l(xi3.l(xi3.l(xi3.l(xi3.l((this.n.hashCode() + xi3.l(xi3.l(Boolean.hashCode(this.g) * 31, 31, this.y), 31, this.r)) * 31, 31, this.v), 31, this.x), 31, this.l), 31, this.j), 31, this.t), 31), 31, this.m), 31, this.q), 31, this.w), 31, this.c), 31, this.i), 31), 31), 31, this.p), 31, this.u), 31, this.z), 31, this.h), 31, this.o), 31), 31, this.k), 31, this.d), 31, this.e), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Settings(showMediaButtons=");
        sb.append(this.g);
        sb.append(", showMouseButtonsTop=");
        sb.append(this.y);
        sb.append(", showMouseButtonsBottom=");
        sb.append(this.r);
        sb.append(", visibleMouseButtons=");
        sb.append(this.n);
        sb.append(", scrollBarLeft=");
        sb.append(this.v);
        sb.append(", scrollBarRight=");
        sb.append(this.x);
        sb.append(", showNavigationButtons=");
        sb.append(this.l);
        sb.append(", showShortcutButtons=");
        sb.append(this.j);
        sb.append(", useAirMouse=");
        sb.append(this.t);
        sb.append(", airMouseSpeed=");
        sb.append(this.a);
        sb.append(", useDarkTheme=");
        sb.append(this.m);
        sb.append(", useOutlineTheme=");
        sb.append(this.q);
        sb.append(", invertScrolling=");
        sb.append(this.w);
        sb.append(", penDrawingMode=");
        sb.append(this.c);
        sb.append(", enabledTouchClick=");
        sb.append(this.i);
        sb.append(", mousePointerSpeed=");
        sb.append(this.b);
        sb.append(", scrollSpeed=");
        sb.append(this.s);
        sb.append(", mouseJiggleMode=");
        sb.append(this.p);
        sb.append(", startFullScreen=");
        sb.append(this.u);
        sb.append(", keepScreenOn=");
        sb.append(this.z);
        sb.append(", showOverLockScreen=");
        sb.append(this.h);
        sb.append(", showKeyboard=");
        sb.append(this.o);
        sb.append(", screenBrightness=");
        sb.append(this.f);
        sb.append(", inputBarOption=");
        sb.append(this.k);
        sb.append(", hapticFeedback=");
        sb.append(this.d);
        sb.append(", scannerSendEnter=");
        sb.append(this.e);
        sb.append(", scannerContinuousMode=");
        sb.append(this.A);
        sb.append(", scannerSkipDuplicate=");
        sb.append(this.B);
        sb.append(", volUpButton=");
        du4.B(sb, this.C, ", volDownButton=", this.D, ", passwordModeEnabled=");
        sb.append(this.E);
        sb.append(", imeVisible=");
        sb.append(this.F);
        sb.append(", useAnalogStick=");
        sb.append(this.G);
        sb.append(")");
        return sb.toString();
    }
}
