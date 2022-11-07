package com.g.clickhouse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("trips")
public class Trips {
    @Column("trip_id")
    private Long tripId;

    @Column("vendor_id")
    private String vendorId;

    @Column("pickup_date")
    private LocalDate pickupDate;

    @Column("pickup_datetime")
    private LocalDateTime pickupDatetime;

    @Column("dropoff_date")
    private LocalDate dropoffDate;

    @Column("dropoff_datetime")
    private LocalDateTime dropoffDatetime;

    @Column("store_and_fwd_flag")
    private Short storeAndFwdFlag;

    @Column("rate_code_id")
    private Short rateCodeId;

    @Column("pickup_longitude")
    private Double pickupLongitude;

    @Column("pickup_latitude")
    private Double pickupLatitude;

    @Column("dropoff_longitude")
    private Double dropoffLongitude;

    @Column("dropoff_latitude")
    private Double dropoffLatitude;

    @Column("passenger_count")
    private Short passengerCount;

    @Column("trip_distance")
    private Double tripDistance;

    @Column("fare_amount")
    private Double fareAmount;

    @Column("extra")
    private Double extra;

    @Column("mta_tax")
    private Double mtaTax;

    @Column("tip_amount")
    private Double tipAmount;

    @Column("tolls_amount")
    private Double tollsAmount;

    @Column("ehail_fee")
    private Double ehailFee;

    @Column("improvement_surcharge")
    private Double improvementSurcharge;

    @Column("total_amount")
    private Double totalAmount;

    @Column("payment_type")
    private String paymentType;

    @Column("trip_type")
    private Short tripType;

    @Column("pickup")
    private String pickup;

    @Column("dropoff")
    private String dropoff;

    @Column("cab_type")
    private String cabType;

    @Column("pickup_nyct2010_gid")
    private Byte pickupNyct2010Gid;

    @Column("pickup_ctlabel")
    private Double pickupCtlabel;

    @Column("pickup_borocode")
    private Byte pickupBorocode;

    @Column("pickup_ct2010")
    private String pickupCt2010;

    @Column("pickup_boroct2010")
    private String pickupBoroct2010;

    @Column("pickup_cdeligibil")
    private String pickupCdeligibil;

    @Column("pickup_ntacode")
    private String pickupNtacode;

    @Column("pickup_ntaname")
    private String pickupNtaname;

    @Column("pickup_puma")
    private Integer pickupPuma;

    @Column("dropoff_nyct2010_gid")
    private Short dropoffNyct2010Gid;

    @Column("dropoff_ctlabel")
    private Double dropoffCtlabel;

    @Column("dropoff_borocode")
    private Short dropoffBorocode;

    @Column("dropoff_ct2010")
    private String dropoffCt2010;

    @Column("dropoff_boroct2010")
    private String dropoffBoroct2010;

    @Column("dropoff_cdeligibil")
    private String dropoffCdeligibil;

    @Column("dropoff_ntacode")
    private String dropoffNtacode;

    @Column("dropoff_ntaname")
    private String dropoffNtaname;

    @Column("dropoff_puma")
    private Integer dropoffPuma;

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public LocalDateTime getPickupDatetime() {
        return pickupDatetime;
    }

    public void setPickupDatetime(LocalDateTime pickupDatetime) {
        this.pickupDatetime = pickupDatetime;
    }

    public LocalDate getDropoffDate() {
        return dropoffDate;
    }

    public void setDropoffDate(LocalDate dropoffDate) {
        this.dropoffDate = dropoffDate;
    }

    public LocalDateTime getDropoffDatetime() {
        return dropoffDatetime;
    }

    public void setDropoffDatetime(LocalDateTime dropoffDatetime) {
        this.dropoffDatetime = dropoffDatetime;
    }

    public Short getStoreAndFwdFlag() {
        return storeAndFwdFlag;
    }

    public void setStoreAndFwdFlag(Short storeAndFwdFlag) {
        this.storeAndFwdFlag = storeAndFwdFlag;
    }

    public Short getRateCodeId() {
        return rateCodeId;
    }

    public void setRateCodeId(Short rateCodeId) {
        this.rateCodeId = rateCodeId;
    }

    public Double getPickupLongitude() {
        return pickupLongitude;
    }

    public void setPickupLongitude(Double pickupLongitude) {
        this.pickupLongitude = pickupLongitude;
    }

    public Double getPickupLatitude() {
        return pickupLatitude;
    }

    public void setPickupLatitude(Double pickupLatitude) {
        this.pickupLatitude = pickupLatitude;
    }

    public Double getDropoffLongitude() {
        return dropoffLongitude;
    }

    public void setDropoffLongitude(Double dropoffLongitude) {
        this.dropoffLongitude = dropoffLongitude;
    }

    public Double getDropoffLatitude() {
        return dropoffLatitude;
    }

    public void setDropoffLatitude(Double dropoffLatitude) {
        this.dropoffLatitude = dropoffLatitude;
    }

    public Short getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(Short passengerCount) {
        this.passengerCount = passengerCount;
    }

    public Double getTripDistance() {
        return tripDistance;
    }

    public void setTripDistance(Double tripDistance) {
        this.tripDistance = tripDistance;
    }

    public Double getFareAmount() {
        return fareAmount;
    }

    public void setFareAmount(Double fareAmount) {
        this.fareAmount = fareAmount;
    }

    public Double getExtra() {
        return extra;
    }

    public void setExtra(Double extra) {
        this.extra = extra;
    }

    public Double getMtaTax() {
        return mtaTax;
    }

    public void setMtaTax(Double mtaTax) {
        this.mtaTax = mtaTax;
    }

    public Double getTipAmount() {
        return tipAmount;
    }

    public void setTipAmount(Double tipAmount) {
        this.tipAmount = tipAmount;
    }

    public Double getTollsAmount() {
        return tollsAmount;
    }

    public void setTollsAmount(Double tollsAmount) {
        this.tollsAmount = tollsAmount;
    }

    public Double getEhailFee() {
        return ehailFee;
    }

    public void setEhailFee(Double ehailFee) {
        this.ehailFee = ehailFee;
    }

    public Double getImprovementSurcharge() {
        return improvementSurcharge;
    }

    public void setImprovementSurcharge(Double improvementSurcharge) {
        this.improvementSurcharge = improvementSurcharge;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Short getTripType() {
        return tripType;
    }

    public void setTripType(Short tripType) {
        this.tripType = tripType;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropoff() {
        return dropoff;
    }

    public void setDropoff(String dropoff) {
        this.dropoff = dropoff;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public Byte getPickupNyct2010Gid() {
        return pickupNyct2010Gid;
    }

    public void setPickupNyct2010Gid(Byte pickupNyct2010Gid) {
        this.pickupNyct2010Gid = pickupNyct2010Gid;
    }

    public Double getPickupCtlabel() {
        return pickupCtlabel;
    }

    public void setPickupCtlabel(Double pickupCtlabel) {
        this.pickupCtlabel = pickupCtlabel;
    }

    public Byte getPickupBorocode() {
        return pickupBorocode;
    }

    public void setPickupBorocode(Byte pickupBorocode) {
        this.pickupBorocode = pickupBorocode;
    }

    public String getPickupCt2010() {
        return pickupCt2010;
    }

    public void setPickupCt2010(String pickupCt2010) {
        this.pickupCt2010 = pickupCt2010;
    }

    public String getPickupBoroct2010() {
        return pickupBoroct2010;
    }

    public void setPickupBoroct2010(String pickupBoroct2010) {
        this.pickupBoroct2010 = pickupBoroct2010;
    }

    public String getPickupCdeligibil() {
        return pickupCdeligibil;
    }

    public void setPickupCdeligibil(String pickupCdeligibil) {
        this.pickupCdeligibil = pickupCdeligibil;
    }

    public String getPickupNtacode() {
        return pickupNtacode;
    }

    public void setPickupNtacode(String pickupNtacode) {
        this.pickupNtacode = pickupNtacode;
    }

    public String getPickupNtaname() {
        return pickupNtaname;
    }

    public void setPickupNtaname(String pickupNtaname) {
        this.pickupNtaname = pickupNtaname;
    }

    public Integer getPickupPuma() {
        return pickupPuma;
    }

    public void setPickupPuma(Integer pickupPuma) {
        this.pickupPuma = pickupPuma;
    }

    public Short getDropoffNyct2010Gid() {
        return dropoffNyct2010Gid;
    }

    public void setDropoffNyct2010Gid(Short dropoffNyct2010Gid) {
        this.dropoffNyct2010Gid = dropoffNyct2010Gid;
    }

    public Double getDropoffCtlabel() {
        return dropoffCtlabel;
    }

    public void setDropoffCtlabel(Double dropoffCtlabel) {
        this.dropoffCtlabel = dropoffCtlabel;
    }

    public Short getDropoffBorocode() {
        return dropoffBorocode;
    }

    public void setDropoffBorocode(Short dropoffBorocode) {
        this.dropoffBorocode = dropoffBorocode;
    }

    public String getDropoffCt2010() {
        return dropoffCt2010;
    }

    public void setDropoffCt2010(String dropoffCt2010) {
        this.dropoffCt2010 = dropoffCt2010;
    }

    public String getDropoffBoroct2010() {
        return dropoffBoroct2010;
    }

    public void setDropoffBoroct2010(String dropoffBoroct2010) {
        this.dropoffBoroct2010 = dropoffBoroct2010;
    }

    public String getDropoffCdeligibil() {
        return dropoffCdeligibil;
    }

    public void setDropoffCdeligibil(String dropoffCdeligibil) {
        this.dropoffCdeligibil = dropoffCdeligibil;
    }

    public String getDropoffNtacode() {
        return dropoffNtacode;
    }

    public void setDropoffNtacode(String dropoffNtacode) {
        this.dropoffNtacode = dropoffNtacode;
    }

    public String getDropoffNtaname() {
        return dropoffNtaname;
    }

    public void setDropoffNtaname(String dropoffNtaname) {
        this.dropoffNtaname = dropoffNtaname;
    }

    public Integer getDropoffPuma() {
        return dropoffPuma;
    }

    public void setDropoffPuma(Integer dropoffPuma) {
        this.dropoffPuma = dropoffPuma;
    }
}