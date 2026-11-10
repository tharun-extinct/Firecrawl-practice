package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class iv5 extends qv5 {
    public final /* synthetic */ Intent j;
    public final /* synthetic */ GoogleApiActivity t;

    public iv5(Intent intent, GoogleApiActivity googleApiActivity) {
        this.j = intent;
        this.t = googleApiActivity;
    }

    @Override // defpackage.qv5
    public final void g() {
        Intent intent = this.j;
        if (intent != null) {
            this.t.startActivityForResult(intent, 2);
        }
    }
}
