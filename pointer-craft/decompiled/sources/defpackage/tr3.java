package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tr3 extends ur3 implements bp0 {
    public static final tr3 m = new tr3(od5.v, 0);

    @Override // defpackage.ur3, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof j14) {
            return super.containsKey((j14) obj);
        }
        return false;
    }

    @Override // defpackage.ur3, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof oi5) {
            return super.containsValue((oi5) obj);
        }
        return false;
    }

    @Override // defpackage.ur3, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof j14) {
            return (oi5) super.get((j14) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof j14) ? obj2 : (oi5) super.getOrDefault((j14) obj, (oi5) obj2);
    }

    public final tr3 y(j14 j14Var, oi5 oi5Var) {
        sv1 sv1VarH = this.j.h(j14Var.hashCode(), 0, j14Var, oi5Var);
        return sv1VarH == null ? this : new tr3((od5) sv1VarH.y, this.t + (sv1VarH.g ? 1 : 0));
    }
}
