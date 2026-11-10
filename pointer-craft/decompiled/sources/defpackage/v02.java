package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v02 implements k53 {
    public static final v02 y = new v02(0);
    public final /* synthetic */ byte g;

    public /* synthetic */ v02(byte b) {
        this.g = b;
    }

    @Override // defpackage.k53
    public final z24 g(Class cls) {
        switch (this.g) {
            case 0:
                if (!b12.class.isAssignableFrom(cls)) {
                    l0.u("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (z24) b12.n(cls.asSubclass(b12.class)).r(3);
                } catch (Exception e) {
                    uo1.w("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.k53
    public final boolean y(Class cls) {
        switch (this.g) {
            case 0:
                return b12.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
