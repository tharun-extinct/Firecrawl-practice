package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ke4 implements p14 {
    public final /* synthetic */ byte g;
    public final p14 n;
    public final p14 r;
    public final p14 y;

    public /* synthetic */ ke4(p14 p14Var, p14 p14Var2, p14 p14Var3, byte b) {
        this.g = b;
        this.y = p14Var;
        this.r = p14Var2;
        this.n = p14Var3;
    }

    @Override // defpackage.p14
    public final Object get() {
        byte b = this.g;
        p14 p14Var = this.n;
        p14 p14Var2 = this.r;
        p14 p14Var3 = this.y;
        switch (b) {
            case 0:
                return new ro((Context) p14Var3.get(), p14Var2.get(), ((ql1) p14Var).get(), (byte) 16);
            default:
                return new fd5(new tg1((byte) 18), new f73((byte) 17), (y21) ((z21) p14Var3).get(), (uh5) ((vh5) p14Var2).get(), (kb5) ((jr5) p14Var).get());
        }
    }
}
