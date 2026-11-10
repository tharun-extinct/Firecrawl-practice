package defpackage;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class vi2 extends gy {
    public my1 u0 = new ym0((byte) 28);

    @Override // defpackage.pw1
    public final void A(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
    }

    @Override // defpackage.gy
    public final boolean Y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        viewGroup.removeAllViews();
        ComposeView composeView = new ComposeView(N(), null, 6);
        composeView.setContent(new nm0(318200523, true, new ed(this, (byte) 10)));
        viewGroup.addView(composeView);
        return false;
    }
}
