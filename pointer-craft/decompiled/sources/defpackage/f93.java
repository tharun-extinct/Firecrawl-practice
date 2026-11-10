package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes2.dex */
public final class f93 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService g;

    public f93(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.g = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((h92) iInterface).getClass();
        obj.getClass();
        this.g.t.remove((Integer) obj);
    }
}
