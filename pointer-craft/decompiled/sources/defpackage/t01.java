package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class t01 extends ThreadLocal {
    public final /* synthetic */ byte g;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.g) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(ws5.g);
                return simpleDateFormat;
            case 1:
                return new Random();
            default:
                return 0L;
        }
    }
}
