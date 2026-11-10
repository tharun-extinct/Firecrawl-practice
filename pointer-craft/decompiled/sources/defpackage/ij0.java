package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ij0 implements bk4 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ ij0(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.bk4
    public final Iterator iterator() {
        switch (this.g) {
            case 0:
                return ((Iterable) this.y).iterator();
            default:
                return (Iterator) this.y;
        }
    }
}
