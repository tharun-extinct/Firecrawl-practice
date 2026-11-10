package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ew0;
import defpackage.l0;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // defpackage.bw0
    public final void r(ew0 ew0Var) {
        if (ew0Var.j == 0) {
            ew0Var.j = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.bw0
    public final void y(View view) {
        if (view.getVisibility() != 8) {
            return;
        }
        l0.z("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
