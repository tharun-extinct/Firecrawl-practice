package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mj extends jj {
    public final /* synthetic */ byte g;
    public static final mj y = new mj(0);
    public static final mj r = new mj(1);

    public /* synthetic */ mj(byte b) {
        this.g = b;
    }

    @Override // defpackage.jj
    public final int g() {
        switch (this.g) {
            case 0:
                return R.string.option_no;
            default:
                return R.string.option_yes;
        }
    }
}
