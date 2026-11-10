package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class ie extends i73 implements zo0, wd1, xk2 {
    public gw4 A;
    public float B;
    public boolean D;
    public i94 F;
    public j94 G;
    public final b51 d;
    public final a51 e;
    public final boolean f;
    public final float k;
    public final ve2 o;
    public long C = 0;
    public final xa3 E = new xa3();

    public ie(ve2 ve2Var, boolean z, float f, b51 b51Var, a51 a51Var) {
        this.o = ve2Var;
        this.f = z;
        this.k = f;
        this.d = b51Var;
        this.e = a51Var;
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.i73
    public final void I0() {
        m50.T(E0(), null, new op((Object) this, (mu0) null, (byte) 13), 3);
    }

    @Override // defpackage.i73
    public final void J0() {
        i94 i94Var = this.F;
        if (i94Var != null) {
            i94Var.g(this);
        }
    }

    public final void Q0(ox3 ox3Var) {
        j94 j94Var;
        if (!(ox3Var instanceof mx3)) {
            if (ox3Var instanceof nx3) {
                j94 j94Var2 = this.G;
                if (j94Var2 != null) {
                    j94Var2.n();
                    return;
                }
                return;
            }
            if (!(ox3Var instanceof lx3) || (j94Var = this.G) == null) {
                return;
            }
            j94Var.n();
            return;
        }
        mx3 mx3Var = (mx3) ox3Var;
        long j = this.C;
        float f = this.B;
        i94 i94Var = this.F;
        if (i94Var == null) {
            Object obj = (View) v70.b(this, sa.x);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    uo1.C(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i94 i94Var2 = new i94(viewGroup.getContext());
                    viewGroup.addView(i94Var2);
                    i94Var = i94Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof i94) {
                        i94Var = (i94) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.F = i94Var;
        }
        j94 j94VarY = i94Var.y(this);
        int iZ = k33.Z(f);
        long jG = this.d.g();
        this.e.g();
        j94VarY.y(mx3Var, this.f, j, iZ, jG, 0.1f, new qd((Object) this, (byte) 1));
        this.G = j94VarY;
        c93.A(this);
    }

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        wm2Var.g();
        gw4 gw4Var = this.A;
        if (gw4Var != null) {
            gw4Var.g(wm2Var, this.B, this.d.g());
        }
        nb0 nb0VarB = wm2Var.j.t.b();
        j94 j94Var = this.G;
        if (j94Var != null) {
            long j = this.C;
            int iZ = k33.Z(this.B);
            long jG = this.d.g();
            this.e.g();
            j94Var.v(j, iZ, jG, 0.1f);
            j94Var.draw(d9.g(nb0VarB));
        }
    }

    @Override // defpackage.xk2, defpackage.x33
    public final void r(long j) {
        float fE;
        this.D = true;
        j51 j51Var = k33.V(this).F;
        this.C = y94.N(j);
        float f = this.k;
        if (Float.isNaN(f)) {
            long j2 = this.C;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fE = wi3.r((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.f) {
                fE += j51Var.e(10.0f);
            }
        } else {
            fE = j51Var.e(f);
        }
        this.B = fE;
        xa3 xa3Var = this.E;
        Object[] objArr = xa3Var.g;
        int i = xa3Var.y;
        for (int i2 = 0; i2 < i; i2++) {
            Q0((ox3) objArr[i2]);
        }
        xa3Var.n();
    }
}
