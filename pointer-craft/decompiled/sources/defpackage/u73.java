package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class u73 implements Comparable, Parcelable {
    public static final Parcelable.Creator<u73> CREATOR = new q4(13);
    public final int a;
    public String c;
    public final Calendar j;
    public final int m;
    public final int q;
    public final int t;
    public final long w;

    public u73(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarG = zh5.g(calendar);
        this.j = calendarG;
        this.t = calendarG.get(2);
        this.a = calendarG.get(1);
        this.m = calendarG.getMaximum(7);
        this.q = calendarG.getActualMaximum(5);
        this.w = calendarG.getTimeInMillis();
    }

    public static u73 n(long j) {
        Calendar calendarR = zh5.r(null);
        calendarR.setTimeInMillis(j);
        return new u73(calendarR);
    }

    public static u73 r(int i, int i2) {
        Calendar calendarR = zh5.r(null);
        calendarR.set(1, i);
        calendarR.set(2, i2);
        return new u73(calendarR);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.j.compareTo(((u73) obj).j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u73)) {
            return false;
        }
        u73 u73Var = (u73) obj;
        return this.t == u73Var.t && this.a == u73Var.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.t), Integer.valueOf(this.a)});
    }

    public final String l() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        long timeInMillis = this.j.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = zh5.g;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        String str2 = instanceForSkeleton.format(new Date(timeInMillis));
        this.c = str2;
        return str2;
    }

    public final int t(u73 u73Var) {
        if (this.j instanceof GregorianCalendar) {
            return (u73Var.t - this.t) + ((u73Var.a - this.a) * 12);
        }
        l0.u("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.t);
    }
}
