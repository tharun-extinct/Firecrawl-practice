package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class h51 implements bk4 {
    public final /* synthetic */ byte g = 1;
    public final jz1 r;
    public final Object y;

    public h51(CharSequence charSequence, bz1 bz1Var) {
        charSequence.getClass();
        this.y = charSequence;
        this.r = bz1Var;
    }

    @Override // defpackage.bk4
    public final Iterator iterator() {
        switch (this.g) {
            case 0:
                return new g51(this);
            default:
                return new ko1(this);
        }
    }

    public h51(h25 h25Var, vy3 vy3Var) {
        this.y = h25Var;
        this.r = vy3Var;
    }
}
