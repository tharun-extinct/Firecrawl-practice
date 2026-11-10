package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gh implements t33 {
    public final oh g;
    public int l;
    public int n;
    public us3[] r;
    public int v;
    public int x;
    public us3[] y;
    public final fh j = new fh(this, (byte) 1);
    public final fh t = new fh(this, (byte) 0);

    public gh(oh ohVar) {
        this.g = ohVar;
    }

    @Override // defpackage.t33
    public final int g(rf2 rf2Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((p33) list.get(0)).x(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((p33) list.get(i2)).x(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.t33
    public final int n(rf2 rf2Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((p33) list.get(0)).Z(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((p33) list.get(i2)).Z(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        fp3 fp3Var;
        int size = list.size();
        us3[] us3VarArr = new us3[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            p33 p33Var = (p33) list.get(i);
            Object objA = p33Var.a();
            jh jhVar = objA instanceof jh ? (jh) objA : null;
            if (jhVar != null && ((Boolean) jhVar.g.getValue()).booleanValue()) {
                us3 us3VarV = p33Var.v(j);
                long j3 = (((long) us3VarV.t) & 4294967295L) | (((long) us3VarV.j) << 32);
                us3VarArr[i] = us3VarV;
                j2 = j3;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            p33 p33Var2 = (p33) list.get(i2);
            if (us3VarArr[i2] == null) {
                us3VarArr[i2] = p33Var2.v(j);
            }
        }
        if (v33Var.u()) {
            fp3Var = new fp3(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                us3 us3Var = us3VarArr[i5];
                if (us3Var != null) {
                    Object objA2 = ((p33) list.get(i5)).a();
                    jh jhVar2 = objA2 instanceof jh ? (jh) objA2 : null;
                    if (jhVar2 == null || !((Boolean) jhVar2.y.getValue()).booleanValue()) {
                        int i6 = us3Var.j;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = us3Var.t;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            fp3Var = new fp3(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) fp3Var.j).intValue();
        int iIntValue2 = ((Number) fp3Var.t).intValue();
        boolean zU = v33Var.u();
        qi1 qi1Var = qi1.j;
        if (zU) {
            this.y = us3VarArr;
            this.n = iIntValue;
            this.x = iIntValue2;
            return v33Var.k0(iIntValue, iIntValue2, qi1Var, this.j);
        }
        this.g.r.setValue(new qe2((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.r = us3VarArr;
        this.v = iIntValue;
        this.l = iIntValue2;
        return v33Var.k0(iIntValue, iIntValue2, qi1Var, this.t);
    }

    @Override // defpackage.t33
    public final int v(rf2 rf2Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((p33) list.get(0)).P(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((p33) list.get(i2)).P(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.t33
    public final int y(rf2 rf2Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((p33) list.get(0)).Y(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((p33) list.get(i2)).Y(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
