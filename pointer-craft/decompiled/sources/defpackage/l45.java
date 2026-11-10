package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l45 {
    public final int g;
    public static final l45 y = new l45(0);
    public static final l45 r = new l45(1);
    public static final l45 n = new l45(2);

    public l45(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l45) {
            return this.g == ((l45) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g;
    }

    public final String toString() {
        int i = this.g;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return du4.i("TextDecoration[", tw2.g(arrayList, ", ", null, 62), "]");
        }
        return "TextDecoration." + arrayList.get(0);
    }
}
