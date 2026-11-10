package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dx {
    public static final /* synthetic */ dx[] j = {new dx("PRESENT", 0), new dx("ABSENT", 1), new dx("PRESENT_OPTIONAL", 2), new dx("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    dx EF5;

    public static dx valueOf(String str) {
        return (dx) Enum.valueOf(dx.class, str);
    }

    public static dx[] values() {
        return (dx[]) j.clone();
    }
}
