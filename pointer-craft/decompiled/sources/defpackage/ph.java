package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ph implements t33 {
    public final ei g;
    public boolean y;

    public ph(ei eiVar) {
        this.g = eiVar;
    }

    @Override // defpackage.t33
    public final int g(rf2 rf2Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iX = ((p33) list.get(0)).x(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iX2 = ((p33) list.get(i2)).x(i);
                if (iX2 > iX) {
                    iX = iX2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iX;
    }

    @Override // defpackage.t33
    public final int n(rf2 rf2Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iZ = ((p33) list.get(0)).Z(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iZ2 = ((p33) list.get(i2)).Z(i);
                if (iZ2 > iZ) {
                    iZ = iZ2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iZ;
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        tp3 tp3Var = this.g.g;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            us3 us3VarV = ((p33) list.get(i)).v(j);
            iMax = Math.max(iMax, us3VarV.j);
            iMax2 = Math.max(iMax2, us3VarV.t);
            arrayList.add(us3VarV);
        }
        if (v33Var.u()) {
            this.y = true;
            tp3Var.setValue(new qe2((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.y) {
            tp3Var.setValue(new qe2((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return v33Var.k0(iMax, iMax2, qi1.j, new zg(arrayList, (byte) 1));
    }

    @Override // defpackage.t33
    public final int v(rf2 rf2Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iP = ((p33) list.get(0)).P(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iP2 = ((p33) list.get(i2)).P(i);
                if (iP2 > iP) {
                    iP = iP2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iP;
    }

    @Override // defpackage.t33
    public final int y(rf2 rf2Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iY = ((p33) list.get(0)).Y(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iY2 = ((p33) list.get(i2)).Y(i);
                if (iY2 > iY) {
                    iY = iY2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iY;
    }
}
