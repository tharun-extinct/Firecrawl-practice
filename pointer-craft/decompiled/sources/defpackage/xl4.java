package defpackage;

import io.appground.blek.R;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class xl4 {
    public static final rl4 a;
    public static final sl4 c;
    public static final /* synthetic */ xl4[] i;
    public static final vl4 m;
    public static final wl4 q;
    public static final ul4 w;
    public final int j;
    public final o05 t;

    static {
        rl4 rl4Var = new rl4(0, R.string.settings_controls, "Custom");
        a = rl4Var;
        vl4 vl4Var = new vl4(1, R.string.settings_mouse, "Mouse");
        m = vl4Var;
        wl4 wl4Var = new wl4(2, R.string.settings_mouse, "MouseSimple");
        q = wl4Var;
        ul4 ul4Var = new ul4(3, R.string.settings_keyboard, "Keyboard");
        w = ul4Var;
        sl4 sl4Var = new sl4(4, R.string.settings_display, "Display");
        c = sl4Var;
        i = new xl4[]{rl4Var, vl4Var, wl4Var, ul4Var, sl4Var, new tl4(5, R.string.settings_display, "GamepadDisplay")};
    }

    public xl4(int i2, int i3, String str) {
        super(str, i2);
        this.j = i3;
        this.t = new o05(new gd4(this, (byte) 4));
    }

    public static xl4 valueOf(String str) {
        return (xl4) Enum.valueOf(xl4.class, str);
    }

    public static xl4[] values() {
        return (xl4[]) i.clone();
    }

    public List g() {
        return pi1.j;
    }
}
