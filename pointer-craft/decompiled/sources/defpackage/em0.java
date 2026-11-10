package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public class em0 extends Dialog implements gu2, vj3, gf3, id4 {
    public final o05 a;
    public ju2 j;
    public final o05 m;
    public final ji t;

    public em0(Context context, int i) {
        super(context, i);
        final byte b = 0;
        this.t = new ji(new hd4(this, new gd4(this, b)));
        this.a = new o05(new my1(this) { // from class: dm0
            public final /* synthetic */ em0 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b2 = b;
                em0 em0Var = this.t;
                switch (b2) {
                    case 0:
                        ca1 ca1Var = new ca1();
                        em0Var.g().a(ca1Var);
                        return ca1Var;
                    default:
                        return new tj3(new j4(em0Var, (byte) 5));
                }
            }
        });
        final byte b2 = 1;
        this.m = new o05(new my1(this) { // from class: dm0
            public final /* synthetic */ em0 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b2;
                em0 em0Var = this.t;
                switch (b3) {
                    case 0:
                        ca1 ca1Var = new ca1();
                        em0Var.g().a(ca1Var);
                        return ca1Var;
                    default:
                        return new tj3(new j4(em0Var, (byte) 5));
                }
            }
        });
    }

    public static final void x(em0 em0Var) {
        super.onBackPressed();
    }

    @Override // defpackage.gu2
    public final ju2 a() {
        return n();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        v();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.gf3
    public final kb5 g() {
        return y().y().r;
    }

    public final ju2 n() {
        ju2 ju2Var = this.j;
        if (ju2Var != null) {
            return ju2Var;
        }
        ju2 ju2Var2 = new ju2(this, true);
        this.j = ju2Var2;
        return ju2Var2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((ca1) this.a.getValue()).g();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            tj3 tj3VarY = y();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            tj3VarY.r(onBackInvokedDispatcher);
        }
        this.t.Q(bundle);
        n().n(vt2.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.t.R(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        n().n(vt2.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        n().n(vt2.ON_DESTROY);
        this.j = null;
        super.onStop();
    }

    @Override // defpackage.id4
    public final ji r() {
        return (ji) this.t.a;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        v();
        super.setContentView(view);
    }

    public final void v() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.vj3
    public final tj3 y() {
        return (tj3) this.m.getValue();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        v();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        v();
        super.setContentView(view, layoutParams);
    }
}
