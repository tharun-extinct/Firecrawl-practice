package defpackage;

import android.os.Build;
import io.appground.blek.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'q' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class p92 {
    public static final p92 q;
    public static final /* synthetic */ p92[] w;
    public final int a;
    public final int j;
    public final float m;
    public final int t;

    static {
        int i = Build.VERSION.SDK_INT;
        p92 p92Var = new p92("Square", 0, R.drawable.glance_component_btn_square, R.dimen.glance_component_square_icon_button_corners, i >= 31 ? 0 : R.drawable.glance_component_square_button_ripple, 60.0f);
        q = p92Var;
        w = new p92[]{p92Var, new p92("Circle", 1, R.drawable.glance_component_btn_circle, R.dimen.glance_component_circle_icon_button_corners, i < 31 ? R.drawable.glance_component_circle_button_ripple : 0, 48.0f)};
    }

    public p92(String str, int i, int i2, int i3, int i4, float f) {
        super(str, i);
        this.j = i2;
        this.t = i3;
        this.a = i4;
        this.m = f;
    }

    public static p92 valueOf(String str) {
        return (p92) Enum.valueOf(p92.class, str);
    }

    public static p92[] values() {
        return (p92[]) w.clone();
    }
}
