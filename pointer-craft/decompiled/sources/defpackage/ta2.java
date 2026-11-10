package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class ta2 {
    public final Context g;

    public ta2(Context context) {
        context.getClass();
        this.g = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(yl0 yl0Var, ou0 ou0Var) {
        sa2 sa2Var;
        long jCurrentTimeMillis;
        rk4 rk4VarG;
        boolean z;
        yl0 yl0Var2;
        if (ou0Var instanceof sa2) {
            sa2Var = (sa2) ou0Var;
            int i = sa2Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                sa2Var.s = i - Integer.MIN_VALUE;
            } else {
                sa2Var = new sa2(this, ou0Var);
            }
        } else {
            sa2Var = new sa2(this, ou0Var);
        }
        Object obj = sa2Var.i;
        int i2 = sa2Var.s;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        try {
            if (i2 == 0) {
                js2.o(obj);
                SharedPreferences sharedPreferencesD = y94.d(this.g);
                if (sharedPreferencesD != null) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    int i3 = sharedPreferencesD.getInt("review_sessions_count", 0);
                    SharedPreferences sharedPreferences = d52.b;
                    sharedPreferences.getClass();
                    long j = sharedPreferences.getLong("first_start_time", System.currentTimeMillis());
                    long j2 = sharedPreferencesD.getLong("review_last_prompt_time", 0L);
                    boolean z2 = i3 >= 3 && jCurrentTimeMillis - j >= 432000000 && (j2 == 0 || jCurrentTimeMillis - j2 >= 5184000000L);
                    if (z2) {
                        SharedPreferences.Editor editorEdit = sharedPreferencesD.edit();
                        editorEdit.getClass();
                        editorEdit.putLong("review_last_prompt_time", jCurrentTimeMillis);
                        editorEdit.apply();
                        rk4VarG = xe6.g(yl0Var);
                        nj6 nj6VarL = rk4VarG.L();
                        nj6VarL.getClass();
                        sa2Var.m = yl0Var;
                        sa2Var.q = rk4VarG;
                        sa2Var.w = jCurrentTimeMillis;
                        sa2Var.c = z2;
                        sa2Var.s = 1;
                        Object objR = hh6.r(nj6VarL, sa2Var);
                        if (objR != px0Var) {
                            boolean z3 = z2;
                            obj = objR;
                            z = z3;
                            yl0Var2 = yl0Var;
                        }
                    }
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = sa2Var.c;
            jCurrentTimeMillis = sa2Var.w;
            rk4VarG = sa2Var.q;
            yl0Var2 = sa2Var.m;
            js2.o(obj);
            nj6 nj6VarD = rk4VarG.D(yl0Var2, (s84) obj);
            nj6VarD.getClass();
            sa2Var.m = null;
            sa2Var.q = null;
            sa2Var.w = jCurrentTimeMillis;
            sa2Var.c = z;
            sa2Var.s = 2;
            return hh6.r(nj6VarD, sa2Var) == px0Var ? px0Var : og5Var;
        } catch (Exception e) {
            Log.d("InAppReviewManager", "Review flow unavailable", e);
            return og5Var;
        }
    }
}
