package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tf3 {
    public static final LinkedHashMap y = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();

    public final void g(sf3 sf3Var) {
        sf3Var.getClass();
        String strO = xs2.o(sf3Var.getClass());
        if (strO.length() <= 0) {
            l0.u("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.g;
        sf3 sf3Var2 = (sf3) linkedHashMap.get(strO);
        if (yf2.p(sf3Var2, sf3Var)) {
            return;
        }
        if (sf3Var2 != null && sf3Var2.y) {
            uo1.A("Navigator ", sf3Var, " is replacing an already attached ", sf3Var2);
        } else if (sf3Var.y) {
            uo1.s(sf3Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final sf3 y(String str) {
        str.getClass();
        if (str.length() <= 0) {
            l0.u("navigator name cannot be an empty string");
            return null;
        }
        sf3 sf3Var = (sf3) this.g.get(str);
        if (sf3Var != null) {
            return sf3Var;
        }
        l0.z(du4.i("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
