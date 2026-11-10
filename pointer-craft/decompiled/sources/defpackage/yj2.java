package defpackage;

import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yj2 implements my1 {
    public final /* synthetic */ byte j;

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return kq2.M(Boolean.FALSE);
            case 1:
                return new qp3(0);
            case 2:
                return UUID.randomUUID();
            case 3:
                float f = oe3.g;
                return r21.g;
            case 4:
                x21 x21Var = na1.g;
                return c21.a;
            case 5:
                return null;
            case 6:
                return og5Var;
            case 7:
                return Pattern.compile("^P((\\d)*Y)?((\\d)*W)?((\\d)*D)?");
            case 8:
                return og5Var;
            case 9:
                return kq2.M(null);
            case 10:
                return v70.v();
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return qr4.t;
            case 12:
            case 13:
                return null;
            case 14:
                return new je2(0L);
            default:
                return new je2(0L);
        }
    }

    public /* synthetic */ yj2(byte b) {
        this.j = b;
    }
}
