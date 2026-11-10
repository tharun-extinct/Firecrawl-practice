package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import io.appground.blek.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jx implements View.OnClickListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ gy t;

    public /* synthetic */ jx(gy gyVar, byte b) {
        this.j = b;
        this.t = gyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aq2 vp5Var;
        byte b = this.j;
        gy gyVar = this.t;
        switch (b) {
            case 0:
                rk4 rk4Var = gyVar.T().f;
                if (rk4Var != null) {
                    rk4Var.V(wk1.g);
                }
                break;
            case 1:
                gp gpVarS = gyVar.S();
                gpVarS.x(ip.g(gpVarS.v(), null, true, false, 5));
                break;
            case 2:
                rk4 rk4Var2 = gyVar.T().f;
                if (rk4Var2 != null) {
                    rk4Var2.V(vk1.g);
                }
                break;
            case 3:
                view.getClass();
                CheckBox checkBox = (CheckBox) view;
                if (gyVar.X()) {
                    bi6.f(gyVar.N(), checkBox.isChecked() ? R.string.text_visibility_hidden : R.string.text_visibility_visible, false);
                } else if (checkBox.isChecked()) {
                    checkBox.setChecked(false);
                    gyVar.S().l(Integer.valueOf(R.string.premium_feature_password_mode), "password_mode");
                }
                break;
            default:
                gyVar.b0();
                tw1 tw1Var = gyVar.j0;
                tw1Var.getClass();
                if (tw1Var.t.isFocused()) {
                    tw1 tw1Var2 = gyVar.j0;
                    tw1Var2.getClass();
                    tw1Var2.m.q(view.getId(), true);
                }
                tw1 tw1Var3 = gyVar.j0;
                tw1Var3.getClass();
                LinearLayout linearLayout = tw1Var3.g;
                WeakHashMap weakHashMap = xk5.g;
                tp5 tp5VarG = qk5.g(linearLayout);
                if (!(tp5VarG != null ? tp5VarG.g.h(8) : false)) {
                    Window window = gyVar.M().getWindow();
                    tw1 tw1Var4 = gyVar.j0;
                    tw1Var4.getClass();
                    jy3 jy3Var = new jy3((View) tw1Var4.g);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 35) {
                        vp5Var = new xp5(window, jy3Var);
                    } else if (i >= 30) {
                        vp5Var = new wp5(window, jy3Var);
                    } else {
                        vp5Var = i >= 26 ? new vp5(window, jy3Var) : new up5(window, jy3Var);
                    }
                    vp5Var.H(8);
                }
                break;
        }
    }
}
