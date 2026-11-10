package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class st0 implements rt0, tt0 {
    public byte a;
    public final /* synthetic */ byte j = 0;
    public int m;
    public Uri q;
    public ClipData t;
    public Bundle w;

    public st0(st0 st0Var) {
        ClipData clipData = st0Var.t;
        clipData.getClass();
        this.t = clipData;
        byte b = st0Var.a;
        if (b < 0) {
            Locale locale = Locale.US;
            l0.u("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (b > 5) {
            Locale locale2 = Locale.US;
            l0.u("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.a = b;
        int i = st0Var.m;
        if ((i & 1) == i) {
            this.m = i;
            this.q = st0Var.q;
            this.w = st0Var.w;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.rt0
    public void a(Uri uri) {
        this.q = uri;
    }

    @Override // defpackage.tt0
    public ContentInfo b() {
        return null;
    }

    @Override // defpackage.rt0
    public ut0 build() {
        return new ut0(new st0(this));
    }

    @Override // defpackage.rt0
    public void c(int i) {
        this.m = i;
    }

    @Override // defpackage.tt0
    public int g() {
        return this.a;
    }

    @Override // defpackage.tt0
    public int i() {
        return this.m;
    }

    @Override // defpackage.tt0
    public ClipData n() {
        return this.t;
    }

    @Override // defpackage.rt0
    public void setExtras(Bundle bundle) {
        this.w = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.j) {
            case 1:
                Uri uri = this.q;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.t.getDescription());
                sb.append(", source=");
                byte b = this.a;
                if (b == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (b == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (b == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (b == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (b != 4) {
                    strValueOf = b != 5 ? String.valueOf((int) b) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i = this.m;
                sb.append((i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return du4.b(sb, this.w != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ st0() {
    }
}
