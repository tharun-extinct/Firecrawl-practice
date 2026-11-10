package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j42 extends li5 {
    public final z6 a;
    public float b;
    public float c;
    public float i;
    public ld j;
    public boolean l;
    public String m;
    public float p;
    public float q;
    public float s;
    public xy1 t;
    public boolean u;
    public float w;
    public List x;
    public float[] y;
    public final ArrayList r = new ArrayList();
    public boolean n = true;
    public long v = jj0.j;

    public j42() {
        int i = fj5.g;
        this.x = pi1.j;
        this.l = true;
        this.a = new z6(this, (byte) 18);
        this.m = "";
        this.i = 1.0f;
        this.b = 1.0f;
        this.u = true;
    }

    @Override // defpackage.li5
    public final void g(xd1 xd1Var) {
        if (this.u) {
            float[] fArrG = this.y;
            if (fArrG == null) {
                fArrG = l33.g();
                this.y = fArrG;
            } else {
                l33.n(fArrG);
            }
            l33.x(fArrG, this.s + this.w, this.p + this.c);
            float f = this.q;
            if (fArrG.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrG[0];
                float f3 = fArrG[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrG[1];
                float f8 = fArrG[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrG[2];
                float f12 = fArrG[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrG[3];
                float f16 = fArrG[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrG[0] = f4;
                fArrG[1] = f9;
                fArrG[2] = f13;
                fArrG[3] = f17;
                fArrG[4] = f6;
                fArrG[5] = f10;
                fArrG[6] = f14;
                fArrG[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.i;
            float f19 = this.b;
            if (fArrG.length >= 16) {
                fArrG[0] = fArrG[0] * f18;
                fArrG[1] = fArrG[1] * f18;
                fArrG[2] = fArrG[2] * f18;
                fArrG[3] = fArrG[3] * f18;
                fArrG[4] = fArrG[4] * f19;
                fArrG[5] = fArrG[5] * f19;
                fArrG[6] = fArrG[6] * f19;
                fArrG[7] = fArrG[7] * f19;
                fArrG[8] = fArrG[8] * 1.0f;
                fArrG[9] = fArrG[9] * 1.0f;
                fArrG[10] = fArrG[10] * 1.0f;
                fArrG[11] = fArrG[11] * 1.0f;
            }
            l33.x(fArrG, -this.w, -this.c);
            this.u = false;
        }
        if (this.l) {
            if (!this.x.isEmpty()) {
                ld ldVarG = this.j;
                if (ldVarG == null) {
                    ldVarG = nd.g();
                    this.j = ldVarG;
                }
                kq2.V(this.x, ldVarG);
            }
            this.l = false;
        }
        ro roVarE = xd1Var.E();
        long jG = roVarE.G();
        roVarE.b().q();
        try {
            ro roVar = (ro) ((y22) roVarE.t).t;
            float[] fArr = this.y;
            if (fArr != null) {
                roVar.b().s(fArr);
            }
            ld ldVar = this.j;
            if (!this.x.isEmpty() && ldVar != null) {
                roVar.b().u(ldVar);
            }
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((li5) arrayList.get(i)).g(xd1Var);
            }
        } finally {
            du4.d(roVarE, jG);
        }
    }

    public final void l(li5 li5Var) {
        if (!(li5Var instanceof lq3)) {
            if (li5Var instanceof j42) {
                j42 j42Var = (j42) li5Var;
                if (j42Var.n && this.n) {
                    x(j42Var.v);
                    return;
                } else {
                    this.n = false;
                    this.v = jj0.j;
                    return;
                }
            }
            return;
        }
        lq3 lq3Var = (lq3) li5Var;
        z60 z60Var = lq3Var.y;
        if (this.n && z60Var != null) {
            if (z60Var instanceof cu4) {
                x(((cu4) z60Var).g);
            } else {
                this.n = false;
                this.v = jj0.j;
            }
        }
        z60 z60Var2 = lq3Var.l;
        if (this.n && z60Var2 != null) {
            if (z60Var2 instanceof cu4) {
                x(((cu4) z60Var2).g);
            } else {
                this.n = false;
                this.v = jj0.j;
            }
        }
    }

    @Override // defpackage.li5
    public final void n(z6 z6Var) {
        this.t = z6Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.m);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            li5 li5Var = (li5) arrayList.get(i);
            sb.append("\t");
            sb.append(li5Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public final void v(int i, li5 li5Var) {
        ArrayList arrayList = this.r;
        if (i < arrayList.size()) {
            arrayList.set(i, li5Var);
        } else {
            arrayList.add(li5Var);
        }
        l(li5Var);
        li5Var.n(this.a);
        r();
    }

    public final void x(long j) {
        if (this.n && j != 16) {
            long j2 = this.v;
            if (j2 == 16) {
                this.v = j;
                return;
            }
            int i = fj5.g;
            if (jj0.l(j2) == jj0.l(j) && jj0.x(j2) == jj0.x(j) && jj0.n(j2) == jj0.n(j)) {
                return;
            }
            this.n = false;
            this.v = jj0.j;
        }
    }

    @Override // defpackage.li5
    public final xy1 y() {
        return this.t;
    }
}
