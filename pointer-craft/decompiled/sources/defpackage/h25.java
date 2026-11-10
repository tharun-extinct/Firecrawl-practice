package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class h25 implements bk4 {
    public final /* synthetic */ byte g;
    public final xy1 r;
    public final bk4 y;

    public /* synthetic */ h25(bk4 bk4Var, xy1 xy1Var, byte b) {
        this.g = b;
        this.y = bk4Var;
        this.r = xy1Var;
    }

    @Override // defpackage.bk4
    public final Iterator iterator() {
        switch (this.g) {
            case 0:
                return new ko1(this);
            default:
                return new yb5(this);
        }
    }
}
