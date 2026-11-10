package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class c20 implements hy {
    public Object a;
    public boolean j;
    public Object m;
    public Collection q;
    public Object t;
    public Object w;

    public static ty g() {
        ty tyVar = new ty((byte) 1, false);
        a20 a20VarG = b20.g();
        a20VarG.y = true;
        tyVar.q = a20VarG;
        return tyVar;
    }

    public a06 a() {
        return (a06) this.q;
    }

    public String j() {
        ((b20) this.m).getClass();
        return null;
    }

    public String l() {
        return (String) ((b20) this.m).g;
    }

    public boolean m() {
        if (((String) this.t) != null || ((String) this.a) != null) {
            return true;
        }
        b20 b20Var = (b20) this.m;
        b20Var.getClass();
        if (b20Var.y || this.j) {
            return true;
        }
        a06 a06Var = (a06) this.q;
        if (a06Var != null) {
            int size = a06Var.size();
            for (int i = 0; i < size; i++) {
                ((z10) a06Var.get(i)).getClass();
            }
        }
        return false;
    }

    public x20 n() {
        gz3 gz3Var;
        if (((a06) this.q).isEmpty()) {
            return b36.t;
        }
        z10 z10Var = (z10) ((a06) this.q).get(0);
        for (int i = 1; i < ((a06) this.q).size(); i++) {
            z10 z10Var2 = (z10) ((a06) this.q).get(i);
            if (!z10Var2.g.n.equals(z10Var.g.n) && !z10Var2.g.n.equals("play_pass_subs")) {
                return b36.g("All products should have same ProductType.", 5);
            }
        }
        jz3 jz3Var = z10Var.g;
        String strOptString = jz3Var.y.optString("packageName");
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        a06 a06Var = (a06) this.q;
        int size = a06Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            z10 z10Var3 = (z10) a06Var.get(i2);
            z10Var3.getClass();
            jz3 jz3Var2 = z10Var3.g;
            ArrayList arrayList = jz3Var2.t;
            String str = jz3Var2.r;
            if (arrayList != null && z10Var3.y == null) {
                return b36.g("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str, 5);
            }
            if (map.containsKey(str)) {
                return b36.g("ProductId can not be duplicated. Invalid product id: " + str + ".", 5);
            }
            map.put(str, z10Var3);
            if (!jz3Var.n.equals("play_pass_subs") && !jz3Var2.n.equals("play_pass_subs") && !strOptString.equals(jz3Var2.y.optString("packageName"))) {
                return b36.g("All products must have the same package name.", 5);
            }
        }
        for (String str2 : hashSet) {
            if (map.containsKey(str2)) {
                ((z10) map.get(str2)).getClass();
                return b36.g("OldProductId must not be one of the products to be purchased. Invalid old product id: " + str2 + ".", 5);
            }
        }
        ArrayList arrayList2 = jz3Var.a;
        String str3 = z10Var.y;
        if (str3 != null && arrayList2 != null) {
            int size2 = arrayList2.size();
            int i3 = 0;
            do {
                if (i3 >= size2) {
                    gz3Var = null;
                    break;
                }
                Object obj = arrayList2.get(i3);
                i3++;
                gz3Var = (gz3) obj;
            } while (!str3.equals(gz3Var.n));
            if (gz3Var != null && gz3Var.l != null) {
                return b36.g("Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.", 5);
            }
        }
        return b36.t;
    }

    @Override // defpackage.hy
    public void q(kq0 kq0Var) {
        ((p32) this.w).w.post(new i26((byte) 15, this, kq0Var, false));
    }

    public int r() {
        return ((b20) this.m).y ? 1 : 0;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) this.w);
        return arrayList;
    }

    public String v() {
        return (String) this.t;
    }

    public String x() {
        return (String) this.a;
    }

    public void y(kq0 kq0Var) {
        su5 su5Var = (su5) ((p32) this.w).a.get((ck) this.a);
        if (su5Var != null) {
            su5Var.w(kq0Var);
        }
    }
}
