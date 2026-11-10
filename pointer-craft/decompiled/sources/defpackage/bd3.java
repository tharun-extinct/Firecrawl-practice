package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class bd3 {
    public final sf3 g;
    public final String y;
    public final LinkedHashMap r = new LinkedHashMap();
    public final ArrayList n = new ArrayList();
    public final LinkedHashMap v = new LinkedHashMap();

    public bd3(sf3 sf3Var, String str) {
        this.g = sf3Var;
        this.y = str;
    }

    public ad3 g() {
        ad3 ad3VarY = y();
        ad3VarY.getClass();
        al alVar = ad3VarY.t;
        for (Map.Entry entry : this.r.entrySet()) {
            String str = (String) entry.getKey();
            jc3 jc3Var = (jc3) entry.getValue();
            str.getClass();
            jc3Var.getClass();
            alVar.getClass();
            ((LinkedHashMap) alVar.n).put(str, jc3Var);
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        final byte b = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            final yc3 yc3Var = (yc3) obj;
            yc3Var.getClass();
            alVar.getClass();
            final byte b2 = 1;
            ArrayList arrayListF = v13.f((LinkedHashMap) alVar.n, new xy1() { // from class: cd3
                @Override // defpackage.xy1
                public final Object a(Object obj2) {
                    boolean zContains;
                    byte b3 = b2;
                    yc3 yc3Var2 = yc3Var;
                    String str2 = (String) obj2;
                    switch (b3) {
                        case 0:
                            str2.getClass();
                            zContains = yc3Var2.r().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            zContains = yc3Var2.r().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListF.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + yc3Var.g + " can't be used to open destination " + ((ad3) alVar.y) + ".\nFollowing required arguments are missing: " + arrayListF).toString());
            }
            ((ArrayList) alVar.r).add(yc3Var);
        }
        Iterator it = this.v.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            uo1.B();
            return null;
        }
        String str2 = this.y;
        if (str2 != null) {
            alVar.getClass();
            if (tx4.Y(str2)) {
                l0.u("Cannot have an empty route");
                return null;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            final yc3 yc3Var2 = new yc3(strConcat);
            ArrayList arrayListF2 = v13.f((LinkedHashMap) alVar.n, new xy1() { // from class: cd3
                @Override // defpackage.xy1
                public final Object a(Object obj2) {
                    boolean zContains;
                    byte b3 = b;
                    yc3 yc3Var3 = yc3Var2;
                    String str3 = (String) obj2;
                    switch (b3) {
                        case 0:
                            str3.getClass();
                            zContains = yc3Var3.r().contains(str3);
                            break;
                        default:
                            str3.getClass();
                            zContains = yc3Var3.r().contains(str3);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListF2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((ad3) alVar.y) + ". Following required arguments are missing: " + arrayListF2).toString());
            }
            alVar.x = new o05(new gf(strConcat, (byte) 19));
            alVar.g = strConcat.hashCode();
            alVar.v = str2;
        }
        return ad3VarY;
    }

    public ad3 y() {
        return this.g.g();
    }
}
