package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class ig1 {
    public EdgeEffect a;
    public final Context g;
    public EdgeEffect j;
    public EdgeEffect l;
    public EdgeEffect m;
    public EdgeEffect n;
    public long r = 0;
    public EdgeEffect t;
    public EdgeEffect v;
    public EdgeEffect x;
    public final int y;

    public ig1(Context context, int i) {
        this.g = context;
        this.y = i;
    }

    public static boolean l(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(cf6.r(edgeEffect) == 0.0f);
    }

    public static boolean x(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final EdgeEffect g(um3 um3Var) {
        EdgeEffect edgeEffectY = cf6.y(this.g);
        edgeEffectY.setColor(this.y);
        if (!qe2.g(this.r, 0L)) {
            long j = this.r;
            if (um3Var == um3.j) {
                edgeEffectY.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectY;
            }
            edgeEffectY.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectY;
    }

    public final EdgeEffect n() {
        EdgeEffect edgeEffect = this.l;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectG = g(um3.t);
        this.l = edgeEffectG;
        return edgeEffectG;
    }

    public final EdgeEffect r() {
        EdgeEffect edgeEffect = this.x;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectG = g(um3.t);
        this.x = edgeEffectG;
        return edgeEffectG;
    }

    public final EdgeEffect v() {
        EdgeEffect edgeEffect = this.n;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectG = g(um3.j);
        this.n = edgeEffectG;
        return edgeEffectG;
    }

    public final EdgeEffect y() {
        EdgeEffect edgeEffect = this.v;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectG = g(um3.j);
        this.v = edgeEffectG;
        return edgeEffectG;
    }
}
