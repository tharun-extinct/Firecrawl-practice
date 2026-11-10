package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class rw1 extends ue5 implements wl5, vj3, f5, id4, ox1 {
    public final /* synthetic */ yk A;
    public final Handler d;
    public final kx1 e;
    public final yk f;
    public final yk k;

    public rw1(yk ykVar) {
        this.A = ykVar;
        Handler handler = new Handler();
        this.f = ykVar;
        this.k = ykVar;
        this.d = handler;
        this.e = new kx1();
    }

    @Override // defpackage.gu2
    public final ju2 a() {
        return this.A.D;
    }

    @Override // defpackage.ue5
    public final View a0(int i) {
        return this.A.findViewById(i);
    }

    @Override // defpackage.ue5
    public final boolean b0() {
        Window window = this.A.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.f5
    public final wl0 j() {
        return this.A.b;
    }

    @Override // defpackage.id4
    public final ji r() {
        return (ji) this.A.m.a;
    }

    @Override // defpackage.wl5
    public final vl5 t() {
        return this.A.t();
    }

    @Override // defpackage.vj3
    public final tj3 y() {
        return this.A.y();
    }

    @Override // defpackage.ox1
    public final void g() {
    }
}
