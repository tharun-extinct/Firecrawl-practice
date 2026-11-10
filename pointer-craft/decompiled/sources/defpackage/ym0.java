package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ym0 implements my1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ ym0(byte b) {
        this.j = b;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
            case 12:
            case 13:
            case 14:
            case kq2.x /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return og5Var;
            case 21:
                return null;
            case 22:
                return new Bundle();
            case 23:
                return og5Var;
            case 24:
                return kq2.M(Boolean.FALSE);
            case 25:
                return Boolean.FALSE;
            case 26:
                return kq2.M("");
            case 27:
                return Long.valueOf(System.nanoTime());
            case 28:
                return og5Var;
            default:
                return kq2.M(Boolean.TRUE);
        }
    }
}
