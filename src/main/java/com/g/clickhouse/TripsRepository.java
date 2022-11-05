package com.g.clickhouse;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TripsRepository extends
        PagingAndSortingRepository<Trips, Long> {
    @Query("SELECT DISTINCT(pickup_ntaname) FROM trips")
    List<Trips> findDistinctPickupNtaname();


    @Query("SELECT\n" +
            "    passenger_count,\n" +
            "    ceil(avg(total_amount),2) AS average_total_amount\n" +
            "FROM trips\n" +
            "GROUP BY passenger_count")
    List<AverageCost> queryAverageCost();

    Page<Trips> queryByCabType(String cab_type, Pageable pageable);

    @Query("SELECT * FROM trips WHERE vendor_id = :vendor_id AND cab_type = :cab_type LIMIT 10")
    List<Trips> customQuery(String cab_type, String vendor_id);

}
