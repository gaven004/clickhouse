package com.g.clickhouse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}