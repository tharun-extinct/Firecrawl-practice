package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w02 implements l53 {
    public static final w02 y = new w02(0);
    public final /* synthetic */ byte g;

    public /* synthetic */ w02(byte b) {
        this.g = b;
    }

    @Override // defpackage.l53
    public final a34 g(Class cls) {
        switch (this.g) {
            case 0:
                if (!c12.class.isAssignableFrom(cls)) {
                    l0.u("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (a34) c12.n(cls.asSubclass(c12.class)).r(3);
                } catch (Exception e) {
                    uo1.w("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.l53
    public final boolean y(Class cls) {
        switch (this.g) {
            case 0:
                return c12.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
