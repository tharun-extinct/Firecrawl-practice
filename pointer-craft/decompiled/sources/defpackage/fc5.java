package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface fc5 {
    Object g();

    Object r();

    default boolean y(Object obj, Object obj2) {
        return obj.equals(g()) && obj2.equals(r());
    }
}
