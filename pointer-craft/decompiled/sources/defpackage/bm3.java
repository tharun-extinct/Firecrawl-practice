package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bm3 {
    public final int g;
    public final int y;

    public /* synthetic */ bm3(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        pr4Var.g(ti0Var.y(0));
    }

    public final String toString() {
        String strR = v54.g(getClass()).r();
        return strR == null ? "" : strR;
    }

    public c02 y(ti0 ti0Var) {
        return null;
    }

    public bm3(int i, int i2) {
        this.g = i;
        this.y = i2;
    }
}
