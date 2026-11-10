package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t05 extends ri0 {
    public final HashMap a;
    public final /* synthetic */ u05 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t05(u05 u05Var) {
        super(0);
        this.m = u05Var;
        this.a = new HashMap();
    }

    @Override // defpackage.ri0
    public final cd2 a(yo5 yo5Var, cd2 cd2Var) {
        if ((yo5Var.g.n() & 519) != 0) {
            nd2 nd2Var = (nd2) cd2Var.a;
            nd2 nd2Var2 = (nd2) cd2Var.t;
            int i = nd2Var.g != nd2Var2.g ? 1 : 0;
            if (nd2Var.y != nd2Var2.y) {
                i |= 2;
            }
            if (nd2Var.r != nd2Var2.r) {
                i |= 4;
            }
            if (nd2Var.n != nd2Var2.n) {
                i |= 8;
            }
            this.a.put(yo5Var, Integer.valueOf(i));
        }
        return cd2Var;
    }

    @Override // defpackage.ri0
    public final tp5 j(tp5 tp5Var, List list) {
        ArrayList arrayList = this.m.y;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            yo5 yo5Var = (yo5) list.get(size);
            Integer num = (Integer) this.a.get(yo5Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float fG = yo5Var.g.g();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fG;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fG;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fG;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fG;
                }
                i |= iIntValue;
            }
        }
        nd2.y(tp5Var.g.t(519), tp5Var.g.t(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            j04 j04Var = (j04) arrayList.get(size2);
            nd2 nd2Var = j04Var.n;
            ArrayList arrayList2 = j04Var.g;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ((pj0) arrayList2.get(size3)).getClass();
                if ((0 & i) != 0) {
                    throw null;
                }
            }
        }
        return tp5Var;
    }

    @Override // defpackage.ri0
    public final void l(yo5 yo5Var) {
        ArrayList arrayList = this.m.y;
        if ((yo5Var.g.n() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((j04) arrayList.get(size)).v++;
            }
        }
    }

    @Override // defpackage.ri0
    public final void x(yo5 yo5Var) {
        ArrayList arrayList = this.m.y;
        if ((yo5Var.g.n() & 519) != 0) {
            this.a.remove(yo5Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j04 j04Var = (j04) arrayList.get(size);
                int i = j04Var.v;
                boolean z = i > 0;
                int i2 = i - 1;
                j04Var.v = i2;
                if (z && i2 == 0) {
                    j04Var.r();
                }
            }
        }
    }
}
