package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import defpackage.eg6;

/* JADX INFO: loaded from: classes.dex */
public class ActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eg6.r(this, getIntent());
        finish();
    }
}
