package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qn4 {
    public float g;
    public float n;
    public float r;
    public float v;
    public float y;
    public final ArrayList x = new ArrayList();
    public final ArrayList l = new ArrayList();

    public qn4() {
        n(0.0f, 270.0f, 0.0f);
    }

    public final void g(float f) {
        float f2 = this.n;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.y;
        float f5 = this.r;
        mn4 mn4Var = new mn4(f4, f5, f4, f5);
        mn4Var.x = this.n;
        mn4Var.l = f3;
        this.l.add(new kn4(mn4Var));
        this.n = f;
    }

    public final void n(float f, float f2, float f3) {
        this.g = f;
        this.y = 0.0f;
        this.r = f;
        this.n = f2;
        this.v = (f2 + f3) % 360.0f;
        this.x.clear();
        this.l.clear();
    }

    public final void r(float f, float f2) {
        nn4 nn4Var = new nn4();
        nn4Var.y = f;
        nn4Var.r = f2;
        this.x.add(nn4Var);
        ln4 ln4Var = new ln4(nn4Var, this.y, this.r);
        float fY = ln4Var.y() + 270.0f;
        float fY2 = ln4Var.y() + 270.0f;
        g(fY);
        this.l.add(ln4Var);
        this.n = fY2;
        this.y = f;
        this.r = f2;
    }

    public final void y(Matrix matrix, Path path) {
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((on4) arrayList.get(i)).g(matrix, path);
        }
    }
}
