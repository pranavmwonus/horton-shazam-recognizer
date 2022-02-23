package hr.dtakac.horton.shazamrecognizer.api.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lhr/dtakac/horton/shazamrecognizer/api/request/ShazamRequestBody;", "", "geolocation", "Lhr/dtakac/horton/shazamrecognizer/api/request/ShazamGeolocation;", "signature", "Lhr/dtakac/horton/shazamrecognizer/api/request/ShazamSignature;", "timestamp", "", "timezone", "", "(Lhr/dtakac/horton/shazamrecognizer/api/request/ShazamGeolocation;Lhr/dtakac/horton/shazamrecognizer/api/request/ShazamSignature;JLjava/lang/String;)V", "getGeolocation", "()Lhr/dtakac/horton/shazamrecognizer/api/request/ShazamGeolocation;", "getSignature", "()Lhr/dtakac/horton/shazamrecognizer/api/request/ShazamSignature;", "getTimestamp", "()J", "getTimezone", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "shazamrecognizer_debug"})
public final class ShazamRequestBody {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "geolocation")
    private final hr.dtakac.horton.shazamrecognizer.api.request.ShazamGeolocation geolocation = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "signature")
    private final hr.dtakac.horton.shazamrecognizer.api.request.ShazamSignature signature = null;
    @com.google.gson.annotations.SerializedName(value = "timestamp")
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "timezone")
    private final java.lang.String timezone = null;
    
    @org.jetbrains.annotations.NotNull()
    public final hr.dtakac.horton.shazamrecognizer.api.request.ShazamRequestBody copy(@org.jetbrains.annotations.NotNull()
    hr.dtakac.horton.shazamrecognizer.api.request.ShazamGeolocation geolocation, @org.jetbrains.annotations.NotNull()
    hr.dtakac.horton.shazamrecognizer.api.request.ShazamSignature signature, long timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String timezone) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ShazamRequestBody(@org.jetbrains.annotations.NotNull()
    hr.dtakac.horton.shazamrecognizer.api.request.ShazamGeolocation geolocation, @org.jetbrains.annotations.NotNull()
    hr.dtakac.horton.shazamrecognizer.api.request.ShazamSignature signature, long timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String timezone) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final hr.dtakac.horton.shazamrecognizer.api.request.ShazamGeolocation component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final hr.dtakac.horton.shazamrecognizer.api.request.ShazamGeolocation getGeolocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final hr.dtakac.horton.shazamrecognizer.api.request.ShazamSignature component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final hr.dtakac.horton.shazamrecognizer.api.request.ShazamSignature getSignature() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimezone() {
        return null;
    }
}