package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ek4 implements bk4 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ ek4(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.bk4
    public final Iterator iterator() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                return lr2.d((bz1) obj);
            default:
                return new lv2((CharSequence) obj);
        }
    }
}
