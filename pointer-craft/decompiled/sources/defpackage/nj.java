package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nj extends jj {
    public final /* synthetic */ byte g;
    public static final nj y = new nj(0);
    public static final nj r = new nj(1);
    public static final nj n = new nj(2);

    public /* synthetic */ nj(byte b) {
        this.g = b;
    }

    @Override // defpackage.jj
    public final int g() {
        switch (this.g) {
            case 0:
                return R.string.option_no;
            case 1:
                return R.string.option_unsure;
            default:
                return R.string.option_yes;
        }
    }
}
