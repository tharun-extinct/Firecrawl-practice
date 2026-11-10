package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ij extends jj {
    public final /* synthetic */ byte g;
    public static final ij y = new ij(0);
    public static final ij r = new ij(1);
    public static final ij n = new ij(2);
    public static final ij v = new ij(3);

    public /* synthetic */ ij(byte b) {
        this.g = b;
    }

    @Override // defpackage.jj
    public final int g() {
        switch (this.g) {
            case 0:
                return R.string.option_connects_but_doesnt_work;
            case 1:
                return R.string.option_error;
            case 2:
                return R.string.option_nothing;
            default:
                return R.string.option_something_else;
        }
    }
}
