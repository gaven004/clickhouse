package com.g.clickhouse;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;

@Data
public class Trips {
    @Id
    Long trip_id;
    String vendor_id;
    LocalDate pickup_date;
    LocalDateTime pickup_datetime;
    LocalDate dropoff_date;
    LocalDateTime dropoff_datetime;
    Integer store_and_fwd_flag;
    Integer rate_code_id;
    Double pickup_longitude;
    Double pickup_latitude;
    Double dropoff_longitude;
    Double dropoff_latitude;
    Integer passenger_count;
    Double trip_distance;
    Float fare_amount;
    Float extra;
    Float mta_tax;
    Float tip_amount;
    Float tolls_amount;
    Float ehail_fee;
    Float improvement_surcharge;
    Float total_amount;
    String payment_type;
    Integer trip_type;
    String pickup;
    String dropoff;
    @Column("cab_type")
    String cabType;
    Integer pickup_nyct2010_gid;
    Float pickup_ctlabel;
    Integer pickup_borocode;
    String pickup_ct2010;
    String pickup_boroct2010;
    String pickup_cdeligibil;
    String pickup_ntacode;
    String pickup_ntaname;
    Integer pickup_puma;
    Integer dropoff_nyct2010_gid;
    Float dropoff_ctlabel;
    Integer dropoff_borocode;
    String dropoff_ct2010;
    String dropoff_boroct2010;
    String dropoff_cdeligibil;
    String dropoff_ntacode;
    String dropoff_ntaname;
    Integer dropoff_puma;
}
