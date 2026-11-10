package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.g;
import com.google.android.material.datepicker.v;

/* JADX INFO: loaded from: classes2.dex */
public final class o23 implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final Object t;

    public o23(oa5 oa5Var) {
        this.j = (byte) 2;
        this.a = oa5Var;
        Context context = oa5Var.g.getContext();
        CharSequence charSequence = oa5Var.j;
        t3 t3Var = new t3();
        t3Var.v = 4096;
        t3Var.l = 4096;
        t3Var.q = null;
        t3Var.w = null;
        t3Var.c = false;
        t3Var.i = false;
        t3Var.b = 16;
        t3Var.t = context;
        t3Var.g = charSequence;
        this.t = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.j;
        Object obj = this.t;
        Object obj2 = this.a;
        switch (b) {
            case 0:
                u23 u23Var = (u23) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) u23Var.q0.getLayoutManager();
                View viewC1 = linearLayoutManager.c1(0, linearLayoutManager.G(), false);
                int iR = viewC1 == null ? -1 : g.R(viewC1);
                v vVar = (v) obj;
                vVar.j = 2;
                u23Var.T(vVar.x(iR + 1));
                break;
            case 1:
                u23 u23Var2 = (u23) obj2;
                int iA1 = ((LinearLayoutManager) u23Var2.q0.getLayoutManager()).a1();
                v vVar2 = (v) obj;
                vVar2.j = 1;
                u23Var2.T(vVar2.x(iA1 - 1));
                break;
            default:
                oa5 oa5Var = (oa5) obj2;
                Window.Callback callback = oa5Var.m;
                if (callback != null && oa5Var.q) {
                    callback.onMenuItemSelected(0, (t3) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o23(u23 u23Var, v vVar, byte b) {
        this.j = b;
        this.a = u23Var;
        this.t = vVar;
    }
}
