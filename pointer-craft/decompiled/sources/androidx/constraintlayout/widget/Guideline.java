package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.fs0;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public boolean j;

    public Guideline(Context context) {
        super(context);
        this.j = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.j = z;
    }

    public void setGuidelineBegin(int i) {
        fs0 fs0Var = (fs0) getLayoutParams();
        if (this.j && fs0Var.g == i) {
            return;
        }
        fs0Var.g = i;
        setLayoutParams(fs0Var);
    }

    public void setGuidelineEnd(int i) {
        fs0 fs0Var = (fs0) getLayoutParams();
        if (this.j && fs0Var.y == i) {
            return;
        }
        fs0Var.y = i;
        setLayoutParams(fs0Var);
    }

    public void setGuidelinePercent(float f) {
        fs0 fs0Var = (fs0) getLayoutParams();
        if (this.j && fs0Var.r == f) {
            return;
        }
        fs0Var.r = f;
        setLayoutParams(fs0Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = true;
        super.setVisibility(8);
    }
}
