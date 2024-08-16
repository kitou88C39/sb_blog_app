package com.example.blog_app.dao;

import org.hibernate.mapping.List;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JpaRespsitory<T, ID>
        extends CrudRepository<T, ID>, PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T> {
    void flush();

    <S extends T> S saveAllFlush(S entity);

    <S extends T> List<S> saveAllFlush(Iterable<S> entities);

    @Deprecated
    default void deleteInBatch(Iterable<T> entities) {
        this.deleteAllInBatch(entities);
    }
}
