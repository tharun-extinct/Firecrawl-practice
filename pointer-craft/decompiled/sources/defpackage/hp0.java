package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hp0 {
    public static final vf1 g = new vf1(new y4(24), (byte) 1);
    public static final vf1 y = new vf1(new y4(25), (byte) 1);
    public static final vf1 r = new vf1(new cp0((byte) 3), (byte) 1);
    public static final vf1 n = new vf1(new cp0((byte) 4), (byte) 1);
    public static final vf1 v = new vf1(new cp0((byte) 5), (byte) 1);
    public static final vf1 x = new vf1(new cp0((byte) 6), (byte) 1);
    public static final vf1 l = new vf1(new cp0((byte) 8), (byte) 1);
    public static final vf1 j = new vf1(new cp0((byte) 11), (byte) 1);
    public static final vf1 t = new vf1(new cp0((byte) 12), (byte) 1);
    public static final vf1 a = new vf1(new cp0((byte) 13), (byte) 1);
    public static final vf1 m = new vf1(new cp0((byte) 7), (byte) 1);
    public static final vf1 q = new vf1(new cp0((byte) 14), (byte) 1);
    public static final vf1 w = new vf1(new cp0((byte) 17), (byte) 1);
    public static final vf1 c = new vf1(new cp0((byte) 20), (byte) 1);
    public static final vf1 i = new vf1(new cp0((byte) 21), (byte) 1);
    public static final vf1 b = new vf1(new cp0((byte) 22), (byte) 1);
    public static final vf1 s = new vf1(new cp0((byte) 23), (byte) 1);
    public static final vf1 p = new vf1(new cp0((byte) 24), (byte) 1);
    public static final vf1 u = new vf1(new cp0((byte) 25), (byte) 1);
    public static final vf1 z = new vf1(new y4(28), (byte) 1);
    public static final vf1 h = new vf1(new y4(29), (byte) 1);
    public static final vf1 o = new vf1(new cp0((byte) 0), (byte) 1);
    public static final vf1 f = new vf1(new cp0((byte) 1), (byte) 1);
    public static final vf1 k = new vf1(new cp0((byte) 2), (byte) 0);
    public static final vf1 d = new vf1(new cp0((byte) 29), (byte) 1);

    public static final void g(pn3 pn3Var, rf rfVar, nm0 nm0Var, h02 h02Var, int i2) {
        h02Var.Z(1925803616);
        int i3 = i2 | (h02Var.x(pn3Var) ? 4 : 2) | (h02Var.x(rfVar) ? 32 : 16) | (h02Var.j(nm0Var) ? 256 : 128);
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            ba baVar = (ba) pn3Var;
            m14 m14VarG = g.g(baVar.getAccessibilityManager());
            m14 m14VarG2 = y.g(baVar.getAutofill());
            m14 m14VarG3 = n.g(baVar.m4getAutofillManager());
            m14 m14VarG4 = r.g(baVar.getAutofillTree());
            m14 m14VarG5 = v.g(baVar.getClipboardManager());
            m14 m14VarG6 = x.g(baVar.getClipboard());
            m14 m14VarG7 = j.g(baVar.getDensity());
            m14 m14VarG8 = t.g(baVar.getFocusOwner());
            m14 m14VarG9 = a.g(baVar.getFontLoader());
            m14VarG9.l = false;
            m14 m14VarG10 = m.g(baVar.getFontFamilyResolver());
            m14VarG10.l = false;
            m14 m14VarG11 = q.g(baVar.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (z2 || objK == l76Var) {
                objK = new p9(baVar, (byte) 4);
                h02Var.i0(objK);
            }
            m14 m14VarR = w.r((xy1) objK);
            m14 m14VarG12 = c.g(baVar.getLayoutDirection());
            boolean z3 = i4 == 4;
            Object objK2 = h02Var.K();
            if (z3 || objK2 == l76Var) {
                objK2 = new p9(baVar, (byte) 5);
                h02Var.i0(objK2);
            }
            m14 m14VarR2 = b.r((xy1) objK2);
            boolean z4 = i4 == 4;
            Object objK3 = h02Var.K();
            if (z4 || objK3 == l76Var) {
                objK3 = new p9(baVar, (byte) 6);
                h02Var.i0(objK3);
            }
            m14 m14VarR3 = s.r((xy1) objK3);
            boolean z5 = i4 == 4;
            Object objK4 = h02Var.K();
            if (z5 || objK4 == l76Var) {
                objK4 = new p9(baVar, (byte) 7);
                h02Var.i0(objK4);
            }
            m14 m14VarR4 = p.r((xy1) objK4);
            m14 m14VarG13 = u.g(rfVar);
            m14 m14VarG14 = z.g(baVar.getViewConfiguration());
            m14 m14VarG15 = h.g(baVar.getWindowInfo());
            boolean z6 = i4 == 4;
            Object objK5 = h02Var.K();
            if (z6 || objK5 == l76Var) {
                objK5 = new p9(baVar, (byte) 8);
                h02Var.i0(objK5);
            }
            og0.r(new m14[]{m14VarG, m14VarG2, m14VarG3, m14VarG4, m14VarG5, m14VarG6, m14VarG7, m14VarG8, m14VarG9, m14VarG10, m14VarG11, m14VarR, m14VarG12, m14VarR2, m14VarR3, m14VarR4, m14VarG13, m14VarG14, m14VarG15, f.r((xy1) objK5), l.g(baVar.getGraphicsContext()), px2.g.g(baVar.getRetainedValuesStore()), i.g(baVar.getLocaleList())}, nm0Var, h02Var, ((i3 >> 3) & 112) | 8);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new nn(pn3Var, rfVar, nm0Var, i2, (byte) 3);
        }
    }

    public static final void y(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
