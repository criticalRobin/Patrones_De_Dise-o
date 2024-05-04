package com.builder;

public class QueryBuilder implements IQueryBuilder {
    private StringBuilder query;

    public QueryBuilder() {
        query = new StringBuilder();
    }

    @Override
    public IQueryBuilder select(String columns) {
        query.append("Select ").append(columns).append(" ");
        return this;
    }

    @Override
    public IQueryBuilder from(String table) {
        query.append("From").append(table).append(" ");
        return this;
    }

    @Override
    public IQueryBuilder where(String condition) {
        query.append("Where ").append(condition).append(" ");
        return this;
    }

    @Override
    public IQueryBuilder limit(int limit) {
        query.append("Limit ").append(limit).append(" ");
        return this;
    }

    @Override
    public IQueryBuilder offset(int offset) {
        query.append("Offset ").append(offset).append(" ");
        return this;
    }

    @Override
    public String build() {
        return query.toString();
    }
}
