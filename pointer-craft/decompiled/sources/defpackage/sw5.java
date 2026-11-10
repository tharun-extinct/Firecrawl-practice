package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sw5 extends Exception {
    public final kq0 j;

    public sw5(kq0 kq0Var) {
        jr2.l("ResolvableConnectionException can only be created with a connection result containing a resolution.", (kq0Var.t == 0 || kq0Var.a == null) ? false : true);
        this.j = kq0Var;
    }
}
