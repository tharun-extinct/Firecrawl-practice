package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w30 extends nz1 implements bz1 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(Object obj, byte b) {
        super(2, obj, c62.class, "sendReport", "sendReport(B[B)V", 0);
        this.i = b;
        switch (b) {
            case 2:
                super(2, obj, wm4.class, "saveKey", "saveKey(Ljava/lang/String;Z)V", 0);
                break;
            case 3:
                super(2, obj, qr0.class, "sendText", "sendText(Ljava/lang/String;Ljava/lang/Integer;)V", 0);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.i;
        og5 og5Var = og5.g;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                byte bByteValue = ((Number) obj).byteValue();
                byte[] bArr = (byte[]) obj2;
                bArr.getClass();
                ((c62) obj3).g(bByteValue, bArr);
                break;
            case 1:
                String str = (String) obj;
                int iIntValue = ((Number) obj2).intValue();
                str.getClass();
                b90 b90Var = (b90) obj3;
                b90Var.getClass();
                int i = b90Var.v().r;
                ArrayList arrayList = new ArrayList(b90Var.v().y);
                gx4 gx4Var = (gx4) arrayList.get(i);
                gx4Var.getClass();
                arrayList.set(i, gx4.g(gx4Var, str, new o90(iIntValue), 0, 4));
                b90Var.x(bg5.g(b90Var.v(), null, arrayList, 0, 5));
                break;
            case 2:
                String str2 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str2.getClass();
                ((wm4) obj3).x().edit().putBoolean(str2, zBooleanValue).apply();
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                qr0 qr0Var = (qr0) obj3;
                qr0Var.getClass();
                m50.T(v70.d(qr0Var), null, new c(qr0Var, str3, (Integer) obj2, null, (byte) 17), 3);
                break;
        }
        return og5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w30(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
        this.i = (byte) 1;
    }
}
