package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b70 implements m65 {
    public final a70 g;
    public final float y;

    public b70(a70 a70Var, float f) {
        this.g = a70Var;
        this.y = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b70) {
            b70 b70Var = (b70) obj;
            if (this.g == b70Var.g && Float.compare(this.y, b70Var.y) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m65
    public final float g() {
        return this.y;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (this.g.hashCode() * 31);
    }

    @Override // defpackage.m65
    public final z60 r() {
        return this.g;
    }

    public final String toString() {
        return "BrushStyle(value=" + this.g + ", alpha=" + this.y + ")";
    }

    @Override // defpackage.m65
    public final long y() {
        int i = jj0.t;
        return jj0.j;
    }
}
