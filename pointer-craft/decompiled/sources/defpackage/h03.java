package defpackage;

import io.appground.blek.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class h03 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ MainActivity t;

    public /* synthetic */ h03(MainActivity mainActivity, byte b) {
        this.j = b;
        this.t = mainActivity;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        MainActivity mainActivity = this.t;
        switch (b) {
            case 0:
                return mainActivity.x();
            case 1:
                return mainActivity.t();
            case 2:
                return mainActivity.l();
            case 3:
                return mainActivity.x();
            case 4:
                return mainActivity.t();
            case 5:
                return mainActivity.l();
            case 6:
                return mainActivity.x();
            case 7:
                return mainActivity.t();
            case 8:
                return mainActivity.l();
            case 9:
                return mainActivity.x();
            case 10:
                return mainActivity.t();
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return mainActivity.l();
            case 12:
                return mainActivity.x();
            case 13:
                return mainActivity.t();
            default:
                return mainActivity.l();
        }
    }
}
