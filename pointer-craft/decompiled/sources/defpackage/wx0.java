package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class wx0 implements p14 {
    public final /* synthetic */ byte g;
    public final Object y;

    public /* synthetic */ wx0(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.p14
    public final Object get() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                return new ro((Context) ((wx0) obj).y, (Object) new tg1((byte) 18), (Object) new f73((byte) 17), (byte) 11);
            default:
                return obj;
        }
    }
}
