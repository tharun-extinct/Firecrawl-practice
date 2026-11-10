package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hj {
    public static final hj a;
    public static final hj c;
    public static final /* synthetic */ hj[] i;
    public static final hj j;
    public static final hj m;
    public static final hj q;
    public static final hj t;
    public static final hj w;

    static {
        hj hjVar = new hj("Paragraph", 0);
        j = hjVar;
        hj hjVar2 = new hj("Span", 1);
        t = hjVar2;
        hj hjVar3 = new hj("VerbatimTts", 2);
        a = hjVar3;
        hj hjVar4 = new hj("Url", 3);
        m = hjVar4;
        hj hjVar5 = new hj("Link", 4);
        q = hjVar5;
        hj hjVar6 = new hj("Clickable", 5);
        w = hjVar6;
        hj hjVar7 = new hj("String", 6);
        c = hjVar7;
        i = new hj[]{hjVar, hjVar2, hjVar3, hjVar4, hjVar5, hjVar6, hjVar7};
    }

    public static hj valueOf(String str) {
        return (hj) Enum.valueOf(hj.class, str);
    }

    public static hj[] values() {
        return (hj[]) i.clone();
    }
}
