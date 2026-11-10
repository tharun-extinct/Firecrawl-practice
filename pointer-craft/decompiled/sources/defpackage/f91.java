package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.appground.blek.R;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class f91 extends pw1 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final c91 j0;
    public final d91 k0;
    public int l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public boolean q0;
    public final v92 r0;
    public Dialog s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;

    public f91() {
        new ml((Object) this, (byte) 5);
        this.j0 = new c91(this);
        this.k0 = new d91(this);
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = true;
        this.o0 = true;
        this.p0 = -1;
        this.r0 = new v92((Object) this, (byte) 13);
        this.w0 = false;
    }

    @Override // defpackage.pw1
    public final void C() {
        this.M = true;
        Dialog dialog = this.s0;
        if (dialog != null) {
            this.t0 = true;
            dialog.setOnDismissListener(null);
            this.s0.dismiss();
            if (!this.u0) {
                onDismiss(this.s0);
            }
            this.s0 = null;
            this.w0 = false;
        }
    }

    @Override // defpackage.pw1
    public final void D() {
        this.M = true;
        if (!this.v0 && !this.u0) {
            this.u0 = true;
        }
        ka3 ka3Var = this.a0;
        ka3Var.getClass();
        ka3.g("removeObserver");
        lc4 lc4Var = ka3Var.y;
        WeakHashMap weakHashMap = lc4Var.a;
        ic4 ic4Var = lc4Var.j;
        while (ic4Var != null && !ic4Var.j.equals(this.r0)) {
            ic4Var = ic4Var.a;
        }
        ex2 ex2Var = null;
        if (ic4Var != null) {
            lc4Var.m--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((kc4) it.next()).g(ic4Var);
                }
            }
            ic4 ic4Var2 = ic4Var.m;
            ic4 ic4Var3 = ic4Var.a;
            if (ic4Var2 != null) {
                ic4Var2.a = ic4Var3;
            } else {
                lc4Var.j = ic4Var3;
            }
            ic4 ic4Var4 = ic4Var.a;
            if (ic4Var4 != null) {
                ic4Var4.m = ic4Var2;
            } else {
                lc4Var.t = ic4Var2;
            }
            ic4Var.a = null;
            ic4Var.m = null;
            ex2Var = ic4Var.t;
        }
        if (ex2Var == null) {
            return;
        }
        ex2Var.g(false);
    }

    @Override // defpackage.pw1
    public final LayoutInflater E(Bundle bundle) {
        LayoutInflater layoutInflaterE = super.E(bundle);
        boolean z = this.o0;
        if (z && !this.q0) {
            if (z && !this.w0) {
                try {
                    this.q0 = true;
                    Dialog dialogR = R();
                    this.s0 = dialogR;
                    if (this.o0) {
                        int i = this.l0;
                        if (i == 1 || i == 2) {
                            dialogR.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogR.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogR.requestWindowFeature(1);
                        }
                        Context contextM = m();
                        if (contextM != null) {
                            this.s0.setOwnerActivity((Activity) contextM);
                        }
                        this.s0.setCancelable(this.n0);
                        this.s0.setOnCancelListener(this.j0);
                        this.s0.setOnDismissListener(this.k0);
                        this.w0 = true;
                    } else {
                        this.s0 = null;
                    }
                    this.q0 = false;
                } catch (Throwable th) {
                    this.q0 = false;
                    throw th;
                }
            }
            if (kx1.N(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.s0;
            if (dialog != null) {
                return layoutInflaterE.cloneInContext(dialog.getContext());
            }
        } else if (kx1.N(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.o0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterE;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterE;
    }

    @Override // defpackage.pw1
    public void F(Bundle bundle) {
        Dialog dialog = this.s0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.l0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.m0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.n0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.o0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.p0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.pw1
    public void G() {
        this.M = true;
        Dialog dialog = this.s0;
        if (dialog != null) {
            this.t0 = false;
            dialog.show();
            View decorView = this.s0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.pw1
    public void H() {
        this.M = true;
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.pw1
    public final void J(Bundle bundle) {
        Bundle bundle2;
        this.M = true;
        if (this.s0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.s0.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.pw1
    public final void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.K(layoutInflater, viewGroup, bundle);
        if (this.O != null || this.s0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.s0.onRestoreInstanceState(bundle2);
    }

    public Dialog R() {
        if (kx1.N(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new em0(N(), this.m0);
    }

    @Override // defpackage.pw1
    public void e(Bundle bundle) {
        super.e(bundle);
        new Handler();
        this.o0 = this.F == 0;
        if (bundle != null) {
            this.l0 = bundle.getInt("android:style", 0);
            this.m0 = bundle.getInt("android:theme", 0);
            this.n0 = bundle.getBoolean("android:cancelable", true);
            this.o0 = bundle.getBoolean("android:showsDialog", this.o0);
            this.p0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.pw1
    public final ue5 g() {
        return new e91(this, new lw1(this));
    }

    @Override // defpackage.pw1
    public final void k(yk ykVar) {
        ex2 ex2Var;
        super.k(ykVar);
        ka3 ka3Var = this.a0;
        ka3Var.getClass();
        ka3.g("observeForever");
        v92 v92Var = this.r0;
        ex2 ex2Var2 = new ex2(ka3Var, v92Var);
        lc4 lc4Var = ka3Var.y;
        ic4 ic4Var = lc4Var.j;
        while (ic4Var != null && !ic4Var.j.equals(v92Var)) {
            ic4Var = ic4Var.a;
        }
        if (ic4Var != null) {
            ex2Var = ic4Var.t;
        } else {
            ic4 ic4Var2 = new ic4(v92Var, ex2Var2);
            lc4Var.m++;
            ic4 ic4Var3 = lc4Var.t;
            if (ic4Var3 == null) {
                lc4Var.j = ic4Var2;
                lc4Var.t = ic4Var2;
            } else {
                ic4Var3.a = ic4Var2;
                ic4Var2.m = ic4Var3;
                lc4Var.t = ic4Var2;
            }
            ex2Var = null;
        }
        if (ex2Var == null) {
            ex2Var2.g(true);
        }
        if (this.v0) {
            return;
        }
        this.u0 = false;
    }

    @Override // defpackage.pw1
    public final void o() {
        this.M = true;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.t0) {
            return;
        }
        if (kx1.N(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.u0) {
            return;
        }
        this.u0 = true;
        this.v0 = false;
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.s0.dismiss();
        }
        this.t0 = true;
        if (this.p0 < 0) {
            fw fwVar = new fw(w());
            fwVar.i = true;
            fwVar.j(this);
            fwVar.v(true, true);
            return;
        }
        kx1 kx1VarW = w();
        int i = this.p0;
        if (i < 0) {
            l0.u(xi3.j("Bad id: ", i));
        } else {
            kx1VarW.d(new ix1(kx1VarW, i), true);
            this.p0 = -1;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
