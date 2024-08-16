package com.example.blog_app.dao;

import org.springframework.data.repository.*;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JpaRespsitory<T, ID>
        extends CrudRepository<T, ID>, PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T> {
    void flush();

    <S extends T> S saveAllFlush(S entity);

    <S extends T> List<S> saveAllFlush(Interable<S> entities);

}
