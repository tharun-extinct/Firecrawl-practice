package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o71 extends v71 {
    public final boolean g;
    public final String y;

    public o71(String str, boolean z) {
        str.getClass();
        this.g = z;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o71)) {
            return false;
        }
        o71 o71Var = (o71) obj;
        return this.g == o71Var.g && yf2.p(this.y, o71Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (Boolean.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "CreateConnection(onlyDiscoverMode=" + this.g + ", bluetoothName=" + this.y + ")";
    }
}
