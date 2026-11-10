package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kj extends jj {
    public final /* synthetic */ byte g;
    public static final kj y = new kj(0);
    public static final kj r = new kj(1);
    public static final kj n = new kj(2);
    public static final kj v = new kj(3);
    public static final kj x = new kj(4);

    public /* synthetic */ kj(byte b) {
        this.g = b;
    }

    @Override // defpackage.jj
    public final int g() {
        switch (this.g) {
            case 0:
                return R.string.option_computer;
            case 1:
                return R.string.option_other;
            case 2:
                return R.string.option_phone;
            case 3:
                return R.string.option_tv;
            default:
                return R.string.option_tablet;
        }
    }
}
