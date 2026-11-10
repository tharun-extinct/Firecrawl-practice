package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f12 implements bk4 {
    public final my1 g;
    public final xy1 y;

    public f12(my1 my1Var, xy1 xy1Var) {
        this.g = my1Var;
        this.y = xy1Var;
    }

    @Override // defpackage.bk4
    public final Iterator iterator() {
        return new e12(this);
    }
}
