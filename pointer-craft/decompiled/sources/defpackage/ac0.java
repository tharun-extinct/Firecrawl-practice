package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ac0 extends w44 {
    public final Paint g;
    public final List y;

    public ac0() {
        Paint paint = new Paint();
        this.g = paint;
        this.y = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.w44
    public final void x(Canvas canvas, RecyclerView recyclerView) {
        int paddingRight;
        Canvas canvas2;
        int paddingBottom;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.g;
        paint.setStrokeWidth(dimension);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((dk2) it.next()).getClass();
            ThreadLocal threadLocal = zj0.g;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int paddingLeft = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).R0()) {
                bc0 bc0Var = ((CarouselLayoutManager) recyclerView.getLayoutManager()).k;
                switch (bc0Var.y) {
                    case 0:
                        break;
                    default:
                        paddingLeft = bc0Var.r.getPaddingTop();
                        break;
                }
                float f2 = paddingLeft;
                bc0 bc0Var2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).k;
                switch (bc0Var2.y) {
                    case 0:
                        paddingBottom = bc0Var2.r.o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = bc0Var2.r;
                        paddingBottom = carouselLayoutManager.o - carouselLayoutManager.getPaddingBottom();
                        break;
                }
                float f3 = paddingBottom;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, f3, paint);
            } else {
                bc0 bc0Var3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).k;
                switch (bc0Var3.y) {
                    case 0:
                        paddingLeft = bc0Var3.r.getPaddingLeft();
                        break;
                }
                float f4 = paddingLeft;
                bc0 bc0Var4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).k;
                switch (bc0Var4.y) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = bc0Var4.r;
                        paddingRight = carouselLayoutManager2.h - carouselLayoutManager2.getPaddingRight();
                        break;
                    default:
                        paddingRight = bc0Var4.r.h;
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, 0.0f, paddingRight, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
