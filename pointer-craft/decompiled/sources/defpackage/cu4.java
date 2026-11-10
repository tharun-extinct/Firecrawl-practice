package defpackage;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class cu4 extends z60 {
    public final long g;

    public cu4(long j) {
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu4)) {
            return false;
        }
        long j = ((cu4) obj).g;
        int i = jj0.t;
        return tf5.g(this.g, j);
    }

    @Override // defpackage.z60
    public final void g(float f, long j, cd cdVar) {
        cdVar.n(1.0f);
        long jY = this.g;
        if (f != 1.0f) {
            jY = jj0.y(jj0.r(jY) * f, jY);
        }
        cdVar.x(jY);
        if (((Shader) cdVar.r) != null) {
            cdVar.t(null);
        }
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return du4.i("SolidColor(value=", jj0.j(this.g), ")");
    }
}
