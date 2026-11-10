package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class d04 {
    public final ArrayList g;
    public final /* synthetic */ c04 j;
    public final int l;
    public final t32 n;
    public final Map r;
    public int v;
    public final boolean x;
    public boolean y;

    public d04(c04 c04Var, Map map, jk4 jk4Var) {
        map.getClass();
        jk4Var.getClass();
        this.j = c04Var;
        this.g = new ArrayList();
        this.r = map;
        this.n = c04Var.g;
        boolean z = yf2.p(jk4Var.y(), cy4.r) || yf2.p(jk4Var.y(), cy4.n);
        this.x = z;
        this.l = z ? Integer.MAX_VALUE : jk4Var.r();
    }

    public final d04 g(jk4 jk4Var) {
        jk4Var.getClass();
        d04 d04Var = new d04(this.j, this.r, jk4Var);
        d04Var.g.addAll(this.g);
        return d04Var;
    }

    public final Object j() {
        ArrayList arrayList = this.g;
        Object objRemove = arrayList.remove(arrayList.size() - 1);
        this.y = true;
        return objRemove;
    }

    public final String l(String str) {
        str.getClass();
        String str2 = (String) cj0.s0(this.g);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            return str;
        }
        return str2 + '.' + str;
    }

    public final Object n(di2 di2Var) {
        String string;
        di2Var.getClass();
        if (!(di2Var instanceof cv3)) {
            return di2Var.y(this);
        }
        Object obj = this.r.get(l("type"));
        tf0 tf0Var = null;
        String string2 = obj != null ? obj.toString() : null;
        this.n.getClass();
        String str = "in the polymorphic scope of '" + tf0Var.r() + '\'';
        if (string2 == null) {
            string = "Class discriminator was missing and no default serializers were registered " + str + '.';
        } else {
            StringBuilder sbZ = du4.z("Serializer for subclass '", string2, "' is not found ", str, ".\nCheck if class with serial name '");
            du4.B(sbZ, string2, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", string2, "' has to be '@Serializable', and the base class '");
            sbZ.append(tf0Var.r());
            sbZ.append("' has to be sealed and '@Serializable'.");
            string = sbZ.toString();
        }
        throw new mk4(string);
    }

    public final Object r(jk4 jk4Var, int i, String str) {
        rx4 rx4Var = rx4.g;
        String strL = l(jk4Var.n(i));
        rx4 rx4Var2 = rx4.g;
        ArrayList arrayList = this.g;
        arrayList.add(strL);
        rx4 rx4Var3 = rx4.g;
        rx4Var3.r().getClass();
        Object objN = cj0.s0(arrayList) != null ? n(rx4Var3) : null;
        if (!this.y) {
            j();
        }
        this.y = false;
        return objN;
    }

    public final String v(Object obj) {
        Object objX = x(obj);
        objX.getClass();
        return (String) objX;
    }

    public final Object x(Object obj) {
        String str = (String) obj;
        str.getClass();
        return v13.i(str, this.r);
    }

    public final int y(jk4 jk4Var) {
        jk4Var.getClass();
        do {
            int i = this.v;
            if (i >= this.l) {
                return -1;
            }
            this.v = i + 1;
            String strL = l(jk4Var.n(i));
            Set<String> setKeySet = this.r.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                for (String str : setKeySet) {
                    if (ay4.P(str, strL, false) && (str.length() == strL.length() || str.charAt(strL.length()) == '.')) {
                        return this.v - 1;
                    }
                }
            }
        } while (!this.x);
        return -1;
    }
}
