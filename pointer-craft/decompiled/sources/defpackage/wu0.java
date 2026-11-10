package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wu0 implements gr1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ av0 j;
    public final /* synthetic */ ViewGroup m;
    public final /* synthetic */ LayoutInflater q;
    public final /* synthetic */ p04 t;

    public wu0(av0 av0Var, p04 p04Var, String str, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.j = av0Var;
        this.t = p04Var;
        this.a = str;
        this.m = viewGroup;
        this.q = layoutInflater;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        gm3 gm3Var;
        Boolean bool;
        u04 u04Var;
        db3 db3Var = (db3) obj;
        av0 av0Var = this.j;
        st4 st4Var = av0Var.W().t;
        p04 p04Var = this.t;
        p04Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r04[] r04VarArr = p04Var.a;
        r04VarArr.getClass();
        ArrayList arrayList = new ArrayList();
        int length = r04VarArr.length;
        int i = 0;
        byte b = 0;
        while (true) {
            String str = this.a;
            if (i >= length) {
                st4Var.clear();
                st4Var.addAll(arrayList);
                ViewGroup viewGroup = this.m;
                viewGroup.removeAllViews();
                av0Var.c0(viewGroup, this.q, this.t, null, str, linkedHashMap);
                return og5.g;
            }
            r04 r04Var = r04VarArr[i];
            p04 p04VarK = r04Var.k();
            if (((p04VarK == null || (u04Var = p04VarK.b) == null) ? b : u04Var.t) > 0) {
                String str2 = str + ":" + r04Var.m;
                String strConcat = "layout_section_activated_".concat(str2);
                linkedHashMap.put(str2, Boolean.valueOf((db3Var == null || (bool = (Boolean) db3Var.r(new rw3(strConcat))) == null) ? b : bool.booleanValue()));
                boolean z = r04Var.k().s;
                u04 u04Var2 = r04Var.k().b;
                int iIntValue = u04Var2.t == 1 ? ((Integer) u04Var2.a).intValue() : 0;
                u04 u04Var3 = r04Var.k().b;
                gm3Var = new gm3(new w75(u04Var3.t == 2 ? (String) u04Var3.a : "", iIntValue), strConcat, z);
            } else {
                gm3Var = null;
            }
            if (gm3Var != null) {
                arrayList.add(gm3Var);
            }
            i++;
            b = 0;
        }
    }
}
