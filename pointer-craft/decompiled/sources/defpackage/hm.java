package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hm extends SeekBar {
    public final im j;

    public hm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        t85.g(this, getContext());
        im imVar = new im(this);
        this.j = imVar;
        imVar.f(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        im imVar = this.j;
        hm hmVar = imVar.q;
        Drawable drawable = imVar.w;
        if (drawable != null && drawable.isStateful() && drawable.setState(hmVar.getDrawableState())) {
            hmVar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.j.w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.j.R(canvas);
    }
}
