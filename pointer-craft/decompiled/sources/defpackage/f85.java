package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f85 extends o73 {
    public final String g;
    public final int l;
    public final int n;
    public final ku1 r;
    public final boolean v;
    public final int x;
    public final k85 y;

    public f85(String str, k85 k85Var, ku1 ku1Var, int i, boolean z, int i2, int i3) {
        this.g = str;
        this.y = k85Var;
        this.r = ku1Var;
        this.n = i;
        this.v = z;
        this.x = i2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f85)) {
            return false;
        }
        f85 f85Var = (f85) obj;
        return yf2.p(this.g, f85Var.g) && yf2.p(this.y, f85Var.y) && yf2.p(this.r, f85Var.r) && this.n == f85Var.n && this.v == f85Var.v && this.x == f85Var.x && this.l == f85Var.l;
    }

    public final int hashCode() {
        return (((xi3.l(du4.r(this.n, (this.r.hashCode() + ei3.r(this.y, this.g.hashCode() * 31, 31)) * 31, 31), 31, this.v) + this.x) * 31) + this.l) * 31;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        ku1 ku1Var;
        ku1 ku1Var2;
        int i5;
        int i6;
        i85 i85Var = (i85) i73Var;
        i85Var.getClass();
        k85 k85Var = i85Var.f;
        boolean z5 = false;
        boolean z6 = true;
        k85 k85Var2 = this.y;
        if (k85Var2 != k85Var) {
            if (!k85Var2.g.y(k85Var.g)) {
                z = true;
            }
            str = i85Var.o;
            str2 = this.g;
            if (!yf2.p(str, str2)) {
                i85Var.o = str2;
                i85Var.F = null;
                z5 = true;
            }
            z2 = !i85Var.f.r(k85Var2);
            i85Var.f = k85Var2;
            i = i85Var.B;
            i2 = this.l;
            if (i != i2) {
                i85Var.B = i2;
                z2 = true;
            }
            i3 = i85Var.A;
            i4 = this.x;
            if (i3 != i4) {
                i85Var.A = i4;
                z2 = true;
            }
            z3 = i85Var.e;
            z4 = this.v;
            if (z3 != z4) {
                i85Var.e = z4;
                z2 = true;
            }
            ku1Var = i85Var.k;
            ku1Var2 = this.r;
            if (!yf2.p(ku1Var, ku1Var2)) {
                i85Var.k = ku1Var2;
                z2 = true;
            }
            i5 = i85Var.d;
            i6 = this.n;
            if (i5 == i6) {
                z6 = z2;
            } else {
                i85Var.d = i6;
            }
            if (z5 || z6) {
                kp3 kp3VarQ0 = i85Var.Q0();
                String str3 = i85Var.o;
                k85 k85Var3 = i85Var.f;
                ku1 ku1Var3 = i85Var.k;
                int i7 = i85Var.d;
                boolean z7 = i85Var.e;
                int i8 = i85Var.A;
                int i9 = i85Var.B;
                kp3VarQ0.g = str3;
                kp3VarQ0.y = k85Var3;
                kp3VarQ0.r = ku1Var3;
                kp3VarQ0.n = i7;
                kp3VarQ0.v = z7;
                kp3VarQ0.x = i8;
                kp3VarQ0.l = i9;
                kp3VarQ0.u = (kp3VarQ0.u << 2) | 2;
                kp3VarQ0.r();
            }
            if (i85Var.h) {
                if (z5 || (z && i85Var.E != null)) {
                    br2.d(i85Var);
                }
                if (z5 || z6) {
                    c93.B(i85Var);
                    c93.A(i85Var);
                }
                if (z) {
                    c93.A(i85Var);
                }
            }
            return;
        }
        k85Var2.getClass();
        z = false;
        str = i85Var.o;
        str2 = this.g;
        if (!yf2.p(str, str2)) {
            i85Var.o = str2;
            i85Var.F = null;
            z5 = true;
        }
        z2 = !i85Var.f.r(k85Var2);
        i85Var.f = k85Var2;
        i = i85Var.B;
        i2 = this.l;
        if (i != i2) {
            i85Var.B = i2;
            z2 = true;
        }
        i3 = i85Var.A;
        i4 = this.x;
        if (i3 != i4) {
            i85Var.A = i4;
            z2 = true;
        }
        z3 = i85Var.e;
        z4 = this.v;
        if (z3 != z4) {
            i85Var.e = z4;
            z2 = true;
        }
        ku1Var = i85Var.k;
        ku1Var2 = this.r;
        if (!yf2.p(ku1Var, ku1Var2)) {
            i85Var.k = ku1Var2;
            z2 = true;
        }
        i5 = i85Var.d;
        i6 = this.n;
        if (i5 == i6) {
            z6 = z2;
        } else {
            i85Var.d = i6;
        }
        if (z5) {
            kp3 kp3VarQ1 = i85Var.Q0();
            String str4 = i85Var.o;
            k85 k85Var4 = i85Var.f;
            ku1 ku1Var4 = i85Var.k;
            int i10 = i85Var.d;
            boolean z8 = i85Var.e;
            int i11 = i85Var.A;
            int i12 = i85Var.B;
            kp3VarQ1.g = str4;
            kp3VarQ1.y = k85Var4;
            kp3VarQ1.r = ku1Var4;
            kp3VarQ1.n = i10;
            kp3VarQ1.v = z8;
            kp3VarQ1.x = i11;
            kp3VarQ1.l = i12;
            kp3VarQ1.u = (kp3VarQ1.u << 2) | 2;
            kp3VarQ1.r();
        } else {
            kp3 kp3VarQ2 = i85Var.Q0();
            String str5 = i85Var.o;
            k85 k85Var5 = i85Var.f;
            ku1 ku1Var5 = i85Var.k;
            int i13 = i85Var.d;
            boolean z9 = i85Var.e;
            int i14 = i85Var.A;
            int i15 = i85Var.B;
            kp3VarQ2.g = str5;
            kp3VarQ2.y = k85Var5;
            kp3VarQ2.r = ku1Var5;
            kp3VarQ2.n = i13;
            kp3VarQ2.v = z9;
            kp3VarQ2.x = i14;
            kp3VarQ2.l = i15;
            kp3VarQ2.u = (kp3VarQ2.u << 2) | 2;
            kp3VarQ2.r();
        }
        if (i85Var.h) {
            return;
        }
        if (z5) {
            br2.d(i85Var);
        } else {
            br2.d(i85Var);
        }
        if (z5) {
            c93.B(i85Var);
            c93.A(i85Var);
        } else {
            c93.B(i85Var);
            c93.A(i85Var);
        }
        if (z) {
            c93.A(i85Var);
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        i85 i85Var = new i85();
        i85Var.o = this.g;
        i85Var.f = this.y;
        i85Var.k = this.r;
        i85Var.d = this.n;
        i85Var.e = this.v;
        i85Var.A = this.x;
        i85Var.B = this.l;
        return i85Var;
    }
}
