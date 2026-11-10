package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g05 extends i73 implements vu3, j51, tu3 {
    public final rb3 A;
    public final rb3 B;
    public final rb3 C;
    public ju3 D;
    public long E;
    public iv4 d;
    public ju3 e = b05.g;
    public Object f;
    public PointerInputEventHandler k;
    public Object o;

    public g05(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.o = obj;
        this.f = obj2;
        this.k = pointerInputEventHandler;
        rb3 rb3Var = new rb3(new f05[16]);
        this.A = rb3Var;
        this.B = rb3Var;
        this.C = new rb3(new f05[16]);
        this.E = 0L;
    }

    @Override // defpackage.i73
    public final void J0() {
        S0();
    }

    @Override // defpackage.tu3
    public final void L(ju3 ju3Var, ku3 ku3Var, long j) {
        this.E = j;
        if (ku3Var == ku3.j) {
            this.e = ju3Var;
        }
        mu0 mu0Var = null;
        if (this.d == null) {
            this.d = m50.T(E0(), null, new a90(this, mu0Var, (byte) 4), 1);
        }
        R0(ju3Var, ku3Var);
        List list = ju3Var.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!fd6.n((qu3) list.get(i))) {
                this.D = ju3Var;
            }
        }
        ju3Var = null;
        this.D = ju3Var;
    }

    public final Object Q0(bz1 bz1Var, mu0 mu0Var) {
        ib0 ib0Var = new ib0(1, pw5.o(mu0Var));
        ib0Var.o();
        f05 f05Var = new f05(this, ib0Var);
        synchronized (this.B) {
            this.A.y(f05Var);
            new gc4(pw5.o(pw5.q(f05Var, f05Var, bz1Var))).j(og5.g);
        }
        ib0Var.k(new ce(f05Var, (byte) 7));
        return ib0Var.z();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x000d, B:13:0x001c, B:14:0x0021, B:17:0x0024, B:20:0x0030, B:22:0x0038, B:24:0x003c, B:25:0x0041, B:26:0x0044, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    public final void R0(ju3 ju3Var, ku3 ku3Var) {
        Object[] objArr;
        int i;
        f05 f05Var;
        ib0 ib0Var;
        ib0 ib0Var2;
        synchronized (this.B) {
            rb3 rb3Var = this.C;
            rb3Var.n(rb3Var.a, this.A);
        }
        try {
            int iOrdinal = ku3Var.ordinal();
            if (iOrdinal == 0) {
                rb3 rb3Var2 = this.C;
                objArr = rb3Var2.j;
                i = rb3Var2.a;
                for (int i2 = 0; i2 < i; i2++) {
                    f05Var = (f05) objArr[i2];
                    if (ku3Var != f05Var.m && (ib0Var = f05Var.a) != null) {
                        f05Var.a = null;
                        ib0Var.j(ju3Var);
                    }
                }
            } else if (iOrdinal == 1) {
                rb3 rb3Var3 = this.C;
                int i3 = rb3Var3.a - 1;
                Object[] objArr2 = rb3Var3.j;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        f05 f05Var2 = (f05) objArr2[i3];
                        if (ku3Var == f05Var2.m && (ib0Var2 = f05Var2.a) != null) {
                            f05Var2.a = null;
                            ib0Var2.j(ju3Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new il0(false);
                }
                rb3 rb3Var4 = this.C;
                objArr = rb3Var4.j;
                i = rb3Var4.a;
                while (i2 < i) {
                    f05Var = (f05) objArr[i2];
                    if (ku3Var != f05Var.m) {
                    }
                }
            }
            this.C.j();
        } catch (Throwable th) {
            this.C.j();
            throw th;
        }
    }

    public final void S0() {
        iv4 iv4Var = this.d;
        if (iv4Var != null) {
            iv4Var.K(new uu3());
            this.d = null;
        }
    }

    @Override // defpackage.o41, defpackage.tu3
    public final void g() {
        S0();
    }

    @Override // defpackage.tu3
    public final void i0() {
        S0();
    }

    @Override // defpackage.tu3
    public final void m0() {
        ju3 ju3Var = this.D;
        if (ju3Var == null) {
            return;
        }
        List list = ju3Var.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((qu3) list.get(i)).x()) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    qu3 qu3Var = (qu3) list.get(i2);
                    arrayList.add(new qu3(qu3Var.n(), qu3Var.m(), qu3Var.v(), qu3Var.l(), qu3Var.m(), qu3Var.v(), qu3Var.x(), qu3Var.x(), qu3Var.a()));
                }
                ju3 ju3Var2 = new ju3(arrayList, null);
                this.e = ju3Var2;
                R0(ju3Var2, ku3.j);
                R0(ju3Var2, ku3.t);
                R0(ju3Var2, ku3.a);
                this.D = null;
                return;
            }
        }
    }

    @Override // defpackage.j51
    public final float w() {
        return k33.V(this).F.w();
    }

    @Override // defpackage.j51
    public final float y() {
        return k33.V(this).F.y();
    }
}
