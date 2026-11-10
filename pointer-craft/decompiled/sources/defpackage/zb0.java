package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class zb0 extends jv2 {
    public final /* synthetic */ byte s = 1;

    public /* synthetic */ zb0(Context context) {
        super(context);
    }

    @Override // defpackage.jv2
    public float n(DisplayMetrics displayMetrics) {
        switch (this.s) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.n(displayMetrics);
        }
    }

    @Override // defpackage.jv2
    public int r(View view, int i) {
        switch (this.s) {
            case 0:
                return 0;
            default:
                return super.r(view, i);
        }
    }

    @Override // defpackage.jv2
    public PointF x(int i) {
        switch (this.s) {
            case 0:
                return null;
            default:
                return super.x(i);
        }
    }

    @Override // defpackage.jv2
    public int y(View view, int i) {
        switch (this.s) {
            case 0:
                return 0;
            default:
                return super.y(view, i);
        }
    }

    public zb0(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
