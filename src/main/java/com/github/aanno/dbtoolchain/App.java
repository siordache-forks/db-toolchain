/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.github.aanno.dbtoolchain;

import com.github.aanno.dbtoolchain.xml.S9ApiSingleton;
import com.github.aanno.dbtoolchain.xml.S9ApiUtils;
import com.github.aanno.dbtoolchain.xml.XmlSingleton;

public class App {

    // Don't delete. Needed to start xml processing early (tp)
    private static final XmlSingleton XML_SINGLETON = XmlSingleton.getInstance();

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        String css = S9ApiUtils.getDefaultCss().toString();

        // S9ApiSingleton.getInstance();

        /*
usage: java -jar docbook-xslt2-2.3.8.jar [options] dbdoc.xml [param=value [param=value] ...]
    --css <css>                   A CSS stylesheet (CSS print only)
 -f,--format <format>             The format: (x)html (css)print foprint
 -h,--help                        Usage: org.docbook.Main [options]
                                  dbdoc.xml
    --ns <namespace>              Namespace binding
 -o,--output <output>             Name for the output file (defaults to
                                  stdout)
    --params <params>             A file of parameters
    --pdf <pdf>                   Name for the output PDF file (print
                                  only)
    --postprocess <postprocess>   Post-processing stylesheet
 -s,--style <style>               Custom final-pass XSL stylesheet

         */
        // Main.main(new String[] {"-h"});
        org.docbook.Main.main(("-f cssprint -o out.fo.xml --css ./" +
                css + " examples/db/transition/howto.xml").split("[ \t]+"));
        System.exit(0);
        org.docbook.Main.main("-f fo -o out.fo.xml examples/db/transition/howto.xml".split("[ \t]+"));

        /*
USAGE
fop [options] [-fo|-xml] infile [-xsl file] [-awt|-pdf|-mif|-rtf|-tiff|-png|-pcl|-ps|-txt|-at [mime]|-print] <outfile>
 [OPTIONS]
  -version          print FOP version and exit
  -x                dump configuration settings
  -c cfg.xml        use additional configuration file cfg.xml
  -l lang           the language to use for user information
  -nocs             disable complex script features
  -r                relaxed/less strict validation (where available)
  -dpi xxx          target resolution in dots per inch (dpi) where xxx is a number
  -s                for area tree XML, down to block areas only
  -v                run in verbose mode (currently simply print FOP version and continue)

  -o [password]     PDF file will be encrypted with option owner password
  -u [password]     PDF file will be encrypted with option user password
  -noprint          PDF file will be encrypted without printing permission
  -nocopy           PDF file will be encrypted without copy content permission
  -noedit           PDF file will be encrypted without edit content permission
  -noannotations    PDF file will be encrypted without edit annotation permission
  -nofillinforms    PDF file will be encrypted without fill in interactive form fields permission
  -noaccesscontent  PDF file will be encrypted without extract text and graphics permission
  -noassembledoc    PDF file will be encrypted without assemble the document permission
  -noprinthq        PDF file will be encrypted without print high quality permission
  -a                enables accessibility features (Tagged PDF etc., default off)
  -pdfprofile prof  PDF file will be generated with the specified profile
                    (Examples for prof: PDF/A-1b or PDF/X-3:2003)

  -conserve         enable memory-conservation policy (trades memory-consumption for disk I/O)
                    (Note: currently only influences whether the area tree is serialized.)

  -cache            specifies a file/directory path location for the font cache file
  -flush            flushes the current font cache file

 [INPUT]
  infile            xsl:fo input file (the same as the next)
                    (use '-' for infile to pipe input from stdin)
  -fo  infile       xsl:fo input file
  -xml infile       xml input file, must be used together with -xsl
  -atin infile      area tree input file
  -ifin infile      intermediate format input file
  -imagein infile   image input file (piping through stdin not supported)
  -xsl stylesheet   xslt stylesheet

  -param name value <value> to use for parameter <name> in xslt stylesheet
                    (repeat '-param name value' for each parameter)

  -catalog          use catalog resolver for input XML and XSLT files
 [OUTPUT]
  outfile           input will be rendered as PDF into outfile
                    (use '-' for outfile to pipe output to stdout)
  -pdf outfile      input will be rendered as PDF (outfile req'd)
  -pdfa1b outfile   input will be rendered as PDF/A-1b compliant PDF
                    (outfile req'd, same as "-pdf outfile -pdfprofile PDF/A-1b")
  -awt              input will be displayed on screen
  -rtf outfile      input will be rendered as RTF (outfile req'd)
  -pcl outfile      input will be rendered as PCL (outfile req'd)
  -ps outfile       input will be rendered as PostScript (outfile req'd)
  -afp outfile      input will be rendered as AFP (outfile req'd)
  -tiff outfile     input will be rendered as TIFF (outfile req'd)
  -png outfile      input will be rendered as PNG (outfile req'd)
  -txt outfile      input will be rendered as plain text (outfile req'd)
  -at [mime] out    representation of area tree as XML (outfile req'd)
                    specify optional mime output to allow the AT to be converted
                    to final format later
  -if [mime] out    representation of document in intermediate format XML (outfile req'd)
                    specify optional mime output to allow the IF to be converted
                    to final format later
  -print            input file will be rendered and sent to the printer
                    see options with "-print help"
  -out mime outfile input will be rendered using the given MIME type
                    (outfile req'd) Example: "-out application/pdf D:\out.pdf"
                    (Tip: "-out list" prints the list of supported MIME types and exits)
  -svg outfile      input will be rendered as an SVG slides file (outfile req'd)
                    Experimental feature - requires additional fop-sandbox.jar.

  -foout outfile    input will only be XSL transformed. The intermediate
                    XSL-FO file is saved and no rendering is performed.
                    (Only available if you use -xml and -xsl parameters)


 [Examples]
  fop foo.fo foo.pdf
  fop -fo foo.fo -pdf foo.pdf (does the same as the previous line)
  fop -xml foo.xml -xsl foo.xsl -pdf foo.pdf
  fop -xml foo.xml -xsl foo.xsl -foout foo.fo
  fop -xml - -xsl foo.xsl -pdf -
  fop foo.fo -mif foo.mif
  fop foo.fo -rtf foo.rtf
  fop foo.fo -print
  fop foo.fo -awt
         */
        // org.apache.fop.cli.Main.main("-h".split("[ \t]"));
        org.apache.fop.cli.Main.main("out.fo.xml -pdf out.pdf".split("[ \t]"));
    }
}
