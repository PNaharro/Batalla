import lxml.html
from lxml import etree

xslt_doc = etree.parse("template-batalla.xsl")
xslt_transformer = etree.XSLT(xslt_doc)
source_doc = etree.parse("batalla.xml")
output_doc = xslt_transformer(source_doc)


output_doc.write("Batalla.html", pretty_print=True)
print(str(output_doc))
