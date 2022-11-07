package com.g.clickhouse;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class ClickhouseApplicationTests {
    @Autowired
    TripsRepository tripsRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void tripsRepository() {
        final long count = tripsRepository.count();
        Assertions.assertTrue(count > 0);
        log.info("Trips count: {}", count);

        final Page<Trips> page = tripsRepository.findAll(Pageable.ofSize(100));
        Assertions.assertNotNull(page);
        Assertions.assertTrue(page.getTotalElements() > 0);
        log.info("Page {} of {}", page.getNumber(), page.getTotalPages());

        final List<Trips> names = tripsRepository.findDistinctPickupNtaname();
        Assertions.assertNotNull(names);
        Assertions.assertTrue(names.size() > 0);
        log.info("distinct Pickup Ntanames: {}", names.size());

        final List<AverageCost> costList = tripsRepository.queryAverageCost();
        Assertions.assertNotNull(costList);
        Assertions.assertTrue(costList.size() > 0);
        log.info("Query computes the average cost");
        costList.forEach(e -> log.info("\t{}, {}", e.passenger_count, e.average_total_amount));

        final Page<Trips> trips = tripsRepository.queryByCabType("yellow", PageRequest.of(0, 10, Sort.Direction.ASC, "pickup_datetime"));
        Assertions.assertNotNull(trips);
        Assertions.assertTrue(trips.getTotalElements() > 0);
        log.info("Query by cab_type: ");
        trips.forEach(e -> log.info("\t{}", e));

        final List<Trips> query = tripsRepository.customQuery("yellow", "2");
        Assertions.assertNotNull(query);
        Assertions.assertTrue(query.size() > 0);
        log.info("Custom Query: ");
        query.forEach(e -> log.info("\t{}", e));

    }

}
