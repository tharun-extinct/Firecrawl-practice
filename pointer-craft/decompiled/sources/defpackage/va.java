package defpackage;

import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.util.Log;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.material.button.MaterialButton;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class va implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ va(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        String string = null;
        Object obj = this.a;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                wa.r((ya) obj2, (LongSparseArray) obj);
                return;
            case 1:
                jl jlVar = (jl) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    jlVar.g();
                }
            case 2:
                e11 e11Var = (e11) obj;
                xp2 xp2Var = ((r11) obj2).v.g;
                if (e11Var == null) {
                    ((SharedPreferences) xp2Var.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", e11Var.g).putString("com.google.firebase.appcheck.TOKEN_TYPE", "UNKNOWN_APP_CHECK_TOKEN").apply();
                    return;
                }
                SharedPreferences.Editor editorEdit = ((SharedPreferences) xp2Var.get()).edit();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("token", e11Var.g);
                    jSONObject.put("receivedAt", e11Var.y);
                    jSONObject.put("expiresIn", e11Var.r);
                    string = jSONObject.toString();
                    break;
                } catch (JSONException e) {
                    Log.e("e11", "Could not serialize token: " + e.getMessage());
                }
                editorEdit.putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", string).putString("com.google.firebase.appcheck.TOKEN_TYPE", "DEFAULT_APP_CHECK_TOKEN").apply();
                return;
            case 3:
                fa4 fa4Var = (fa4) obj;
                try {
                    fa4Var.K(((Callable) obj2).call());
                    return;
                } catch (Exception e2) {
                    fa4Var.L(e2);
                    return;
                }
            case 4:
                int i = JobInfoSchedulerService.j;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case 5:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr = MaterialButton.V;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams = materialButton.K;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.K = null;
                    materialButton.H = -2.14748365E9f;
                }
                materialButton.requestLayout();
                return;
            default:
                ((jr2) obj2).D((Typeface) obj);
                return;
        }
    }
}
