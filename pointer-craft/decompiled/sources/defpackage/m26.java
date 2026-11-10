package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m26 {
    public static final /* synthetic */ int g = 0;

    static {
        int i = o26.l;
    }

    public static String g(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + nc6.s(exc.getMessage());
            int i = i06.g;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            i06.t("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static yb6 r(int i, mc6 mc6Var) {
        try {
            pb6 pb6VarP = yb6.p();
            pb6VarP.y();
            yb6.s((yb6) pb6VarP.t, i);
            if (!mc6Var.equals(mc6.t)) {
                pb6VarP.y();
                yb6.z((yb6) pb6VarP.t, mc6Var);
            }
            return (yb6) pb6VarP.g();
        } catch (Exception e) {
            i06.t("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static mb6 y(int i, int i2, x20 x20Var, String str, mc6 mc6Var) {
        try {
            ac6 ac6VarP = fc6.p();
            ac6VarP.n(x20Var.g);
            String str2 = x20Var.r;
            ac6VarP.y();
            fc6.z((fc6) ac6VarP.t, str2);
            int i3 = x20Var.y;
            if (i3 != 0) {
                ac6VarP.y();
                fc6.o((fc6) ac6VarP.t, i3);
            }
            if (i != 0) {
                ac6VarP.r(i);
            }
            if (str != null) {
                ac6VarP.y();
                fc6.u((fc6) ac6VarP.t, str);
            }
            kb6 kb6VarZ = mb6.z();
            kb6VarZ.r(ac6VarP);
            kb6VarZ.v(i2);
            if (!mc6Var.equals(mc6.t)) {
                kb6VarZ.y();
                mb6.f((mb6) kb6VarZ.t, mc6Var);
            }
            return (mb6) kb6VarZ.g();
        } catch (Throwable th) {
            i06.t("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }
}
