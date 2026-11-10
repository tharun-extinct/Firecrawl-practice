package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes2.dex */
public final class a53 extends ef1 {
    public n43 f;
    public final byte h;
    public m43 o;
    public final byte z;

    public a53(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.z = (byte) 21;
            this.h = (byte) 22;
        } else {
            this.z = (byte) 22;
            this.h = (byte) 21;
        }
    }

    @Override // defpackage.ef1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        f43 f43Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                f43Var = (f43) headerViewListAdapter.getWrappedAdapter();
            } else {
                f43Var = (f43) adapter;
                headersCount = 0;
            }
            n43 n43VarY = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= f43Var.getCount()) ? null : f43Var.getItem(i);
            n43 n43Var = this.f;
            if (n43Var != n43VarY) {
                i43 i43Var = f43Var.g;
                if (n43Var != null) {
                    this.o.t(i43Var, n43Var);
                }
                this.f = n43VarY;
                if (n43VarY != null) {
                    this.o.w(i43Var, n43VarY);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.z) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.h) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (f43) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (f43) adapter).g.n(false);
        return true;
    }

    public void setHoverListener(m43 m43Var) {
        this.o = m43Var;
    }

    @Override // defpackage.ef1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
