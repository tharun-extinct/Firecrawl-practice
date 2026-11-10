package defpackage;

import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qz5 {
    public static final nm0 g = new nm0(2037756225, false, new at(28));
    public static final nm0 y = new nm0(675325854, false, new at(29));
    public static final nm0 r = new nm0(44534519, false, new bn0(5));
    public static final nm0 n = new nm0(2018932405, false, new gn0(0));
    public static final nm0 v = new nm0(-481849546, false, new gn0(1));

    public static z70 g(h02 h02Var) {
        h02Var.Y(207135993);
        vf1 vf1Var = ep0.v;
        z70 z70Var = new z70(((wf1) h02Var.a(vf1Var)).g, ((wf1) h02Var.a(vf1Var)).y);
        h02Var.b(false);
        return z70Var;
    }

    public static final bz2 n(bz2 bz2Var) {
        um2 um2Var = bz2Var.B.B;
        while (true) {
            um2 um2VarO = um2Var.o();
            um2 um2Var2 = null;
            if ((um2VarO != null ? um2VarO.i : null) == null) {
                bz2 bz2VarW0 = um2Var.M.n.W0();
                bz2VarW0.getClass();
                return bz2VarW0;
            }
            um2 um2VarO2 = um2Var.o();
            if (um2VarO2 != null) {
                um2Var2 = um2VarO2.i;
            }
            um2Var2.getClass();
            um2 um2VarO3 = um2Var.o();
            um2VarO3.getClass();
            um2Var = um2VarO3.i;
            um2Var.getClass();
        }
    }

    public static IntStream r(CharSequence charSequence) {
        return charSequence.codePoints();
    }

    public static IntStream y(CharSequence charSequence) {
        return charSequence.chars();
    }
}
