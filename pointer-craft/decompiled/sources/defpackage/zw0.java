package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public abstract class zw0 implements cn4 {
    public final cx0 g;
    public final cx0 n;
    public final cx0 r;
    public final cx0 y;

    public zw0(cx0 cx0Var, cx0 cx0Var2, cx0 cx0Var3, cx0 cx0Var4) {
        this.g = cx0Var;
        this.y = cx0Var2;
        this.r = cx0Var3;
        this.n = cx0Var4;
    }

    public static /* synthetic */ zw0 r(zw0 zw0Var, cx0 cx0Var, cx0 cx0Var2, cx0 cx0Var3, cx0 cx0Var4, int i) {
        if ((i & 1) != 0) {
            cx0Var = zw0Var.g;
        }
        if ((i & 2) != 0) {
            cx0Var2 = zw0Var.y;
        }
        if ((i & 4) != 0) {
            cx0Var3 = zw0Var.r;
        }
        if ((i & 8) != 0) {
            cx0Var4 = zw0Var.n;
        }
        return zw0Var.y(cx0Var, cx0Var2, cx0Var3, cx0Var4);
    }

    @Override // defpackage.cn4
    public final br2 g(long j, fl2 fl2Var, j51 j51Var) {
        float fG = this.g.g(j, j51Var);
        float fG2 = this.y.g(j, j51Var);
        float fG3 = this.r.g(j, j51Var);
        float fG4 = this.n.g(j, j51Var);
        float fY = cq4.y(j);
        float f = fG + fG4;
        if (f > fY) {
            float f2 = fY / f;
            fG *= f2;
            fG4 *= f2;
        }
        float f3 = fG2 + fG3;
        if (f3 > fY) {
            float f4 = fY / f3;
            fG2 *= f4;
            fG3 *= f4;
        }
        if (fG < 0.0f || fG2 < 0.0f || fG3 < 0.0f || fG4 < 0.0f) {
            StringBuilder sbU = du4.u("Corner size in Px can't be negative(topStart = ", fG, ", topEnd = ", fG2, ", bottomEnd = ");
            sbU.append(fG3);
            sbU.append(", bottomStart = ");
            sbU.append(fG4);
            sbU.append(")!");
            pc2.g(sbU.toString());
        }
        return n(j, fG, fG2, fG3, fG4, fl2Var);
    }

    public br2 n(long j, float f, float f2, float f3, float f4, fl2 fl2Var) {
        if (f + f2 + f4 + f3 == 0.0f) {
            return new ym3(kq2.r(0L, j));
        }
        ld ldVarG = nd.g();
        Path path = ldVarG.g;
        fl2 fl2Var2 = fl2.j;
        float f5 = fl2Var == fl2Var2 ? f : f2;
        path.moveTo(0.0f, f5);
        ldVarG.v(f5, 0.0f);
        if (fl2Var == fl2Var2) {
            f = f2;
        }
        int i = (int) (j >> 32);
        ldVarG.v(Float.intBitsToFloat(i) - f, 0.0f);
        ldVarG.v(Float.intBitsToFloat(i), f);
        float f6 = fl2Var == fl2Var2 ? f3 : f4;
        int i2 = (int) (j & 4294967295L);
        ldVarG.v(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - f6);
        ldVarG.v(Float.intBitsToFloat(i) - f6, Float.intBitsToFloat(i2));
        if (fl2Var == fl2Var2) {
            f3 = f4;
        }
        ldVarG.v(f3, Float.intBitsToFloat(i2));
        ldVarG.v(0.0f, Float.intBitsToFloat(i2) - f3);
        path.close();
        return new xm3(ldVarG);
    }

    public zw0 y(cx0 cx0Var, cx0 cx0Var2, cx0 cx0Var3, cx0 cx0Var4) {
        return new zy0(cx0Var, cx0Var2, cx0Var3, cx0Var4);
    }
}
