package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class kl0 {
    public String g = null;
    public final HashSet l;
    public boolean n;
    public final HashSet r;
    public boolean v;
    public gm0 x;
    public final HashSet y;

    public kl0(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.y = hashSet;
        this.r = new HashSet();
        this.n = false;
        this.v = false;
        this.l = new HashSet();
        hashSet.add(e24.g(cls));
        for (Class cls2 : clsArr) {
            lr2.b(cls2, "Null interface");
            this.y.add(e24.g(cls2));
        }
    }

    public final void g(p51 p51Var) {
        if (this.y.contains(p51Var.g)) {
            l0.u("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.r.add(p51Var);
        }
    }

    public final ll0 y() {
        if (!(this.x != null)) {
            l0.z("Missing required property: factory.");
            return null;
        }
        return new ll0(this.g, new HashSet(this.y), new HashSet(this.r), this.n ? 1 : 0, this.v ? 1 : 0, this.x, this.l);
    }
}
