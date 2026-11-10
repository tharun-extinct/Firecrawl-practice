package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class tb {
    public final j51 g;
    public long j;
    public long l;
    public final tp3 n;
    public final ig1 r;
    public final p41 t;
    public final boolean v;
    public boolean x;
    public long y = 9205357640488583168L;

    public tb(Context context, j51 j51Var, long j, bo3 bo3Var) {
        this.g = j51Var;
        ig1 ig1Var = new ig1(context, ra.U(j));
        this.r = ig1Var;
        this.n = new tp3(og5.g, hi0.B);
        this.v = true;
        this.l = 0L;
        this.j = -1L;
        sb sbVar = new sb(this, (byte) 0);
        ju3 ju3Var = b05.g;
        g05 g05Var = new g05(null, null, sbVar);
        this.t = Build.VERSION.SDK_INT >= 31 ? new px4(g05Var, this, ig1Var) : new h32(g05Var, this, ig1Var, bo3Var);
    }

    public final void a(long j) {
        boolean zG = cq4.g(this.l, 0L);
        boolean zG2 = cq4.g(j, this.l);
        this.l = j;
        if (!zG2) {
            int iZ = k33.Z(Float.intBitsToFloat((int) (j >> 32)));
            long jZ = (((long) k33.Z(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iZ) << 32);
            ig1 ig1Var = this.r;
            ig1Var.r = jZ;
            EdgeEffect edgeEffect = ig1Var.n;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jZ >> 32), (int) (jZ & 4294967295L));
            }
            EdgeEffect edgeEffect2 = ig1Var.v;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jZ >> 32), (int) (jZ & 4294967295L));
            }
            EdgeEffect edgeEffect3 = ig1Var.x;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jZ & 4294967295L), (int) (jZ >> 32));
            }
            EdgeEffect edgeEffect4 = ig1Var.l;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jZ & 4294967295L), (int) (jZ >> 32));
            }
            EdgeEffect edgeEffect5 = ig1Var.j;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jZ >> 32), (int) (jZ & 4294967295L));
            }
            EdgeEffect edgeEffect6 = ig1Var.t;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jZ >> 32), (int) (jZ & 4294967295L));
            }
            EdgeEffect edgeEffect7 = ig1Var.a;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jZ & 4294967295L), (int) (jZ >> 32));
            }
            EdgeEffect edgeEffect8 = ig1Var.m;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jZ), (int) (jZ >> 32));
            }
        }
        if (zG || zG2) {
            return;
        }
        g();
    }

    public final void g() {
        boolean z;
        ig1 ig1Var = this.r;
        EdgeEffect edgeEffect = ig1Var.n;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = ig1Var.v;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = ig1Var.x;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = ig1Var.l;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            n();
        }
    }

    public final float j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.l >> 32));
        EdgeEffect edgeEffectN = this.r.n();
        return cf6.r(edgeEffectN) == 0.0f ? Float.intBitsToFloat((int) (this.l >> 32)) * (-cf6.v(edgeEffectN, -fIntBitsToFloat2, fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    public final float l(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.l >> 32));
        EdgeEffect edgeEffectR = this.r.r();
        return cf6.r(edgeEffectR) == 0.0f ? Float.intBitsToFloat((int) (this.l >> 32)) * cf6.v(edgeEffectR, fIntBitsToFloat2, 1.0f - fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    public final void n() {
        if (this.v) {
            this.n.setValue(og5.g);
        }
    }

    public final long r() {
        long jV = this.y;
        if ((9223372034707292159L & jV) == 9205357640488583168L) {
            jV = mq2.v(this.l);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jV >> 32)) / Float.intBitsToFloat((int) (this.l >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jV & 4294967295L)) / Float.intBitsToFloat((int) (this.l & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final float t(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.l & 4294967295L));
        EdgeEffect edgeEffectV = this.r.v();
        return cf6.r(edgeEffectV) == 0.0f ? Float.intBitsToFloat((int) (this.l & 4294967295L)) * cf6.v(edgeEffectV, fIntBitsToFloat2, fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    public final boolean v() {
        ig1 ig1Var = this.r;
        EdgeEffect edgeEffect = ig1Var.n;
        if (edgeEffect != null && cf6.r(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = ig1Var.v;
        if (edgeEffect2 != null && cf6.r(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = ig1Var.x;
        if (edgeEffect3 != null && cf6.r(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = ig1Var.l;
        return (edgeEffect4 == null || cf6.r(edgeEffect4) == 0.0f) ? false : true;
    }

    public final float x(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.l & 4294967295L));
        EdgeEffect edgeEffectY = this.r.y();
        return cf6.r(edgeEffectY) == 0.0f ? Float.intBitsToFloat((int) (this.l & 4294967295L)) * (-cf6.v(edgeEffectY, -fIntBitsToFloat2, 1.0f - fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object y(long j, bz1 bz1Var, ou0 ou0Var) {
        qb qbVar;
        float fG;
        float fG2;
        long j2;
        if (ou0Var instanceof qb) {
            qbVar = (qb) ou0Var;
            int i = qbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qbVar.c = i - Integer.MIN_VALUE;
            } else {
                qbVar = new qb(this, ou0Var);
            }
        } else {
            qbVar = new qb(this, ou0Var);
        }
        Object objL = qbVar.q;
        int i2 = qbVar.c;
        og5 og5Var = og5.g;
        ig1 ig1Var = this.r;
        if (i2 == 0) {
            js2.o(objL);
            boolean zR = cq4.r(this.l);
            Object obj = px0.j;
            if (zR) {
                Object objG = vj5.g(j);
                qbVar.c = 1;
                if (bz1Var.l(objG, qbVar) != obj) {
                    return og5Var;
                }
            } else {
                boolean zL = ig1.l(ig1Var.x);
                j51 j51Var = this.g;
                if (!zL || vj5.n(j) >= 0.0f) {
                    fG = (!ig1.l(ig1Var.l) || vj5.n(j) <= 0.0f) ? 0.0f : -cf6.g(ig1Var.n(), -vj5.n(j), Float.intBitsToFloat((int) (this.l >> 32)), j51Var);
                } else {
                    fG = cf6.g(ig1Var.r(), vj5.n(j), Float.intBitsToFloat((int) (this.l >> 32)), j51Var);
                }
                if (!ig1.l(ig1Var.n) || vj5.v(j) >= 0.0f) {
                    fG2 = (!ig1.l(ig1Var.v) || vj5.v(j) <= 0.0f) ? 0.0f : -cf6.g(ig1Var.y(), -vj5.v(j), Float.intBitsToFloat((int) (4294967295L & this.l)), j51Var);
                } else {
                    fG2 = cf6.g(ig1Var.v(), vj5.v(j), Float.intBitsToFloat((int) (4294967295L & this.l)), j51Var);
                }
                long jG = d06.g(fG, fG2);
                if (!vj5.r(jG)) {
                    n();
                }
                long jX = vj5.x(j, jG);
                Object objG2 = vj5.g(jX);
                qbVar.m = jX;
                qbVar.c = 2;
                objL = bz1Var.l(objG2, qbVar);
                if (objL != obj) {
                    j2 = jX;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            js2.o(objL);
            return og5Var;
        }
        if (i2 != 2) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = qbVar.m;
        js2.o(objL);
        long jX2 = vj5.x(j2, ((vj5) objL).a());
        this.x = false;
        if (vj5.n(jX2) > 0.0f) {
            cf6.n(ig1Var.r(), k33.Z(vj5.n(jX2)));
        } else if (vj5.n(jX2) < 0.0f) {
            cf6.n(ig1Var.n(), -k33.Z(vj5.n(jX2)));
        }
        if (vj5.v(jX2) > 0.0f) {
            cf6.n(ig1Var.v(), k33.Z(vj5.v(jX2)));
        } else if (vj5.v(jX2) < 0.0f) {
            cf6.n(ig1Var.y(), -k33.Z(vj5.v(jX2)));
        }
        g();
        return og5Var;
    }
}
