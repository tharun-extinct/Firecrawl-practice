package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e24 {
    public final Class g;
    public final Class y;

    public e24(Class cls, Class cls2) {
        this.g = cls;
        this.y = cls2;
    }

    public static e24 g(Class cls) {
        return new e24(d24.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e24.class != obj.getClass()) {
            return false;
        }
        e24 e24Var = (e24) obj;
        if (this.y.equals(e24Var.y)) {
            return this.g.equals(e24Var.g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + (this.y.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.y;
        Class cls2 = this.g;
        if (cls2 == d24.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
