package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class y3 extends cm implements a4 {
    public final /* synthetic */ z3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(z3 z3Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.m = z3Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        zy5.y(this, getContentDescription());
        setOnTouchListener(new u3(this, this));
    }

    @Override // defpackage.a4
    public final boolean g() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.m.q();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }

    @Override // defpackage.a4
    public final boolean y() {
        return false;
    }
}
