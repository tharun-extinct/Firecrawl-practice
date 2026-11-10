package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yd3 extends ce3 {
    public final Class w;

    public yd3(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.w = cls;
        } else {
            up.n(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.ce3, defpackage.de3
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Enum n(String str) {
        Object obj;
        Class cls = this.w;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (ay4.J(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r4 = (Enum) obj;
        if (r4 != null) {
            return r4;
        }
        l0.u(xi3.a("Enum value ", str, " not found for type ", cls.getName(), "."));
        return null;
    }

    @Override // defpackage.ce3, defpackage.de3
    public final String y() {
        return this.w.getName();
    }
}
