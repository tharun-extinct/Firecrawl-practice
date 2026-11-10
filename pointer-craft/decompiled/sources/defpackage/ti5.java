package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class ti5 extends li5 {
    public long a;
    public m30 j;
    public final tp3 l;
    public float m;
    public boolean n;
    public float q;
    public String r;
    public final tp3 t;
    public final td1 v;
    public final si5 w;
    public my1 x;
    public final j42 y;

    public ti5(j42 j42Var) {
        this.y = j42Var;
        j42Var.t = new si5(this, (byte) 0);
        this.r = "";
        this.n = true;
        this.v = new td1();
        this.x = new lc3((byte) 17);
        this.l = kq2.M(null);
        this.t = kq2.M(new cq4(0L));
        this.a = 9205357640488583168L;
        this.m = 1.0f;
        this.q = 1.0f;
        this.w = new si5(this, (byte) 1);
    }

    @Override // defpackage.li5
    public final void g(xd1 xd1Var) {
        v(xd1Var, 1.0f, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.r);
        sb.append("\n\tviewportWidth: ");
        tp3 tp3Var = this.t;
        sb.append(Float.intBitsToFloat((int) (((cq4) tp3Var.getValue()).g >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((cq4) tp3Var.getValue()).g & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    public final void v(xd1 xd1Var, float f, m30 m30Var) {
        int i;
        m30 m30Var2;
        nc ncVarN;
        char c;
        long j;
        long jY;
        m30 m30Var3;
        int i2;
        int i3;
        j42 j42Var = this.y;
        boolean z = j42Var.n;
        tp3 tp3Var = this.l;
        if (!z || j42Var.v == 16) {
            i = 0;
        } else {
            m30 m30Var4 = (m30) tp3Var.getValue();
            int i4 = fj5.g;
            if (!(m30Var4 instanceof m30) ? m30Var4 == null : (i3 = m30Var4.r) == 5 || i3 == 3) {
                i = 0;
            } else if (!(m30Var instanceof m30) ? m30Var == null : (i2 = m30Var.r) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.n;
        td1 td1Var = this.v;
        if (z2 || !cq4.g(this.a, xd1Var.n())) {
            if (i == 1) {
                jY = j42Var.v;
                int i5 = fj5.g;
                if (jj0.r(jY) != 1.0f) {
                    jY = jj0.y(1.0f, jY);
                }
                m30Var2 = new m30(5, jY);
            } else {
                m30Var2 = null;
            }
            this.j = m30Var2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (xd1Var.n() >> 32));
            tp3 tp3Var2 = this.t;
            this.m = fIntBitsToFloat / Float.intBitsToFloat((int) (((cq4) tp3Var2.getValue()).g >> 32));
            this.q = Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) / Float.intBitsToFloat((int) (((cq4) tp3Var2.getValue()).g & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (xd1Var.n() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L))))) & 4294967295L);
            fl2 layoutDirection = xd1Var.getLayoutDirection();
            ncVarN = td1Var.g;
            c9 c9Var = td1Var.y;
            if (ncVarN != null || c9Var == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = ncVarN.g;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || td1Var.n != i) {
                }
                td1Var.r = jCeil;
                pb0 pb0Var = td1Var.v;
                ob0 ob0Var = pb0Var.j;
                long jN = y94.N(jCeil);
                j51 j51Var = ob0Var.g;
                fl2 fl2Var = ob0Var.y;
                nb0 nb0Var = ob0Var.r;
                c9 c9Var2 = c9Var;
                long j2 = ob0Var.n;
                ob0Var.g = xd1Var;
                ob0Var.y = layoutDirection;
                ob0Var.r = c9Var2;
                ob0Var.n = jN;
                c9Var2.q();
                xd1.B(pb0Var, jj0.y, 0L, 0L, 0.0f, 62);
                this.w.a(pb0Var);
                c9Var2.t();
                ob0Var.g = j51Var;
                ob0Var.y = fl2Var;
                ob0Var.r = nb0Var;
                ob0Var.n = j2;
                ncVarN.g.prepareToDraw();
                this.n = false;
                this.a = xd1Var.n();
            }
            ncVarN = pw5.n((int) (jCeil >> c), (int) (jCeil & j), i);
            Canvas canvas = d9.g;
            c9Var = new c9();
            c9Var.g = new Canvas(y94.b(ncVarN));
            td1Var.g = ncVarN;
            td1Var.y = c9Var;
            td1Var.n = i;
            td1Var.r = jCeil;
            pb0 pb0Var2 = td1Var.v;
            ob0 ob0Var2 = pb0Var2.j;
            long jN2 = y94.N(jCeil);
            j51 j51Var2 = ob0Var2.g;
            fl2 fl2Var2 = ob0Var2.y;
            nb0 nb0Var2 = ob0Var2.r;
            c9 c9Var3 = c9Var;
            long j3 = ob0Var2.n;
            ob0Var2.g = xd1Var;
            ob0Var2.y = layoutDirection;
            ob0Var2.r = c9Var3;
            ob0Var2.n = jN2;
            c9Var3.q();
            xd1.B(pb0Var2, jj0.y, 0L, 0L, 0.0f, 62);
            this.w.a(pb0Var2);
            c9Var3.t();
            ob0Var2.g = j51Var2;
            ob0Var2.y = fl2Var2;
            ob0Var2.r = nb0Var2;
            ob0Var2.n = j3;
            ncVarN.g.prepareToDraw();
            this.n = false;
            this.a = xd1Var.n();
        } else {
            nc ncVar = td1Var.g;
            if (i != (ncVar != null ? ncVar.g() : 0)) {
                if (i == 1) {
                    jY = j42Var.v;
                    int i7 = fj5.g;
                    if (jj0.r(jY) != 1.0f) {
                        jY = jj0.y(1.0f, jY);
                    }
                    m30Var2 = new m30(5, jY);
                } else {
                    m30Var2 = null;
                }
                this.j = m30Var2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xd1Var.n() >> 32));
                tp3 tp3Var3 = this.t;
                this.m = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((cq4) tp3Var3.getValue()).g >> 32));
                this.q = Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) / Float.intBitsToFloat((int) (((cq4) tp3Var3.getValue()).g & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (xd1Var.n() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L))))) & 4294967295L);
                fl2 layoutDirection2 = xd1Var.getLayoutDirection();
                ncVarN = td1Var.g;
                c9 c9Var4 = td1Var.y;
                if (ncVarN != null) {
                    c = ' ';
                    j = 4294967295L;
                    ncVarN = pw5.n((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas2 = d9.g;
                    c9Var4 = new c9();
                    c9Var4.g = new Canvas(y94.b(ncVarN));
                    td1Var.g = ncVarN;
                    td1Var.y = c9Var4;
                    td1Var.n = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    ncVarN = pw5.n((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas3 = d9.g;
                    c9Var4 = new c9();
                    c9Var4.g = new Canvas(y94.b(ncVarN));
                    td1Var.g = ncVarN;
                    td1Var.y = c9Var4;
                    td1Var.n = i;
                }
                td1Var.r = jCeil2;
                pb0 pb0Var3 = td1Var.v;
                ob0 ob0Var3 = pb0Var3.j;
                long jN3 = y94.N(jCeil2);
                j51 j51Var3 = ob0Var3.g;
                fl2 fl2Var3 = ob0Var3.y;
                nb0 nb0Var3 = ob0Var3.r;
                c9 c9Var5 = c9Var4;
                long j4 = ob0Var3.n;
                ob0Var3.g = xd1Var;
                ob0Var3.y = layoutDirection2;
                ob0Var3.r = c9Var5;
                ob0Var3.n = jN3;
                c9Var5.q();
                xd1.B(pb0Var3, jj0.y, 0L, 0L, 0.0f, 62);
                this.w.a(pb0Var3);
                c9Var5.t();
                ob0Var3.g = j51Var3;
                ob0Var3.y = fl2Var3;
                ob0Var3.r = nb0Var3;
                ob0Var3.n = j4;
                ncVarN.g.prepareToDraw();
                this.n = false;
                this.a = xd1Var.n();
            }
        }
        if (m30Var != null) {
            m30Var3 = m30Var;
        } else {
            m30Var3 = ((m30) tp3Var.getValue()) != null ? (m30) tp3Var.getValue() : this.j;
        }
        nc ncVar2 = td1Var.g;
        if (ncVar2 == null) {
            mc2.y("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        xd1.X(xd1Var, ncVar2, td1Var.r, 0L, f, m30Var3, 0, 858);
    }
}
