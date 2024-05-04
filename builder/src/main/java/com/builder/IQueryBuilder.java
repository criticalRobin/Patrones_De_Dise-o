package com.builder;

public interface IQueryBuilder {
    IQueryBuilder select(String columns);

    IQueryBuilder from(String table);

    IQueryBuilder where(String condition);

    IQueryBuilder limit(int limit);

    IQueryBuilder offset(int offset);

    String build();
}
