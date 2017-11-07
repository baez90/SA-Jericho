/*
 * This file is generated by jOOQ.
*/
package de.fhro.inf.sa.jerichoDemo.persistence.generated;


import de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.Categories;
import de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.Jokes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1031085560;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.categories</code>.
     */
    public final Categories CATEGORIES = de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.Categories.CATEGORIES;

    /**
     * The table <code>public.jokes</code>.
     */
    public final Jokes JOKES = de.fhro.inf.sa.jerichoDemo.persistence.generated.tables.Jokes.JOKES;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.CATEGORIES_ID_SEQ,
            Sequences.JOKES_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Categories.CATEGORIES,
            Jokes.JOKES);
    }
}