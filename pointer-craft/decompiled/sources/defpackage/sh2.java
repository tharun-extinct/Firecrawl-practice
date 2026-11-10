package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sh2 implements cj1 {
    public static final qh2 l;
    public static final qh2 x;
    public final HashMap g;
    public boolean n;
    public final ph2 r;
    public final HashMap y;
    public static final ph2 v = new ph2();
    public static final rh2 j = new rh2();

    /* JADX WARN: Type inference failed for: r0v1, types: [qh2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [qh2] */
    static {
        final byte b = 0;
        x = new mi5() { // from class: qh2
            @Override // defpackage.bj1
            public final void g(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        ((ni5) obj2).y((String) obj);
                        break;
                    default:
                        ((ni5) obj2).r(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final byte b2 = 1;
        l = new mi5() { // from class: qh2
            @Override // defpackage.bj1
            public final void g(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        ((ni5) obj2).y((String) obj);
                        break;
                    default:
                        ((ni5) obj2).r(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public sh2() {
        HashMap map = new HashMap();
        this.g = map;
        HashMap map2 = new HashMap();
        this.y = map2;
        this.r = v;
        this.n = false;
        map2.put(String.class, x);
        map.remove(String.class);
        map2.put(Boolean.class, l);
        map.remove(Boolean.class);
        map2.put(Date.class, j);
        map.remove(Date.class);
    }

    @Override // defpackage.cj1
    public final cj1 g(Class cls, ji3 ji3Var) {
        this.g.put(cls, ji3Var);
        this.y.remove(cls);
        return this;
    }
}
