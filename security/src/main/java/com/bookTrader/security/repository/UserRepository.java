package com.bookTrader.security.repository;

import com.bookTrader.security.model.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User,Long> {
}
