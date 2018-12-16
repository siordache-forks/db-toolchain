package com.github.aanno.dbtoolchain;

import com.github.aanno.dbtoolchain.xml.TraxSingleton;
import com.github.aanno.dbtoolchain.xml.XmlSingleton;
import com.helger.schematron.ISchematronResource;
import com.helger.schematron.pure.SchematronResourcePure;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Validation {

    public Validation() {

    }

    public static void main(String[] args) throws Exception {
        TraxSingleton traxSingleton = TraxSingleton.getInstance();
        XmlSingleton xmlSingleton = XmlSingleton.getInstance();

        Path dbPath = Paths.get("examples/db/transition/howto.xml");

        // DB 5.1
        // Path dbRelaxPath = traxSingleton.pathFromUri("http://www.oasis-open.org/docbook/xml/5.1CR4/rng/docbookxi.rng");
        // Path dbSchematronPath = Paths.get("schema/5.1/schemas/sch/docbookxi.sch");
        // TODO tp: no public uri in catalog!
        // String dbSchematronUri = traxSingleton.uriFromUri("http://www.docbook.org/xml/5.1CR4/xsd/docbookxi.xsd");

        // DB 5.0
        Path dbRelaxPath = traxSingleton.pathFromUri("http://www.oasis-open.org/docbook/xml/5.0/rng/docbookxi.rng");
        // TODO tp: schematron invalid?
        // Path dbSchematronPath = traxSingleton.pathFromUri("http://www.oasis-open.org/docbook/xml/5.0/sch/docbook.sch");
        Path dbSchematronPath = null;

        Schema dbRelax = xmlSingleton.getRelaxNgSchema(dbRelaxPath);

        Validator validator = dbRelax.newValidator();
        validator.validate(traxSingleton.getSource(dbPath, false));

        if (dbSchematronPath != null) {
            ISchematronResource aResPure = xmlSingleton.getSchematronResource(dbSchematronPath);
            if (!aResPure.getSchematronValidity(traxSingleton.getStreamSource(dbPath)).isValid()) {
                throw new IllegalArgumentException("Validation against Schematron failed: " + dbPath);
            }
        }
    }
}