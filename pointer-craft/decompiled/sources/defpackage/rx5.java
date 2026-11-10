package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rx5 {
    public final Object g;
    public final Object r;
    public final Object y;

    public rx5(Object obj, Object obj2, Object obj3) {
        this.g = obj;
        this.y = obj2;
        this.r = obj3;
    }

    public final IllegalArgumentException g() {
        Object obj = this.g;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.y);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.r);
        StringBuilder sbZ = du4.z("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbZ.append(strValueOf3);
        sbZ.append("=");
        sbZ.append(strValueOf4);
        return new IllegalArgumentException(sbZ.toString());
    }
}
