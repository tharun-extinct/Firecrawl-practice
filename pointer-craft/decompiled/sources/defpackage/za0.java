package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class za0 implements ot1 {
    public static final za0 g = new za0();
    public static Boolean y;

    @Override // defpackage.ot1
    public final void r(boolean z) {
        y = Boolean.valueOf(z);
    }

    @Override // defpackage.ot1
    public final boolean y() {
        Boolean bool = y;
        if (bool != null) {
            return bool.booleanValue();
        }
        mc2.r("canFocus is read before it is written");
        l0.x();
        return false;
    }
}
