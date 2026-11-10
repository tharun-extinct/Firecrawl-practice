package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class fl5 extends dg {
    public final View I;
    public final ag3 J;
    public tc4 K;
    public xy1 L;
    public xy1 M;
    public xy1 N;

    public fl5(Context context, xy1 xy1Var, f02 f02Var, uc4 uc4Var, int i, pn3 pn3Var) {
        View view = (View) xy1Var.a(context);
        ag3 ag3Var = new ag3();
        super(context, f02Var, i, ag3Var, view, pn3Var);
        this.I = view;
        this.J = ag3Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objX = uc4Var != null ? uc4Var.x(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objX instanceof SparseArray ? (SparseArray) objX : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (uc4Var != null) {
            setSavableRegistryEntry(uc4Var.g(strValueOf, new yf(this, (byte) 2)));
        }
        l1 l1Var = k33.g;
        this.L = l1Var;
        this.M = l1Var;
        this.N = l1Var;
    }

    public static final void i(fl5 fl5Var) {
        fl5Var.N.a(fl5Var.I);
        fl5Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(tc4 tc4Var) {
        tc4 tc4Var2 = this.K;
        if (tc4Var2 != null) {
            ((ro) tc4Var2).f0();
        }
        this.K = tc4Var;
    }

    public final ag3 getDispatcher() {
        return this.J;
    }

    public final xy1 getReleaseBlock() {
        return this.N;
    }

    public final xy1 getResetBlock() {
        return this.M;
    }

    public /* bridge */ /* synthetic */ d getSubCompositionView() {
        return null;
    }

    public final xy1 getUpdateBlock() {
        return this.L;
    }

    public final void setReleaseBlock(xy1 xy1Var) {
        this.N = xy1Var;
        setRelease(new yf(this, (byte) 3));
    }

    public final void setResetBlock(xy1 xy1Var) {
        this.M = xy1Var;
        setReset(new m63(this, (byte) 10));
    }

    public final void setUpdateBlock(xy1 xy1Var) {
        this.L = xy1Var;
        setUpdate(new yf(this, (byte) 4));
    }

    public View getViewRoot() {
        return this;
    }
}
