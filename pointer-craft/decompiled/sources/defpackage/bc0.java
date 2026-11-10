package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class bc0 {
    public final boolean g;
    public final /* synthetic */ CarouselLayoutManager r;
    public final /* synthetic */ byte y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bc0(CarouselLayoutManager carouselLayoutManager, byte b) {
        this(1);
        this.y = b;
        switch (b) {
            case 1:
                this.r = carouselLayoutManager;
                this(0);
                break;
            default:
                this.r = carouselLayoutManager;
                break;
        }
    }

    public final int g() {
        switch (this.y) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.r;
                if (carouselLayoutManager.S0()) {
                    return carouselLayoutManager.h;
                }
                return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bc0(int i) {
        this.g = i;
    }
}
