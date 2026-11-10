package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p8 {
    public Object a;
    public final Object c;
    public final Object g;
    public final Object j;
    public final Object l;
    public Object m;
    public final Object n;
    public Object q;
    public final Object r;
    public final Object t;
    public Object v;
    public final Object w;
    public final Object x;
    public final Object y;

    public p8(yo4 yo4Var, tz2 tz2Var, my1 my1Var, m63 m63Var, xy1 xy1Var) {
        this.g = tz2Var;
        this.y = my1Var;
        this.r = m63Var;
        this.n = xy1Var;
        this.v = new kf2();
        this.x = new rk4(this);
        this.l = kq2.M(yo4Var);
        this.a = pt4.y(new d8(this, (byte) 0));
        this.m = pt4.y(new d8(this, (byte) 1));
        this.q = new pp3(Float.NaN);
        pt4.r(new d8(this, (byte) 2));
        this.w = new pp3(0.0f);
        this.j = kq2.M(null);
        this.t = kq2.M(new i13(qi1.j));
        this.c = new l8(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object g(ub3 ub3Var, n8 n8Var, ou0 ou0Var) {
        f8 f8Var;
        pp3 pp3Var = (pp3) this.q;
        xy1 xy1Var = (xy1) this.n;
        if (ou0Var instanceof f8) {
            f8Var = (f8) ou0Var;
            int i = f8Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                f8Var.w = i - Integer.MIN_VALUE;
            } else {
                f8Var = new f8(this, ou0Var);
            }
        } else {
            f8Var = new f8(this, ou0Var);
        }
        Object obj = f8Var.m;
        int i2 = f8Var.w;
        try {
            if (i2 == 0) {
                js2.o(obj);
                kf2 kf2Var = (kf2) this.v;
                mu0 mu0Var = null;
                h8 h8Var = new h8(this, n8Var, mu0Var, (byte) 0);
                f8Var.w = 1;
                kf2Var.getClass();
                Object objB = k33.B(new jf2(ub3Var, kf2Var, h8Var, mu0Var, (byte) 0), f8Var);
                px0 px0Var = px0.j;
                if (objB == px0Var) {
                    return px0Var;
                }
            } else {
                if (i2 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
            }
            Object objG = n().g(pp3Var.d());
            if (objG != null && Math.abs(pp3Var.d() - n().n(objG)) <= 0.5f && ((Boolean) xy1Var.a(objG)).booleanValue()) {
                l(objG);
            }
            return og5.g;
        } catch (Throwable th) {
            Object objG2 = n().g(pp3Var.d());
            if (objG2 == null || Math.abs(pp3Var.d() - n().n(objG2)) > 0.5f || !((Boolean) xy1Var.a(objG2)).booleanValue()) {
                throw th;
            }
            l(objG2);
            throw th;
        }
    }

    public void j(Object obj) {
        ((tp3) this.j).setValue(obj);
    }

    public void l(Object obj) {
        ((tp3) this.l).setValue(obj);
    }

    public i13 n() {
        return (i13) ((tp3) this.t).getValue();
    }

    public Object r(float f, float f2, Object obj) {
        tz2 tz2Var = (tz2) this.g;
        i13 i13VarN = n();
        float fN = i13VarN.n(obj);
        float fFloatValue = ((Number) ((my1) this.y).g()).floatValue();
        if (fN != f && !Float.isNaN(fN)) {
            if (fN < f) {
                if (f2 >= fFloatValue) {
                    Object objY = i13VarN.y(f, true);
                    objY.getClass();
                    return objY;
                }
                Object objY2 = i13VarN.y(f, true);
                objY2.getClass();
                if (f >= Math.abs(Math.abs(((Number) tz2Var.a(Float.valueOf(Math.abs(i13VarN.n(objY2) - fN)))).floatValue()) + fN)) {
                    return objY2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objY3 = i13VarN.y(f, false);
                    objY3.getClass();
                    return objY3;
                }
                Object objY4 = i13VarN.y(f, false);
                objY4.getClass();
                float fAbs = Math.abs(fN - Math.abs(((Number) tz2Var.a(Float.valueOf(Math.abs(fN - i13VarN.n(objY4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objY4;
                }
            }
        }
        return obj;
    }

    public float v(float f) {
        Float fValueOf;
        pp3 pp3Var = (pp3) this.q;
        float fD = (Float.isNaN(pp3Var.d()) ? 0.0f : pp3Var.d()) + f;
        float fR = n().r();
        Collection collectionValues = n().g.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return xs2.q(fD, fR, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public float x() {
        pp3 pp3Var = (pp3) this.q;
        if (!Float.isNaN(pp3Var.d())) {
            return pp3Var.d();
        }
        l0.z("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public Object y(Object obj, ub3 ub3Var, dz1 dz1Var, ou0 ou0Var) {
        i8 i8Var;
        pp3 pp3Var = (pp3) this.q;
        xy1 xy1Var = (xy1) this.n;
        if (ou0Var instanceof i8) {
            i8Var = (i8) ou0Var;
            int i = i8Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                i8Var.w = i - Integer.MIN_VALUE;
            } else {
                i8Var = new i8(this, ou0Var);
            }
        } else {
            i8Var = new i8(this, ou0Var);
        }
        i8 i8Var2 = i8Var;
        Object obj2 = i8Var2.m;
        int i2 = i8Var2.w;
        mu0 mu0Var = null;
        try {
            if (i2 == 0) {
                js2.o(obj2);
                if (n().g.containsKey(obj)) {
                    kf2 kf2Var = (kf2) this.v;
                    try {
                        k8 k8Var = new k8((Object) this, obj, (Object) dz1Var, mu0Var, (byte) 0);
                        i8Var2.w = 1;
                        kf2Var.getClass();
                        Object objB = k33.B(new jf2(ub3Var, kf2Var, k8Var, mu0Var, (byte) 0), i8Var2);
                        px0 px0Var = px0.j;
                        if (objB == px0Var) {
                            return px0Var;
                        }
                    } catch (Throwable th) {
                        th = th;
                        mu0Var = null;
                        j(mu0Var);
                        Object objG = n().g(pp3Var.d());
                        if (objG != null && Math.abs(pp3Var.d() - n().n(objG)) <= 0.5f && ((Boolean) xy1Var.a(objG)).booleanValue()) {
                            l(objG);
                        }
                        throw th;
                    }
                } else {
                    l(obj);
                }
                return og5.g;
            }
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj2);
            j(null);
            Object objG2 = n().g(pp3Var.d());
            if (objG2 != null && Math.abs(pp3Var.d() - n().n(objG2)) <= 0.5f && ((Boolean) xy1Var.a(objG2)).booleanValue()) {
                l(objG2);
            }
            return og5.g;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p8(RecyclerView recyclerView, fa4 fa4Var, ql2 ql2Var, aj6 aj6Var) {
        this.v = new ui4(0 == true ? 1 : 0);
        this.x = new m46();
        this.t = new bi6((byte) 20);
        this.w = new int[]{1};
        this.c = new int[]{3};
        xs2.l(recyclerView != null);
        this.g = recyclerView;
        this.r = recyclerView.getContext();
        p44 adapter = recyclerView.getAdapter();
        this.y = adapter;
        xs2.l(adapter != null);
        xs2.l(ql2Var != null);
        this.j = ql2Var;
        this.l = fa4Var;
        this.n = aj6Var;
        new t32(recyclerView, ql2Var);
    }
}
