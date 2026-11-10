package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Context t;

    public /* synthetic */ sn(Context context, byte b) {
        this.j = b;
        this.t = context;
    }

    @Override // defpackage.my1
    public final Object g() {
        int i;
        aq2 vp5Var;
        byte b = this.j;
        boolean zL = false;
        og5 og5Var = og5.g;
        Context context = this.t;
        switch (b) {
            case 0:
                kq2.N(context);
                return og5Var;
            case 1:
                kh0 kh0VarT = dc6.t(context);
                int i2 = kh0VarT == null ? -1 : no.g[kh0VarT.ordinal()];
                if (i2 == -1) {
                    i = R.string.message_error;
                } else if (i2 == 1) {
                    i = R.string.classic_mode_setup_toast_locked;
                } else {
                    if (i2 != 2) {
                        uo1.g();
                        return null;
                    }
                    i = R.string.classic_mode_setup_toast_unlocked;
                }
                bi6.f(context, i, true);
                return og5Var;
            case 2:
                kq2.N(context);
                return og5Var;
            case 3:
                try {
                    zL = kq2.L(gp4.F(context));
                    break;
                } catch (Exception unused) {
                }
                return Boolean.valueOf(zL);
            case 4:
                yl0 yl0VarF = gp4.F(context);
                Window window = yl0VarF.getWindow();
                jy3 jy3Var = new jy3(yl0VarF.getWindow().getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 35) {
                    vp5Var = new xp5(window, jy3Var);
                } else if (i3 >= 30) {
                    vp5Var = new wp5(window, jy3Var);
                } else {
                    vp5Var = i3 >= 26 ? new vp5(window, jy3Var) : new up5(window, jy3Var);
                }
                vp5Var.G(1);
                vp5Var.H(519);
                return og5Var;
            case 5:
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.toggleSoftInput(1, 0);
                }
                return og5Var;
            case 6:
                try {
                    Uri uri = Uri.parse("https://play.google.com/store/account/orderhistory");
                    uri.getClass();
                    context.startActivity(new Intent("android.intent.action.VIEW", uri));
                    break;
                } catch (Throwable unused2) {
                }
                return og5Var;
            default:
                return zq2.l(context);
        }
    }
}
