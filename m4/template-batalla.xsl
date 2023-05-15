<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <head>
        <title>Batallas</title>
        <link rel="stylesheet" href="BatleCSS.css"/>
      </head>
      <body>
        <table>
          <tr>
            <th>id batalla</th>
            <th>id player</th>
            <th>warrior id</th>
            <th>warrior weapon id</th>
            <th>oponent id</th>
            <th>oponent weapon id</th>
            <th>damage caused</th>
            <th>damage recived</th>
            <th>battle points</th>
          </tr>
          <xsl:for-each select="Batalla/batalla">
            <tr>
              <td><xsl:value-of select="id_batalla"/></td>
              <td><xsl:value-of select="id_player"/></td>
              <td><xsl:value-of select="warrior_id"/></td>
              <td><xsl:value-of select="warrior_weapon_id"/></td>
              <td><xsl:value-of select="oponent_id"/></td>
              <td><xsl:value-of select="oponent_weapon_id"/></td>
              <td><xsl:value-of select="damage_caused"/></td>
              <td><xsl:value-of select="damage_recived"/></td>
              <td><xsl:value-of select="battle_points"/></td>

            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>