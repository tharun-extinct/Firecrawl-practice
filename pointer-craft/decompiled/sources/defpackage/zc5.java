package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zc5 {
    public final HashMap g = new HashMap();
    public final ArrayList r = new ArrayList();
    public final View y;

    public zc5(View view) {
        this.y = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zc5)) {
            return false;
        }
        zc5 zc5Var = (zc5) obj;
        return this.y == zc5Var.y && this.g.equals(zc5Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + (this.y.hashCode() * 31);
    }

    public final String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.y + "\n").concat("    values:");
        HashMap map = this.g;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
