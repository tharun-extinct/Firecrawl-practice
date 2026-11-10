package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ht2 {
    public k65 a;
    public k44 c;
    public final sc g;
    public boolean j;
    public boolean l;
    public j75 m;
    public boolean n;
    public aj3 q;
    public boolean t;
    public boolean v;
    public k44 w;
    public boolean x;
    public final cd2 y;
    public final Object r = new Object();
    public final CursorAnchorInfo.Builder i = new CursorAnchorInfo.Builder();
    public final float[] b = l33.g();
    public final Matrix s = new Matrix();

    public ht2(sc scVar, cd2 cd2Var) {
        this.g = scVar;
        this.y = cd2Var;
    }

    public final void g() {
        cd2 cd2Var = this.y;
        InputMethodManager inputMethodManagerI = cd2Var.i();
        View view = (View) cd2Var.t;
        if (!inputMethodManagerI.isActive(view) || this.a == null || this.q == null || this.m == null || this.w == null || this.c == null) {
            return;
        }
        float[] fArr = this.b;
        l33.n(fArr);
        bl2 bl2Var = (bl2) this.g.i.d.getValue();
        if (bl2Var != null) {
            if (!bl2Var.W()) {
                bl2Var = null;
            }
            if (bl2Var != null) {
                bl2Var.o(fArr);
            }
        }
        k44 k44Var = this.c;
        k44Var.getClass();
        float f = -k44Var.g;
        k44 k44Var2 = this.c;
        k44Var2.getClass();
        l33.x(fArr, f, -k44Var2.y);
        Matrix matrix = this.s;
        gp4.Q(matrix, fArr);
        k65 k65Var = this.a;
        k65Var.getClass();
        long j = k65Var.y;
        aj3 aj3Var = this.q;
        aj3Var.getClass();
        j75 j75Var = this.m;
        j75Var.getClass();
        h93 h93Var = j75Var.y;
        k44 k44Var3 = this.w;
        k44Var3.getClass();
        float f2 = k44Var3.n;
        float f3 = k44Var3.y;
        k44 k44Var4 = this.c;
        k44Var4.getClass();
        boolean z = this.x;
        boolean z2 = this.l;
        boolean z3 = this.j;
        boolean z4 = this.t;
        CursorAnchorInfo.Builder builder = this.i;
        builder.reset();
        builder.setMatrix(matrix);
        u75 u75Var = k65Var.r;
        int iX = u75.x(j);
        builder.setSelectionRange(iX, u75.v(j));
        n74 n74Var = n74.t;
        if (z && iX >= 0) {
            int iJ = aj3Var.j(iX);
            k44 k44VarR = j75Var.r(iJ);
            float fQ = xs2.q(k44VarR.g, 0.0f, (int) (j75Var.r >> 32));
            boolean zV = cz5.v(k44Var3, fQ, k44VarR.y);
            boolean zV2 = cz5.v(k44Var3, fQ, k44VarR.n);
            boolean z5 = j75Var.g(iJ) == n74Var;
            int i = (zV || zV2) ? 1 : 0;
            if (!zV || !zV2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f4 = k44VarR.y;
            float f5 = k44VarR.n;
            builder.setInsertionMarkerLocation(fQ, f4, f5, f5, i);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z2) {
            int iX2 = u75Var != null ? u75.x(u75Var.g) : -1;
            int iV = u75Var != null ? u75.v(u75Var.g) : -1;
            if (iX2 >= 0 && iX2 < iV) {
                builder2.setComposingText(iX2, k65Var.g.t.subSequence(iX2, iV));
                int iJ2 = aj3Var.j(iX2);
                int iJ3 = aj3Var.j(iV);
                float[] fArr2 = new float[(iJ3 - iJ2) * 4];
                h93Var.g(sp2.y(iJ2, iJ3), fArr2);
                while (iX2 < iV) {
                    int iJ4 = aj3Var.j(iX2);
                    int i2 = (iJ4 - iJ2) * 4;
                    float f6 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f7 = fArr2[i2 + 1];
                    int i3 = iJ2;
                    float f8 = fArr2[i2 + 2];
                    float f9 = fArr2[i2 + 3];
                    int i4 = iV;
                    int i5 = (k44Var3.g < f8 ? 1 : 0) & (f6 < k44Var3.r ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!cz5.v(k44Var3, f6, f7) || !cz5.v(k44Var3, f8, f9)) {
                        i5 |= 2;
                    }
                    if (j75Var.g(iJ4) == n74Var) {
                        i5 |= 4;
                    }
                    int i6 = iX2;
                    builder3.addCharacterBounds(i6, f6, f7, f8, f9, i5);
                    builder2 = builder3;
                    iX2 = i6 + 1;
                    iJ2 = i3;
                    iV = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            h2.c(builder2, k44Var4);
        }
        if (i7 >= 34 && z4 && !k44Var3.x()) {
            int i8 = h93Var.x - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iW = xs2.w(h93Var.v(f3), 0, i8);
            int iW2 = xs2.w(h93Var.v(f2), 0, i8);
            if (iW <= iW2) {
                while (true) {
                    builder2.addVisibleLineBounds(j75Var.v(iW), h93Var.x(iW), j75Var.x(iW), h93Var.y(iW));
                    if (iW == iW2) {
                        break;
                    } else {
                        iW++;
                    }
                }
            }
        }
        cd2Var.i().updateCursorAnchorInfo(view, builder2.build());
        this.v = false;
    }
}
