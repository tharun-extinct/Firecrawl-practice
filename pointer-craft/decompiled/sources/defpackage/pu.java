package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pu {
    public final String g;
    public final String y;

    public pu(String str, String str2) {
        this.g = str;
        if (str2 != null) {
            this.y = str2;
        } else {
            l0.q("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pu)) {
            return false;
        }
        pu puVar = (pu) obj;
        return this.g.equals(puVar.g) && this.y.equals(puVar.y);
    }

    public final int hashCode() {
        return this.y.hashCode() ^ ((this.g.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.g);
        sb.append(", version=");
        return du4.b(sb, this.y, "}");
    }
}
