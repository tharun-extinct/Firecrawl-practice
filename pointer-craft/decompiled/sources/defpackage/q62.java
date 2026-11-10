package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q62 {
    public final /* synthetic */ byte g;

    public static final void g(final float f, final float f2, final int i, final int i2, final long j, final long j2, final nm0 nm0Var, final nm0 nm0Var2, final cz1 cz1Var, h02 h02Var, final j73 j73Var, final rf4 rf4Var) {
        int i3;
        long j3;
        h02Var.Z(414860860);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.n(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.x(j73Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            j3 = j;
            i3 |= h02Var.v(j3) ? 256 : 128;
        } else {
            j3 = j;
        }
        if ((i2 & 3072) == 0) {
            i3 |= h02Var.v(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= h02Var.r(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= h02Var.r(f2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= h02Var.x(rf4Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= h02Var.j(cz1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= h02Var.j(nm0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= h02Var.j(nm0Var2) ? 536870912 : 268435456;
        }
        if (h02Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            uz4.g(j73Var, null, j3, j2, 0.0f, 0.0f, null, ue5.m0(1878374785, new y15(rf4Var, nm0Var, nm0Var2, f, f2, i, cz1Var), h02Var), h02Var, ((i3 >> 3) & 14) | 12582912 | (i3 & 896) | (i3 & 7168), 114);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: t15
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i2 | 1);
                    q62.g(f, f2, i, iJ, j, j2, nm0Var, nm0Var2, cz1Var, (h02) obj, j73Var, rf4Var);
                    return og5.g;
                }
            };
        }
    }

    public static final void n(j73 j73Var, long j, long j2, cz1 cz1Var, bz1 bz1Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(1955286154);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.v(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.v(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(cz1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.j(bz1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.j(nm0Var) ? 131072 : 65536;
        }
        if (h02Var.N(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            uz4.g(dj4.g(j73Var, false, new vy3((byte) 8)), null, j, j2, 0.0f, 0.0f, null, ue5.m0(830280655, new u43(nm0Var, bz1Var, cz1Var), h02Var), h02Var, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new u15(j73Var, j, j2, cz1Var, bz1Var, nm0Var, i);
        }
    }

    public static final void r(int i, j73 j73Var, long j, long j2, cz1 cz1Var, bz1 bz1Var, nm0 nm0Var, h02 h02Var, int i2) {
        j73 j73Var2;
        long j3;
        cz1 cz1Var2;
        bz1 bz1Var2;
        long jV;
        cz1 cz1Var3;
        int i3;
        j73 j73Var3;
        bz1 bz1Var3;
        h02Var.Z(563434725);
        int i4 = i2 | (h02Var.n(i) ? 4 : 2) | 48 | (h02Var.v(j) ? 256 : 128) | 222208;
        byte b = 1;
        if (h02Var.N(i4 & 1, (599187 & i4) != 599186)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                jV = tj0.v(ee6.g, h02Var);
                nm0 nm0VarM0 = ue5.m0(959948692, new z15(i, b), h02Var);
                nm0 nm0Var2 = nn0.g;
                cz1Var3 = nm0VarM0;
                i3 = i4 & (-7169);
                j73Var3 = g73.g;
                bz1Var3 = nm0Var2;
            } else {
                h02Var.Q();
                int i5 = i4 & (-7169);
                j73Var3 = j73Var;
                i3 = i5;
                jV = j2;
                cz1Var3 = cz1Var;
                bz1Var3 = bz1Var;
            }
            h02Var.s();
            n(j73Var3, j, jV, cz1Var3, bz1Var3, nm0Var, h02Var, (i3 >> 3) & 524286);
            cz1Var2 = cz1Var3;
            bz1Var2 = bz1Var3;
            j3 = jV;
            j73Var2 = j73Var3;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            j3 = j2;
            cz1Var2 = cz1Var;
            bz1Var2 = bz1Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new u15(i, j73Var2, j, j3, cz1Var2, bz1Var2, nm0Var, i2);
        }
    }

    public static final void v(h93 h93Var, nb0 nb0Var, z60 z60Var, float f, ym4 ym4Var, l45 l45Var, yd1 yd1Var) {
        nb0Var.q();
        ArrayList arrayList = h93Var.j;
        if (arrayList.size() <= 1 || (z60Var instanceof cu4)) {
            x(h93Var, nb0Var, z60Var, f, ym4Var, l45Var, yd1Var);
        } else {
            if (!(z60Var instanceof a70)) {
                up.y();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float f2 = 0.0f;
            for (int i = 0; i < size; i++) {
                gd gdVar = ((hp3) arrayList.get(i)).g;
                f2 += gdVar.x;
                fMax = Math.max(fMax, gdVar.r());
            }
            Float.floatToRawIntBits(fMax);
            Float.floatToRawIntBits(f2);
            Shader shader = ((a70) z60Var).r;
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                gd gdVar2 = ((hp3) arrayList.get(i2)).g;
                gdVar2.x(nb0Var, new a70(shader), f, ym4Var, l45Var, yd1Var);
                nb0Var.l(0.0f, gdVar2.x);
                matrix.setTranslate(0.0f, -gdVar2.x);
                shader.setLocalMatrix(matrix);
            }
        }
        nb0Var.t();
    }

    public static final void x(h93 h93Var, nb0 nb0Var, z60 z60Var, float f, ym4 ym4Var, l45 l45Var, yd1 yd1Var) {
        ArrayList arrayList = h93Var.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hp3 hp3Var = (hp3) arrayList.get(i);
            hp3Var.g.x(nb0Var, z60Var, f, ym4Var, l45Var, yd1Var);
            nb0Var.l(0.0f, hp3Var.g.x);
        }
    }

    public static final void y(float f, float f2, final int i, final int i2, final long j, long j2, final nm0 nm0Var, final nm0 nm0Var2, cz1 cz1Var, h02 h02Var, j73 j73Var, rf4 rf4Var) {
        final float f3;
        final float f4;
        final long j3;
        final cz1 cz1Var2;
        final j73 j73Var2;
        final rf4 rf4Var2;
        int i3;
        cz1 cz1VarM0;
        float f5;
        float f6;
        long j4;
        h02Var.Z(519094802);
        int i4 = i2 | (h02Var.n(i) ? 4 : 2) | 102441136;
        byte b = 0;
        if (h02Var.N(i4 & 1, (306783379 & i4) != 306783378)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                rf4 rf4VarO = gp4.O(h02Var);
                long jV = tj0.v(ee6.g, h02Var);
                rf4Var2 = rf4VarO;
                i3 = i4 & (-58241);
                cz1VarM0 = ue5.m0(610355265, new z15(i, b), h02Var);
                j73Var2 = g73.g;
                f5 = 52.0f;
                f6 = 90.0f;
                j4 = jV;
            } else {
                h02Var.Q();
                int i5 = i4 & (-58241);
                f5 = f;
                i3 = i5;
                f6 = f2;
                j4 = j2;
                cz1VarM0 = cz1Var;
                j73Var2 = j73Var;
                rf4Var2 = rf4Var;
            }
            h02Var.s();
            g(f5, f6, i, 918774144 | (i3 & 126), j, j4, nm0Var, nm0Var2, cz1VarM0, h02Var, j73Var2, rf4Var2);
            f4 = f6;
            j3 = j4;
            cz1Var2 = cz1VarM0;
            f3 = f5;
        } else {
            h02Var.Q();
            f3 = f;
            f4 = f2;
            j3 = j2;
            cz1Var2 = cz1Var;
            j73Var2 = j73Var;
            rf4Var2 = rf4Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(f3, f4, i, i2, j, j3, nm0Var, nm0Var2, cz1Var2, j73Var2, rf4Var2) { // from class: s15
                public final /* synthetic */ rf4 a;
                public final /* synthetic */ float b;
                public final /* synthetic */ cz1 c;
                public final /* synthetic */ nm0 i;
                public final /* synthetic */ int j;
                public final /* synthetic */ long m;
                public final /* synthetic */ long q;
                public final /* synthetic */ nm0 s;
                public final /* synthetic */ j73 t;
                public final /* synthetic */ float w;

                {
                    this.t = j73Var2;
                    this.a = rf4Var2;
                    this.m = j;
                    this.q = j3;
                    this.c = cz1Var2;
                    this.i = nm0Var;
                    this.s = nm0Var2;
                }

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(817892353);
                    q62.y(this.w, this.b, this.j, iJ, this.m, this.q, this.i, this.s, this.c, (h02) obj, this.t, this.a);
                    return og5.g;
                }
            };
        }
    }

    public final ViewPropertyAnimator l(View view, int i) {
        switch (this.g) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
