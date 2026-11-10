package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ey1 implements iz4 {
    public final gz4 a;
    public final Context j;
    public final boolean m;
    public final o05 q;
    public final String t;
    public boolean w;

    public ey1(Context context, String str, gz4 gz4Var, boolean z) {
        context.getClass();
        gz4Var.getClass();
        this.j = context;
        this.t = str;
        this.a = gz4Var;
        this.m = z;
        this.q = new o05(new gf((Object) this, (byte) 8));
    }

    @Override // defpackage.iz4
    public final zx1 K() {
        return ((dy1) this.q.getValue()).y(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o05 o05Var = this.q;
        if (o05Var.g()) {
            ((dy1) o05Var.getValue()).close();
        }
    }

    @Override // defpackage.iz4
    public final String getDatabaseName() {
        return this.t;
    }

    @Override // defpackage.iz4
    public final void setWriteAheadLoggingEnabled(boolean z) {
        o05 o05Var = this.q;
        if (o05Var.g()) {
            ((dy1) o05Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.w = z;
    }
}
