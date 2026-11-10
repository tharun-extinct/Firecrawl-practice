package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vu {
    public String g;
    public byte j;
    public String l;
    public String n;
    public String r;
    public long v;
    public long x;
    public int y;

    public final wu g() {
        if (this.j == 3 && this.y != 0) {
            return new wu(this.g, this.y, this.r, this.n, this.v, this.x, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.y == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.j & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.j & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        uo1.j(sb, "Missing required properties:");
        return null;
    }

    public final void j(long j) {
        this.x = j;
        this.j = (byte) (this.j | 2);
    }

    public final void l(int i) {
        if (i != 0) {
            this.y = i;
        } else {
            l0.q("Null registrationStatus");
        }
    }

    public final void n(String str) {
        this.g = str;
    }

    public final void r(long j) {
        this.v = j;
        this.j = (byte) (this.j | 1);
    }

    public final void v(String str) {
        this.l = str;
    }

    public final void x(String str) {
        this.n = str;
    }

    public final void y(String str) {
        this.r = str;
    }
}
