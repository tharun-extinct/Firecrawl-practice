package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class i73 implements o41 {
    public int a;
    public boolean b;
    public ui3 c;
    public boolean h;
    public gh3 i;
    public i73 j = this;
    public int m = -1;
    public boolean p;
    public i73 q;
    public boolean s;
    public ku0 t;
    public boolean u;
    public i73 w;
    public p2 z;

    public final ox0 E0() {
        ku0 ku0Var = this.t;
        if (ku0Var != null) {
            return ku0Var;
        }
        ku0 ku0VarX = k33.x(((ba) k33.W(this)).getCoroutineContext().b(new fh2((dh2) ((ba) k33.W(this)).getCoroutineContext().h(d52.m))));
        this.t = ku0VarX;
        return ku0VarX;
    }

    public boolean F0() {
        return !(this instanceof pw);
    }

    public void G0() {
        if (this.h) {
            mc2.y("node attached multiple times");
        }
        if (this.i == null) {
            mc2.y("attach invoked on a node without a coordinator");
        }
        this.h = true;
        this.p = true;
    }

    public void H0() {
        if (!this.h) {
            mc2.y("Cannot detach a node that is not attached");
        }
        if (this.p) {
            mc2.y("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.u) {
            mc2.y("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.h = false;
        ku0 ku0Var = this.t;
        if (ku0Var != null) {
            k33.d(ku0Var, new n73("The Modifier.Node was detached", (byte) 2));
            this.t = null;
        }
    }

    public void L0() {
        if (!this.h) {
            mc2.y("reset() called on an unattached node");
        }
        K0();
    }

    public void M0() {
        if (!this.h) {
            mc2.y("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.p) {
            mc2.y("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.p = false;
        I0();
        this.u = true;
    }

    public void N0() {
        if (!this.h) {
            mc2.y("node detached multiple times");
        }
        if (this.i == null) {
            mc2.y("detach invoked on a node without a coordinator");
        }
        if (!this.u) {
            mc2.y("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.u = false;
        p2 p2Var = this.z;
        if (p2Var != null) {
            p2Var.g();
        }
        J0();
    }

    public void O0(i73 i73Var) {
        this.j = i73Var;
    }

    public void P0(gh3 gh3Var) {
        this.i = gh3Var;
    }

    public void I0() {
    }

    public void J0() {
    }

    public void K0() {
    }
}
