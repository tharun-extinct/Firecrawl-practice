package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ss implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 t;

    public /* synthetic */ ss(my1 my1Var, byte b) {
        this.j = b;
        this.t = my1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        float f;
        byte b = this.j;
        og5 og5Var = og5.g;
        my1 my1Var = this.t;
        switch (b) {
            case 0:
                my1Var.g();
                return og5Var;
            case 1:
                my1Var.g();
                return og5Var;
            case 2:
                my1Var.g();
                return og5Var;
            case 3:
                try {
                    return (List) my1Var.g();
                } catch (SSLPeerUnverifiedException unused) {
                    return pi1.j;
                }
            case 4:
                my1Var.g();
                return og5Var;
            case 5:
                my1Var.g();
                break;
            case 6:
                my1Var.g();
                break;
            case 7:
                my1Var.g();
                break;
            case 8:
                float fFloatValue = ((Number) my1Var.g()).floatValue();
                f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
                return Float.valueOf(f <= 1.0f ? f : 1.0f);
            case 9:
                float fFloatValue2 = ((Number) my1Var.g()).floatValue();
                f = fFloatValue2 >= 0.0f ? fFloatValue2 : 0.0f;
                return Float.valueOf(f <= 1.0f ? f : 1.0f);
            case 10:
                my1Var.g();
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                my1Var.g();
                return og5Var;
            default:
                my1Var.g();
                return og5Var;
        }
        return Boolean.TRUE;
    }
}
