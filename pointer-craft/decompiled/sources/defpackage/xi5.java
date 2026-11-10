package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xi5 extends yi5 {
    public final Matrix a;
    public final Matrix g;
    public float j;
    public float l;
    public String m;
    public float n;
    public float r;
    public float t;
    public float v;
    public float x;
    public final ArrayList y;

    public xi5(xi5 xi5Var, mr mrVar) {
        zi5 vi5Var;
        this.g = new Matrix();
        this.y = new ArrayList();
        this.r = 0.0f;
        this.n = 0.0f;
        this.v = 0.0f;
        this.x = 1.0f;
        this.l = 1.0f;
        this.j = 0.0f;
        this.t = 0.0f;
        Matrix matrix = new Matrix();
        this.a = matrix;
        this.m = null;
        this.r = xi5Var.r;
        this.n = xi5Var.n;
        this.v = xi5Var.v;
        this.x = xi5Var.x;
        this.l = xi5Var.l;
        this.j = xi5Var.j;
        this.t = xi5Var.t;
        String str = xi5Var.m;
        this.m = str;
        if (str != null) {
            mrVar.put(str, this);
        }
        matrix.set(xi5Var.a);
        ArrayList arrayList = xi5Var.y;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof xi5) {
                this.y.add(new xi5((xi5) obj, mrVar));
            } else {
                if (obj instanceof wi5) {
                    vi5Var = new wi5((wi5) obj);
                } else {
                    if (!(obj instanceof vi5)) {
                        l0.z("Unknown object in the tree!");
                        throw null;
                    }
                    vi5Var = new vi5((vi5) obj);
                }
                this.y.add(vi5Var);
                Object obj2 = vi5Var.y;
                if (obj2 != null) {
                    mrVar.put(obj2, vi5Var);
                }
            }
        }
    }

    @Override // defpackage.yi5
    public final boolean g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((yi5) arrayList.get(i)).g()) {
                return true;
            }
            i++;
        }
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.a;
    }

    public float getPivotX() {
        return this.n;
    }

    public float getPivotY() {
        return this.v;
    }

    public float getRotation() {
        return this.r;
    }

    public float getScaleX() {
        return this.x;
    }

    public float getScaleY() {
        return this.l;
    }

    public float getTranslateX() {
        return this.j;
    }

    public float getTranslateY() {
        return this.t;
    }

    public final void r() {
        Matrix matrix = this.a;
        matrix.reset();
        matrix.postTranslate(-this.n, -this.v);
        matrix.postScale(this.x, this.l);
        matrix.postRotate(this.r, 0.0f, 0.0f);
        matrix.postTranslate(this.j + this.n, this.t + this.v);
    }

    public void setPivotX(float f) {
        if (f != this.n) {
            this.n = f;
            r();
        }
    }

    public void setPivotY(float f) {
        if (f != this.v) {
            this.v = f;
            r();
        }
    }

    public void setRotation(float f) {
        if (f != this.r) {
            this.r = f;
            r();
        }
    }

    public void setScaleX(float f) {
        if (f != this.x) {
            this.x = f;
            r();
        }
    }

    public void setScaleY(float f) {
        if (f != this.l) {
            this.l = f;
            r();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.j) {
            this.j = f;
            r();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.t) {
            this.t = f;
            r();
        }
    }

    @Override // defpackage.yi5
    public final boolean y(int[] iArr) {
        int i = 0;
        boolean zY = false;
        while (true) {
            ArrayList arrayList = this.y;
            if (i >= arrayList.size()) {
                return zY;
            }
            zY |= ((yi5) arrayList.get(i)).y(iArr);
            i++;
        }
    }

    public xi5() {
        this.g = new Matrix();
        this.y = new ArrayList();
        this.r = 0.0f;
        this.n = 0.0f;
        this.v = 0.0f;
        this.x = 1.0f;
        this.l = 1.0f;
        this.j = 0.0f;
        this.t = 0.0f;
        this.a = new Matrix();
        this.m = null;
    }
}
