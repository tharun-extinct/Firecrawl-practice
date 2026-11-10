package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class hw5 extends AsyncTask {
    public final /* synthetic */ Context g;

    public hw5(Context context, aj6 aj6Var) {
        this.g = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            r14.g(this.g);
            return 0;
        } catch (q32 e) {
            return Integer.valueOf(e.j);
        } catch (r32 e2) {
            return Integer.valueOf(e2.j);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            zo1.t.y(null);
            return;
        }
        m32 m32Var = r14.g;
        r14.g.g(num.intValue(), this.g, "pi");
        Log.d("FirebaseFunctions", "Failed to update ssl context");
        zo1.t.y(null);
    }
}
