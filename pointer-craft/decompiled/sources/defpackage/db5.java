package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class db5 implements t33 {
    public final jq1 g;
    public final float y;

    public db5(jq1 jq1Var, float f) {
        this.g = jq1Var;
        this.y = f;
    }

    @Override // defpackage.t33
    public final int g(rf2 rf2Var, List list, int i) {
        Integer numValueOf;
        int iV = rf2Var.V(this.y);
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
        return Math.max(iV, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.t33
    public final int n(rf2 rf2Var, List list, int i) {
        Integer numValueOf;
        int iV = rf2Var.V(this.y);
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
        return Math.max(iV, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.t33
    public final u33 r(final v33 v33Var, List list, final long j) {
        int iT;
        int size = list.size();
        final int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            p33 p33Var = (p33) list.get(i2);
            if (yf2.p(ue5.S(p33Var), "navigationIcon")) {
                final us3 us3VarV = p33Var.v(ws0.y(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    p33 p33Var2 = (p33) list.get(i3);
                    if (yf2.p(ue5.S(p33Var2), "actionIcons")) {
                        final us3 us3VarV2 = p33Var2.v(ws0.y(j, 0, 0, 0, 0, 14));
                        if (ws0.t(j) == Integer.MAX_VALUE) {
                            iT = ws0.t(j);
                        } else {
                            iT = (ws0.t(j) - us3VarV.j) - us3VarV2.j;
                            if (iT < 0) {
                                iT = 0;
                            }
                        }
                        int i4 = iT;
                        int size3 = list.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            p33 p33Var3 = (p33) list.get(i5);
                            if (yf2.p(ue5.S(p33Var3), "title")) {
                                final us3 us3VarV3 = p33Var3.v(ws0.y(j, 0, i4, 0, 0, 12));
                                f72 f72Var = y6.y;
                                int iC0 = us3VarV3.c0(f72Var) != Integer.MIN_VALUE ? us3VarV3.c0(f72Var) : 0;
                                float fG = this.g.g();
                                int iZ = Float.isNaN(fG) ? 0 : k33.Z(fG);
                                final int iMax = Math.max(v33Var.V(this.y), us3VarV3.t);
                                if (ws0.j(j) == Integer.MAX_VALUE) {
                                    i = iMax;
                                } else {
                                    int i6 = iZ + iMax;
                                    if (i6 >= 0) {
                                        i = i6;
                                    }
                                }
                                final int i7 = iC0;
                                return v33Var.k0(ws0.t(j), i, qi1.j, new xy1(i, us3VarV3, us3VarV2, j, v33Var, this, i7, iMax) { // from class: cb5
                                    public final /* synthetic */ us3 a;
                                    public final /* synthetic */ us3 m;
                                    public final /* synthetic */ long q;
                                    public final /* synthetic */ int t;
                                    public final /* synthetic */ v33 w;

                                    @Override // defpackage.xy1
                                    public final Object a(Object obj) {
                                        int iT2;
                                        ts3 ts3Var = (ts3) obj;
                                        us3 us3Var = this.j;
                                        int i8 = us3Var.t;
                                        int i9 = this.t;
                                        ts3.m(ts3Var, us3Var, 0, (i9 - i8) / 2);
                                        int iMax2 = Math.max(this.w.V(mk.r), us3Var.j);
                                        us3 us3Var2 = this.m;
                                        int i10 = us3Var2.j;
                                        us3 us3Var3 = this.a;
                                        int i11 = us3Var3.j;
                                        long j2 = this.q;
                                        int iRound = Math.round((1.0f - 1.0f) * ((ws0.t(j2) - i11) / 2.0f));
                                        if (iRound >= iMax2) {
                                            if (us3Var3.j + iRound > ws0.t(j2) - i10) {
                                                iT2 = (ws0.t(j2) - i10) - (us3Var3.j + iRound);
                                            }
                                            ts3.m(ts3Var, us3Var3, iRound, (i9 - us3Var3.t) / 2);
                                            ts3.m(ts3Var, us3Var2, ws0.t(j2) - us3Var2.j, (i9 - us3Var2.t) / 2);
                                            return og5.g;
                                        }
                                        iT2 = iMax2 - iRound;
                                        iRound += iT2;
                                        ts3.m(ts3Var, us3Var3, iRound, (i9 - us3Var3.t) / 2);
                                        ts3.m(ts3Var, us3Var2, ws0.t(j2) - us3Var2.j, (i9 - us3Var2.t) / 2);
                                        return og5.g;
                                    }
                                });
                            }
                            i5++;
                            this = this;
                        }
                        tw2.y("Collection contains no element matching the predicate.");
                        l0.x();
                        return null;
                    }
                    i3++;
                    this = this;
                }
                tw2.y("Collection contains no element matching the predicate.");
                l0.x();
                return null;
            }
        }
        tw2.y("Collection contains no element matching the predicate.");
        l0.x();
        return null;
    }

    @Override // defpackage.t33
    public final int v(rf2 rf2Var, List list, int i) {
        int size = list.size();
        int iP = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iP += ((p33) list.get(i2)).P(i);
        }
        return iP;
    }

    @Override // defpackage.t33
    public final int y(rf2 rf2Var, List list, int i) {
        int size = list.size();
        int iY = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iY += ((p33) list.get(i2)).Y(i);
        }
        return iY;
    }
}
