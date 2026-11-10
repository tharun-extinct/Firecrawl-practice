package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes.dex */
public final class ww1 implements xy1 {
    public final int j;
    public FragmentContainerView t;

    public ww1(int i) {
        this.j = i;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView((Context) obj);
        fragmentContainerView.setId(this.j);
        this.t = fragmentContainerView;
        return fragmentContainerView;
    }

    public final FragmentContainerView n() {
        FragmentContainerView fragmentContainerView = this.t;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        uo1.x(du4.w(this.j, "AndroidView has not created a container for ", " yet"));
        return null;
    }
}
