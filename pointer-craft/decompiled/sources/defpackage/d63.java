package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d63 extends i73 implements zo0, lm2 {
    public LinkedHashMap o;

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        float f = ((vb1) v70.b(this, ye2.r)).j;
        if (f < 0.0f) {
            f = 0.0f;
        }
        us3 us3VarV = p33Var.v(j);
        boolean z = this.h && !Float.isNaN(f) && vb1.g(f, 0.0f) > 0;
        int iV = !Float.isNaN(f) ? v33Var.V(f) : 0;
        int iMax = us3VarV.j;
        if (z) {
            iMax = Math.max(iMax, iV);
        }
        int iMax2 = us3VarV.t;
        if (z) {
            iMax2 = Math.max(iMax2, iV);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.o;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.o = linkedHashMap;
            }
            ek5 ek5Var = ye2.y;
            int iRound = Math.round((iV - us3VarV.j) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(ek5Var, Integer.valueOf(iRound));
            f72 f72Var = ye2.g;
            int iRound2 = Math.round((iV - us3VarV.t) / 2.0f);
            linkedHashMap.put(f72Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.o;
        if (map == null) {
            map = qi1.j;
        }
        return v33Var.k0(iMax, iMax2, map, new ud2(iMax, us3VarV, iMax2));
    }
}
