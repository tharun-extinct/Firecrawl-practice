package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class su4 {
    public static final su4 a;
    public static final d93 j;
    public static final su4 m;
    public static final su4 q;
    public static final su4 t;
    public static final /* synthetic */ su4[] w;

    static {
        su4 su4Var = new su4("REMOVED", 0);
        t = su4Var;
        su4 su4Var2 = new su4("VISIBLE", 1);
        a = su4Var2;
        su4 su4Var3 = new su4("GONE", 2);
        m = su4Var3;
        su4 su4Var4 = new su4("INVISIBLE", 3);
        q = su4Var4;
        w = new su4[]{su4Var, su4Var2, su4Var3, su4Var4};
        j = new d93((byte) 15);
    }

    public static su4 valueOf(String str) {
        return (su4) Enum.valueOf(su4.class, str);
    }

    public static su4[] values() {
        return (su4[]) w.clone();
    }

    public final void g(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (kx1.N(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (kx1.N(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (kx1.N(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (kx1.N(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iOrdinal == 2) {
            if (kx1.N(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iOrdinal != 3) {
            uo1.g();
            return;
        }
        if (kx1.N(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
