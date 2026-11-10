package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lj extends jj {
    public final /* synthetic */ byte g;
    public static final lj y = new lj(0);
    public static final lj r = new lj(1);
    public static final lj n = new lj(2);
    public static final lj v = new lj(3);
    public static final lj x = new lj(4);

    public /* synthetic */ lj(byte b) {
        this.g = b;
    }

    @Override // defpackage.jj
    public final int g() {
        switch (this.g) {
            case 0:
                return R.string.option_android;
            case 1:
                return R.string.option_macos;
            case 2:
                return R.string.option_other;
            case 3:
                return R.string.option_windows;
            default:
                return R.string.option_ios;
        }
    }
}
