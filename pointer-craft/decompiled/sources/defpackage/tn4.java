package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes.dex */
public final class tn4 extends ViewOutlineProvider {
    public final Rect g = new Rect();
    public final /* synthetic */ ShapeableImageView y;

    public tn4(ShapeableImageView shapeableImageView) {
        this.y = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.y;
        if (shapeableImageView.u == null) {
            return;
        }
        if (shapeableImageView.p == null) {
            shapeableImageView.p = new g33(shapeableImageView.u);
        }
        RectF rectF = shapeableImageView.q;
        Rect rect = this.g;
        rectF.round(rect);
        shapeableImageView.p.setBounds(rect);
        shapeableImageView.p.getOutline(outline);
    }
}
