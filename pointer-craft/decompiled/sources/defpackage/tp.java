package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tp {
    public final int g;

    public tp(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tp) && this.g == ((tp) obj).g;
    }

    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return fj.x(new StringBuilder("AppWidgetId(appWidgetId="), this.g, ')');
    }
}
