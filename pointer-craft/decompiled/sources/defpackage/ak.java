package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public class ak extends Exception {
    public final Status j;

    public ak(Status status) {
        int i = status.j;
        String str = status.t;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.j = status;
    }
}
