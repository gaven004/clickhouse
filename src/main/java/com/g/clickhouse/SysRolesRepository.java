package com.g.clickhouse;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface SysRolesRepository extends
        PagingAndSortingRepository<SysRole, Long> {
}
