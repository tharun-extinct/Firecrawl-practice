package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class sx2 {
    public final Locale g;

    public sx2(Locale locale) {
        this.g = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof sx2)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return yf2.p(this.g.toLanguageTag(), ((sx2) obj).g.toLanguageTag());
    }

    public final int hashCode() {
        return this.g.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.g.toLanguageTag();
    }
}
