package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kr2 {
    public final Object g;
    public int n;
    public kr2 v;
    public boolean x;
    public final mr2 y;
    public int r = -1;
    public final tp3 l = kq2.M(null);

    public kr2(Object obj, mr2 mr2Var) {
        this.g = obj;
        this.y = mr2Var;
    }

    public final kr2 g() {
        if (this.x) {
            pc2.r("Pin should not be called on an already disposed item ");
        }
        if (this.n == 0) {
            this.y.j.add(this);
            kr2 kr2Var = (kr2) this.l.getValue();
            if (kr2Var != null) {
                kr2Var.g();
            } else {
                kr2Var = null;
            }
            this.v = kr2Var;
        }
        this.n++;
        return this;
    }

    public final void y() {
        if (this.x) {
            return;
        }
        if (this.n <= 0) {
            pc2.r("Release should only be called once");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.y.j.remove(this);
            kr2 kr2Var = this.v;
            if (kr2Var != null) {
                kr2Var.y();
            }
            this.v = null;
        }
    }
}
