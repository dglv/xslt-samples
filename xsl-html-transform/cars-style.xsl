<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">

<html> 
<body>
  <h2>The TOP10 Cars In The World</h2>
  <table border="1">
    <tr bgcolor="#ffc18c">
      <th style="text-align:left">№</th>
      <th style="text-align:left">Name</th>
      <th style="text-align:left">URL</th>
    </tr>
    <xsl:for-each select="catalog/car">
    <tr>
      <xsl:variable name="number"><xsl:value-of select="position()"/></xsl:variable>
      <td><xsl:copy-of select="$number"/></td>
      
      <td><xsl:value-of select="name"/></td>
      
      <xsl:variable name="link"><xsl:value-of select="url"/></xsl:variable>
      <td><a href="{$link}" target="_blank"><xsl:value-of select="url"/></a></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>