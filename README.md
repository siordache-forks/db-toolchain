## Docbook

### Resources

* [References](https://tdg.docbook.org/)
* [Big Example](https://docbook.org/docs/howto/howto.html) (with xml and pdf)
* [DocBook XML Schema](https://docbook.org/xml/5.1/)
* [Docbook Wiki](https://github.com/docbook/wiki/wiki)

### Instructions

* [Introduction to DocBook](https://opensource.com/article/17/9/docbook)
* [Firebird DocBook XML introduction](https://www.firebirdsql.org/pdfmanual/html/docwritehowto-docbook-intro.html)
  + [DocBook Source](https://github.com/FirebirdSQL/firebird-documentation/blob/1ec7b44f5e527198ca79a7ef40ff63fce73c56ff/src/docs/firebirddocs/docwriting-howto.xml)
* [DocBook Demystification](http://en.tldp.org/HOWTO/DocBook-Demystification-HOWTO/x128.html)
* [Einführung in XML/XSLT Docbook](http://www.usegroup.de/software/xmltutorial/docbook.html)
* [How to generate PDF](https://stackoverflow.com/questions/2615002/how-to-generate-pdf-from-docbook-5-0) (in german)
* [Using DocBook toolchain](http://xpt.sourceforge.net/techdocs/nix/tool/asciidoc-usg/ascu04-UsingDocBooktoolchain/)
* [Recommended toolchain](https://stackoverflow.com/questions/122752/what-is-the-recommended-toolchain-for-formatting-xml-docbook)
* [DocBook XSL: The Complete Guide](http://www.sagehill.net/docbookxsl/) (from 2007)

#### DB Tools

* [docbkx-tools (maven plugin)](https://github.com/mimil/docbkx-tools)
* [fopub (java based)](https://github.com/asciidoctor/asciidoctor-fopub)
* [AsciiBook](https://github.com/arnaldorusso/AsciiBook): toolchain from AsciiDoc to PDF (in JS)
* [asciidoctor-fopub](https://github.com/asciidoctor/asciidoctor-fopub): toolchain from DB (4.5) to PDF

#### Tools with DB *output*

* [docToolchain](https://doctoolchain.github.io/docToolchain/#_generatedocbook)
* [from asciidoctor](https://asciidoctor.org/docs/convert-documents/#converting-a-document-to-docbook)

### Docbook Stylesheets

* [To Context XSL](https://github.com/doctribute/docbook-to-context-xsl-stylesheets)
* [Chunking](https://github.com/doctribute/docbook-xinclude-based-chunking-stylesheets)

#### XSLT 2.0

* [XSLT 2.0](https://github.com/docbook/xslt20-stylesheets)
* [Saxon 9.6 documentation](https://saxonica.com/html/documentation9.6/about/index.html)
* [XSLT 2.0 java implementations](https://stackoverflow.com/questions/529309/open-source-java-xslt-2-0-implementation)

##### Technology used with DB XSLT 2.0

* [XProc](https://de.wikipedia.org/wiki/XProc)
  + [XProc Spec](https://www.w3.org/TR/xproc/)
  + [Calabash: XProc Implementation](http://xmlcalabash.com/)
    - [Calabash Gradle Plugin](https://github.com/ndw/xmlcalabash1-gradle)
* [EXProc](http://exproc.org/): XProc extensions

### Validation DB

#### Technology used for DB Validation

* [NVDL](https://www.kosek.cz/xml/2008w3c-nvdl/foil18.html)
  + [jNDL Implementation](http://jnvdl.sourceforge.net/)
  + [NVDL within jing-trang](https://github.com/relaxng/jing-trang/blob/bf4bafa3fef13aa2bed1ea03aea0c79a257680b3/mod/nvdl/src/main/com/thaiopensource/validate/nvdl/SchemaImpl.java)
* [Relax NG](https://relaxng.org/jclark/)
  + [Relax NG home page](https://relaxng.org/)
  + [java validation with relax ng](https://stackoverflow.com/questions/47185975/validate-an-xml-document-with-relax-ng-and-namespaces)
  + [jing-trang](https://github.com/relaxng/jing-trang)
* [Schematron](http://schematron.com/)
  + [ph-schematron Implementation](https://github.com/phax/ph-schematron/)
  + [Skeleton XSLT Schematron Implementation](https://github.com/Schematron/schematron)

### Math with DB

* [mathml1](https://www.data2type.de/xml-xslt-xslfo/docbook/block-elemente/gleichungen/docbook-und-mathml/) (in german)
* [mathml2](https://www.data2type.de/xml-xslt-xslfo/docbook/anpassen-von-docbook/docbook-5-erweitern/erweitern-von-docbook-mit-math/) (in german)

### (Source) Code Syntax Highlighting in DB

* [xslthl](http://xslthl.sourceforge.net/) (old)

## FOP

* [Apache FOP](https://xmlgraphics.apache.org/fop/)
* [Apache FOP Images Plugin](https://xmlgraphics.apache.org/fop/fop-pdf-images.html)
* [XSL-FO Input](https://xmlgraphics.apache.org/fop/fo.html)
* [XSL-FO Reference](https://www.data2type.de/xml-xslt-xslfo/xsl-fo/xslfo-referenz/) (in german)

## dblatex

* [dblatex documentation](http://dblatex.sourceforge.net/)

## Asciidoctor

* [Installing the Toolchain](https://asciidoctor.org/docs/install-toolchain/)
* [AsciidoctorJ](https://asciidoctor.org/docs/asciidoctorj/)
* [Syntax Highlighting](https://asciidoctor.org/docs/user-manual/#source-code-blocks)

## Alternativen

* [DITA](https://www.dita-ot.org/)
  + [Converter Manual](http://www.xmlmind.com/ditac/_distrib/doc/manual/index.html)
* [CommonMark](https://commonmark.org/): Unify Markdown
* [Lyx Editor](https://www.lyx.org/)
* [Context](https://wiki.contextgarden.net/Main_Page)
