package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x43 implements mp4, f53, AdapterView.OnItemClickListener {
    public Rect j;

    public static int w(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void b(int i);

    public abstract void c(View view);

    public abstract void i(boolean z);

    @Override // defpackage.f53
    public final boolean n(n43 n43Var) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (f43) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f43) listAdapter).g.p((MenuItem) listAdapter.getItem(i), this, !(this instanceof fc0) ? 0 : 4);
    }

    public abstract void p(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(int i);

    public abstract void u(boolean z);

    @Override // defpackage.f53
    public final boolean x(n43 n43Var) {
        return false;
    }

    public abstract void z(int i);

    public void q(i43 i43Var) {
    }

    @Override // defpackage.f53
    public final void t(Context context, i43 i43Var) {
    }
}
