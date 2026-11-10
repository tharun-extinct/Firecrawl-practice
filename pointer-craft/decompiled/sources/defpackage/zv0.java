package defpackage;

import io.appground.blek.data.room.AppDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class zv0 implements o14 {
    public final /* synthetic */ byte g;
    public final o14 r;
    public final o14 y;

    public /* synthetic */ zv0(o14 o14Var, o14 o14Var2, byte b) {
        this.g = b;
        this.y = o14Var;
        this.r = o14Var2;
    }

    @Override // defpackage.p14
    public final Object get() {
        byte b = this.g;
        o14 o14Var = this.r;
        o14 o14Var2 = this.y;
        switch (b) {
            case 0:
                return new yv0((AppDatabase) o14Var2.get(), new tg1((byte) 12), (ji) ((hp) o14Var).get());
            default:
                return new xl2((el2) o14Var2.get(), new tg1((byte) 12), (wh4) ((e20) o14Var).get());
        }
    }
}
