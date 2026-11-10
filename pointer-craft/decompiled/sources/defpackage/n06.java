package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n06 extends tz5 implements Set {
    public transient a06 t;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return pc6.r(this);
    }

    public a06 j() {
        Object[] array = toArray(tz5.j);
        vz5 vz5Var = a06.t;
        return a06.a(array.length, array);
    }

    @Override // defpackage.tz5
    public a06 v() {
        a06 a06Var = this.t;
        if (a06Var != null) {
            return a06Var;
        }
        a06 a06VarJ = j();
        this.t = a06VarJ;
        return a06VarJ;
    }
}
