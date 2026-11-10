package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import io.appground.blek.data.room.AppDatabase;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wm4 extends fg {
    public final tp3 a;
    public final f34 b;
    public final tp3 c;
    public final pm4 h;
    public final ew4 i;
    public final er1 j;
    public final f34 l;
    public final tp3 m;
    public final AppDatabase n;
    public final ec3 p;
    public final tp3 q;
    public final Application r;
    public final ak4 s;
    public final st4 t;
    public h61 u;
    public final o05 v;
    public final tp3 w;
    public final ew4 x;
    public final tp3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [pm4] */
    public wm4(Application application, AppDatabase appDatabase) {
        super(application);
        application.getClass();
        appDatabase.getClass();
        this.r = application;
        this.n = appDatabase;
        this.v = new o05(new lc3((byte) 11));
        mu0 mu0Var = null;
        ew4 ew4VarW = y94.w(null);
        this.x = ew4VarW;
        this.l = pw5.j(ew4VarW);
        this.j = ((ow3) q03.g(application)).g.y();
        this.t = new st4();
        this.a = kq2.M(pi1.j);
        Boolean bool = Boolean.FALSE;
        this.m = kq2.M(bool);
        this.q = kq2.M(null);
        this.w = kq2.M(bool);
        this.c = kq2.M(null);
        ew4 ew4VarW2 = y94.w(bool);
        this.i = ew4VarW2;
        this.b = pw5.j(ew4VarW2);
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        this.s = new ak4(applicationContext);
        this.p = new ec3();
        this.z = kq2.M(bool);
        this.h = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: pm4
            /* JADX WARN: Code duplicated, block: B:128:0x08c5  */
            /* JADX WARN: Code duplicated, block: B:131:0x08d1  */
            /* JADX WARN: Code duplicated, block: B:138:0x08ff  */
            /* JADX WARN: Code duplicated, block: B:141:0x090b  */
            /* JADX WARN: Code duplicated, block: B:148:0x091d  */
            /* JADX WARN: Code duplicated, block: B:151:0x0929  */
            /* JADX WARN: Code duplicated, block: B:153:0x093e  */
            /* JADX WARN: Code duplicated, block: B:155:0x095c  */
            /* JADX WARN: Code duplicated, block: B:158:0x0967  */
            /* JADX WARN: Code duplicated, block: B:165:0x0992  */
            /* JADX WARN: Code duplicated, block: B:169:0x09a4  */
            /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v2, types: [fx0, java.lang.Object, mu0] */
            /* JADX WARN: Type inference failed for: r3v33 */
            /* JADX WARN: Type inference failed for: r3v34 */
            /* JADX WARN: Type inference failed for: r6v54, types: [ew4] */
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                ew4 ew4Var;
                wm4 wm4Var;
                Object obj;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                Object obj6;
                Object obj7;
                Object obj8;
                Object obj9;
                Object obj10;
                Object obj11;
                String str2;
                String str3;
                String str4;
                String str5;
                ?? r3;
                byte b;
                wm4 wm4Var2;
                h61 h61Var;
                wm4 wm4Var3;
                h61 h61Var2;
                wm4 wm4Var4;
                h61 h61Var3;
                wm4 wm4Var5;
                boolean z;
                wm4 wm4Var6;
                h61 h61Var4;
                Object obj12;
                Object obj13;
                wm4 wm4Var7 = this.g;
                ew4 ew4Var2 = wm4Var7.x;
                ql4 ql4VarG = (ql4) ew4Var2.getValue();
                if (ql4VarG == null) {
                    return;
                }
                boolean z2 = ql4VarG.t;
                sharedPreferences.getClass();
                String str6 = ql4VarG.D;
                String str7 = ql4VarG.C;
                String str8 = ql4VarG.k;
                String str9 = ql4VarG.p;
                Set<String> set = ql4VarG.n;
                if (yf2.p(str, "show_mouse_buttons")) {
                    Set<String> stringSet = sharedPreferences.getStringSet(str, null);
                    boolean zContains = stringSet != null ? stringSet.contains("top") : ql4VarG.y;
                    boolean zContains2 = stringSet != null ? stringSet.contains("bottom") : ql4VarG.r;
                    obj = "mouse_jiggle_mode";
                    obj2 = "mouse_scroll_speed";
                    obj3 = "mouse_pointer_speed";
                    obj4 = "activate_outline_theme";
                    obj11 = "air_mouse_speed";
                    ew4Var = ew4Var2;
                    obj13 = null;
                    wm4Var = wm4Var7;
                    obj5 = "activate_air_mouse";
                    ql4VarG = ql4.g(ql4VarG, zContains, zContains2, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -7, 1);
                } else {
                    ew4Var = ew4Var2;
                    Object obj14 = null;
                    wm4Var = wm4Var7;
                    obj = "mouse_jiggle_mode";
                    obj2 = "mouse_scroll_speed";
                    obj3 = "mouse_pointer_speed";
                    obj4 = "activate_outline_theme";
                    obj5 = "activate_air_mouse";
                    if (yf2.p(str, "visible_mouse_buttons")) {
                        Set<String> stringSet2 = sharedPreferences.getStringSet(str, set);
                        if (stringSet2 != null) {
                            set = stringSet2;
                        }
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, set, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -9, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "show_scroll_bar")) {
                        Set<String> stringSet3 = sharedPreferences.getStringSet(str, null);
                        boolean zContains3 = stringSet3 != null ? stringSet3.contains("left") : ql4VarG.v;
                        boolean zContains4 = stringSet3 != null ? stringSet3.contains("right") : ql4VarG.x;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, zContains3, zContains4, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -49, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, obj5)) {
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, sharedPreferences.getBoolean(str, z2), 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -257, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "air_mouse_speed")) {
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, sharedPreferences.getInt(str, ql4VarG.a), false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -513, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "activate_dark_theme")) {
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, sharedPreferences.getBoolean(str, ql4VarG.m), false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -1025, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, obj4)) {
                        obj4 = obj4;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, sharedPreferences.getBoolean(str, ql4VarG.q), false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -2049, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "mouse_invert_scroll")) {
                        obj4 = obj4;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, sharedPreferences.getBoolean(str, ql4VarG.w), false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -4097, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "pen_drawing_mode")) {
                        obj4 = obj4;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, sharedPreferences.getBoolean(str, ql4VarG.c), false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -8193, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "touch_click_enabled")) {
                        obj4 = obj4;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, sharedPreferences.getBoolean(str, ql4VarG.i), 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -16385, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, obj3)) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, sharedPreferences.getInt(str, ql4VarG.b), 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -32769, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, obj2)) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj2 = obj2;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, sharedPreferences.getInt(str, ql4VarG.s), null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -65537, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, obj)) {
                        String string = sharedPreferences.getString(str, str9);
                        if (string == null) {
                            obj4 = obj4;
                            obj3 = obj3;
                            obj2 = obj2;
                            str5 = str9;
                        } else {
                            obj4 = obj4;
                            obj3 = obj3;
                            obj2 = obj2;
                            str5 = string;
                        }
                        obj = obj;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, str5, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -131073, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "start_full_screen")) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj2 = obj2;
                        obj = obj;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, sharedPreferences.getBoolean(str, ql4VarG.u), false, false, false, 0, null, false, false, false, false, null, null, false, false, false, -262145, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "keep_screen_on")) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj2 = obj2;
                        obj = obj;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, sharedPreferences.getBoolean(str, ql4VarG.z), false, false, 0, null, false, false, false, false, null, null, false, false, false, -524289, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "show_over_lock_screen")) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj2 = obj2;
                        obj = obj;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, sharedPreferences.getBoolean(str, ql4VarG.h), false, 0, null, false, false, false, false, null, null, false, false, false, -1048577, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "show_keyboard")) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj2 = obj2;
                        obj = obj;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, sharedPreferences.getBoolean(str, ql4VarG.o), 0, null, false, false, false, false, null, null, false, false, false, -2097153, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "screen_brightness")) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj2 = obj2;
                        obj = obj;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, sharedPreferences.getInt(str, ql4VarG.f), null, false, false, false, false, null, null, false, false, false, -4194305, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "input_bar_option")) {
                        String string2 = sharedPreferences.getString(str, str8);
                        if (string2 == null) {
                            obj4 = obj4;
                            obj3 = obj3;
                            obj2 = obj2;
                            obj = obj;
                            str4 = str8;
                        } else {
                            obj4 = obj4;
                            obj3 = obj3;
                            obj2 = obj2;
                            obj = obj;
                            str4 = string2;
                        }
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, str4, false, false, false, false, null, null, false, false, false, -8388609, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "haptic_feedback")) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj2 = obj2;
                        obj = obj;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, sharedPreferences.getBoolean(str, ql4VarG.d), false, false, false, null, null, false, false, false, -16777217, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "scanner_send_enter")) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj2 = obj2;
                        obj = obj;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, sharedPreferences.getBoolean(str, ql4VarG.e), false, false, null, null, false, false, false, -33554433, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "scanner_continuous_mode")) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj2 = obj2;
                        obj = obj;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, sharedPreferences.getBoolean(str, ql4VarG.A), false, null, null, false, false, false, -67108865, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "scanner_skip_duplicate")) {
                        obj4 = obj4;
                        obj3 = obj3;
                        obj2 = obj2;
                        obj = obj;
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, sharedPreferences.getBoolean(str, ql4VarG.B), null, null, false, false, false, -134217729, 1);
                        obj13 = obj14;
                    } else if (yf2.p(str, "vol_up_button")) {
                        String string3 = sharedPreferences.getString(str, str7);
                        if (string3 == null) {
                            obj4 = obj4;
                            obj3 = obj3;
                            obj2 = obj2;
                            obj = obj;
                            str3 = str7;
                        } else {
                            obj4 = obj4;
                            obj3 = obj3;
                            obj2 = obj2;
                            obj = obj;
                            str3 = string3;
                        }
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, str3, null, false, false, false, -268435457, 1);
                        obj13 = obj14;
                    } else {
                        if (!yf2.p(str, "vol_down_button")) {
                            if (yf2.p(str, "password_mode_enabled")) {
                                obj4 = obj4;
                                obj3 = obj3;
                                obj2 = obj2;
                                obj = obj;
                                obj11 = "air_mouse_speed";
                                ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, sharedPreferences.getBoolean(str, false), false, false, -1073741825, 1);
                                obj13 = obj14;
                            } else if (yf2.p(str, "use_analog_stick")) {
                                obj4 = obj4;
                                obj3 = obj3;
                                obj2 = obj2;
                                obj = obj;
                                obj6 = "air_mouse_speed";
                                obj7 = obj;
                                obj8 = obj2;
                                obj9 = obj3;
                                obj10 = obj4;
                                ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, null, false, false, sharedPreferences.getBoolean(str, ql4VarG.G), -1, 0);
                                r3 = obj14;
                            } else {
                                obj4 = obj4;
                                obj3 = obj3;
                                obj2 = obj2;
                                obj = obj;
                                obj6 = "air_mouse_speed";
                                obj12 = obj14;
                                obj7 = obj;
                                obj8 = obj2;
                                obj9 = obj3;
                                obj10 = obj4;
                                r3 = obj12;
                            }
                            ew4Var.getClass();
                            ew4Var.m(r3, ql4VarG);
                            if (str != null) {
                                b = 16;
                                switch (str.hashCode()) {
                                    case -1467753041:
                                        wm4Var2 = wm4Var;
                                        if (str.equals(obj8) || (h61Var = wm4Var2.u) == null) {
                                            return;
                                        }
                                        h61 h61VarG = h61.g(h61Var, 0, 0, ql4VarG.s, null, 0, 0, null, 1015);
                                        wm4Var2.u = h61VarG;
                                        m50.T(v70.d(wm4Var2), r3, new s12(wm4Var2, h61VarG, r3, b), 3);
                                        return;
                                    case -594170965:
                                        if (!str.equals("theme_option")) {
                                            return;
                                        }
                                        break;
                                    case -235580208:
                                        wm4Var3 = wm4Var;
                                        if (str.equals(obj7) || (h61Var2 = wm4Var3.u) == null) {
                                            return;
                                        }
                                        h61 h61VarG2 = h61.g(h61Var2, 0, 0, 0, ql4VarG.p, 0, 0, null, 1007);
                                        wm4Var3.u = h61VarG2;
                                        m50.T(v70.d(wm4Var3), r3, new s12(wm4Var3, h61VarG2, r3, b), 3);
                                        return;
                                    case -168833683:
                                        if (!str.equals("theme_color")) {
                                            return;
                                        }
                                        break;
                                    case 125896888:
                                        wm4Var4 = wm4Var;
                                        if (str.equals(obj6)) {
                                            wm4Var4.s.x = kq2.D(100 - ql4VarG.a, 5.0f) / 1000.0f;
                                            h61Var3 = wm4Var4.u;
                                            if (h61Var3 != null) {
                                                h61 h61VarG3 = h61.g(h61Var3, 0, ql4VarG.a, 0, null, 0, 0, null, 1019);
                                                wm4Var4.u = h61VarG3;
                                                m50.T(v70.d(wm4Var4), r3, new s12(wm4Var4, h61VarG3, r3, b), 3);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 470414628:
                                        wm4Var5 = wm4Var;
                                        if (str.equals(obj5) || z2 == (z = ql4VarG.t)) {
                                            return;
                                        }
                                        wm4Var5.m(z);
                                        return;
                                    case 1049733440:
                                        if (!str.equals(obj10)) {
                                            return;
                                        }
                                        break;
                                    case 1586416043:
                                        if (str.equals(obj9) || (h61Var4 = (wm4Var6 = wm4Var).u) == null) {
                                            return;
                                        }
                                        h61 h61VarG4 = h61.g(h61Var4, ql4VarG.b, 0, 0, null, 0, 0, null, 1021);
                                        wm4Var6.u = h61VarG4;
                                        m50.T(v70.d(wm4Var6), r3, new s12(wm4Var6, h61VarG4, r3, b), 3);
                                        return;
                                    default:
                                        return;
                                }
                                wm4Var.z.setValue(Boolean.TRUE);
                            }
                        }
                        String string4 = sharedPreferences.getString(str, str6);
                        if (string4 == null) {
                            obj4 = obj4;
                            obj3 = obj3;
                            obj2 = obj2;
                            obj = obj;
                            str2 = str6;
                        } else {
                            obj4 = obj4;
                            obj3 = obj3;
                            obj2 = obj2;
                            obj = obj;
                            str2 = string4;
                        }
                        obj11 = "air_mouse_speed";
                        ql4VarG = ql4.g(ql4VarG, false, false, null, false, false, false, 0, false, false, false, false, false, 0, 0, null, false, false, false, false, 0, null, false, false, false, false, null, str2, false, false, false, -536870913, 1);
                        obj13 = obj14;
                    }
                }
                obj6 = obj11;
                obj12 = obj13;
                obj7 = obj;
                obj8 = obj2;
                obj9 = obj3;
                obj10 = obj4;
                r3 = obj12;
                ew4Var.getClass();
                ew4Var.m(r3, ql4VarG);
                if (str != null) {
                    b = 16;
                    switch (str.hashCode()) {
                        case -1467753041:
                            wm4Var2 = wm4Var;
                            if (str.equals(obj8)) {
                                return;
                            }
                            h61 h61VarG5 = h61.g(h61Var, 0, 0, ql4VarG.s, null, 0, 0, null, 1015);
                            wm4Var2.u = h61VarG5;
                            m50.T(v70.d(wm4Var2), r3, new s12(wm4Var2, h61VarG5, r3, b), 3);
                            return;
                        case -594170965:
                            if (!str.equals("theme_option")) {
                                return;
                            }
                            break;
                        case -235580208:
                            wm4Var3 = wm4Var;
                            if (str.equals(obj7)) {
                                return;
                            }
                            h61 h61VarG6 = h61.g(h61Var2, 0, 0, 0, ql4VarG.p, 0, 0, null, 1007);
                            wm4Var3.u = h61VarG6;
                            m50.T(v70.d(wm4Var3), r3, new s12(wm4Var3, h61VarG6, r3, b), 3);
                            return;
                        case -168833683:
                            if (!str.equals("theme_color")) {
                                return;
                            }
                            break;
                        case 125896888:
                            wm4Var4 = wm4Var;
                            if (str.equals(obj6)) {
                                return;
                            }
                            wm4Var4.s.x = kq2.D(100 - ql4VarG.a, 5.0f) / 1000.0f;
                            h61Var3 = wm4Var4.u;
                            if (h61Var3 != null) {
                                h61 h61VarG7 = h61.g(h61Var3, 0, ql4VarG.a, 0, null, 0, 0, null, 1019);
                                wm4Var4.u = h61VarG7;
                                m50.T(v70.d(wm4Var4), r3, new s12(wm4Var4, h61VarG7, r3, b), 3);
                                return;
                            }
                            return;
                        case 470414628:
                            wm4Var5 = wm4Var;
                            if (str.equals(obj5)) {
                                return;
                            }
                            wm4Var5.m(z);
                            return;
                        case 1049733440:
                            if (!str.equals(obj10)) {
                                return;
                            }
                            break;
                        case 1586416043:
                            if (str.equals(obj9)) {
                                return;
                            }
                            h61 h61VarG8 = h61.g(h61Var4, ql4VarG.b, 0, 0, null, 0, 0, null, 1021);
                            wm4Var6.u = h61VarG8;
                            m50.T(v70.d(wm4Var6), r3, new s12(wm4Var6, h61VarG8, r3, b), 3);
                            return;
                        default:
                            return;
                    }
                    wm4Var.z.setValue(Boolean.TRUE);
                }
            }
        };
        ji0 ji0VarD = v70.d(this);
        x21 x21Var = na1.g;
        c21 c21Var = c21.a;
        m50.T(ji0VarD, c21Var, new of3(this, mu0Var, (byte) 1), 2);
        m50.T(v70.d(this), c21Var, new of3(this, mu0Var, (byte) 2), 2);
    }

    public final void a(int i, int i2) {
        h61 h61Var = this.u;
        if (h61Var != null) {
            h61 h61VarG = h61.g(h61Var, 0, 0, 0, null, i, i2, null, 927);
            this.u = h61VarG;
            m50.T(v70.d(this), null, new s12(this, h61VarG, null, (byte) 16), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (defpackage.kq2.k(r13, r1, r0) == r10) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (defpackage.kq2.k(r13, r1, r0) == r10) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (defpackage.kq2.k(r13, r1, r0) == r10) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ou0 r13) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm4.j(ou0):java.lang.Object");
    }

    public final void l() {
        this.m.setValue(Boolean.FALSE);
        this.q.setValue(null);
    }

    public final void m(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        ew4 ew4Var = this.i;
        ew4Var.getClass();
        ew4Var.m(null, boolValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(String str, ou0 ou0Var) {
        vm4 vm4Var;
        if (ou0Var instanceof vm4) {
            vm4Var = (vm4) ou0Var;
            int i = vm4Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                vm4Var.w = i - Integer.MIN_VALUE;
            } else {
                vm4Var = new vm4(this, ou0Var);
            }
        } else {
            vm4Var = new vm4(this, ou0Var);
        }
        Object obj = vm4Var.m;
        int i2 = vm4Var.w;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(obj);
            vz0 vz0VarG = q03.g(this.r);
            pt ptVar = new pt(str, mu0Var, (byte) 2);
            vm4Var.w = 1;
            Object objK = kq2.k(vz0VarG, ptVar, vm4Var);
            px0 px0Var = px0.j;
            if (objK == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        return og5.g;
    }

    public final void t(String str, int i) {
        str.getClass();
        if (str.equals("custom?layoutId={layoutId}")) {
            str = ay4.N("custom?layoutId={layoutId}", "{layoutId}", String.valueOf(i));
        }
        this.c.setValue(str);
    }

    public final boolean v(String str, boolean z) {
        return x().getBoolean(str, z);
    }

    public final SharedPreferences x() {
        return (SharedPreferences) this.v.getValue();
    }
}
