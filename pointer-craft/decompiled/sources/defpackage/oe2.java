package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oe2 {
    public int g = 0;

    public final String toString() {
        int i = this.g;
        int iHashCode = hashCode();
        a11.x(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "IntRef(element = " + i + ")@" + string;
    }
}
