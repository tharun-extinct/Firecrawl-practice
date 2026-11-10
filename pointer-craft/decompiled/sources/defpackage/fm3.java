package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fm3 extends nm3 {
    public final w75 g;
    public final String y;

    public /* synthetic */ fm3() {
        this(new w75(null, R.string.menu_keyboard_language), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3)) {
            return false;
        }
        fm3 fm3Var = (fm3) obj;
        return yf2.p(this.g, fm3Var.g) && yf2.p(this.y, fm3Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + xi3.l(this.g.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "KeyboardLayout(title=" + this.g + ", proFeature=false, layoutName=" + this.y + ")";
    }

    @Override // defpackage.nm3
    public final w75 y() {
        return this.g;
    }

    public fm3(w75 w75Var, String str) {
        this.g = w75Var;
        this.y = str;
    }
}
