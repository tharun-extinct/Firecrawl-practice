package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rt {
    public iv4 a;
    public final qr0 g;
    public final tp3 j;
    public final tp3 l;
    public final List m;
    public final Context n;
    public final List q;
    public final zi2 r;
    public final tp3 t;
    public final tp3 v;
    public final tp3 x;
    public final ox0 y;

    public rt(qr0 qr0Var, ox0 ox0Var, zi2 zi2Var, Context context) {
        qr0Var.getClass();
        ox0Var.getClass();
        zi2Var.getClass();
        context.getClass();
        this.g = qr0Var;
        this.y = ox0Var;
        this.r = zi2Var;
        this.n = context;
        this.v = kq2.M(ny3.g);
        this.x = kq2.M("");
        this.l = kq2.M("");
        this.j = kq2.M(null);
        this.t = kq2.M("");
        this.m = pw5.d(100, 50, 53, 135, 137, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 45, 46, 47, 48, 49, 51, 52, 54, 55, 56);
        this.q = pw5.d(new fp3(0, "Base"), new fp3(2, "Shift"), new fp3(64, "AltGr"), new fp3(66, "Shift + AltGr"));
    }

    public final void g(String str) {
        str.getClass();
        Uri uri = Uri.parse(str);
        uri.getClass();
        boolean zP = yf2.p(uri.getHost(), "appground.io");
        byte b = 6;
        mu0 mu0Var = null;
        ox0 ox0Var = this.y;
        if (!zP || !yf2.p(uri.getPath(), "/keyboard")) {
            m50.T(ox0Var, null, new c(str, this, mu0Var, b), 3);
            return;
        }
        String queryParameter = uri.getQueryParameter("c");
        if (queryParameter != null) {
            m50.T(ox0Var, null, new c(queryParameter, this, mu0Var, b), 3);
        } else if (uri.getQueryParameter("start") != null || yf2.p(uri.getQuery(), "start")) {
            r();
        } else {
            y(my3.g);
        }
    }

    public final void r() {
        y(new ry3(0.0f));
        iv4 iv4VarT = m50.T(this.y, null, new qt(this, null), 3);
        iv4VarT.A(new ks(this, (byte) 2));
        this.a = iv4VarT;
    }

    public final void y(uy3 uy3Var) {
        this.v.setValue(uy3Var);
    }
}
