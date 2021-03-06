/*
 * This file is generated by jOOQ.
*/
package de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.daos;


import de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.Jokes;
import de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.records.JokesRecord;

import io.github.jklingsporn.vertx.jooq.async.future.VertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.async.future.AsyncJooqSQLClient;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JokesDao extends DAOImpl<JokesRecord, de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes, Integer> implements VertxDAO<de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.records.JokesRecord,de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes,java.lang.Integer> {

    /**
     * Create a new JokesDao without any configuration
     */
    public JokesDao() {
        super(Jokes.JOKES, de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes.class);
    }

    /**
     * Create a new JokesDao with an attached configuration
     */
    public JokesDao(Configuration configuration) {
        super(Jokes.JOKES, de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes> fetchById(Integer... values) {
        return fetch(Jokes.JOKES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes fetchOneById(Integer value) {
        return fetchOne(Jokes.JOKES.ID, value);
    }

    /**
     * Fetch records that have <code>joke IN (values)</code>
     */
    public List<de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes> fetchByJoke(String... values) {
        return fetch(Jokes.JOKES.JOKE, values);
    }

    /**
     * Fetch records that have <code>categoryId IN (values)</code>
     */
    public List<de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes> fetchByCategoryid(Integer... values) {
        return fetch(Jokes.JOKES.CATEGORYID, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code> asynchronously
     */
    public CompletableFuture<List<de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes>> fetchByIdAsync(List<Integer> values) {
        return fetchAsync(Jokes.JOKES.ID,values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code> asynchronously
     */
    public CompletableFuture<de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes> fetchOneByIdAsync(Integer value) {
        return fetchOneAsync(Jokes.JOKES.ID,value);
    }

    /**
     * Fetch records that have <code>joke IN (values)</code> asynchronously
     */
    public CompletableFuture<List<de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes>> fetchByJokeAsync(List<String> values) {
        return fetchAsync(Jokes.JOKES.JOKE,values);
    }

    /**
     * Fetch records that have <code>categoryId IN (values)</code> asynchronously
     */
    public CompletableFuture<List<de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes>> fetchByCategoryidAsync(List<Integer> values) {
        return fetchAsync(Jokes.JOKES.CATEGORYID,values);
    }

    private AsyncJooqSQLClient client;

    @Override
    public void setClient(AsyncJooqSQLClient client) {
        this.client = client;
    }

    @Override
    public AsyncJooqSQLClient client() {
        return this.client;
    }

    @Override
    public java.util.function.Function<io.vertx.core.json.JsonObject, de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes> jsonMapper() {
        return de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.pojos.Jokes::new;
    }

}
