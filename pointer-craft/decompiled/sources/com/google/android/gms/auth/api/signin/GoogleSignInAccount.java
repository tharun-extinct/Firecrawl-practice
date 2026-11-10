package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ef6;
import defpackage.i1;
import defpackage.jr2;
import defpackage.q4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInAccount extends i1 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new q4((byte) 22);
    public final String a;
    public final List b;
    public final long c;
    public final String i;
    public final String j;
    public final String m;
    public final String p;
    public final Uri q;
    public final String s;
    public final String t;
    public final HashSet u = new HashSet();
    public String w;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.j = str;
        this.t = str2;
        this.a = str3;
        this.m = str4;
        this.q = uri;
        this.w = str5;
        this.c = j;
        this.i = str6;
        this.b = arrayList;
        this.s = str7;
        this.p = str8;
    }

    public static GoogleSignInAccount r(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i), 1));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        jr2.t(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.w = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.i.equals(this.i)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.b);
        hashSet.addAll(googleSignInAccount.u);
        HashSet hashSet2 = new HashSet(this.b);
        hashSet2.addAll(this.u);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.b);
        hashSet.addAll(this.u);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.r(parcel, 2, this.j);
        ef6.r(parcel, 3, this.t);
        ef6.r(parcel, 4, this.a);
        ef6.r(parcel, 5, this.m);
        ef6.y(parcel, 6, this.q, i);
        ef6.r(parcel, 7, this.w);
        ef6.x(parcel, 8, 8);
        parcel.writeLong(this.c);
        ef6.r(parcel, 9, this.i);
        ef6.v(parcel, 10, this.b);
        ef6.r(parcel, 11, this.s);
        ef6.r(parcel, 12, this.p);
        ef6.j(parcel, iL);
    }
}
