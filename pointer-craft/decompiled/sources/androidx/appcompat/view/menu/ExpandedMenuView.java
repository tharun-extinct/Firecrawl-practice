package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.h43;
import defpackage.h53;
import defpackage.i43;
import defpackage.n43;
import defpackage.ro;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements h43, h53, AdapterView.OnItemClickListener {
    public static final int[] t = {R.attr.background, R.attr.divider};
    public i43 j;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ro roVarP = ro.P(R.attr.listViewStyle, 0, context, attributeSet, t);
        TypedArray typedArray = (TypedArray) roVarP.t;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(roVarP.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(roVarP.h(1));
        }
        roVarP.S();
    }

    @Override // defpackage.h43
    public final boolean g(n43 n43Var) {
        return this.j.p(n43Var, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        g((n43) getAdapter().getItem(i));
    }

    @Override // defpackage.h53
    public final void y(i43 i43Var) {
        this.j = i43Var;
    }
}
