package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zi5 extends yi5 {
    public gr3[] g;
    public int r;
    public String y;

    public zi5(zi5 zi5Var) {
        this.g = null;
        this.r = 0;
        this.y = zi5Var.y;
        gr3[] gr3VarArr = zi5Var.g;
        gr3[] gr3VarArr2 = new gr3[gr3VarArr.length];
        for (int i = 0; i < gr3VarArr.length; i++) {
            gr3VarArr2[i] = new gr3(gr3VarArr[i]);
        }
        this.g = gr3VarArr2;
    }

    public gr3[] getPathData() {
        return this.g;
    }

    public String getPathName() {
        return this.y;
    }

    public final void n(Path path) {
        path.reset();
        gr3[] gr3VarArr = this.g;
        if (gr3VarArr != null) {
            nc6.c(gr3VarArr, path);
        }
    }

    public boolean r() {
        return this instanceof vi5;
    }

    public void setPathData(gr3[] gr3VarArr) {
        gr3[] gr3VarArr2 = this.g;
        if (gr3VarArr2 != null && gr3VarArr != null && gr3VarArr2.length == gr3VarArr.length) {
            int i = 0;
            while (true) {
                if (i >= gr3VarArr2.length) {
                    gr3[] gr3VarArr3 = this.g;
                    for (int i2 = 0; i2 < gr3VarArr.length; i2++) {
                        gr3VarArr3[i2].g = gr3VarArr[i2].g;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = gr3VarArr[i2].y;
                            if (i3 < fArr.length) {
                                gr3VarArr3[i2].y[i3] = fArr[i3];
                                i3++;
                            }
                        }
                    }
                    return;
                }
                gr3 gr3Var = gr3VarArr2[i];
                char c = gr3Var.g;
                gr3 gr3Var2 = gr3VarArr[i];
                if (c != gr3Var2.g || gr3Var.y.length != gr3Var2.y.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        gr3[] gr3VarArr4 = new gr3[gr3VarArr.length];
        for (int i4 = 0; i4 < gr3VarArr.length; i4++) {
            gr3VarArr4[i4] = new gr3(gr3VarArr[i4]);
        }
        this.g = gr3VarArr4;
    }

    public zi5() {
        this.g = null;
        this.r = 0;
    }
}
