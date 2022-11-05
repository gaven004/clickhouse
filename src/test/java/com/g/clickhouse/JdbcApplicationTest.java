package com.g.clickhouse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootTest
public class JdbcApplicationTest {
    @Autowired
    SysRolesRepository sysRolesService;

    @Test
    void test() {
        final Iterable<SysRole> roles = sysRolesService.findAll();
        log.info("Found roles");

        roles.forEach(sysRole -> {
            log.info("\t[{}]", sysRole);
        });
    }
}
