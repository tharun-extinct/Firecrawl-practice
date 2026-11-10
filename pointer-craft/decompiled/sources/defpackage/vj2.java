package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vj2 {
    public static final vj2 y = new vj2(127);
    public final int g;

    public vj2(int i) {
        this.g = (i & 8) != 0 ? -1 : 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vj2) && this.g == ((vj2) obj).g;
    }

    public final int hashCode() {
        return du4.r(this.g, du4.r(0, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return xi3.a("KeyboardOptions(capitalization=Unspecified, autoCorrectEnabled=null, keyboardType=", pw5.U(0), ", imeAction=", la2.g(this.g), ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)");
    }
}
