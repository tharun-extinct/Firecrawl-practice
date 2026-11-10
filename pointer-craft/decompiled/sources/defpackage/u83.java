package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u83 extends ph3 {
    public iv4 j;
    public final m70 l;
    public final v92 x;

    public u83(ng4 ng4Var, v92 v92Var, cg4 cg4Var, j51 j51Var) {
        super(ng4Var, cg4Var, j51Var);
        this.x = v92Var;
        this.l = v70.y(Integer.MAX_VALUE, 6, null);
    }

    public static q83 a(m70 m70Var) {
        q83 q83Var = null;
        ck4 ck4VarD = lr2.d(new qh3(new p83(m70Var, (byte) 0), null));
        while (ck4VarD.hasNext()) {
            q83 q83VarG = (q83) ck4VarD.next();
            if (q83Var != null) {
                q83VarG = q83Var.g(q83VarG);
            }
            q83Var = q83VarG;
        }
        return q83Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object x(u83 u83Var, u54 u54Var, r54 r54Var, ng4 ng4Var, u54 u54Var2, long j, ou0 ou0Var) throws Throwable {
        t83 t83Var;
        r54 r54Var2;
        ng4 ng4Var2;
        u54 u54Var3;
        boolean z;
        if (ou0Var instanceof t83) {
            t83Var = (t83) ou0Var;
            int i = t83Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                t83Var.s = i - Integer.MIN_VALUE;
            } else {
                t83Var = new t83(ou0Var);
            }
        } else {
            t83Var = new t83(ou0Var);
        }
        Object objE = t83Var.b;
        int i2 = t83Var.s;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(objE);
            if (j < 0) {
                return Boolean.FALSE;
            }
            dy dyVar = new dy((Object) u83Var, mu0Var, (byte) 21);
            t83Var.m = u83Var;
            t83Var.q = u54Var;
            t83Var.w = r54Var;
            t83Var.c = ng4Var;
            t83Var.i = u54Var2;
            t83Var.s = 1;
            objE = br2.E(j, dyVar, t83Var);
            px0 px0Var = px0.j;
            if (objE == px0Var) {
                return px0Var;
            }
            r54Var2 = r54Var;
            ng4Var2 = ng4Var;
            u54Var3 = u54Var2;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u54 u54Var4 = t83Var.i;
            ng4 ng4Var3 = t83Var.c;
            r54Var2 = t83Var.w;
            u54 u54Var5 = t83Var.q;
            u83 u83Var2 = t83Var.m;
            js2.o(objE);
            u54Var3 = u54Var4;
            ng4Var2 = ng4Var3;
            u54Var = u54Var5;
            u83Var = u83Var2;
        }
        q83 q83Var = (q83) objE;
        if (q83Var != null) {
            boolean z2 = ((q83) u54Var.j).r;
            long j2 = q83Var.g;
            u54Var.j = new q83(j2, q83Var.y, z2);
            r54Var2.j = ng4Var2.a(ng4Var2.x(j2));
            u54Var3.j = v70.g(0.0f, 0.0f, 30);
            cd2 cd2Var = u83Var.v;
            long j3 = q83Var.y;
            long j4 = q83Var.g;
            ((xj5) cd2Var.t).g(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((xj5) cd2Var.a).g(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !fb6.v(r54Var2.j);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void j(ju3 ju3Var, ku3 ku3Var, long j) {
        if (ju3Var.x == 6) {
            List list = ju3Var.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((qu3) list.get(i)).q()) {
                    return;
                }
            }
            if (ku3Var == ku3.j && this.n) {
                l(ju3Var);
                ph3.g(ju3Var);
            }
            if (ku3Var == ku3.t && !this.n && l(ju3Var)) {
                ph3.g(ju3Var);
            }
        }
    }

    public final boolean l(ju3 ju3Var) {
        long j;
        j51 j51Var = this.r;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.x.t;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? tm.l(viewConfiguration) : j51Var.e(64.0f));
        float f2 = -(i > 26 ? tm.r(viewConfiguration) : j51Var.e(64.0f));
        List list = ju3Var.g;
        wi3 wi3Var = new wi3(0L);
        int size = list.size();
        boolean zR = false;
        int i2 = 0;
        while (true) {
            j = wi3Var.g;
            if (i2 >= size) {
                break;
            }
            wi3Var = new wi3(wi3.v(j, ((qu3) list.get(i2)).a));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        ng4 ng4Var = this.g;
        float fA = ng4Var.a(ng4Var.x(jFloatToRawIntBits));
        if (fA != 0.0f) {
            gg4 gg4Var = ng4Var.g;
            zR = fA > 0.0f ? gg4Var.r() : gg4Var.g();
        }
        if (zR) {
            return !(this.l.z(new q83(jFloatToRawIntBits, ((qu3) cj0.j0(ju3Var.g)).y, false)) instanceof kd0);
        }
        return this.n;
    }

    public final float n(lg4 lg4Var, float f) {
        ng4 ng4Var = this.g;
        long jT = ng4Var.t(ng4Var.v(f));
        ng4 ng4Var2 = lg4Var.g;
        return ng4Var.j(ng4Var.x(ng4Var2.n(ng4Var2.m, jT, 1)));
    }

    public final void t(ox0 ox0Var) {
        if (this.j == null) {
            this.j = m50.T(ox0Var, null, new b8(this, null, (byte) 8), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object v(ng4 ng4Var, q83 q83Var, float f, float f2, ou0 ou0Var) {
        r83 r83Var;
        og5 og5Var;
        u54 u54Var;
        Object obj;
        r54 r54Var;
        float f3;
        ng4 ng4Var2;
        long jG;
        if (ou0Var instanceof r83) {
            r83Var = (r83) ou0Var;
            int i = r83Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                r83Var.b = i - Integer.MIN_VALUE;
            } else {
                r83Var = new r83(this, ou0Var);
            }
        } else {
            r83Var = new r83(this, ou0Var);
        }
        r83 r83Var2 = r83Var;
        Object obj2 = r83Var2.c;
        int i2 = r83Var2.b;
        cd2 cd2Var = this.v;
        og5 og5Var2 = og5.g;
        Object obj3 = px0.j;
        if (i2 == 0) {
            js2.o(obj2);
            u54 u54Var2 = new u54();
            u54Var2.j = q83Var;
            og5Var = og5Var2;
            long j = q83Var.y;
            long j2 = q83Var.g;
            ((xj5) cd2Var.t).g(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((xj5) cd2Var.a).g(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            q83 q83VarA = a(this.l);
            if (q83VarA != null) {
                long j3 = q83VarA.y;
                long j4 = q83VarA.g;
                ((xj5) cd2Var.t).g(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((xj5) cd2Var.a).g(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                u54Var = u54Var2;
                u54Var.j = ((q83) u54Var.j).g(q83VarA);
            } else {
                u54Var = u54Var2;
            }
            r54 r54Var2 = new r54();
            float fJ = ng4Var.j(ng4Var.x(((q83) u54Var.j).g));
            r54Var2.j = fJ;
            if (!fb6.v(fJ)) {
                u54 u54Var3 = new u54();
                u54Var3.j = v70.g(0.0f, 0.0f, 30);
                obj = obj3;
                bz1 s83Var = new s83(r54Var2, u54Var3, u54Var, f, this, f2, ng4Var, null);
                r83Var2.m = ng4Var;
                r83Var2.q = r54Var2;
                r83Var2.w = f2;
                r83Var2.b = 1;
                if (r(s83Var, r83Var2) != obj) {
                    r54Var = r54Var2;
                    f3 = f2;
                    ng4Var2 = ng4Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                js2.o(obj2);
                return og5Var2;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = r83Var2.w;
        r54Var = r83Var2.q;
        ng4Var2 = r83Var2.m;
        js2.o(obj2);
        obj = obj3;
        og5Var = og5Var2;
        long jG2 = d06.g(((xj5) cd2Var.t).r(Float.MAX_VALUE), ((xj5) cd2Var.a).r(Float.MAX_VALUE));
        if (vj5.r(jG2)) {
            float fV = ng4Var2.v(Math.signum(r54Var.j)) * Math.min(Math.abs(r54Var.j) / 100.0f, f3) * 1000.0f;
            if (fV == 0.0f) {
                jG = 0;
            } else {
                jG = ng4Var2.n == um3.t ? d06.g(fV, 0.0f) : d06.g(0.0f, fV);
            }
            jG2 = jG;
        }
        vj5 vj5Var = new vj5(jG2);
        r83Var2.m = null;
        r83Var2.q = null;
        r83Var2.b = 2;
        return this.y.l(vj5Var, r83Var2) == obj ? obj : og5Var;
    }
}
