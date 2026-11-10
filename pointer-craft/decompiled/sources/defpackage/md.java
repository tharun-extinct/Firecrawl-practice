package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes2.dex */
public final class md {
    public final PathMeasure g;

    public md(PathMeasure pathMeasure) {
        this.g = pathMeasure;
    }

    public final float g() {
        return this.g.getLength();
    }

    public final void r(ld ldVar) {
        this.g.setPath(ldVar.g, false);
    }

    public final void y(float f, float f2, ld ldVar) {
        this.g.getSegment(f, f2, ldVar.g, true);
    }
}
