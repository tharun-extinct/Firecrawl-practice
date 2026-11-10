package defpackage;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class f33 extends ra {
    public final int J;

    public f33(int i) {
        this.J = i;
    }

    @Override // defpackage.ra
    public final float C(Object obj) {
        float[] fArr = ((g33) obj).I;
        if (fArr != null) {
            return fArr[this.J];
        }
        return 0.0f;
    }

    @Override // defpackage.ra
    public final void T(Object obj, float f) {
        g33 g33Var = (g33) obj;
        float[] fArr = g33Var.I;
        if (fArr != null) {
            int i = this.J;
            if (fArr[i] != f) {
                fArr[i] = f;
                d5 d5Var = g33Var.K;
                if (d5Var != null) {
                    float fJ = g33Var.j();
                    MaterialButton materialButton = (MaterialButton) d5Var.t;
                    int[] iArr = MaterialButton.V;
                    int i2 = (int) (fJ * 0.11f);
                    if (materialButton.M != i2) {
                        materialButton.M = i2;
                        materialButton.f();
                        materialButton.invalidate();
                    }
                }
                g33Var.invalidateSelf();
            }
        }
    }
}
