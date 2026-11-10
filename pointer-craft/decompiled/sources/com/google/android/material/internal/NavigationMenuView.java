package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.h53;
import defpackage.i43;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements h53 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.h53
    public final void y(i43 i43Var) {
    }
}
