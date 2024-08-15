package com.example.blog_app.dao;

import org.springframework.data.repository.*;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JpaRespsitory<T, ID>
        extends CrudRepository<T, ID>, PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T> {
    void flush();

}
