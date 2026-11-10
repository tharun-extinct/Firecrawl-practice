package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class h33<S> extends ps3 {
    public int k0;
    public qa0 l0;

    @Override // defpackage.pw1
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m(), this.k0));
        throw null;
    }

    @Override // defpackage.pw1
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.k0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.l0);
    }

    @Override // defpackage.pw1
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle == null) {
            bundle = this.w;
        }
        this.k0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.l0 = (qa0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        } else {
            uo1.B();
        }
    }
}
