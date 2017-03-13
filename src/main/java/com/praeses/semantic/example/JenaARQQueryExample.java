package com.praeses.semantic.example;

import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.query.Query;
import org.apache.jena.sparql.vocabulary.FOAF;

/**
 *
 */
public class JenaARQQueryExample {
    public static Query getQuery() {
        ParameterizedSparqlString sparqlString = new ParameterizedSparqlString("" +
                "SELECT ?title\n" +
                "WHERE { \n" +
                "?character foaf:name ?characterName.\n" +
                "?character foaf:title ?title.\n" +
                "} ORDER BY ?title\n");

        sparqlString.setNsPrefix("foaf", FOAF.getURI());

        sparqlString.setLiteral("characterName", "Aegon I");

        return sparqlString.asQuery();
    }

    public static void main(String[] args) {
        System.out.println(getQuery());
    }
}
