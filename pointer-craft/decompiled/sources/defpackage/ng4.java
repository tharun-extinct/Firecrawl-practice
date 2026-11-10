package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ng4 {
    public gg4 g;
    public final bg4 j;
    public final fg4 l;
    public um3 n;
    public bq1 r;
    public boolean t;
    public boolean v;
    public ag3 x;
    public tb y;
    public byte a = 1;
    public pf4 m = yf4.g;
    public final lg4 q = new lg4(this);
    public final s94 w = new s94(this, 3);

    public ng4(gg4 gg4Var, tb tbVar, bq1 bq1Var, um3 um3Var, boolean z, ag3 ag3Var, fg4 fg4Var, bg4 bg4Var) {
        this.g = gg4Var;
        this.y = tbVar;
        this.r = bq1Var;
        this.n = um3Var;
        this.v = z;
        this.x = ag3Var;
        this.l = fg4Var;
        this.j = bg4Var;
    }

    public final float a(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        um3 um3Var = this.n;
        if (dAtan2 >= 0.7853981633974483d) {
            if (um3Var == um3.j) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (um3Var == um3.t) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(long j, ou0 ou0Var) throws Throwable {
        jg4 jg4Var;
        ng4 ng4Var;
        Throwable th;
        t54 t54Var;
        if (ou0Var instanceof jg4) {
            jg4Var = (jg4) ou0Var;
            int i = jg4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jg4Var.c = i - Integer.MIN_VALUE;
            } else {
                jg4Var = new jg4(this, ou0Var);
            }
        } else {
            jg4Var = new jg4(this, ou0Var);
        }
        Object obj = jg4Var.q;
        int i2 = jg4Var.c;
        if (i2 != 0) {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t54Var = jg4Var.m;
            try {
                js2.o(obj);
                ng4Var = this;
                ng4Var.t = false;
                return vj5.g(t54Var.j);
            } catch (Throwable th2) {
                th = th2;
                ng4Var = this;
                ng4Var.t = false;
                throw th;
            }
        }
        js2.o(obj);
        t54 t54Var2 = new t54();
        t54Var2.j = j;
        this.t = true;
        try {
            ub3 ub3Var = ub3.j;
            ng4Var = this;
            try {
                kg4 kg4Var = new kg4(ng4Var, t54Var2, j, null);
                jg4Var.m = t54Var2;
                jg4Var.c = 1;
                Object objL = ng4Var.l(ub3Var, kg4Var, jg4Var);
                px0 px0Var = px0.j;
                if (objL == px0Var) {
                    return px0Var;
                }
                t54Var = t54Var2;
                ng4Var.t = false;
                return vj5.g(t54Var.j);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                ng4Var.t = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            ng4Var = this;
        }
    }

    public final float j(long j) {
        return Float.intBitsToFloat((int) (this.n == um3.t ? j >> 32 : j & 4294967295L));
    }

    public final Object l(ub3 ub3Var, bz1 bz1Var, ou0 ou0Var) {
        Object objN = this.g.n(ub3Var, new u03(this, bz1Var, null, (byte) 4), ou0Var);
        return objN == px0.j ? objN : og5.g;
    }

    public final long n(pf4 pf4Var, long j, int i) {
        eg3 eg3Var = this.x.g;
        eg3 eg3VarR0 = eg3Var != null ? eg3Var.R0() : null;
        long jT0 = eg3VarR0 != null ? eg3VarR0.t0(i, j) : 0L;
        long jN = wi3.n(j, jT0);
        long jX = x(t(pf4Var.g(j(x(this.n == um3.t ? wi3.g(jN, 0.0f, 1) : wi3.g(jN, 0.0f, 2))))));
        fg4 fg4Var = this.l;
        if (fg4Var.h) {
            ViewTreeObserver viewTreeObserver = ((ba) k33.W(fg4Var)).getViewTreeObserver();
            try {
                Method declaredMethod = ba.U0;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ba.U0 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jN2 = wi3.n(jN, jX);
        eg3 eg3Var2 = this.x.g;
        eg3 eg3VarR1 = eg3Var2 != null ? eg3Var2.R0() : null;
        return wi3.v(wi3.v(jT0, jX), eg3VarR1 != null ? eg3VarR1.Q(i, jX, jN2) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public final Object r(long j, boolean z, zz4 zz4Var) {
        int i;
        long jY;
        mg4 mg4Var;
        tb tbVar;
        px0 px0Var;
        Object objL;
        if (z) {
            bq1 bq1Var = this.r;
            wf4 wf4Var = yf4.g;
            if (!(bq1Var instanceof t11)) {
                if (this.n == um3.t) {
                    i = 1;
                } else {
                    i = 2;
                }
                jY = vj5.y(j, 0.0f, 0.0f, i);
                mg4Var = new mg4(this, null);
                tbVar = this.y;
                px0Var = px0.j;
                if (tbVar == null && y()) {
                    Object objY = tbVar.y(jY, mg4Var, zz4Var);
                    if (objY == px0Var) {
                        return objY;
                    }
                } else {
                    objL = mg4Var.l(vj5.g(jY), zz4Var);
                    if (objL == px0Var) {
                        return objL;
                    }
                }
            }
        } else {
            if (this.n == um3.t) {
                i = 1;
            } else {
                i = 2;
            }
            jY = vj5.y(j, 0.0f, 0.0f, i);
            mg4Var = new mg4(this, null);
            tbVar = this.y;
            px0Var = px0.j;
            if (tbVar == null) {
                objL = mg4Var.l(vj5.g(jY), zz4Var);
                if (objL == px0Var) {
                    return objL;
                }
            } else {
                objL = mg4Var.l(vj5.g(jY), zz4Var);
                if (objL == px0Var) {
                    return objL;
                }
            }
        }
        return og5.g;
    }

    public final long t(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.n == um3.t) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float v(float f) {
        return this.v ? f * (-1.0f) : f;
    }

    public final long x(long j) {
        return this.v ? wi3.x(-1.0f, j) : j;
    }

    public final boolean y() {
        tb tbVar;
        return this.g.r() || this.g.g() || ((tbVar = this.y) != null && tbVar.v());
    }
}
